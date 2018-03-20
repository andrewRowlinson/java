
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LyyraCard cardPekka = new LyyraCard(20);
        LyyraCard cardBrian = new LyyraCard(30);
        
        cardPekka.payGourmet();
        cardBrian.payEconomical();
        
        System.out.println("Pekka: " + cardPekka.toString());
        System.out.println("Brian: " + cardBrian.toString());   
        
        cardPekka.loadMoney(20);
        cardBrian.payGourmet();
        
        System.out.println("Pekka: " + cardPekka.toString());
        System.out.println("Brian: " + cardBrian.toString());   
        
        cardPekka.payEconomical();
        cardPekka.payEconomical();
        
        System.out.println("Pekka: " + cardPekka.toString());   
        
        cardBrian.loadMoney(50);
        
        System.out.println("Brian: " + cardBrian.toString());          
        
        
        
        
        
        
        
        //card.loadMoney(-15);
        //System.out.println(card);
        
        //card.loadMoney(10);
        //System.out.println(card);
        
        //card.loadMoney(200);
        //System.out.println(card);
        
        //card.payEconomical();
        //System.out.println(card);
        
        //card.payGourmet();
        //System.out.println(card);
        //.payEconomical();
        //card.payGourmet();
        //System.out.println(card);
        // add here code that tests LyraCard. However before doing 77.6 remove the
        // other code 

    }
}
