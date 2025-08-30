package org.example.services;

import java.io.File;

import org.example.User;

public class UserBookingsServices {
    private User user;
    private  ObjectMapper objectMapper= new ObjectMapper();
    private static final String USERS_PATH ="../localDb/users.json";
	public UserBookingsServices(User user) {
		this.user = user;
		File users= new File();
	}
    
}
