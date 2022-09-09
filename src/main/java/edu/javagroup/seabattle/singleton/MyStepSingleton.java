package edu.javagroup.seabattle.singleton;


public class MyStepSingleton {

    private static MyStepSingleton instance;
    private final Boolean myStep;

    private MyStepSingleton(Boolean myStep) {
        this.myStep = myStep;
    }

    public static MyStepSingleton instance(Boolean myStep) {
        if (instance == null) {
            instance = new MyStepSingleton(true);
        }
        if (myStep != null) {
            instance = new MyStepSingleton(myStep);
        }
        return instance;
    }

    public Boolean myStep() {
        return myStep;
    }
}
