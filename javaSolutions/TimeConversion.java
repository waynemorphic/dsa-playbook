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

    // Method two
    public static String timeConversion(String s) {
        // Write your code here
        String pm = "PM";
        String am = "AM";
        String hh = s.substring(0,2);
        String mm = s.substring(3,5);
        String ss = s.substring(6, 8);
        String timeFormat = s.substring(8, s.length());
        int time = Integer.parseInt(hh);
        String military = "";
        
        if (timeFormat.equals(pm) && hh.equals("12")){
            military = s.substring(0,8);
        }
        else if (timeFormat.equals(pm)){
            time += 12;                       
            military = String.valueOf(time)+":"+mm+":"+ss;
        }
        else if (timeFormat.equals(am) && hh.equals("12")){
            // time = Integer.parseInt(hh) - 12;
            // System.out.println(time); 
            military = String.format("00"+":"+mm+":"+ss);
        }
        else {
            military = hh+":"+mm+":"+ss;
        }
        return military;
    }

    public static void main(String[] args){
        String input = "07:18:01PM";
        TimeConversion.solution(input);
    }
}
