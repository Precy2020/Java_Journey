package special_assignments;

public class Geopolitical_Zones {

    public static void main(String[] args) {
        System.out.println(Geopolitical_zones.SOUTH_EAST.getSOUTH_EAST());
        System.out.println(Geopolitical_zones.NORTH_CENTRAL.getNORTH_CENTRAL());

    }

    public static void north_central(){
        System.out.println("Benue, Kogi, Kwara, Nasarawa, Niger, Plateau States, Abuja.");
    }

    public static void north_east(){
        System.out.println("Adamawa, Bauchi, Borno, Gombe, Taraba, Yobe States");
    }

    public static void north_west(){
        System.out.println("Jigawa, Kaduna, Kano, Katsina, Kebbi, Sokoto, Zamfara States");
    }

    public static void south_east(){
        System.out.println("Abia, Anambra, Ebonyi, Enugu, Imo States");
    }

    public static void south_south(){
        System.out.println("Akwa_Ibom, Bayelsa, Cross River, Delta, Edo, Rivers States");
    }

    public static void south_west(){
        System.out.println("Ekiti, Lagos, Ogun, Ondo, Osun, Oyo States");
    }
}
