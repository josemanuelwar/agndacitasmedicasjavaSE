package model;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends User {
	
	private String brithday;
	private double weight;
	private double height;
	private String blood;
	
	private ArrayList<AppontmentDoctor> appointmentDoctors = new ArrayList<>();
	private ArrayList<AppointmentNurse> appointmentNurses = new ArrayList<>();
	
	public ArrayList<AppontmentDoctor> getAppointmentDoctors() {
		return appointmentDoctors;
	}

	public void setAppointmentDcotor(Doctor doctor,Date date,String time) {
		AppontmentDoctor appointmentDoctor = new AppontmentDoctor(this,doctor);
		appointmentDoctor.schedule(date, time);
		appointmentDoctors.add(appointmentDoctor);
	}

	public ArrayList<AppointmentNurse> getAppointmentNurses() {
		return appointmentNurses;
	}

	public void setAppointmentNurses(ArrayList<AppointmentNurse> appointmentNurses) {
		this.appointmentNurses = appointmentNurses;
	}

	public Patient(String name,String email) {
		super(name,email);
	}

	public String getBrithday() {
		return brithday;
	}

	public void setBrithday(String brithday) {
		this.brithday = brithday;
	}

	public String getWeight() {
		return weight+" kg.";
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getHeight() {
		return height+" Mts.";
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getBlood() {
		return blood;
	}

	public void setBlood(String blood) {
		this.blood = blood;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString().concat("\n age: ").concat(this.brithday).concat("\n Weigth: ").concat(getWeight()).concat("\n Heidht").concat(getHeight()).concat("\n bood").concat(this.blood);
	}

	@Override
	public void showDataUser() {
		// TODO Auto-generated method stub
		System.out.println("Paciente");
		System.out.println("Historial completo desde nacimientos");
		
	}
	

}
