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
public class BoundedCounter {
    private int value;
    private int upperLimit;

// constuctor
    public BoundedCounter (int upperLimit) {
        this.value=0;
        this.upperLimit=upperLimit;
    }
    
// method next
    public void next() {
        if (this.value + 1 > upperLimit) {
            this.value=0;
        }
        else {
            this.value++;
        }
    }
    
// method get value
    public int getValue() {
        return this.value;
    }
    
// set value
    
    public void setValue(int value) {
        if (value < 0 || value > upperLimit) {
        }
        else {
            this.value=value;
        }
    }
    
// method to string
    
    public String toString() {
        if (this.value < 10) {
            return "0" + this.value;
        }
        else {
            return "" + this.value;
        }
    }
}
