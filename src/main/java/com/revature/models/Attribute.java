package com.revature.models;

<<<<<<< Updated upstream
public class Attribute {
	
	private String name;
	private int value;
	private int modifier;
=======
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Attribute")

public class Attribute implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "attrib_id", nullable = false)
	private int attrib_id;
	
	@Column(name = "attrib_name", nullable = false)
	private String attrib_name;
	
	@Column(name = "value", nullable = false)
	private int value;
	
	@Column(name = "modifier", nullable = false)
	private int modifier;
	
	@Column(name = "save", nullable = false)
>>>>>>> Stashed changes
	private int save;

}
