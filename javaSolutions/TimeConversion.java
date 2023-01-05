package javaSolutions;

public class TimeConversion {
    public static String solution(String s){
        String[] splitted = s.split(":");
        String aMOrPm = splitted[2].substring(2,4); // -> check if time is Am or PM

        // converting the strings to integers
        int hours = Integer.parseInt(splitted[0]);
        int minutes = Integer.parseInt(splitted[1]);
        int seconds = Integer.parseInt(splitted[2].substring(0,2));

        // Strings for checking if AM or PM
        String timeAM = "AM";
        String timePM = "PM";

        if (aMOrPm.equals(timeAM) && hours == 12){
            hours = 0;
        }

        else if (aMOrPm.equals(timePM) && hours < 12){
            hours += 12;
        }

        String convTime = String.format("%02d:%02d:%02d", hours, minutes, seconds);
        System.out.println(convTime);
        return convTime;
        
    }

    public static void main(String[] args){
        String input = "07:18:01PM";
        TimeConversion.solution(input);
    }
}
