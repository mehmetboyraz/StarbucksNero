package Entities;

import javax.print.DocFlavor.STRING;

public class Customer {
	
	int id;
	String Name;
	String Lastname;
	long NationalityId;
	int Year;
	

	public Customer(int id, String name, String lastname, long nationalityId, int year) {
		super();
		this.id = id;
		Name = name;
		Lastname = lastname;
		 NationalityId = nationalityId;
		Year = year;

	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public long getNationalityId() {
		return NationalityId;
	}
	public void setNationalityId(long nationalityId) {
		NationalityId = nationalityId;
	}
	public int getYear() {
		return Year;
	}
	public void setYear(int year) {
		Year = year;
	} 
	

}
