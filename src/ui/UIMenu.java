package ui;

import java.util.ArrayList;
import java.util.Scanner;

import model.Doctor;
import model.Patient;

public class UIMenu {

    public static final String[] MONTHS = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    public static Doctor dotorlogged;
    public static Patient patientlogged;
    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                	response=0;
                    System.out.println("Doctor");
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                    authUser(2);
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }

    private static void authUser(int userType) {
    	ArrayList<Doctor> doctors = new ArrayList<>();
    	doctors.add(new Doctor("Alegandro Martinez", "alegandro@gmail.com"));
    	doctors.add(new Doctor("Karen Sosa","karen@email.com"));
    	doctors.add(new Doctor("Rocio Gomez","rocio@mail.com"));
    	
    	ArrayList<Patient> patients = new ArrayList<>();
    	patients.add(new Patient("Anahi Salgado", "anahi@mail.com"));
    	patients.add(new Patient("Roberto Rodriguez", "roberto@mail.com"));
    	patients.add(new Patient("Carlos Sanchez", "carlos@gmail.com"));
    	
    	boolean emailCorrect = false;
    	do {
    		System.out.println("Insetr your email :[a@a.com]");
    		Scanner sc = new Scanner(System.in);
    		String email = sc.nextLine();
    		
    		switch (userType) {
			case 1: 
				for (Doctor doc : doctors) {
					if(doc.getEmail().equals(email)) {
						emailCorrect=true;
						dotorlogged = doc;
						UIDotorMenu.showDoctorMenu();
					}
				}
				break;
			case 2:
				for(Patient p : patients) {
					if(p.getEmail().equals(email)) {
						emailCorrect= true;
						patientlogged=p;
					}
				}
				break;
				
			}
			
    	}while(!emailCorrect);
    }
    static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 1; i < 4; i++) {
                        System.out.println(i +". " + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
    }
    
}
