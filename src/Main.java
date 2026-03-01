import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ContactService service = new ContactService();

        while (true) {

            System.out.println("\n===== CONTACT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Update Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter phone: ");
                    String phone = sc.nextLine();

                    System.out.print("Enter email: ");
                    String email = sc.nextLine();

                    service.addContact(new Contact(name, phone, email));
                    break;

                case 2:
                    service.viewContacts();
                    break;

                case 3:
                    service.viewContacts();
                    System.out.print("Enter contact number to update: ");
                    int u = sc.nextInt() - 1;
                    sc.nextLine();

                    Contact c = service.getContact(u);

                    if (c != null) {
                        System.out.print("New name: ");
                        c.setName(sc.nextLine());

                        System.out.print("New phone: ");
                        c.setPhone(sc.nextLine());

                        System.out.print("New email: ");
                        c.setEmail(sc.nextLine());
                        System.out.println("Contact updated!");
                    } else {
                        System.out.println("Invalid contact.");
                    }
                    break;

                case 4:
                    service.viewContacts();
                    System.out.print("Enter contact number to delete: ");
                    int d = sc.nextInt() - 1;
                    service.deleteContact(d);
                    break;

                case 5:
                    System.out.println("Thank you for using the system!");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}