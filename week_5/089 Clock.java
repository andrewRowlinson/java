public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;
   
    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        this.hours = new BoundedCounter(23);
        this.minutes = new BoundedCounter(59);
        this.seconds = new BoundedCounter(59);
        hours.setValue(hoursAtBeginning);
        minutes.setValue(minutesAtBeginning);
        seconds.setValue(secondsAtBeginning);
        // the counters that represent hours, minutes and seconds are created and set to have the correct initial values
    }
    
    public void tick() {
        // Clock advances by one second
        seconds.next();
        if (seconds.getValue()==0) {
            minutes.next();                
            }
        if (minutes.getValue()==0 && seconds.getValue()==0) {
            hours.next();
            }  
        }
    
    public String toString() {
        // returns the string representation
        return this.hours + ":" + this.minutes + ":" + this.seconds;
    }
}
