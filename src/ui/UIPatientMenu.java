package ui;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import model.Doctor;
public class UIPatientMenu {
	public static void showPatientMenu() {
		int response = 0;
		do {
			System.out.println("\n\n");
			System.out.println("Patient");
			System.out.println("Welcome: "+UIMenu.patientlogged.getName());
			System.out.println("1. Book an appointment");
			System.out.println("2. My Appointments");
			System.out.println("0. Return");
			Scanner sc = new Scanner(System.in);
			response = Integer.valueOf(sc.nextLine());
			switch (response) {
			case 1:
				showBookAppointmentMenu();
				break;
			case 2:
				break;
			case 0:
				UIMenu.showMenu();
				break;
			}
		}while(response != 0);
	}
	
	private static void showBookAppointmentMenu() {
		int response = 0;
		do {
			System.out.println(":: Book an appointment");
			System.out.println(":: select date: ");
			Map<Integer,Map<Integer,Doctor>> doctors = new TreeMap<>();
			int k=0;
			for(int i=0; i< UIDotorMenu.doctorAvailableAppointments.size(); i++) {
				ArrayList<Doctor.AvailableAppointment> availbleAppointments = UIDotorMenu.doctorAvailableAppointments.get(i).getAvailableAppointment();
				Map<Integer,Doctor> doctorAppintments = new TreeMap();
				for(int j = 0; j < availbleAppointments.size(); j++) {
					k++;
					System.out.println(k+". "+availbleAppointments.get(j).getDate());
					doctorAppintments.put(Integer.valueOf(j),UIDotorMenu.doctorAvailableAppointments.get(i));
					doctors.put(Integer.valueOf(k), doctorAppintments);
				}
			}
			Scanner sc = new Scanner(System.in);
			int responseDataSelect = Integer.valueOf(sc.nextLine());
			Map<Integer,Doctor>doctorAvalilableSelected = doctors.get(responseDataSelect);
			Integer indexDate = 0;
			Doctor doctorSelected = new Doctor("","");
			for(Map.Entry<Integer,Doctor> doc :doctorAvalilableSelected.entrySet()) {
				indexDate = doc.getKey();
				doctorSelected = doc.getValue();
			}
			System.out.println(doctorSelected.getName()+
					" .Date: "+doctorSelected.getAvailableAppointment().get(indexDate).getDate()
					+" .Time: "+ doctorSelected.getAvailableAppointment().get(indexDate).getTimer());
			System.out.println("confirm your appointment \n 1. yes \n 2. change data");
			response = Integer.valueOf(sc.nextLine());
			if(response == 1) {
				UIMenu.patientlogged.setAppointmentDcotor(
						doctorSelected, 
						doctorSelected.getAvailableAppointment().get(indexDate).getDate(null),
						doctorSelected.getAvailableAppointment().get(indexDate).getTimer());
			}
		}while(response != 0);
	}

	private static void showPatientMyAppointments() {
		int response = 0;
		do {
			System.out.println("::My Appointments");
			if(UIMenu.patientlogged.getAppointmentDoctors().size() == 0) {
				System.out.println("Don't have appointments");
				break;
			}
			for(int i=0; i< UIMenu.patientlogged.getAppointmentDoctors().size(); i++) {
				int j=i+1;
				System.out.println(j +". "+
				"Data"+ UIMenu.patientlogged.getAppointmentDoctors().get(i).getDate() +
				" Timer "+ UIMenu.patientlogged.getAppointmentDoctors().get(i).getTime()+
				" \n Doctor" + UIMenu.patientlogged.getAppointmentDoctors().get(i).getDoctor().getName());	
			}
			System.out.println("0 Return");
		} while (response != 0);
	}
}
