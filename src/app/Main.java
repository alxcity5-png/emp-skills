
package app;

import java.util.ArrayList;
import java.util.Scanner;

import model.vehicle;
import model.car;
import model.bike;

import exceptions.ParkingFullException;
import exceptions.VehicleNotFoundException;

import logs.ExitLogList;

public class Main {
    private static final int MAX_SLOTS = 3;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<vehicle> lot = new ArrayList<>();
        ExitLogList exitLogs = new ExitLogList();

        while (true) {
            System.out.println("\n--- PARKING LOT (Impl 3: ArrayList + Linked List) ---");
            System.out.println("1. Park vehicle");
            System.out.println("2. Exit vehicle & calculate fee");
            System.out.println("3. Occupancy and exit history report");
            System.out.println("4. Exit program");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            try {
                if (choice == 1) {
                    if (lot.size() >= MAX_SLOTS) {
                        throw new ParkingFullException("No free slots available.");
                    }

                    System.out.print("Type (car/bike): ");
                    String type = sc.nextLine().trim().toLowerCase();

                    System.out.print("License plate: ");
                    String plate = sc.nextLine().trim().toUpperCase();

                    System.out.print("Entry hour (0-23): ");
                    int hour = sc.nextInt();
                    sc.nextLine();

                    vehicle v = type.equals("bike")
                            ? new bike(plate, hour)
                            : new car(plate, hour);

                    lot.add(v);

                    System.out.println("Parked. Current occupancy: "
                            + lot.size() + "/" + MAX_SLOTS);

                } else if (choice == 2) {
                    // Exit functionality will be added in the next commit.

                } else if (choice == 3) {
                    // Occupancy report will be added later.

                } else if (choice == 4) {
                    System.out.println("Thank you");
                    break;

                } else {
                    System.out.println("Invalid option");
                }

            } catch (ParkingFullException e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }

        sc.close();
    }
}
