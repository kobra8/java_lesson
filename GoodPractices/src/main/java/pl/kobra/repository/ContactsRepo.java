package pl.kobra.repository;

import java.util.Set;

public class ContactsRepo {
    private static Set<String> contacts;
    private Finder finder = new Finder();

    public static ContactsRepo init() {
        ContactsRepo contactsRepo = new ContactsRepo();
        contactsRepo.contacts = ContactsGenerator.createContacts();
        return contactsRepo;
    }

    public Set<String> findContact(String input) {
        return finder.findContact(contacts, input);
    }
}
