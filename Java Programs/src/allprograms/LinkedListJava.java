package allprograms;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.ArrayList;
public class LinkedListJava {
	static ArrayList<String> arrList = new ArrayList<>();
	static LinkedList<String> linkedList = new LinkedList<>();
	static DataStructuresHashMap<String, Information> classHashMap = new DataStructuresHashMap<>();
	public LinkedListJava() {
		classHashMap = new DataStructuresHashMap<>();
	}
	public LinkedListJava(DataStructuresHashMap<String, Information> structures) {
		classHashMap = structures;
	}
	
	@SuppressWarnings("static-access")
	public static void which() {
		Scanner which = new Scanner(System.in);
		System.out.println("Do you want to add, get, remove, or update a value? (Type add, get, remove, or update): ");
		String res = which.nextLine();
		Scanner indexScan = new Scanner(System.in);
		System.out.println("After what index do you want to add/get/remove/update a value? (Type -1 if you want to add/get a value at index 0, type 2 if you want to add/get a value at index 3, etc. \nThe system adds/gets/removes/updates the index that is 1 greater than the inputted number.): ");
		int index = indexScan.nextInt()+1;
		if (res.equalsIgnoreCase("get")) {
			get(index);
		} else if (res.equalsIgnoreCase("add")) {
			add(index);
		} else if (res.equalsIgnoreCase("remove")) {
			delete(index);
		} else if (res.equalsIgnoreCase("update")) {
			update(index);
		}
		DataStructures dS = new DataStructures();
		dS.whichMethodLLJ();
	}
	public static void get(int index) {
		System.out.println("Array List: " + arrList.get(index) + "\nLinked List: " + linkedList.get(index));
		System.out.println("The ArrayList is faster than the LinkedList when getting values. This is because the ArrayList is based off of Arrays which can instantly find the value based on the index."
				+ "However, the LinkedList needs to go through the nodes individually until it reaches the correct index/value.");
	}
	public static void add(int index) {
		Scanner whatToAdd = new Scanner(System.in);
		System.out.println("What do you want to add? ");
		String add = whatToAdd.nextLine();
		arrList.add(index, add);
		linkedList.add(index, add);
		System.out.println("List: " + arrList);
		System.out.println("The LinkedList is faster than the ArrayList when adding values. This is because the LinkedList can rearrange the pointers in the region that the element needs to be added/removed."
				+ "However, the ArrayList needs to create a new array and copy the values so that the new element is placed in the correct spot.");
	}
	public static void delete(int index) {
		arrList.remove(index);
		linkedList.remove(index);
		System.out.println("List: " + arrList);
		System.out.println("The LinkedList is faster than the ArrayList when removing values. This is because the LinkedList can rearrange the pointers in the region that the element needs to be added/removed."
				+ "However, the ArrayList needs to create a new array and copy the values so that the new element is placed in the correct spot.");
	}
	public static void update(int index) {
		Scanner whatToAdd = new Scanner(System.in);
		System.out.println("What do you want to update the value to? ");
		String add = whatToAdd.nextLine();
		arrList.set(index, add);
		linkedList.set(index, add);
		System.out.println("List: " + arrList);
		System.out.println("The ArrayList is faster than the LinkedList when updating values. This is because the ArrayList is based off of Arrays which can instantly find the value based on the index."
				+ "However, the LinkedList needs to go through the nodes individually until it reaches the correct index/value.");
	}
}
