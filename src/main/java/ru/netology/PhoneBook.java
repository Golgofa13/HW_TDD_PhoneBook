package ru.netology;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    private Map<String,String> contacts;

    public PhoneBook(){
        contacts = new HashMap<>();
    }

    public int add(String name, String number) {

        contacts.put(name,number);
        return contacts.size();
    }

    public String findByNumber(String number){

        String theDesiredKey = null;

        for(Map.Entry<String,String> entry : contacts.entrySet()){
            if (entry.getValue().equals(number)){
                theDesiredKey = entry.getKey();
            }
        }
        return theDesiredKey;
    }
}
