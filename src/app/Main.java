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
        }
    }
}