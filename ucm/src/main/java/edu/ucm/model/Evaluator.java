package edu.ucm.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name = "ucmdb")
public class Evaluator implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7956252340680608837L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String number;

	public String getNumber() {
		return number;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setNumber(String number) {
		this.number = number;
	}

}
