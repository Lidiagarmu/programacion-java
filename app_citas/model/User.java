package model;


public abstract class User {

    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() > 8){
            System.out.println("El teléfono tiene demasiados digitos");
        } else if(phoneNumber.length() == 8) {
            this.phoneNumber = phoneNumber;
        }
    }
    @Override
    public String toString(){
        return "model.User: " + name + ", Email: " + email + "\nAddres: " + address + ". Phone: " + phoneNumber;
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;

    }

    //creamos un metodo abstracta general para poder implementar en sus clases hijas obligatoriamente al llevar abstract
    //este metodo ahora no llevará {} sino ()

    /* este metodo se comportara diferente en las clases hijas Doctor y Nurse al de la clase hija Patient por que
    * querremos mostrar datos diferente al ser los primeros empleados y paciente no*/
    public abstract void showDataUser();
}
