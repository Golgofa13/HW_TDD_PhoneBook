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
                break;
            }
        }
        return theDesiredKey;
    }

    public String findByName(String name){
        String theDesiredValue = null;

        for(Map.Entry<String,String> entry : contacts.entrySet()){
            if (entry.getKey().equals(name)){
                theDesiredValue = entry.getValue();
                break;
            }
        }
        return theDesiredValue;
    }
}
