package Enums;

public class Enum1 {
    public static void main(String[] args) {
        Today t1 = new Today(WeekDays.SATURDAY);
        Today t2 = new Today(WeekDays.MONDAY);
        t1.daysInfo();
        t2.daysInfo();
        System.out.println(WeekDays.FRIDAY);

        WeekDays w = WeekDays.valueOf("MONDAY");
        System.out.println(w);
        WeekDays[] arr = WeekDays.values();
    }

}

enum WeekDays {
    MONDAY("bad"),
    TUESDAY("bad"),
    WEDNESDAY("so-so"),
    THURSDAY("so-so"),
    FRIDAY("good"),
    SATURDAY("great"),
    SUNDAY("good");

    private String mood;
    private WeekDays(String mood){
        this.mood = mood;
    }

    public String getMood(){
        return mood;
    }
}

class Today {
    WeekDays weekDays;

    public Today(WeekDays weekDays) {
        this.weekDays = weekDays;
    }

    void daysInfo() {
        switch (weekDays) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Go to work");
                break;
            case SUNDAY:
            case SATURDAY:
                System.out.println("Rest");
                break;
        }
        System.out.println("Mood in this day " + weekDays.getMood());
    }
}
