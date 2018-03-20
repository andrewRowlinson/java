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
import java.util.Scanner;

public class Commands {
    private ArrayList<Bird> birds;
    
    public Commands() {
        this.birds = new ArrayList<Bird>();
    }
    
    public void menu(Scanner reader) {
        while(true) {
            System.out.print("? ");
            String command = reader.nextLine();
            if (command.equals("Quit")) {
                break;
            }
            else if (command.equals("Add")) {
                System.out.print("Name: ");
                String birdName = reader.nextLine();
                System.out.print("Latin name: ");
                String latinName = reader.nextLine();
                Bird newBird = new Bird(birdName,latinName);
                add(newBird);                
            }
            else if (command.equals("Observation")) {
                System.out.print("What was observed:? ");
                String birdObserved = reader.nextLine();
                observe(birdObserved);
            }  
            else if (command.equals("Statistics")) {
                statistics();
            }
            else if (command.equals("Show")) {
                System.out.print("What? ");
                String birdShow = reader.nextLine();
                show(birdShow);
            }
        }
    }
    
    
    
    
    public void add(Bird newBird) {
        this.birds.add(newBird);
    }
    
    public void observe(String birdName) {
        if (birdContains(birdName)) {
            for (Bird i : this.birds) {
                if (i.getName().contains(birdName)) {
                    i.addObservation();
                }
            }
        }
        else {
            System.out.println("Is not a bird!");
        }
    }
        
    
    public boolean birdContains(String birdName) {
        for (Bird i : this.birds) {
            if (i.getName().contains(birdName)) {
                return true;
            }
        }
        return false;
    }
    
    public void statistics() {
        for (Bird i : this.birds) {
            System.out.println(i.getString());            
        }
    }
    
    public void show(String birdName) {
        if (birdContains(birdName)) {
            for (Bird i : this.birds) {
                if (i.getName().equals(birdName)) {
                    System.out.println(i.getString());
                }
            }
        }
        else {
            System.out.println("Is not a bird!");
        }
    }
}
