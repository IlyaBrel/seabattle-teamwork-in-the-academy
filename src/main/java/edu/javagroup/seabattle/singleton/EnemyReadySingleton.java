package edu.javagroup.seabattle.singleton;


public class EnemyReadySingleton {

    private static EnemyReadySingleton instance;
    private final Boolean enemyReady;

    private EnemyReadySingleton(Boolean enemyReady) {
        this.enemyReady = enemyReady;
    }

    public static EnemyReadySingleton instance(Boolean enemyReady) {
        if (instance == null) {
            instance = new EnemyReadySingleton(true);
        }
        if (enemyReady != null) {
            instance = new EnemyReadySingleton(enemyReady);
        }
        return instance;
    }

    public Boolean enemyReady() {
        return enemyReady;
    }
}
