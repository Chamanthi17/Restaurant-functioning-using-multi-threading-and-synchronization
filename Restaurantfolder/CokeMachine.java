package Restaurantfolder;

public class CokeMachine {
    private static int time;

    public static int getTime(){
        return time;
    }

    public static synchronized int serveCokes(int machineTime, int cokes, int dinerId){
        int start;
        if(time > machineTime){
            start = time;
        }
        else{
            start = machineTime;
        }

        // 1 mins. per serving of coke
        time = start + cokes;

        System.out.println("CokesMachine serves diner No." + dinerId + " 's order from " + start + " to " + time);
        return time;
    }
}
