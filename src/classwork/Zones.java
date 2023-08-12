package classwork;

import java.util.Scanner;

public enum Zones {

    NORTHCENTRAL("Benue", "Kogi", "Kwara", "Nasarawa", "Niger", "Plateau States", "Abuja"),
    NORTHEAST("Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe States"),
    NORTHWEST("Jigawa", "Kaduna", "Kano", "Katsina", "Kebbi", "Sokoto", "Zamfara States"),
    SOUTHEAST("Abia", "Anambra", "Ebonyi", "Enugu", "Imo States"),
    SOUTHSOUTH("Akwa_Ibom", "Bayelsa", "Cross River", "Delta", "Edo", "Rivers States"),
    SOUTHWEST("Ekiti", "Lagos", "Ogun", "Ondo", "Osun", "Oyo States");


    private String[] states;


    Zones(String... states) {
        this.states = states;

    }

    public void setStates(String[] states) {
        this.states = states;
    }

    public String[] getStates() {
        return states;
    }

    public static void userInputIsValid(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your state ");
        String user = input.next();
        for (Zones state : Zones.values()) {
           for(String s : state.states){
               if (s.equalsIgnoreCase(user)){
                   System.out.println(state);
               }
               else{
                   System.out.println("Invalid");
               }
           }
        }
    }




}































