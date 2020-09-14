package com.revature.models;

public class Skill {
	
	private String name;
	private int value;
<<<<<<< Updated upstream
=======
	
	@Column(name = "proficient", nullable = false)
	private boolean proficient;
	
	
	@ManyToOne(nullable = false)
>>>>>>> Stashed changes
	private Attribute attribute;
	private boolean proficient;

}
