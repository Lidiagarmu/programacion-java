package model;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends User{
    static int id=0; // Autoincrement

        // PROPIEDADES o ATRIBUTOS DE ESTA CLASE

    private String birthday;
    private double weight;
    private double height;
    private String blood;

    private ArrayList<AppointmentDoctor> appointmentDoctors = new ArrayList<>();
    private ArrayList<AppointmentNurse> appointmentNurses = new ArrayList<>();

    public ArrayList<AppointmentDoctor> getAppointmentDoctors() {
        return appointmentDoctors;
    }

    public void addAppointmentDoctors(Doctor doctor, Date date, String time) {
      AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this, doctor) ;
      appointmentDoctor.schedule(date, time);
      appointmentDoctors.add(appointmentDoctor);
    }

    public ArrayList<AppointmentNurse> getAppointmentNurses() {
        return appointmentNurses;
    }

    public void setAppointmentNurses(ArrayList<AppointmentNurse> appointmentNurses) {
        this.appointmentNurses = appointmentNurses;
    }

    //---------METODO CONSTRUCTOR-------SE ENCARGA DE DEFINIR LOS PARAMETROS OBLIGATORIOS PARA QUE EL OBJETO EXISTA
     // METODO CONSTRUCTOR que cuando creas una nueva instancia de esta clase se ejecuta automáticamente
    public Patient(String name, String email) {
        super(name, email);
        //mas instrucciones --> si hacemos esto estamos sobreescribiendo

    }


    // metodo abstracto heredado de la clase User que vamos a sobreescribir (polimorfismo)
    @Override
    public void showDataUser() {
        System.out.println("Paciente");
        System.out.println("Historial completo desde nacimiento");

    }

    //-----------GETTERS Y SETTERS-----VALIDAN los datos que queremos asignar u obtener

    // 54.5 devuelve esto
    // PUBLIC porque queremos que se pueda acceder desde cualquier parte del codigo
    // void en este caso porque no devuelve nada . con set solo queremos asignar un valor
    //con set se asigna valor y le diremos que será de tipo double
    public void setWeight(double weight) {
        this.weight = weight;
    }

    // 54.5 kg. Queremos que devuelva esto por lo que sera dew tipo String
    // en este caso no ponemos void porque queremos obtener el dato  de tipo String al querer añadir: kg
    public String getWeight(){
        return this.weight + " Kg.";
    }

        // cmd + N --> se abre pestaña para crear automaticamente la estructura de los getter y setter
    public String getHeight() {
        return height + " Mts.";
    }



    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public void setHeight(double height) {
        this.height = height;
    }



    @Override
    public String toString(){
        return super.toString() + "\nAge: " + birthday + "\nWeight: " + getWeight() + "\nHeight: " + getHeight() + "\nBlood: " + blood;
    }

}


