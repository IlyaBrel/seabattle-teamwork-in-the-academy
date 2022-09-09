package edu.javagroup.seabattle.singleton;

import edu.javagroup.seabattle.model.HorizontalLine;

import java.util.ArrayList;
import java.util.List;

public class EnemyPanelSingleton {

    private static EnemyPanelSingleton instance;
    private final List<HorizontalLine> panel;

    private EnemyPanelSingleton(List<HorizontalLine> panel) {
        this.panel = panel;
    }

    public static EnemyPanelSingleton instance(List<HorizontalLine> panel) {
        if (instance == null) {
            instance = new EnemyPanelSingleton(new ArrayList<>(0));
        }
        if (panel != null) {
            instance = new EnemyPanelSingleton(panel);
        }
        return instance;
    }

    public List<HorizontalLine> getPanel() {
        return panel;
    }
}
