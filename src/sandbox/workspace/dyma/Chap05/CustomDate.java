package sandbox.workspace.dyma.Chap05;

public class CustomDate {

    private Day day;

    public CustomDate(Day day) {
        this.day = day;
    }

    public Day getDay() {
        return this.day;
    }

    public CustomDate setDay(Day day) {
        this.day = day;
        return this;
    } 
}
