package edu.javagroup.seabattle.init;

import edu.javagroup.seabattle.model.HorizontalLine;
import edu.javagroup.seabattle.singleton.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static edu.javagroup.seabattle.constants.Constants.DECK;
import static edu.javagroup.seabattle.constants.Constants.VERTICAL_COORDINATE;

public class Initializer {

    public void init() {
        SettingsSingleton.instance(new HashMap<>(0));
        initPanels();
    }

    public void initPanels() {
        MyStepSingleton.instance(true);
        ImReadySingleton.instance(false);
        EnemyReadySingleton.instance(false);
        ForbiddenCellsSingleton.instance(new HashMap<>(0));

        Map<String, Integer> map = new HashMap<>(4);
        map.put(1 + DECK, 0);
        map.put(2 + DECK, 0);
        map.put(3 + DECK, 0);
        map.put(4 + DECK, 0);
        ShipStorageSingleton.instance(map);

        List<HorizontalLine> listMine = new ArrayList<>();
        for (int i = 0; i < VERTICAL_COORDINATE.length(); i++) {
            listMine.add(new HorizontalLine(VERTICAL_COORDINATE.charAt(i)));
        }
        MinePanelSingleton.instance(listMine);

        List<HorizontalLine> listEnemy = new ArrayList<>();
        for (int i = 0; i < VERTICAL_COORDINATE.length(); i++) {
            listEnemy.add(new HorizontalLine(VERTICAL_COORDINATE.charAt(i)));
        }
        EnemyPanelSingleton.instance(listEnemy);
    }
}
