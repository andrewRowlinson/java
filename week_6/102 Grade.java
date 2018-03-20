/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andyr
 * 
 * 
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Grade {
    private int grade0;
    private int grade1;
    private int grade2;
    private int grade3;
    private int grade4;
    private int grade5;
    ArrayList<Integer> grades = new ArrayList<Integer>();
    
    public Grade() {
        this.grade0=0;
        this.grade1=0;
        this.grade2=0;
        this.grade3=0;
        this.grade4=0;
        this.grade5=0;
    }
    
    public void createGrade(Scanner reader) {
        System.out.println("Type exam scores, -1 completes:");
        while(true) {
            int points = Integer.parseInt(reader.nextLine());
            if (points == -1) {
                grades.add(grade0);
                grades.add(grade1);
                grades.add(grade2);
                grades.add(grade3);
                grades.add(grade4);
                grades.add(grade5);
                break;
            }
            else if (points < 0) {
            }
            else if (points < 30) {
                grade0++;
            }
            else if (points < 35) {
                grade1++;
            }
            else if (points < 40) {
                grade2++;
            }
            else if (points < 45) {
                grade3++;
            }
            else if (points < 50) {
                grade4++;
            }
            else if (points <= 60) {
                grade5++;
            }
            else {
            }
        }
    }
    
    public void printStars(int grade) {
        String stars = "";
        for (int i=0; i < grade; i++) {
            stars += "*";
        }
        System.out.println(stars);
    }
    
    public double acceptance() {
        int bottom=0;
        for (int i=0; i < grades.size(); i++) {
            bottom+=grades.get(i);            
        }
        return ((bottom-grade0)*100.0)/bottom;
    }
    
    public void print() {
        System.out.println("Grade distribution:");
        for (int i=5; i>=0; i--) {
            System.out.print(i + ": ");
            printStars(grades.get(i));
        }
        System.out.println("Acceptance percentage: " + acceptance()); 
    }
}
