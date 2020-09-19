package com.revature.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "User")
@Component
@Getter @Setter @NoArgsConstructor @EqualsAndHashCode @ToString
public class User implements Serializable {
	
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "user_id", nullable = false)
	private int user_id;
	
	@Column(name = "username", nullable = false)
	private String username;
	
	@Column(name = "password", nullable = false)
	private String password;
	
	@Column(name = "first_name", nullable = false)
	private String first_name;
	
	@Column(name = "last_name", nullable = false)
	private String last_name;
	
	@Column(name = "email", nullable = false)
	private String email;
	
	//Nullable = true bc might not be a DM or have character made.
	//Also might check how we're setting up roles.
	@ElementCollection
	@CollectionTable(name = "Collect_Roles", joinColumns = @JoinColumn(name = "user_id"))
	@Column(name = "roles")
	private List<String> roles;
	
	
//	public User() {
//		super();
//	}


	public User(String username, String password, String first_name, String last_name, String email,
			List<String> roles) {
		super();
		this.username = username;
		this.password = password;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.roles = roles;
	}


	public User(int user_id, String username, String password, String first_name, String last_name, String email,
			List<String> roles) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.password = password;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.roles = roles;
	}


//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((email == null) ? 0 : email.hashCode());
//		result = prime * result + ((first_name == null) ? 0 : first_name.hashCode());
//		result = prime * result + ((last_name == null) ? 0 : last_name.hashCode());
//		result = prime * result + ((password == null) ? 0 : password.hashCode());
//		result = prime * result + ((roles == null) ? 0 : roles.hashCode());
//		result = prime * result + user_id;
//		result = prime * result + ((username == null) ? 0 : username.hashCode());
//		return result;
//	}
//
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		User other = (User) obj;
//		if (email == null) {
//			if (other.email != null)
//				return false;
//		} else if (!email.equals(other.email))
//			return false;
//		if (first_name == null) {
//			if (other.first_name != null)
//				return false;
//		} else if (!first_name.equals(other.first_name))
//			return false;
//		if (last_name == null) {
//			if (other.last_name != null)
//				return false;
//		} else if (!last_name.equals(other.last_name))
//			return false;
//		if (password == null) {
//			if (other.password != null)
//				return false;
//		} else if (!password.equals(other.password))
//			return false;
//		if (roles == null) {
//			if (other.roles != null)
//				return false;
//		} else if (!roles.equals(other.roles))
//			return false;
//		if (user_id != other.user_id)
//			return false;
//		if (username == null) {
//			if (other.username != null)
//				return false;
//		} else if (!username.equals(other.username))
//			return false;
//		return true;
//	}
//
//
//	@Override
//	public String toString() {
//		return "User [user_id=" + user_id + ", username=" + username + ", password=" + password + ", first_name="
//				+ first_name + ", last_name=" + last_name + ", email=" + email + ", roles=" + roles + "]";
//	}


	
	
	
	
	

}
