package model;

public abstract class User {
	protected int id;
	protected String name;
	protected String email;
	protected String address;
	protected String phoneNumber;
	
	public User(String name,String email) {
		this.name=name;
		this.email=email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		if(phoneNumber.length() > 8) {
			System.out.println("El numero telefonico tiene mas de 8 digitos");
		}else if(phoneNumber.length() ==8) {
			this.phoneNumber = phoneNumber;	
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Use: ".concat(this.name).concat(", Email: ").concat(this.email).concat("\n Addreess: ").concat(this.address).concat(" phone: ").concat(this.phoneNumber);
	}
	
	public abstract void showDataUser();
	
}
