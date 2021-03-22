package com.knoldus;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookCrawlerTest {
    PhoneBookCrawler crawler = new PhoneBookCrawler();

    String name ="gaurav";
    String number ="9897654378";
    @Test
    void findPhoneNoByNameAndPunishIfNothingFound() {
        String num = crawler.findPhoneNoByNameAndPunishIfNothingFound(name);
        assert (num.equals("9897654378"));
    }

    @Test
    void findPhoneByNameAndPrintPhoneBookIfNothingFound() {
        String num = crawler.findPhoneByNameAndPrintPhoneBookIfNothingFound(name);
        assert (num.equals("9897654378"));
    }

    @Test
    void findPhoneByNameAndPrintPhoneBookIfNothingFoundUsingToStringMethod() {
        String num = crawler.findPhoneByNameAndPrintPhoneBookIfNothingFoundUsingToStringMethod(name);

        Assert.assertEquals(num,"9897654378");
    }

    @Test
    void findPhoneNumberByNameUsingStream() {
        String num= crawler.findPhoneNumberByNameUsingStream(name);
        Assert.assertEquals(num,"9897654378");
    }


    @Test
    void findPhoneByNameAndPrintPhoneBookIfNothingFoundUsingStreams() {
        String num = crawler.findPhoneNumberByNameUsingStream(name);
        Assert.assertEquals(num,"9897654378");
    }
    @Test
    void findPhoneNumberByNameOrNameByPhoneNumber(){
        String num = crawler.findPhoneNumberByNameOrNameByPhoneNumber(name,number);
        Assert.assertEquals(num,"9897654378");
    }
    @Test
    void findPhoneNumberByNameOrNameByPhoneNumber2(){
        name ="tosh";
        String nameBy = crawler.findPhoneNumberByNameOrNameByPhoneNumber(name,number);
        Assert.assertEquals(nameBy,"vaibhav bansal");
    }
}
