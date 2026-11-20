package model;

public abstract class vehicle {
    private String licensePlate;
    private int entryHour;

    public vehicle(String licensePlate, int entryHour) {
        this.licensePlate = licensePlate.toUpperCase();
        this.entryHour = entryHour;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public int getEntryHour() {
        return entryHour;
    }

    public int getHoursParked(int exitHour) {
        int hours = exitHour - entryHour;
        return Math.max(1, hours);
    }

    public abstract double calculateFee(int exitHour);

    public abstract String getType();

    @Override
    public String toString() {
        return "[" + getType() + "] Plate: " + licensePlate + " | Entry Hour: " + entryHour;
    }
}