package com.revature.models;

public class Item {
	
<<<<<<< Updated upstream
	private String name;
	private String description;
=======
	@Column(name = "item_name", nullable = false)
	private String item_name;
	
	@Column(name = "item_description")
	private String item_description;
	
	//default 0
	@Column(name = "weight", nullable = false)
	private double weight;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id", nullable = false)
>>>>>>> Stashed changes
	private Currency value;
	private double weight;

}
