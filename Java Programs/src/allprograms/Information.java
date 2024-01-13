package allprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Information {
	 //Information variables
	 String fullName;
	 String address;
	 String biologicalGender;
	 int id;
	 int age;
	 //Last Names and Addresses (last names are found online and road names are real places selected randomly across the US/Canada (I think (an) address(es) from Canada is/are here)
	 final String[] array = {"Li", "Johnson", "Garcia", "Lee", "Muller", "Silva", "Tran", "Sato", "Shah", "Russo", "Hernandez", "Smith", "Martinez", "Petrov", "Kim"};
	 final String[] road = {"Newhouse Ave", "Nixon St", "Phillip Ave", "Noble St", "W Green St"};
	ArrayList<String> randomLastName = new ArrayList<>(Arrays.asList(array));
	//Constructor
	Information (String name, String biologicalGender, int id, int rand) {
		//Sets the Information class variables to the parameters.
		this.biologicalGender = biologicalGender;
		this.id = id;
		//Generates a random index of the arrays to randomly generate the address and the full name.
		address = rand + " " + road[new Random().nextInt(5)];
		age = new Random().nextInt(4)+12;
		fullName = name + " " + array[new Random().nextInt(15)];
	}
	void getInfo() {
		//getInfo function to print the information of a student.
		System.out.println("Full Name: " + fullName);
		System.out.println("Address: " + address);
		System.out.println("Biological Gender: " + biologicalGender);
		System.out.println("ID: " + id);
		System.out.println("Age: " + age);
	}
}
