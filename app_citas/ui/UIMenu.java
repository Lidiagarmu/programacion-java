package ui;

import java.util.ArrayList;
import java.util.Scanner;
import model.*;

public class UIMenu {

    public static final String[] MONTHS = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    public static Doctor doctorLogged;
    public static Patient patientLogged;
    public static void showMenu() {
        System.out.println("Welcome to my Appointments");
        System.out.println("Selecciona la opción deseada");



        int response =0;
        do{
            System.out.println("1.Doctor");
            System.out.println("2.Patient");
            System.out.println("0.Salir");

            Scanner sc = new Scanner(System.in);
            response = sc.nextInt();

            switch (response){
                case 1:
                    System.out.println("Doctor");
                    response = 0; //una vez entre en el caso 1 ponemos la variable response en 0 para que se salga de este menu
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                   authUser(2);
                    break;
                case 0:
                    System.out.println("Thank you for your visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }

        }while (response!=0);
    }



    //-----------ESTA ES LA LOGICA QUE VAMOS A SEGUIR PARA VALIDAD O AUTENTICAR USUARIOS
    //-----------TRABAJAREMOS CON ARRAYLIST COMO BASE DE DATOS AUNQUE EN LA VIDA REAL NO SERÁ ASI

    private static void authUser(int userType){
        //userType = 1 Doctor
        //userType = 2 Paciente

        //añadimos doctores y pacientes como una especie de base de datos, simulamos esta base de datos para poder trabajar con UIMenu

        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Alejandro Martinez", "alejandro@mail.com"));
        doctors.add(new Doctor("Karen Sosa", "karen@mail.com"));
        doctors.add(new Doctor("Rocio Gomez", "rocio@mail.com"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Fede", "fede@fede.com"));
        patients.add(new Patient("Tomas", "tomas@fede.com"));
        patients.add(new Patient("Ivana", "ivana@fede.com"));



        boolean emailCorrect = false;

        do {
            System.out.println("Insert your email: [a@a.com]");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();

            //si es 1 ira a verificar el arraylist de doctor
            //si estuvieramos trabajando con una base de datos real estas validaciones estarian en el query
            if (userType == 1) {
                for (Doctor d : doctors) {
                    if (d.getEmail().equals(email)) {
                        emailCorrect = true; //si se cumple la linea ed arriba ponemos la bandera en true
                        //Obtener el usuario logeado
                        doctorLogged = d;
                        //showDoctorMenu
                        UIDoctorMenu.showDoctorMenu();
                    }
                }
            }

            //si es 2 ira a verificar el arraylist de patient
            if (userType == 2) {
                for (Patient p : patients) {
                    if (p.getEmail().equals(email)) {
                        emailCorrect = true;
                        patientLogged = p;
                        //showPatientMenu
                        UIPatientMenu.showPatientMenu();
                    }
                }
            }

        } while (!emailCorrect);
        }



     static void showPatientMenu(){

        int response = 0 ;
        do {
            System.out.println("\n\n");
            System.out.println("model.Patient");
            System.out.println("1. Book an appoointment");
            System.out.println("2. My appointment");
            System.out.println("0.return");

            Scanner sc = new Scanner(System.in);
            response = sc.nextInt();

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 1; i < 4 ; i++) {
                        System.out.println(i + ". " + MONTHS[i]);

                    }
                    break;
                case 2:
                    System.out.println("::My appointment");
                    break;
                case 0:
                    showMenu();
                    break;

                default:
                    System.out.println("Please select a correct answer");

            }
        } while (response !=0);

    };
}
