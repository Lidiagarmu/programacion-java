

import java.util.Date;

import model.*;

import static ui.UIMenu.*;


public class Main {
    public static void main(String[] args){

       /* Ejemplos de instanciar objetos y llamar metodos

       model.Doctor myDoctor = new model.Doctor(); // declarando e instanciando mi objeto
        myDoctor.name = "Alex Ache"; // damos valor a name
        myDoctor.showName(); // llamando al metodo showname() de la clase model.Doctor anteriormente creada
        // imprime "Alex Ache"

        myDoctor.showId();
        System.out.println(model.Doctor.id);

        model.Doctor myDoctorLau = new model.Doctor(); // estamos creando una nueva instancia de doctor de ejemplo
        myDoctor.showId();

        */

        //showMenu(); // primer comportamiento del programa

        /*-------LO QUITE Doctor myDoctor = new Doctor( "Lidia", "lidia.doctor@gmail.com","Pediatria");
        //llamamos al metodo que añade al arrayList las citas (crea nuevas instancias de la clase anidada)
        myDoctor.addAvailableAppointment(new String(), "4pm"); // new Date() coge la fecha actual
        myDoctor.addAvailableAppointment(new String(), "10pm");
        myDoctor.addAvailableAppointment(new String(), "1pm"); */

        //FOR (x x: x) --> tipo - nombre: - lo que recorres-------------------------------

        //creo bucle para que me muestre las citas disponibles
        //model.Doctor.AvailableAppointment es el tipo + el nombre appointment + array mediante el metodo que te devuelve el arrayList de las citas
        //en el consolelog podemos acceder mediante los getter a los datos

      /* --------LO QUITE  for(Doctor.AvailableAppointment appointment: myDoctor.getAvailableAppointments()){
            System.out.println(appointment.getDate() + " " + appointment.getTime());
        } */



       /*--------------LO QUITE System.out.println(myDoctor.getAvailableAppointments());

        Doctor myDoctor2 = new Doctor("Laura", "lau@gmail.com","Psiquiatria");


        User user = new Doctor("Anahi", "ana@ana.com", "pediatria");
        System.out.println("-------------------------------------------------------------\n");
        System.out.println("INSTANCIANDO UN OBJETO DE USER USANDO SU CLASE HIJA DOCTOR");
        user.showDataUser(); */

        //AQUI INSTANCIAMOS UN OBJETO DE LA CLASE USER (QUE EN PRINCIPIO NO SE PODIA) HACIENDOLO DE MANERA ANONIMA
        //SU CICLO DE VIDA VA A SER CORTO, SOLO EL MOMENTO EN EL QUE LO ESTEMOS USANDO
        //es decir le doy un comportamiento diferente que va a estar vigente solo para este lapso de tiempo en el que se llama al objeto user

       /*--------LO QUITE  User user1 = new User("Lara", "lara@lara.com") {
            @Override
            public void showDataUser() {
                System.out.println("-------------------------------------------------------------\n");
                System.out.println("INSTANCIANDO UN OBJETO DE USER DE MANERA ANONIMA");
                System.out.println("Doctora");
                System.out.println("Hospital: Cruz Verde");
                System.out.println("Departamento de geriatria");

            }
        };

            //lo llamamos

            user1.showDataUser(); -------------*/

        //podemos tambien usar clases anonimas con interfaces:

        /*-------LO QUITE ISchedulable iSchedulable = new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {

            }
        };

        //o instanciando usando sus clases hijas
        ISchedulable iSchedulable1 = new AppointmentDoctor();

        */


         /* -------LO QUITE


        Patient patientOne = new Patient("Alicia", "ali@gmail.com");
        patientOne.setWeight(54.6); // asignando valor
        System.out.println("-------------------------------------------------------------\n");
        System.out.println(patientOne.getWeight()); // obteniendo valor

        System.out.println("-------------------------------------------------------------\n");
        patientOne.setPhoneNumber("1234456789"); // El telefono tiene demasiados digitos
        System.out.println(patientOne.getPhoneNumber()); // null

        System.out.println("IMPRIMIR PACIENTE CON EL MÉTODO TOSTRING SOBREESCRITO EN USER");
        System.out.println("-------------------------------------------------------------\n");
        System.out.println(patientOne);

        System.out.println("IMPRIMIR DOCTOR CON EL MÉTODO TOSTRING SOBREESCRITO EN USER Y AÑADIENDO COMPORTAMIENTO A TOSTRING EN DOCTOR");
        System.out.println("-------------------------------------------------------------\n");
        System.out.println(myDoctor);

  */

        showMenu();

    }





}