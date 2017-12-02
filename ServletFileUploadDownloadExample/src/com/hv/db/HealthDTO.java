package com.hv.db;

public class HealthDTO {
     private String username;
     private String password;
     private String email;
     private String dob;
     private String gender;
     private String bloodgroup;
     private String contact;
     private String e_contact;
     private String address;
     private String medication;
     private String treatment;
     private String disease;
     private String rare_address;
     private String note;
     private String report_url;
     private String message;
     private String type;
     private String from;
     private String id;
     public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	private String date;
     
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getE_contact() {
		return e_contact;
	}

	public void setE_contact(String e_contact) {
		this.e_contact = e_contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMedication() {
		return medication;
	}

	public void setMedication(String medication) {
		this.medication = medication;
	}

	public String getTreatment() {
		return treatment;
	}

	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public String getRare_address() {
		return rare_address;
	}

	public void setRare_address(String rare_address) {
		this.rare_address = rare_address;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getReport_url() {
		return report_url;
	}

	public void setReport_url(String report_url) {
		this.report_url = report_url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "HealthDTO [username=" + username + ", password=" + password + ", email=" + email + ", dob=" + dob
				+ ", gender=" + gender + ", bloodgroup=" + bloodgroup + ", contact=" + contact + ", e_contact="
				+ e_contact + ", address=" + address + ", medication=" + medication + ", treatment=" + treatment
				+ ", disease=" + disease + ", rare_address=" + rare_address + ", note=" + note + ", report_url="
				+ report_url + ", message=" + message + ", type=" + type + ", from=" + from + ", id=" + id + ", date="
				+ date + ", getType()=" + getType() + ", getFrom()=" + getFrom() + ", getId()=" + getId()
				+ ", getDate()=" + getDate() + ", getMessage()=" + getMessage() + ", getPassword()=" + getPassword()
				+ ", getEmail()=" + getEmail() + ", getDob()=" + getDob() + ", getGender()=" + getGender()
				+ ", getBloodgroup()=" + getBloodgroup() + ", getContact()=" + getContact() + ", getE_contact()="
				+ getE_contact() + ", getAddress()=" + getAddress() + ", getMedication()=" + getMedication()
				+ ", getTreatment()=" + getTreatment() + ", getDisease()=" + getDisease() + ", getRare_address()="
				+ getRare_address() + ", getNote()=" + getNote() + ", getReport_url()=" + getReport_url()
				+ ", getUsername()=" + getUsername() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
     
     
}
