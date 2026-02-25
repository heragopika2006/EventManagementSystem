import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EventManager manager = new EventManager();
        int choice;

        do {
            System.out.println("\n===== Event Management System =====");
            System.out.println("1. Add Event");
            System.out.println("2. View Events");
            System.out.println("3. Update Event");
            System.out.println("4. Delete Event");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Date: ");
                    String date = sc.nextLine();
                    System.out.print("Enter Location: ");
                    String location = sc.nextLine();
                    manager.addEvent(new Event(id, name, date, location));
                    break;

                case 2:
                    manager.viewEvents();
                    break;

                case 3:
                    System.out.print("Enter ID to Update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();
                    System.out.print("Enter New Date: ");
                    String newDate = sc.nextLine();
                    System.out.print("Enter New Location: ");
                    String newLocation = sc.nextLine();
                    manager.updateEvent(updateId, newName, newDate, newLocation);
                    break;

                case 4:
                    System.out.print("Enter ID to Delete: ");
                    int deleteId = sc.nextInt();
                    manager.deleteEvent(deleteId);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 5);

        sc.close();
    }
}