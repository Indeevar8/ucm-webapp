package edu.ucm;

public class Faculty {
	private String firstName;
	private String lastName;
	private String email;
	private long mobileNumber;
	private String specialization;

	public Faculty() {

	}

	public Faculty(String firstName, String lastName, String email, long mobileNumber, String specialization) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.specialization = specialization;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	@Override
	public String toString() {
		return "Faculty [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", mobileNumber="
				+ mobileNumber + ", specialization=" + specialization + "]";
	}

}
