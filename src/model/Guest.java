package model;

public class Guest {
    private String Nic;
    private String Name;
    private String Email;
    private String Telephone;
    private String Address;

    public Guest() {
    }

    public Guest(String nic, String name, String email, String telephone, String address) {
        Nic = nic;
        Name = name;
        Email = email;
        Telephone = telephone;
        Address = address;
    }

    public String getNic() {
        return Nic;
    }

    public void setNic(String nic) {
        Nic = nic;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getTelephone() {
        return Telephone;
    }

    public void setTelephone(String telephone) {
        Telephone = telephone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "Nic='" + Nic + '\'' +
                ", Name='" + Name + '\'' +
                ", Email='" + Email + '\'' +
                ", Telephone='" + Telephone + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}
