package com.knoldus;

import java.util.Map;

/**
 * crawler class.
 */
public class PhoneBookCrawler {
    /**
     * phonebook object.
     */
    private PhoneBook pb = new PhoneBook();

  /*Exercise 2-- Implement findPhoneByNameAndPunishIfNothingFound
  in PhoneBookCrawler that uses the implementation from exercise 1 */
    /**
     * Find Phone number.
     *
     * @param name string argument
     * @return string argument
     */
    public String findPhoneNoByNameAndPunishIfNothingFound(final String name) {

        return pb.findPhoneByName(name)
                .orElse("No phone number found");
    }

  /*Exercise 3- Implement findPhoneByNameAndPrintPhoneBookIfNothingFound
  in PhoneBookCrawler that uses the implementation from exercise 1*/
    /**
     * Find Phone number.
     *
     * @param name string argument
     *
     * @return string argument
     */
    public String findPhoneByNameAndPrintPhoneBookIfNothingFound(final
                                                                 String name) {
        return pb.findPhoneByName(name)
                .orElse("PhoneBook Data" + pb.getMap());


    }

    //Exercise 4---Exercise3 by reimplementing PhoneBook's toString method
    /**
     * Find Phone number.
     *
     * @param name string argument
     * @return string argument
     */
    public String
    findPhoneByNameAndPrintPhoneBookIfNothingFoundUsingToStringMethod(
            final String name) {
        return pb.findPhoneByName(name)
                .orElse("PhoneBook Data" + pb.toString());
    }

    //Exercise 5 --Can you reimplement exercise 2 using streams instead of
    // using PhoneBook's findPhoneNumberByName
    /**
     * Find Phone number.
     *
     * @param name string argument
     * @return string argument
     */
    public String findPhoneNumberByNameUsingStream(final String name) {
        if (pb.getMap().containsKey(name)) {
            return pb.getMap().entrySet().stream()
                    .filter(e -> name.equals(e.getKey()))
                    .map(Map.Entry::getValue)
                    .findFirst().get();
        } else {
            return "Number for the given name does not exist";
        }
    }

    // Exercise 6-- Can you reimplement exercise 3 using streams instead
    // of using PhoneBook's findPhoneNumberByName
    /**
     * Find Phone number.
     *
     * @param name string argument
     * @return string argument
     */
    public String findPhoneByNameAndPrintPhoneBookIfNothingFoundUsingStreams(
            final String name) {
        if (pb.getMap().containsKey(name)) {
            return pb.getMap().entrySet().stream()
                    .filter(e -> name.equals(e.getKey()))
                    .map(Map.Entry::getValue)
                    .findFirst().get();
        } else {
            return "PhoneBook Data - " + pb.getMap();
        }
    }

  /*Implement findPhoneNumberByNameOrNameByPhoneNumber
  in PhoneBookCrawler class. First search the phone book by name.
  If that returns nothing search the phone book by phone number.*/
    /**
     * Find Phone number.
     *
     * @param name string argument
     *
     * @param phoneNumber string argument
     * @return string argument
     */
    public String findPhoneNumberByNameOrNameByPhoneNumber(
            final String name, final String phoneNumber) {
        if (pb.findPhoneByName(name).isPresent()) {
            return pb.findPhoneByName(name).get();
        }
        else if (pb.findNameByPhoneNumber(phoneNumber)
                .isPresent())    {
            return pb.findNameByPhoneNumber(phoneNumber).get();
        }
        else {
            return "no match available";
        }
    }



}
