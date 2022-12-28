package org.itmo.lab3.story;

public enum Actions {
    MAKE_SURE("убедившись, что "),
    TO_BE("был"),
    LOOK_AROUND("оглянулся"),
    SEIZE("захватить"),
    PONDER("задумался"),
    SAYING("сказал");

    private final String actionDescribe;
    Actions(String actionDescribe) {
        this.actionDescribe = actionDescribe;
    }

    public String getActionDescribe() {
        return actionDescribe;
    }
}