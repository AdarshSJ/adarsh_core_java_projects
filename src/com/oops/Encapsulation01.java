package com.oops;

// This type of class we can also call as POJO(Plain old Java object) or DTO(Data Transfer Object)
public class Encapsulation01 {

	private int id = 13;
	private String name = "Faf";

	private int eno;
	private String ename;

	private int esalary;
	private String edept;

	public int getEsalary() {
		return esalary;
	}

	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}

	public String getEdept() {
		return edept;
	}

	public void setEdept(String edept) {
		this.edept = edept;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

}