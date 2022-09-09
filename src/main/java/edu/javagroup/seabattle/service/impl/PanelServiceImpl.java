package edu.javagroup.seabattle.service.impl;

import edu.javagroup.seabattle.model.HorizontalLine;
import edu.javagroup.seabattle.model.PointElement;
import edu.javagroup.seabattle.service.PanelService;
import edu.javagroup.seabattle.singleton.EnemyPanelSingleton;
import edu.javagroup.seabattle.singleton.MinePanelSingleton;
import org.springframework.stereotype.Component;

import java.util.List;

import static edu.javagroup.seabattle.constants.Constants.ENEMY;
import static edu.javagroup.seabattle.constants.Constants.MINE;

@Component
public class PanelServiceImpl implements PanelService {

    @Override
    public boolean isPanelEmpty() {
        return countPointElements(MinePanelSingleton.instance(null).getPanel(), 0) != 0;
    }

    @Override
    public boolean isFullMinePanel() {
        return countPointElements(MinePanelSingleton.instance(null).getPanel(), 1) == 20;
    }

    @Override
    public boolean checkEndGame(String side) {
        List<HorizontalLine> horizontalLines = side.equals(MINE)
                ? MinePanelSingleton.instance(null).getPanel()
                : EnemyPanelSingleton.instance(null).getPanel();

        return countPointElements(horizontalLines, 2) == 20;
    }

    private static int countPointElements(List<HorizontalLine> horizontalLines, int value) {
        int count = 0;
        for (HorizontalLine line : horizontalLines) {
            List<PointElement> pointElements = line.getPointElementList();
            for (PointElement element : pointElements) {
                if (element.getValue() == value) {
                    count++;
                }
            }
        }
        return count;
    }

}
