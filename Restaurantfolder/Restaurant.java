package Restaurantfolder;
import java.util.Scanner;
public class Restaurant extends Thread{
    private Tables table;
    private Cooks[] cooks;

    Restaurant(int numTables, int numCooks){
        this.table = new Tables(numTables);
        this.cooks = new Cooks[numCooks];
    }

    public Tables setTables(){
        return this.table;
    }

    public static void main(String[] args) throws Exception{

        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        // Read # of Diners
        System.out.println("Number of diners : ");
        int numDiners = sc.nextInt();
        Diners[] diners = new Diners[numDiners];
        System.out.println("Number of tables : ");
        // Read # of Tables
        int numTables = sc.nextInt();
        System.out.println("Number of cooks : ");
        // Read # of Cooks
        int numCooks = sc.nextInt();

        // Create a restaurant
        Restaurant restaurant = new Restaurant(numTables, numCooks);

        // Create a thread for each cook
        for(int i = 0; i < numCooks; i++){
            restaurant.cooks[i] = new Cooks(i);
            restaurant.cooks[i].start();
        }
        // Read the Diners
        for(int i = 0; i < numDiners; i++){
            System.out.println("Enter the arrival time, number of burgers, number of fries and cokes for diner "+i+": ");
            int arriveTime = sc.nextInt();
            int burgers = sc.nextInt();
            int fries = sc.nextInt();
            int cokes = sc.nextInt();
            diners[i] = new Diners(i, arriveTime, burgers, fries, cokes, restaurant);
            diners[i].setTables();
            diners[i].run();
            Thread.sleep(3);
        }


        // Check whether all orders are completed
        for(int i = 0; i < numDiners; i++){
            while(true){
                if(diners[i].isComplete()) {
                    break;
                }
            }
        }

        // Let all cooks stop working
        for(int i = 0; i < numCooks; i++){
            restaurant.cooks[i].stopWorking();
        }
    }
}

