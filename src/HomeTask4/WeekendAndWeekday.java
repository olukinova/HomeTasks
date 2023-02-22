package HomeTask4;

public class WeekendAndWeekday {
    public static void main(String[] args) {
        boolean workday = true;
        int day;


      /*  while(workday) {
            if(day<=5) {
                System.out.println("I need a day off");
            } else {
                System.out.println("I do not need a day off anymore");
                workday = false;
            }
            day++;
        }*/

        for(day = 1; day <= 7; day++) {
            if(day<=5) {
                System.out.println("I need a day off");
            } else {
                System.out.println("I do not need a day off anymore");
            }
        }
    }
}
