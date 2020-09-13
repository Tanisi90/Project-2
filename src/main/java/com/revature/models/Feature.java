package com.revature.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Feature")
public class Feature implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "feat_id", nullable = false)
	private int feat_id;

	@Column(name = "feat_name", nullable = false)
	private String feat_name;
	
	@Column(name = "f_description")
	private String f_description;
	
	
	public Feature() {
		super();

	}


	public Feature(String feat_name, String f_description) {
		super();
		this.feat_name = feat_name;
		this.f_description = f_description;
	}


	public Feature(int feat_id, String feat_name, String f_description) {
		super();
		this.feat_id = feat_id;
		this.feat_name = feat_name;
		this.f_description = f_description;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((f_description == null) ? 0 : f_description.hashCode());
		result = prime * result + feat_id;
		result = prime * result + ((feat_name == null) ? 0 : feat_name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Feature other = (Feature) obj;
		if (f_description == null) {
			if (other.f_description != null)
				return false;
		} else if (!f_description.equals(other.f_description))
			return false;
		if (feat_id != other.feat_id)
			return false;
		if (feat_name == null) {
			if (other.feat_name != null)
				return false;
		} else if (!feat_name.equals(other.feat_name))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Feature [feat_id=" + feat_id + ", feat_name=" + feat_name + ", f_description=" + f_description + "]";
	}


	

	
	
	
	

}
