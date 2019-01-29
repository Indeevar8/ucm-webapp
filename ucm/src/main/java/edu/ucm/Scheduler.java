package edu.ucm;

public class Scheduler {
	private long id;
	private String date;
	private String subject;
	private String department;
	private String faculty;
	private String description;

	public Scheduler() {

	}

	public Scheduler(long id, String date, String subject, String department, String faculty, String description) {
		super();
		this.id = id;
		this.date = date;
		this.subject = subject;
		this.department = department;
		this.faculty = faculty;
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Scheduler [id=" + id + ", date=" + date + ", subject=" + subject + ", department=" + department
				+ ", faculty=" + faculty + ", description=" + description + "]";
	}

}
