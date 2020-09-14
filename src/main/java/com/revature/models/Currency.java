package com.revature.models;

<<<<<<< Updated upstream
public class Currency {
	
	private int copper;
	private int silver;
	private int gold;
	private int platinum;
=======
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Currency")

public class Currency implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "curr_id", nullable = false)
	private int curr_id;

	//All below default to zero(?)
	@Column(name = "copper", nullable = false)
	private int copper;
	
	@Column(name = "silver", nullable = false)
	private int silver;
	
	@Column(name = "gold", nullable = false)
	private int gold;
	
	@Column(name = "platinum", nullable = false)
	private int platinum;
	
	@Column(name = "total", nullable = false)
>>>>>>> Stashed changes
	private double total;
	


}
