package org.Example;

import java.util.ArrayList;
import java.util.List;

public class ContactManager {

    private List<Contact> allContacts;

    public ContactManager() {
        allContacts = new ArrayList<>();
    }

    public void addContact(String firstName, String lastName, String contactNumber) throws RuntimeException{
        if(firstName==null) {
            throw new RuntimeException("First name is null");
        }else if (contactNumber == null)  {
            throw new RuntimeException("Contact Number is null");
        }
        else if (lastName == null)  {
            throw new RuntimeException("Last Number is null");
        }
        else {
            allContacts.add(new Contact(firstName, lastName, contactNumber));
        }
    }

    public List<Contact> getAllContacts(){
        return allContacts;
    }
}
