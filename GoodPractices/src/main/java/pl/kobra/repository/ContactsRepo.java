package pl.kobra.repository;

import pl.kobra.repository.model.ContactItem;

import java.util.Set;

public class ContactsRepo {
    private static Set<ContactItem> contacts;
    private Finder finder = new Finder();

    public static ContactsRepo init() {
        ContactsRepo contactsRepo = new ContactsRepo();
        contactsRepo.contacts = ContactsData.getContactsFromCSV();
        return contactsRepo;
    }

    public Set<ContactItem> findContact(String input) {
        return finder.findContact(contacts, input);
    }
}
