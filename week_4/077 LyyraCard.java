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
public class LyyraCard {
    private double balance;
    
// constructer
    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }
    
// to string method
    
    public String toString() {
        return "The card has " + this.balance + " euros";
    } 
    
// pay economical method
    
    public void payEconomical() {
        if (this.balance >= 2.5) {
            this.balance -= 2.5;
        }       
    }

// pay gourmet method    
    
    public void payGourmet() {
        if (this.balance >= 4.0) {
            this.balance -= 4.0;
        }
    }
    
// load money

    public void loadMoney(double amount) {
        if (amount < 0) {
        }
        else if (this.balance + amount > 150) {
            this.balance = 150;
        }
        else {
            this.balance += amount;
        }
    }
    
}
