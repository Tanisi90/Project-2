package com.revature.models;

import java.util.List;

public class Spell {
	
	private int level;
<<<<<<< Updated upstream
	private String name;
	private String school;
	private String castingTime;
	private String range;
	private String material;
	private String duration;
=======
	
	@Column(name = "spell_name", nullable = false)
	private String spell_name;
	
	@Column(name = "school", nullable = false)
	private String school;
	
	@Column(name = "castingTime", nullable = false)
	private String castingTime;
	
	@Column(name = "range", nullable = false)
	private String range;
	
	@Column(name = "material", nullable = false)
	private String material;
	
	@Column(name = "duration", nullable = false)
	private String duration;
	
	@Column(name = "description", nullable = false)
>>>>>>> Stashed changes
	private String description;
	private List<Character> components;
	

}
