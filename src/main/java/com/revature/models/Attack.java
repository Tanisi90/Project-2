package com.revature.models;

<<<<<<< Updated upstream
public class Attack {
	
	private String name;
=======
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Attack")
public class Attack implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "attack_id", nullable = false)
	private int attack_id;

	@Column (name = "attack_name", nullable = false)
	private String attack_name;
	
	@Column (name = "type", nullable = false)
>>>>>>> Stashed changes
	private String type;
	private int bonus;
	private Dice damage;
	
	

}
