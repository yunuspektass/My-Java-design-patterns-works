package com.yunuspektas.structural.proxy;

import java.io.FileOutputStream;
import java.util.*;

public class PersonList {

//    Kişi listesini ekledik
    public static List<Person> getPersonList(){
       Person person1 = new Person("yunus@gmail.com" , "root" , true);
       Person person2 = new Person("deneme@gmail.com" , "deneme" , false);

       List<Person> personList = new ArrayList<Person>();
       personList.add(person1);
       personList.add(person2);

        return personList;
    }
//    1- Kişinin email adresinden Person objesine erişmek için Map yazalım
    public static Map<String , Person> getUserEmailMap(){
   List<Person> personList = getPersonList();
Map<String,Person> personMapList = new LinkedHashMap<String , Person>();

  for (Person person : personList){
      personMapList.put(person.getUserEmail() , person);
  }
  return personMapList;
    }
//  2-  Kişinin email adresinden --> person objesine erişmek map'i kullanalım
    public  static Person getPersonEmailAddress(String userEmail){
Map<String,Person> personMap = getUserEmailMap();
Person person = personMap.get(userEmail);
return person;

    }
public static boolean isUserEmail(String userEmail , String userPassword){
        boolean result = false;
        Person person = getPersonEmailAddress(userEmail);

        if (person!=null){
            result = person.getUserPassword().equals(userPassword);
        }
        return result;
}
}
