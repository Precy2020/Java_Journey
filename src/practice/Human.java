package practice;

public class Human {
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void createOccupation(){
        Occupation occupation = new Occupation();
        getPerson().setOccupation(occupation);
        getPerson().getOccupation().setComputers(new Computers());
        getPerson().setName("prcious");
        getPerson().setAge("11");

    }
}
