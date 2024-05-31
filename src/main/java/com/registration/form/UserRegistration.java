package com.registration.form;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="table_reg")
public class UserRegistration {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long UID;
	private String name;
	private String email;
	private String password;
	private String gender;
	private String hobby;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	@Override
	public String toString() {
		return "UserRegistration [name=" + name + ", email=" + email + ", password=" + password + ", gender=" + gender
				+ ", hobby=" + hobby + "]";
	}


}
