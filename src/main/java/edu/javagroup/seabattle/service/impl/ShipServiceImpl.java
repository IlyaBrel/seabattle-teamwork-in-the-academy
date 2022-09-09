package edu.javagroup.seabattle.service.impl;

import edu.javagroup.seabattle.model.HorizontalLine;
import edu.javagroup.seabattle.model.PointElement;
import edu.javagroup.seabattle.model.ShipPoint;
import edu.javagroup.seabattle.service.ShipService;
import edu.javagroup.seabattle.singleton.MinePanelSingleton;
import edu.javagroup.seabattle.singleton.MyStepSingleton;
import edu.javagroup.seabattle.singleton.ShipStorageSingleton;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.logging.Level;

import static edu.javagroup.seabattle.constants.Constants.DECK;
import static edu.javagroup.seabattle.constants.Constants.VERTICAL_COORDINATE;

@Component
public class ShipServiceImpl implements ShipService {

    private List<ShipPoint> coordinateList;

    @Override
    public boolean checkShipCount() {
        getCoordinateList(MinePanelSingleton.instance(null).getPanel());
        Map<String, Integer> map = new HashMap<>(4);
        map.put("4" + DECK, findShipDeck(4));
        map.put("3" + DECK, findShipDeck(3));
        map.put("2" + DECK, findShipDeck(2));
        map.put("1" + DECK, findShipDeck(1));
        ShipStorageSingleton.instance(map);
        return map.get("4" + DECK) == 1
                && map.get("3" + DECK) == 2
                && map.get("2" + DECK) == 3
                && map.get("1" + DECK) == 4;
    }

    @Override
    public int checkShipCount(int deckCount) {
        return 0;
    }

    private List<ShipPoint> getCoordinateList(List<HorizontalLine> coordinate) {
        coordinateList = new ArrayList<>(220);
        coordinateList.addAll(getHorizontalCoordinateList(coordinate));
        coordinateList.addAll(getVerticalCoordinateList(coordinate));
        List<ShipPoint> pointList = new ArrayList<>();
        for (int i = 0; i < coordinateList.size() - 1; i++) {
            if (coordinateList.get(i).getValue() == 0 && coordinateList.get(i + 1).getValue() == 0) {
                pointList.add(coordinateList.get(i));
            }
            coordinateList.removeAll(pointList);
        }
        Collections.sort(coordinateList);
        return coordinateList;
    }

    public List<ShipPoint> getHorizontalCoordinateList(List<HorizontalLine> horizontalCoordinate) {
        List<ShipPoint> shipPointList = new ArrayList<>(horizontalCoordinate.size() * 11);
        int number = 1;
        for (HorizontalLine horizontalLine : horizontalCoordinate) {
            List<PointElement> pointElementList = horizontalLine.getPointElementList();
            for (PointElement pointElement : pointElementList) {
                shipPointList.add(new ShipPoint(number, pointElement.getValue()));
                number++;
            }
            shipPointList.add(new ShipPoint(number, 0));
            number++;
        }
        return shipPointList;
    }

    public List<ShipPoint> getVerticalCoordinateList(List<HorizontalLine> verticalCoordinate) {
        List<ShipPoint> shipPointList = new ArrayList<>(verticalCoordinate.size() * 11);
        char getLetter;
        int number = 111;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < VERTICAL_COORDINATE.length(); j++) {
                getLetter = VERTICAL_COORDINATE.charAt(j);
                for (HorizontalLine horizontalLine : verticalCoordinate) {
                    if (horizontalLine.getRow() == getLetter) {
                        List<PointElement> pointElementList = horizontalLine.getPointElementList();
                        shipPointList.add(new ShipPoint(number, pointElementList.get(i).getValue()));
                        number++;
                    }
                }
            }
            shipPointList.add(new ShipPoint(number, 0));
            number++;
        }
        return shipPointList;
    }

    public int findShipDeck(int deckCount) {
        int count = 0;
        StringBuilder stringBuilder = new StringBuilder();
        coordinateList.forEach(item -> stringBuilder.append(item.getValue()));
        for (String elementArray : stringBuilder.toString().split("0")) {
            count = elementArray.length() == deckCount ? ++count : count;
        }
        return deckCount == 1 ? count / 6 : count;
    }
}

