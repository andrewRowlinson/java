
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }
    
    public Money plus(Money added) {
        Money newMoney = new Money(this.euros + added.euros ,this.cents + added.cents);
        return newMoney;
    }
    
    public Money minus(Money decremented) {
        if (this.less(decremented)) {
            return new Money(0,0);
        }      
        if (this.cents < decremented.cents) {
            int newEuros = this.euros - 1 - decremented.euros;
            int newCents = 100 - decremented.cents + this.cents;
            return new Money(newEuros,newCents);   
        }
        return new Money(this.euros-decremented.euros,this.cents-decremented.cents);
    }
    
    public boolean less(Money compared) {
        if(this.euros < compared.euros | (this.euros == compared.euros && this.cents < compared.cents)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
