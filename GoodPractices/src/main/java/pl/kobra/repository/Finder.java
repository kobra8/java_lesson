package pl.kobra.repository;

import pl.kobra.repository.model.ContactItem;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Finder {
    /**
     * Szuka w kontaktach takich, które są zgodne z zapytaniem (no cas sensitive)
     * @param contacts kontakty do przeszukania
     * @param input zapytanie do odszukania
     * @return kontakty zgodne z zapytaniem
     */

    Set<ContactItem> findContact(Set<ContactItem> contacts, String input) {
        return new HashSet<ContactItem>(contacts.stream()
                .filter(contact -> contact.toString().toLowerCase().contains(input.toLowerCase()))
                .collect(Collectors.toList()));
    }
}
