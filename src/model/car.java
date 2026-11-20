package model;

public class car extends vehicle {
    private static final double RATE_PER_HOUR = 30.0;

    public car(String licensePlate, int entryHour) {
        super(licensePlate, entryHour);
    }

    @Override
    public double calculateFee(int exitHour) {
        return getHoursParked(exitHour) * RATE_PER_HOUR;
    }

    @Override
    public String getType() {
        return "Car";
    }
}