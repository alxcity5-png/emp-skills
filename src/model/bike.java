package model;

public class bike extends vehicle {
    private static final double RATE_PER_HOUR = 15.0;

    public bike(String licensePlate, int entryHour) {
        super(licensePlate, entryHour);
    }

    @Override
    public double calculateFee(int exitHour) {
        return getHoursParked(exitHour) * RATE_PER_HOUR;
    }

    @Override
    public String getType() {
        return "Bike";
    }
}