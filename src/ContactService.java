import java.util.ArrayList;

public class ContactService {

    private ArrayList<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Contact added successfully!");
    }

    public void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found.");
            return;
        }

        for (int i = 0; i < contacts.size(); i++) {
            System.out.println((i + 1) + ". " + contacts.get(i));
        }
    }

    public Contact getContact(int index) {
        if (index < 0 || index >= contacts.size()) {
            return null;
        }
        return contacts.get(index);
    }

    public void deleteContact(int index) {
        if (index < 0 || index >= contacts.size()) {
            System.out.println("Invalid contact number.");
            return;
        }
        contacts.remove(index);
        System.out.println("Contact deleted successfully.");
    }
}