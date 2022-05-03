package fop.w7cal;

public class InfiniteRepeatEvent extends Event {

    private int period;

    public InfiniteRepeatEvent(int day, String description, String place, int period) {
        super(day, description, place);
        this.period = period;
    }

    public int getPeriod() {
        return period;
    }

    @Override
    public int diff(int day) {
        int targetDay = super.getDay();
        if (day <= targetDay) return super.diff(day);
        while (targetDay <= day) {
            targetDay += period;
        }
        return targetDay - day;
    }

}
