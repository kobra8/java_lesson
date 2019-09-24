package pl.kobra.repository.model;

import java.util.Objects;

public class ContactItem {
    private String name;
    private String surname;
    private MailRecords mail;
    private PhoneRecords phone;

    public ContactItem() {
    }

    public ContactItem(String name, String surname, String mail, String phone) {
        this.name = name;
        this.surname = surname;
        this.mail = new MailRecords(mail);
        this.phone = new PhoneRecords(phone);
    }

    /**
     * Tworzy kontakt z jednym telefonem i jednym mailem
     * @param from CSV string
     * @return kontakt
     */
    public static ContactItem fromString(String from) {
        // Rozbijamy stringa na pola i przypisujemy je obiektowi

        ContactItem contactItem = new ContactItem();

        String[] args = from.split(",");

        contactItem.setName(args[0]);
        contactItem.setSurname(args[1]);
        contactItem.setMail(new MailRecords(args[2]));
        contactItem.setPhone(new PhoneRecords(args[3]));

        return contactItem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public MailRecords getMail() {
        return mail;
    }

    public void setMail(MailRecords mail) {
        this.mail = mail;
    }

    public PhoneRecords getPhone() {
        return phone;
    }
    public void setPhone(PhoneRecords phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactItem that = (ContactItem) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(surname, that.surname) &&
                Objects.equals(mail, that.mail) &&
                Objects.equals(phone, that.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, mail, phone);
    }

    @Override
    public String toString() {
        return "ContactItem{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", mail='" + mail + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
