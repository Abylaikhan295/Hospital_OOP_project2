package hospital;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Patient> patients = new ArrayList<>();
    private static ArrayList<Doctor> doctors = new ArrayList<>();
    private static ArrayList<Appointment> appointments = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        patients.add(new Patient("John Wick", 45, "Flu", true));
        doctors.add(new Doctor("Dr. Smith", "Surgery", 5000.0, "Master"));
        appointments.add(new Appointment("2025-12-24", "John Wick", "Dr. Smith", 250.0));
        boolean running = true;
        while (running) {
            System.out.println("\n--- Hospital Management System ---");
            System.out.println("1. Add New Patient");
            System.out.println("2. List All Patients");
            System.out.println("3. Add New Doctor");
            System.out.println("4. List All Doctors");
            System.out.println("5. Schedule Appointment");
            System.out.println("6. List All Appointments");
            System.out.println("0. Exit System");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.print("Enter age: ");
                int age = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter disease: ");
                String disease = scanner.nextLine();
                patients.add(new Patient(name, age, disease, true));
                System.out.println("Patient added successfully.");
            } else if (choice == 2) {
                System.out.println("\n--- Patient Records ---");
                for (Patient p : patients) {
                    System.out.println(p.toString());
                }
            } else if (choice == 3) {
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.print("Enter specialty: ");
                String specialty = scanner.nextLine();
                System.out.print("Enter salary: ");
                double salary = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Enter degree: ");
                String degree = scanner.nextLine();
                doctors.add(new Doctor(name, specialty, salary, degree));
                System.out.println("Doctor added successfully.");
            } else if (choice == 4) {
                System.out.println("\n--- Doctor Records ---");
                for (Doctor d : doctors) {
                    System.out.println(d.toString());
                }
            } else if (choice == 5) {
                System.out.print("Enter date: ");
                String date = scanner.nextLine();
                System.out.print("Patient name: ");
                String pName = scanner.nextLine();
                System.out.print("Doctor name: ");
                String dName = scanner.nextLine();
                System.out.print("Enter fee: ");
                double fee = scanner.nextDouble();
                scanner.nextLine();
                appointments.add(new Appointment(date, pName, dName, fee));
                System.out.println("Appointment scheduled successfully.");
            } else if (choice == 6) {
                System.out.println("\n--- Appointment Records ---");
                for (Appointment a : appointments) {
                    System.out.println(a.toString());
                }
            } else if (choice == 0) {
                System.out.println("System shutting down...");
                running = false;
            } else {
                System.out.println("Invalid option. Try again.");
            }
        }
        scanner.close();
    }
}

