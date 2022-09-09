package edu.javagroup.seabattle.service.impl;

import edu.javagroup.seabattle.exception.SideNotFoundException;
import edu.javagroup.seabattle.model.HorizontalLine;
import edu.javagroup.seabattle.model.PointElement;
import edu.javagroup.seabattle.service.PointService;
import edu.javagroup.seabattle.singleton.EnemyPanelSingleton;
import edu.javagroup.seabattle.singleton.ForbiddenCellsSingleton;
import edu.javagroup.seabattle.singleton.MinePanelSingleton;
import edu.javagroup.seabattle.singleton.MyStepSingleton;
import edu.javagroup.seabattle.util.NumberUtils;
import edu.javagroup.seabattle.util.StringUtils;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.util.List;
import java.util.Map;

import static edu.javagroup.seabattle.constants.Constants.ENEMY;
import static edu.javagroup.seabattle.constants.Constants.MINE;

@Component
public class PointServiceImpl implements PointService {

    private final PanelServiceImpl panelService;

    public PointServiceImpl(PanelServiceImpl panelService) {
        this.panelService = panelService;
    }

    @Override
    public void setShipPoint(char row, int col) {
        if (isClearPoint(row, col)) {
            addShipPoint(row, col);
        } else {
            clearShipPoint(row, col);
        }
    }

    @Override
    public boolean setSidePoint(String side, char row, int col, int value) {
        List<HorizontalLine> panel;
        if (side.equalsIgnoreCase(MINE)) {
            panel = MinePanelSingleton.instance(null).getPanel();
        } else if (side.equalsIgnoreCase(ENEMY)) {
            panel = EnemyPanelSingleton.instance(null).getPanel();
        } else {
            throw new SideNotFoundException();
        }
        for (HorizontalLine horizontalLine : panel) {
            if (row == horizontalLine.getRow()) {
                List<PointElement> elements = horizontalLine.getPointElementList();
                for (PointElement element : elements) {
                    if (col == element.getCol()) {
                        element.setValue(value);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public boolean isClearPoint(char row, int col) {
        return isOccupiedCell(row, col, 0);
    }

    @Override
    public boolean setBomb(char row, int col) {
        if (isOccupiedCell(row, col, 0) || isOccupiedCell(row, col, 2)) {
            setSidePoint(MINE, row, col, 3);
            MyStepSingleton.instance(true);
        }
        if (isOccupiedCell(row, col, 1)) {
            setSidePoint(MINE, row, col, 2);
            MyStepSingleton.instance(false);
            return true;
        }
        return false;
    }

    private void addShipPoint(char row, int col) {
        Map<String, Boolean> map = ForbiddenCellsSingleton.instance(null).getForbiddenCellsMap();
        String key = col < 10 ? row + "0" + col : row + "" + col;
        if (!map.getOrDefault(key, false)) {
            if (!panelService.isFullMinePanel()) {
                if (setSidePoint(MINE, row, col, 1)) {
                    setForbiddenCells();
                } else {
                    JOptionPane.showMessageDialog(null, "Нельзя использовать эту ячейку", "Внимание!", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Уже занято допустимое количество ячеек", "Внимание!", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Не удалось использовать эту ячейку", "Внимание!", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void clearShipPoint(char row, int col) {
        setSidePoint(MINE, row, col, 0);
        setForbiddenCells();
    }

    public boolean isOccupiedCell(char row, int col, int value) {
        List<HorizontalLine> horizontalLines = MinePanelSingleton.instance(null).getPanel();
        for (HorizontalLine line : horizontalLines) {
            if (row == line.getRow()) {
                List<PointElement> pointElementList = line.getPointElementList();
                for (PointElement element : pointElementList) {
                    if (col == element.getCol()) {
                        return element.getValue() == value;
                    }
                }
            }
        }
        return false;
    }

    public void setForbiddenCells() {
        Map<String, Boolean> cellMap = ForbiddenCellsSingleton.instance(null).getForbiddenCellsMap();
        cellMap.clear();
        for (HorizontalLine horizontalLine : MinePanelSingleton.instance(null).getPanel()) {
            for (PointElement pointElement : horizontalLine.getPointElementList()) {
                if (pointElement.getValue() == 1) {
                    int col = pointElement.getCol();
                    char row = horizontalLine.getRow();
                    cellMap.put(row + NumberUtils.currentNumber(col), true);
                    cellMap.put(StringUtils.letterAfter(row) + NumberUtils.numberBefore(col), true);
                    cellMap.put(StringUtils.letterAfter(row) + NumberUtils.numberAfter(col), true);
                    cellMap.put(StringUtils.letterBefore(row) + NumberUtils.numberBefore(col), true);
                    cellMap.put(StringUtils.letterBefore(row) + NumberUtils.numberAfter(col), true);
                }
            }
        }
    }
}
