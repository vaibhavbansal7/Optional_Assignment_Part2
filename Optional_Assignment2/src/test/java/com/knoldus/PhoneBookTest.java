package com.knoldus;

import java.util.Optional;

class PhoneBookTest {
    PhoneBook phoneBookObject = new PhoneBook();


    @org.junit.jupiter.api.Test
    void findPhoneByName() {
        String name ="gaurav";
        Optional<String> phoneNum = phoneBookObject.findPhoneByName(name);
        assert(phoneNum.get().equals("9897654378"));
    }

    @org.junit.jupiter.api.Test
    void findNameByPhoneNumber() {
        String number ="9557672313";
        Optional<String> name = phoneBookObject.findNameByPhoneNumber(number);
        assert (name.get().equals("vaibhav bansal"));
    }



}