package model;

public class Nurse extends User{

	private String speciality;
	
	public Nurse(String name, String email) {
		super(name, email);
		
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	@Override
	public void showDataUser() {
		// TODO Auto-generated method stub
		System.out.println("Empleada Hospital: Cruz verde");
		System.out.println("Departamento: Nutriologia, Pediatria");
		
	}
	
	

}
