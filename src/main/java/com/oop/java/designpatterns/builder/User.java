/**
 * 
 */
package com.oop.java.designpatterns.builder;

/**
 * @author skadale
 *
 */
public class User {

	private final String firstName;
	private final String lastName;
	private final int age;
	private final int number;
	
	public User(UserBuilder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.number = builder.number;
	}
	
	// Only getters to achieve Immutability
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getNumber() {
		return number;
	}
	
    @Override
    public String toString() {
        return "User: "+this.firstName+", "+this.lastName+", "+this.age+", "+this.number;
    }
	
	public static class UserBuilder {
		
		private final String firstName;
		private final String lastName;
		private int age;
		private int number;
		
		UserBuilder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
		public UserBuilder age(int age) {
			this.age = age;
			return this;
		}
		
		public UserBuilder number(int number) {
			this.number = number;
			return this;
		}
		
		public User build() {
			User user = new User(this);
			return user;
		}
		
	}
	
	public static void main(String[] args) {
	    User user1 = new User.UserBuilder("Lokesh", "Gupta")
	    .age(30)
	    .number(1234567)
	    .build();
	 
	    System.out.println(user1);
	 
	    User user2 = new User.UserBuilder("Jack", "Reacher")
	    .age(40)
	    .number(5655)
	    .build();
	 
	    System.out.println(user2);
	 
	    User user3 = new User.UserBuilder("Super", "Man")
	    //No age
	    //No number
	    .build();
	 
	    System.out.println(user3);
	}

}
