package ui;

import java.util.ArrayList;
import java.util.Scanner;
import model.*;

public class UIDoctorMenu {

    //creamos un arreglo de doctores que tienen citas disponibles como "base de datos" sera una variable estatica para que perdure

    public static ArrayList<Doctor> doctorsAvailableAppointments = new ArrayList<>();
    public static void showDoctorMenu(){
        int response = 0;

        do {
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Welcome " + UIMenu.doctorLogged.getName());
            System.out.println("1. Add Available Appointment");
            System.out.println("2. My Scheduled appointments");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    showAddAvailableAppointmentsMenu();
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;

            }



        }while (response != 0);
    }


    private static void showAddAvailableAppointmentsMenu(){
        int response = 0;
        do{
            System.out.println();
            System.out.println("::Add Available Appointments");
            System.out.println(":: Select a Month");

            //vamos a manejar la logica para elegir el mes dentro de los 3 primeros meses siguientes a la fecha actual
            for (int i=0; i<3; i++ ){
                int j = i + 1; //no utilizo la misma i para no alterar el cicli del for por eso uso una variable auxiliar
                System.out.println(j + ". " + UIMenu.MONTHS[i]);
            }
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = sc.nextInt(); // ella lo hace asi Integer.valueOf(sc.nextLine());

            if (response > 0 && response <4) {
                //1,2,3
                int monthSelected = response;
                System.out.println(monthSelected + " . " + UIMenu.MONTHS[monthSelected -1]);


                //para consumir el caracter de nueva linea pendiente despues de leer el numero
                sc.nextLine();

                System.out.println("Insert the date available: [dd/mm/yyyy]");
                String date = sc.nextLine(); //Scanner sigue dentro de nuestro Scope por lo tanto podemos seguir reutilizandolo

                System.out.println("Your date is: " + date + "\n1. Correct \n2. Change Date");
                int responseDate = sc.nextInt();
                if (responseDate == 2) continue; //continue se salta la siguiente condiciom y vuelve arriba a preguntar por insertar fecha

                int responseTime = 0;
                String time = "";
                do{

                    //para consumir el caracter de nueva linea pendiente despues de leer el numero
                    sc.nextLine();

                    System.out.println("Insert the time available for date: " + date + " [16:00]");
                    time = sc.nextLine();
                    System.out.println("Your time is: " + time + "\n1. Correct \n2. Change Time");
                    responseTime = sc.nextInt();

                } while (responseTime == 2);

                UIMenu.doctorLogged.addAvailableAppointment(date,time);
                checkDoctorAvailableAppointments(UIMenu.doctorLogged);





            } else if(response == 0) {
                showDoctorMenu(); //si la respuesta es 0 return entonces volvemos al menu anterior
            }

        } while (response !=0);
    }

    //nuevo metodo para modularizar aun mas
    //si esta doctor tiene citas disponibles por ello >0 y ademas no existe dentro de esa lista
    private static void checkDoctorAvailableAppointments(Doctor doctor){
        if(doctor.getAvailableAppointments().size() >0 && !doctorsAvailableAppointments.contains(doctor)){
           doctorsAvailableAppointments.add(doctor); //lo añado en esos dos casos
        }
    }


}
