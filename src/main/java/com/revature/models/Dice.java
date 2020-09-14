package com.revature.models;

<<<<<<< Updated upstream
public class Dice {
	
	private int number;
=======
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Dice")

public class Dice implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "dice_id", nullable = false)
	private int dice_id;

	@Column(name = "number", nullable = false)
	private int number;
	
	@Column(name = "size", nullable = false)
>>>>>>> Stashed changes
	private int size;
	private boolean advantage;

}
