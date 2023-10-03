package phonebook;

public class Contact {
    private String name;
    private String address;
    private String telephone;
    private String email;

    public Contact(String name, String address, String telephone, String email) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.email = email;
    }



    public String getName() {
        return name;
    }


    public String getAddress() {
        return address;
    }


    public String getTelephone() {
        return telephone;
    }


    public String getEmail() {
        return email;
    }

    public void updateContact(String name, String address, String telephone, String email){
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
