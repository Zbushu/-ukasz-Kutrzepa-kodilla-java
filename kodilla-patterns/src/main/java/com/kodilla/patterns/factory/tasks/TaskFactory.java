package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task executeTask(final String task) {
        switch (task) {
            case SHOPPING:
                return new ShoppingTask("Shopping", "Rocket", 6.0);
            case PAINTING:
                return new PaintingTask("Painting", "Blue", "Bedroom");
            case DRIVING:
                return new DrivingTask("Driving", "Museum", "Rocket bike");
                default:
                    return null;
        }
    }
}
