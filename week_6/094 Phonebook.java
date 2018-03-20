/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andyr
 */
import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> persons;
    
    public Phonebook() {
        this.persons = new ArrayList<Person>();
    }
    
    public void add(String name, String number) {
        Person personToAdd = new Person(name, number);
        persons.add(personToAdd);
    }
    
    public void printAll() {
        for (Person i : persons) {
            System.out.println(i);
        }
    }
    
    public String searchNumber(String name) {
        for (Person i : persons) {
            if (i.getName().equals(name)) {
                return i.getNumber();
            }
        }
            return "number not known";
    }
}
