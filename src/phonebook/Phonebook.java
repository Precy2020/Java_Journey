package phonebook;

import java.util.ArrayList;

public class Phonebook {
    private static ArrayList<Contact> contacts = new ArrayList<>();

    public void add (String name, String address, String telephone, String email){
        Contact contact = new Contact(name, address, telephone, email);
        contacts.add(contact);
    }

    public Contact findByName(String name){
        return getContact(name);
    }

    private static Contact getContact(String name) {
        for (Contact search : contacts) {
            if (search.getName().equals(name)){return search;}
            }
       throw new NullPointerException("This name does not exist");
    }

    public void deleteContact(String name){
        contacts.removeIf(contact -> contact.getName().equals(name));
    }
}
