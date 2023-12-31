package model;

public class Appointmentdata {
	
	private int Appointment_id;
	private String Appointment_name,Appointment_email,Appointment_symptoms,Appointment_date,Appointment_department,Appointment_gender,Appointment_time;
	private Long Appointment_number;
	
	public Long getAppointment_number() {
		return Appointment_number;
	}
	public void setAppointment_number(Long appointment_number) {
		Appointment_number = appointment_number;
	}
	public int getAppointment_id() {
		return Appointment_id;
	}
	public void setAppointment_id(int appointment_id) {
		Appointment_id = appointment_id;
	}
	public String getAppointment_name() {
		return Appointment_name;
	}
	public void setAppointment_name(String appointment_name) {
		Appointment_name = appointment_name;
	}
	public String getAppointment_email() {
		return Appointment_email;
	}
	public void setAppointment_email(String appointment_email) {
		Appointment_email = appointment_email;
	}
	public String getAppointment_symptoms() {
		return Appointment_symptoms;
	}
	public void setAppointment_symptoms(String appointment_symptoms) {
		Appointment_symptoms = appointment_symptoms;
	}
	public String getAppointment_date() {
		return Appointment_date;
	}
	public void setAppointment_date(String appointment_date) {
		Appointment_date = appointment_date;
	}
	public String getAppointment_department() {
		return Appointment_department;
	}
	public void setAppointment_department(String appointment_department) {
		Appointment_department = appointment_department;
	}
	public String getAppointment_gender() {
		return Appointment_gender;
	}
	public void setAppointment_gender(String appointment_gender) {
		Appointment_gender = appointment_gender;
	}
	public String getAppointment_time() {
		return Appointment_time;
	}
	public void setAppointment_time(String appointment_time) {
		Appointment_time = appointment_time;
	}
	
	@Override
	public String toString() {
		return "Appointmentdata [Appointment_id=" + Appointment_id + ", Appointment_name="
				+ Appointment_name + ", Appointment_email=" + Appointment_email + ", Appointment_symptoms="
				+ Appointment_symptoms + ", Appointment_date=" + Appointment_date + ", Appointment_department="
				+ Appointment_department + ", Appointment_gender=" + Appointment_gender + ", Appointment_time="
				+ Appointment_time + ", Appointment_number=" + Appointment_number + "]";
	}
	
	
	
	
	
}
