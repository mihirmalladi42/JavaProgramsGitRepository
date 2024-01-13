package allprograms;
//All Imports
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class DataStructures {
	static DataStructuresHashMap<String, Information> studentProfile = new DataStructuresHashMap<>();
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		LinkedListJava lLJ = new LinkedListJava();
		//Lines 11-13 ask for the number of students
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter how many students you have: (number): " );
		int num = scan.nextInt();
		//Lines 15-17 make the HashMap, names ArrayList, and Information ArrayList
		for (var i = 0; i < num; i++) {
			//Gets the names and biological gender of the students by using a scanner
			Scanner getName = new Scanner(System.in);
			System.out.println("Enter the names of student " + (i+1) + ":");
			String res = getName.nextLine();
			Scanner getBiologicalGender = new Scanner(System.in);
			System.out.println("Enter the biological gender of student " + (i+1) + ":");
			String nextRes = getBiologicalGender.nextLine();
			//Sets the information class of each students
			Information information = new Information(res, nextRes, (i+1), new Random().nextInt(500));
			//Adds the information and names into the ArrayLists and HashMap
			studentProfile.add(res, information);
			lLJ.arrList.add(res);
			lLJ.linkedList.add(res);
		}
		whichMethod(studentProfile);
	}
	@SuppressWarnings("static-access")
	public static void whichMethod(DataStructuresHashMap<String, Information> studentProfileInMethod) {
		System.out.println("The main HashMap list has these elements: " + studentProfile.returnKeys());
		//Gets the user input for stack, queue, or print
		Scanner getMethod = new Scanner(System.in);
		System.out.println("Would you like to use stack, queue, print the information of a specific student, add/remove students, used LinkedList, or get the LinkedList rules? (type stack, queue, print, add, remove, ll, or llr): ");
		String option = getMethod.nextLine();
		//Calls the stack/queue functions if inputed
		if (option.equalsIgnoreCase("stack")) {
			//The method takes 1 input using the custom Generics Class
			stack(studentProfileInMethod);
		} else if (option.equalsIgnoreCase("queue")) {
			queue(studentProfileInMethod);
		} else if (option.equalsIgnoreCase("print")) {
			//Uses the getInfo function from the Information class to print the information of a student
			Scanner whichStudent = new Scanner(System.in);
			System.out.println("Enter the student whose information you want to get (All outcomes/outputs are fake, they are randomly generated): ");
			String name = whichStudent.nextLine();
			//Calls the getInfo method of the Information Class
			studentProfileInMethod.get(name).getInfo();
			//Recalls this method
			whichMethod(studentProfileInMethod);
		} else if (option.equalsIgnoreCase("add")) {
			Scanner whereToAdd = new Scanner(System.in);
			System.out.println("The current students are: " + studentProfileInMethod.returnKeys());
			System.out.println("Enter the index where you want to add a student: ");
			int index = whereToAdd.nextInt();
			boolean isMax = false;
			if (index == studentProfileInMethod.size()) {
				isMax = true;
			}
			Scanner studentInp = new Scanner(System.in);
			System.out.println("Enter the name of the student: ");
			String newName = studentInp.nextLine();
			Scanner getBiologicalGender = new Scanner(System.in);
			System.out.println("Enter the biological gender of the student: ");
			String biologicalGender = getBiologicalGender.nextLine();
			DataStructuresHashMap<String, Information> temp = new DataStructuresHashMap<>();
			temp = studentProfileInMethod;
			Information informationNew = new Information(newName, biologicalGender, (temp.size()), new Random().nextInt(500));
			if (isMax) {
				temp.add(newName, informationNew);
			} else {
				temp.add(newName, informationNew, index);
			}
			whichMethod(temp);
		} else if (option.equalsIgnoreCase("remove")) {
			Scanner whereToRemove = new Scanner(System.in);
			System.out.println("The current students are: " + studentProfileInMethod.returnKeys());
			System.out.println("Enter the index where you want to remove a student: ");
			int removeIndex = whereToRemove.nextInt();
			DataStructuresHashMap<String, Information> tempRemove = new DataStructuresHashMap<>();
			tempRemove = studentProfileInMethod;
			tempRemove.remove(removeIndex);
			whichMethod(tempRemove);
		} else if (option.equalsIgnoreCase("ll")) {
			LinkedListJava llJ = new LinkedListJava();
			llJ.which();
		} else if (option.equalsIgnoreCase("llr")) {
			System.out.println("The LinkedList type is a class where you can test the differences between ArrayList and LinkedList. The methods and changes that you make in the LinkedListJava class don't make changes to the main list in the DataStructures class.");
			whichMethod(studentProfileInMethod);
		} else {
			throw new InputMismatchException("Enter a correct option next time.");
		}
	}
	public static void whichMethodLLJ() {
		whichMethod(studentProfile);
	}
	public static void queue(DataStructuresHashMap<String, Information> studentProfileInMethod) {
		//Prints the queue
		System.out.println("The names of the student are this as per the order you inputted their information: ");
		for (var i = 0; i < studentProfileInMethod.size(); i++) {
			System.out.println((i+1) + ": " + studentProfileInMethod.getIndexKey(i));
		}
		System.out.println("The order of the student in queue format is: ");
		for (var j = 0; j < studentProfileInMethod.size(); j++) {
			System.out.print((j+1) + ": " + studentProfileInMethod.getIndexKey(j) + " ");
		}
		System.out.println();
		whichMethod(studentProfileInMethod);
	}
	public static void stack(DataStructuresHashMap<String, Information> studentProfileInMethod) {
		//Prints the stack
		System.out.println("The names of the student are this as per the order you inputted their information: ");
		for (var i = 0; i < studentProfileInMethod.size(); i++) {
			System.out.println((i+1) + ": " + studentProfileInMethod.getIndexKey(i));
		}
		System.out.println("The order of the student in stack format is: ");
		for (var j = studentProfileInMethod.size()-1; j >= 0; j--) {
			System.out.println((j+1) + ": " + studentProfileInMethod.getIndexKey(j));
		}
		whichMethod(studentProfileInMethod);
	}
}