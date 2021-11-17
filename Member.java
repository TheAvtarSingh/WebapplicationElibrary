package elibraryPackage;


public class Member {
private String firstname,lastname,email,password;

public String getFirstname() {
	return firstname;
}

public Member(String firstname, String lastname, String email, String password) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
	this.email = email;
	this.password = password;
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public String getLastname() {
	return lastname;
}

public void setLastname(String lastname) {
	this.lastname = lastname;
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



}
