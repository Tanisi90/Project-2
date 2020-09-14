package com.revature.models;

import java.util.List;

public class User {
	
	private String username;
	private String password;
<<<<<<< Updated upstream
	private String name;
=======
	
	@Column(name = "first_name", nullable = false)
	private String first_name;
	
	@Column(name = "last_name", nullable = false)
	private String last_name;
	
	@Column(name = "email", nullable = false)
	private String email;
	
	//? Roles table?
	@ElementCollection
	@CollectionTable(name = "Collect_Roles", joinColumns = @JoinColumn(name = "user_id"))
	@Column(name = "roles", nullable = false)
>>>>>>> Stashed changes
	private List<String> roles;

}
