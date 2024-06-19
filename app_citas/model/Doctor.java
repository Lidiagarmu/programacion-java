package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {

    //Atributos (es como una receta de cocina, estos son los ingredientes)



    private String speciality;

    // creamos una coleccion de objetos con estos datos --> availableAppointment(id, date,time) --> tipo ArrayList de Objets
    //creamos un array (como anteriormente haciamos con las variables simples) y la inicializamos
   private  ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    /*ejemplo sin anidar. lo anidaremos mas abajo, este es solo para ver que no seria escalable Habria que
    crear un Array que contenga todos estos datos

    private int id_availableAppointment;
    private Date date;
    private String time;
    //availableAppointmen
    */



    // SOBRECARGA DE CONSTRUCTORES (de esta manera ningun objeto doctor se nos va a ir sin nombre y sin especialidad
     public Doctor(String name, String email){
         super(name,email);

    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }



        //METODO QUE NO DEVUELVE NADA, ES PARA AÑADIR Y CREAR CITAS AL ARRAY DE COLECCION ANTERIOR
        //ESTE METODO CUANDO LO LLAMAS MEDIANTE model.Doctor.addAvailableAppointment() con sus dos parametros realiza las funciones de dentro de los {}
        // es decir, {} las inrucciones de dentro , crean y añaden citas que se van a acumular este nuevo array availableAppointments
            public void addAvailableAppointment(String date, String time){
                availableAppointments.add(new Doctor.AvailableAppointment(date, time));
            }

            // METODO GET del array creado anteriormente
            public ArrayList<AvailableAppointment> getAvailableAppointments(){
                return availableAppointments;
            }


            @Override
            public String toString(){
                return super.toString() + "\nSpeciality: " + speciality + "\nAvailable: "+ availableAppointments.toString();
            }


            // metodo abstracto heredado de la clase User que vamos a sobreescribir (polimorfismo)
            // este metodo es obligatorio al llevar la palabra abstract en User. los demas metodos de User no lo serán
            @Override
            public void showDataUser() {

                System.out.println("Empleado del Hospital: Cruz Roja");
                System.out.println("Departamento: Urgencias");

            }


    //CLASE ANIDADA ESTATICA
    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yy"); //para transformar nuestro String date a Date date
            //CONSTRUCTOR DE LA CLASE ANIDADA

        public AvailableAppointment(String date, String time) {
            try {
                this.date = format.parse(date); //transformar el date de tipo String a Date esto nos obliga a sorround catch
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            this.time = time;
        }

            //METODOS SETTER Y GETTER DE ESTA NUEVA CLASE ANIDADA

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate(String DATE) {
            return date;
        }

        //sobreescribimos el metodo anterior para recibir un objeto de tipo String por ello necesito pasarle un parametro
        public String getDate() {
            return format.format(date);
        }



        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }


        @Override
        public String toString(){
            return "Available Appointments\nDate: " + date + "\nTime: " + time;
        }


            }


}
