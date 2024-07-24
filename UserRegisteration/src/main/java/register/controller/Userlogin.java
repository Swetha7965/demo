package register.controller;

import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Userlogin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String first_name;
	private String last_name;
	@Column(unique = true)
	private String email;
	private String password;
	private long phone;
	private int age;
	private String gender;

	public UserTable(String first_name, String last_name, String email, String password, long phone, int age,
			String gender) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.age = age;
		this.gender = gender;
	}
	
}
