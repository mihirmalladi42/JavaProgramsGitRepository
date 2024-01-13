package allprograms;

import java.util.ArrayList;

public class DataStructuresHashMap<A, B> {
	//Stores the keys and values
	ArrayList<A> keyList = new ArrayList<>();
	ArrayList<B> valueList = new ArrayList<>();
	static int numOfStudents = 0;
	//returns the key based on the index
	public A getIndexKey(int index) {
		return keyList.get(index);
	}
	//returns the value based on the index
	public B getIndexValue(int index) {
		return valueList.get(index);
	}
	//adds terms to the lists
	public void add(A firstAdd, B secondAdd) {
		keyList.add(firstAdd);
		valueList.add(secondAdd);
		numOfStudents++;
	}
	//removes terms from the lists
	public void remove(int index) {
		keyList.remove(index);
		valueList.remove(index);
		numOfStudents--;
	}
	//returns the value based on the key
	public B get(A key) {
		int indexOfKey = keyList.indexOf(key);
		return valueList.get(indexOfKey);
	}
	//returns the size of the BetterHashMap
	public int size() {
		return numOfStudents;
	}
	public void add(A firstAdd, B secondAdd, int index) {
		keyList.add(index, firstAdd);
		valueList.add(index, secondAdd);
		numOfStudents++;
	}
	public ArrayList<A> returnKeys() {
		return keyList;
	}
	public ArrayList<B> returnValues() {
		return valueList;
	}
}