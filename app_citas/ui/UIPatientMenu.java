package ui;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import model.*;

public class UIPatientMenu {

    public static void showPatientMenu(){
        int response = 0;
        do {

            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("Welcome: " + UIMenu.patientLogged.getName());
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointment");
            System.out.println("0. Logout");

            Scanner sc = new Scanner (System.in);
            response = sc.nextInt();

            switch (response){
                case 1:
                    showBookAppointmentMenu();
                    break;
                case 2:
                    showPatientMyAppointments();
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }

        }while (response !=0);

    }

    //--------------CLASE AGENDANDO CITAS

    //---------creo un METODO PARA LA OPCION 1 de Book appointment por ello lo hago private para ser accesible solo dede aqui
    private static void showBookAppointmentMenu(){
        int response = 0;
        do{
            System.out.println("::Book an appointment");
            System.out.println(":: Select date: ");
            //queremos mostrar fechas de los doctores que dejaron fechas disponibles
            //Numeracion de la lista de fechas - Integer
            //Indice de la fecha que seleccione nuestro paciente
            //[doctors]
            //1. - doctor1
                //-1 fecha1
                //-2 fecha2
            //- doctor 2
                //-1 fecha1
                //-2 fecha2

            // --------CLASE RECORRIENDO ESTRUCTURAS DE ARBOL EN JAVA

            //con este Map lo que queremos es que nos muestre las fechas primero antes que los doctores

            Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();
            int k = 0; //para aumentar nuestro scope creo esta variable ya que tengo dos for anindades uno para recorrer doctores y otro citas
            //aqui recorremos el doctor que si tiene citas disponibles y le pido las fechas disponibles y las asigno al arraylist creado
            for (int i = 0; i < UIDoctorMenu.doctorsAvailableAppointments.size(); i++) {
                ArrayList<Doctor.AvailableAppointment> availableAppointments = UIDoctorMenu.doctorsAvailableAppointments.get(i).getAvailableAppointments();

                Map<Integer, Doctor> doctorAppointments = new TreeMap<>();

                for (int j = 0; j < availableAppointments.size(); j++) {
                    k++;
                    System.out.println(k + ". " + availableAppointments.get(j).getDate());
                    doctorAppointments.put(Integer.valueOf(j), UIDoctorMenu.doctorsAvailableAppointments.get(i));

                    doctors.put(Integer.valueOf(k), doctorAppointments);
                }
            }

            Scanner sc = new Scanner(System.in);
            int responseDateSelected = sc.nextInt(); //en esta parte nuestro paciente a seleccionado la primera parte de nuestro arbol es decir
            //Map<Integer, Map<Integer, Doctor>>
            // 1. --> se refiere a  <Integer,
            // - doctor1 --> esta estructura se refiere a , Map<Integer, Doctor>>
            //                //-1 fecha1
            //                //-2 fecha2

            Map<Integer, Doctor> doctorAvailableSelected = doctors.get(responseDateSelected);
            Integer indexDate = 0;
            Doctor doctorSelected = new Doctor("", "");

            for (Map.Entry<Integer, Doctor>  doc : doctorAvailableSelected.entrySet()){
                indexDate = doc.getKey();
                doctorSelected = doc.getValue();

            }
            System.out.println(doctorSelected.getName() +
                    ". Date: " + doctorSelected.getAvailableAppointments().get(indexDate).getDate() +
                     ". Time: " + doctorSelected.getAvailableAppointments().get(indexDate).getTime());

            System.out.println("Confirm your appointment: \n1.Yes \n2. Change Data ");
            response = sc.nextInt();

            if (response == 1){ //si selecciona 1 vamos a dejar agendada la cita y al paciente
                UIMenu.patientLogged.addAppointmentDoctors(
                        doctorSelected,
                        doctorSelected.getAvailableAppointments().get(indexDate).getDate(null),
                        doctorSelected.getAvailableAppointments().get(indexDate).getTime());

                showPatientMenu();

            }

        } while (response !=0);
    }

    //---------creo un METODO PARA LA OPCION 2

    private static void showPatientMyAppointments(){
        int response = 0;
        do {
            System.out.println("::My appointments");
            //esto es, si no tiene citas disponibles...
            if (UIMenu.patientLogged.getAppointmentDoctors().size() == 0){
                System.out.println("Don't have appointments");
                break; //para que salga del bucle
            }
            
            //en caso de que tenga...
            for (int i = 0; i < UIMenu.patientLogged.getAppointmentDoctors().size(); i++) {
                int j = i + 1; // variable auxiliar para estar mostrando una enumeracion en la cantidad de citas que tiene
                System.out.println(j + ". " +
                        "Date: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getDate() +
                        "Time: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getTime() +
                        "\nDoctor: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getDoctor().getName()
                );
            }

            //una vez que se recorre le damos la opcion al usuario de salir del menu de sus citas
            System.out.println("0. Return");

        } while (response!=0);

    }


}

