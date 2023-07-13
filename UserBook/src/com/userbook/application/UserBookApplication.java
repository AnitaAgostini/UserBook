package com.userbook.application;

import com.userbook.entity.UserEntity;

public class UserBookApplication {
	
	public static void main(String[] args) 
	{

		UserEntity user = new UserEntity();
		user.setName("Pippo");
		user.setSurname("Facile");
		user.setBirthday(null);
		user.setPassword(null);
		user.setEmail("pippoStella@yahoo.it");
		user.setUsername("Pippo89");
		
		System.out.println(user);
		
	}
	
}