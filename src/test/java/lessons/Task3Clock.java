package lessons;

public class Task3Clock {

}

class Clock {
    private int alarmHours;
    private int alarmMinutes;


    public boolean setAlarm(int hours, int minutes){
        boolean result = false;
        if(hours >= 0 && hours < 24 && minutes >= 0 && minutes < 60){
            alarmHours = hours;
            alarmMinutes = minutes;
            result = true;
        }
        return result;
    }

    public String checkAlarm(int hours, int minutes){
        String result = " ";
        if(hours==alarmHours && minutes==alarmMinutes){
            result="Chime";
        }
        return result;
    }

    public int checkTimeCount(int hours, int minutes){
        int numOfChimes = 0;
        if(hours<=12 && minutes == 0){
            numOfChimes = hours;
        } else if(hours>12 && minutes == 0){
            numOfChimes = hours-12;
        } else if(minutes%15==0){
            numOfChimes = 1;
        }
        return numOfChimes;
    }

}
