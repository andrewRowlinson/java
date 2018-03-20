/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andyr
 */
public class Player {
    private String playerName;
    private int playerGoals;
    
    public Player(String name, int goals){
        this.playerName = name;
        this.playerGoals = goals;
    }
    
    public Player(String name) {
        this(name, 0);
    }
    
    public String getName() {
        return this.playerName;
    }
    
    public int goals() {
        return this.playerGoals;
    }
    
    public String toString() {
        return "Player: " + this.playerName + ", " + "goals " + this.playerGoals;
    }
    
}
