package special_assignments;

public enum Geopolitical_zones {
    NORTH_CENTRAL("Benue, Kogi, Kwara, Nasarawa, Niger, Plateau States, Abuja"),
    NORTH_EAST("Adamawa, Bauchi, Borno, Gombe, Taraba, Yobe States"),
    NORTH_WEST("Jigawa, Kaduna, Kano, Katsina, Kebbi, Sokoto, Zamfara States"),
    SOUTH_EAST("Abia, Anambra, Ebonyi, Enugu, Imo States"),
    SOUTH_SOUTH("Akwa_Ibom, Bayelsa, Cross River, Delta, Edo, Rivers States"),
    SOUTH_WEST("Ekiti, Lagos, Ogun, Ondo, Osun, Oyo States");


    Geopolitical_zones(String states) {
        this.states = states;
    }


    private String states;

    public String getStates(){return states;}

}


