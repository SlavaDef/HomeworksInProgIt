package collections;

import java.util.HashMap;
import java.util.Map;

// Список контактів. Розробіть програму для зберігання та управління списком
//контактів (ім'я та номер телефону). Використайте стандартні колекції

class PhoneBook {

    private final Map<String, String> phonebook = new HashMap<>();

    private int count = 1;

    public void addContact(String name, String phone) {

        if (phonebook.containsKey(name)) {
            name = name + "_" + count;
            phonebook.put(name, phone);
            count++;
        }
        phonebook.put(name, phone);
    }

    public Map<String, String> getAllContscts() {
        System.out.println(phonebook);
        return phonebook;
    }

    public String getContactByName(String name) {
        return phonebook.get(name);
    }

    public void deleteContact(String name) {

        phonebook.remove(name);
    }

    public boolean clearPhonebook() {

        phonebook.clear();

        return phonebook.isEmpty();
    }

    void getAll(){
        for (Map.Entry<String, String> stringStringEntry : phonebook.entrySet()) {
            System.out.println(stringStringEntry);
        }
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "phonebook=" + phonebook +
                '}';
    }
}

class TestPhonebook {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact("Barbara S.A.", "38050-934-21-22");
        phoneBook.addContact("Lyi V.A.", "38050-654-21-29");
        phoneBook.addContact("Bob S.R.", "38050-888-21-21");
        phoneBook.addContact("Larry P.O", "38050-098-65-16");
        phoneBook.addContact("Sidney R.R.", "38050-777-44-22");
        phoneBook.addContact("Sidney R.R.", "38050-777-47-22");
        phoneBook.addContact("Sidney R.R.", "38050-777-99-22");

        phoneBook.getAllContscts();
        System.out.println(phoneBook.getContactByName("Bob S.R."));
        //  phoneBook.clearPhonebook();
        phoneBook.deleteContact("Larry P.O");
        phoneBook.getAllContscts();
        phoneBook.getAll();

    }
}