package classwork;

import java.util.Scanner;

public enum Zones {

    NORTHCENTRAL(new String[]{"Benue, Kogi, Kwara, Nasarawa, Niger, Plateau States, Abuja"}),
    NORTHEAST(new String[]{"Adamawa, Bauchi, Borno, Gombe, Taraba, Yobe States"}),
    NORTHWEST(new String[]{"Jigawa, Kaduna, Kano, Katsina, Kebbi, Sokoto, Zamfara States"}),
    SOUTHEAST(new String[]{"Abia, Anambra, Ebonyi, Enugu, Imo States"}),
    SOUTHSOUTH(new String[]{"Akwa_Ibom, Bayelsa, Cross River, Delta, Edo, Rivers States"}),
    SOUTHWEST(new String[]{"Ekiti, Lagos, Ogun, Ondo, Osun, Oyo States"});



    Zones(String[] states) {
        this.states = states;
    }
    public static Scanner input = new Scanner(System.in);




    private String[] states;

    public void setStates(String[] states) {
        this.states = states;
    }

    public String[] getStates() {
        return states;
    }


    public static String userInput(){
        System.out.println("Enter your state ");
        String user = input.next();
       String arrayList = null;

        for (int geopoliticalZone = 0; geopoliticalZone < Zones.values().length; geopoliticalZone++) {
            for (int states = 0; states < geopoliticalZone; geopoliticalZone++) {
                if (user.equalsIgnoreCase(String.valueOf(states))){
                    arrayList = String.valueOf(states);
                }
                else {
                    arrayList = "Not valid";
                }
            }

        }
        return arrayList;

        }






    }





















