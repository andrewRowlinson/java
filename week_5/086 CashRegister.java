
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        this.cashInRegister=1000;
    }

    public double payEconomical(double cashGiven) {
        double priceEconomical=2.50;
        if (cashGiven >= priceEconomical) {
            this.cashInRegister+=priceEconomical;
            this.economicalSold++;
            return cashGiven - priceEconomical;
        }
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens        
        return cashGiven;
    }

    public double payGourmet(double cashGiven) {
        double priceGourmet=4.00;
        if (cashGiven >= priceGourmet) {
            this.cashInRegister+=priceGourmet;
            this.gourmetSold++;
            return cashGiven - priceGourmet;
        }
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        return cashGiven;
        }
    
        public boolean payEconomical(LyyraCard card) {
            double priceEconomical=2.50;
            if (card.balance() >= priceEconomical) {
                this.economicalSold++;
                card.pay(priceEconomical);
                return true;
            }
        return false;
        // the price of the economical lunch is 2.50 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
        }

        public boolean payGourmet(LyyraCard card) {
            double priceGourmet=4.00;
            if (card.balance() >= priceGourmet) {
                this.gourmetSold++;
                card.pay(priceGourmet);
                return true;
            }
        return false;
         // the price of the gourmet lunch is 4.00 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
        }
        
        public void loadMoneyToCard(LyyraCard card, double sum) {
            if (sum > 0) {
                card.loadMoney(sum);
                this.cashInRegister+=sum;
            }
        }


    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}