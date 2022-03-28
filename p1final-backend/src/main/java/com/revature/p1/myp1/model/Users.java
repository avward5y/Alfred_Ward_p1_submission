package com.revature.p1.myp1.model;

import javax.persistence.*;

@Entity
@Table(name="ers_users")
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ers_users_id")
	private int id;
	
	@Column(name = "ers_username")
	private String username;
	
	@Column(name = "ers_password")
	private String password;
	
	@Column(name = "user_first_name")
	private String firstName;
	
	@Column(name = "user_last_name")
	private String lastName;
	
	@Column(name = "user_email")
	private String email;
	
	@Column(name = "user_role_id")
	private String roleId;
	
	
	@Override
	public String toString() {
		return "Users [id=" + id + ", username=" + username + ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", email=" + email + ", reoleId=" + roleId + "]";
	}
	
	
	public Users() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public String getRoleId() {
		return roleId;
	}
	public void setReoleId(String roleId) {
		this.roleId = roleId;
	}
	
}
