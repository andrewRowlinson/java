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

public class Team {
    private String name;
    private ArrayList<Player> players;
    private int upperBound;
    
    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<Player>();
        this.upperBound = 16;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void addPlayer(Player player) {
        if (players.size() < upperBound) {
            this.players.add(player);
        }
    }
    
    public int goals() {
        int goals = 0;
        for (Player player: this.players) {
            goals += player.goals();
        }
        return goals;
    }
    
    public void setMaxSize(int maxSize) {
        this.upperBound = maxSize;        
    }
    
    public int size() {
        return this.players.size();
    }
    
    public void printPlayers() {
        for (Player player : this.players) {
            System.out.println(player);
        }
    }
        
}
