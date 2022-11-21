package com.Mentorrant.mentorrant.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "tbl_course")

public class StudentEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int Id;
	
	@Column(name = "Name", length = 50, precision = 0)
	private String Name;
	
	@Column(name = "Program", length = 50, precision = 0)
	private String Program;
	
	@Column(name = "Year", precision = 0)
	private int Year;
	
	public StudentEntity() {}

	public StudentEntity(int id, String name, String program, int year) {
		super();
		Id = id;
		Name = name;
		Program = program;
		Year = year;
	}

	public int getId() {
		return Id;
	}

	public String getName() {
		return Name;
	}

	public String getProgram() {
		return Program;
	}

	public void setProgram(String program) {
		Program = program;
	}

	public int getYear() {
		return Year;
	}

	public void setYear(int year) {
		Year = year;
	}
	
	
}
