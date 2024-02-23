package org.Example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ContactManagerTest {

    private static ContactManager contactManager;

    @BeforeAll
    public static void setup(){
        contactManager = new ContactManager();
    }


    @Test
    @DisplayName("Should Create Contact")
    public void shouldCreateContact(){
        //Assumptions.assumeTrue("Dev".equals(System.getProperty("Env")));
        contactManager.addContact("Syed","Khaja", "98765");

        //assertFalse(should give false)
        assertFalse(contactManager.getAllContacts().isEmpty());

        //assertEquals(c1,c2) --> checks c1==c2
        assertEquals(1, contactManager.getAllContacts().size());
    }

    @Test
    @DisplayName("Should not Create contact when FirstName is Null")
//    @ParameterizedTest
//    @ValueSource(strings = {"12565854", "1244415454", "3546584654"})
//    //@ValueSource(strings = {"12565854", "1244415454", "3546584654"})
//    //@MethodSource("phNumberList")
//    //@Disabled --> to disable a particular test
    public void shouldThrowRuntimeExceptionWhenFirstNameNull(){
        Assertions.assertThrows(RuntimeException.class,()->{
            contactManager.addContact(null,"Dan", "56456444451");
        });
    }

    @Test
    @DisplayName("Should not Create contact when LastName is Null")
    public void shouldThrowRuntimeExceptionWhenLastNameNull(){
        Assertions.assertThrows(RuntimeException.class,()->{
            contactManager.addContact("Dan",null,"5268498554");
        });
    }

    @Test
    @DisplayName("Should not Create contact when PhoneNumber is Null")
    public void shouldThrowRuntimeExceptionWhenPhoneNumberNull(){
        Assertions.assertThrows(RuntimeException.class,()->{
            contactManager.addContact("Leo","Dan",null);
        });
    }

}

