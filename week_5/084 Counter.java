/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andyr
 */
// define attributes
public class Counter {
    private int value;
    private boolean check;
    
// create constructor to be called
    public Counter(int startingValue, boolean check) {
        this.value = startingValue;
        this.check = check;
        }
    
// constructor given starting value (check set to off)
    public Counter(int startingValue) {
        this(startingValue,false);
    }
    
// constructor given check (starting value set to 0
    public Counter(boolean check) {
        this(0,check);
    }
    
// constructor no values
    public Counter() {
        this(0,false);
    }
  
// return current value of counter
    public int value() {
        return this.value;
    }
// increase counter by number
    public void increase(int number) {
        if (number>0) {
            this.value+=number;           
        }
    }
    
// increase counter by 1
    public void increase() {   
        this.value++;
    }
    
// decrease counter by 1
    public void decrease() {
        if (value > 0 && this.check == true) {
            this.value--;
        }
        else if (this.check == false) {
            this.value--;
        }
    }

// decrease counter by number
    public void decrease(int number) {
        if ((value - number) > 0 && this.check == true && number>0) {
            this.value-=number;
        }
        else if ((value - number) < 0 && this.check == true && number>0) {
            this.value=0;
        }
        else if (this.check == false && number>0) {
            this.value-=number;
        }
    }
    
    
    public String toString() {
        return value + " parameter: " + this.check;
    }
}
