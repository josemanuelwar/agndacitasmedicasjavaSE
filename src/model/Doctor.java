package model;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{

	private String speciality;
	private ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
	
	public Doctor(String name,String email) {
		super(name, email);
		this.speciality="";
	}
	
	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	
	public void addAvailableAppointment(String date,String timer){
		availableAppointments.add(new Doctor.AvailableAppointment(date,timer));
	}
	
	public ArrayList<AvailableAppointment> getAvailableAppointment(){
		return availableAppointments;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString().concat("\n Speciality: ").concat(speciality).concat("\n Available: ").concat(availableAppointments.toString());
	}
	
	public static class AvailableAppointment{
		private int id_avaiableAppointment;
		private Date date;
		private String timer;
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		
		public AvailableAppointment(String date, String timer) {
			try {
				this.date = format.parse(date);				
			}catch(ParseException e) {
				e.printStackTrace();
			}
			this.timer = timer;
		}
		public int getId_avaiableAppointment() {
			return id_avaiableAppointment;
		}
		public void setId_avaiableAppointment(int id_avaiableAppointment) {
			this.id_avaiableAppointment = id_avaiableAppointment;
		}
		public Date getDate(String date) {
			return this.date;
		}
		public String getDate() {
			return format.format(this.date);
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
		public String toString() {
			// TODO Auto-generated method stub
			return "Available Appointments \n Date: ".concat(this.date.toString()).concat("\n tiempo: ").concat(timer);
		}
	}

	@Override
	public void showDataUser() {
		// TODO Auto-generated method stub
		System.out.println("Empleado del Hospital: Cruz Roja");
		System.out.println("Departamento: Cnacerologia");
		
	}
}
