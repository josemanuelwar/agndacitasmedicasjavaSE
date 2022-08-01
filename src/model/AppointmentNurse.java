package model;

import java.util.Date;

public class AppointmentNurse implements ISchedulable {
	
	private int id;
	private Nurse nurse;
	private Patient patient;
	private Date date;
	private String timer;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Nurse getNurse() {
		return nurse;
	}
	public void setNurse(Nurse nurse) {
		this.nurse = nurse;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getTimer() {
		return timer;
	}
	public void setTimer(String timer) {
		this.timer = timer;
	}
	@Override
	public void schedule(Date date, String time) {
		// TODO Auto-generated method stub
		
	}
	
	
}
