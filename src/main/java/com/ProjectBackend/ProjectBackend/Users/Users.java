package com.ProjectBackend.ProjectBackend.Users;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "users")
public class Users {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "username")
  private String username;

  @Column(name = "firstname")
  private String firstName;

  @Column(name = "email")
  private String email;

  @Column(name = "password")
  private String password;

  // define constructors

  public Users() {

  }

  public Users(String UserName, String firstName, String email) {
    this.username = UserName;
    this.firstName = firstName;
    this.email = email;
  }

  public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
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

  @Override
  public java.lang.String toString() {
    return "Student [username=" + username + ", firstName=" + firstName + ", email=" + email + "]";
  }
}
