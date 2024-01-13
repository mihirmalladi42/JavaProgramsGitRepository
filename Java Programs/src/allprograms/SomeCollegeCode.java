package allprograms;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SomeCollegeCode {
	public static String jackAndJill(int jackHeight, int jillHeight, int jamesHeight, String direction) {
		if (direction.equals("uphill")) {
			String shortestPerson = "Jack";
			if (jillHeight < jackHeight) {
				shortestPerson = "Jill";
				if (jamesHeight < jillHeight) {
					shortestPerson = "James";
				}
			} else if (jamesHeight < jackHeight) {
				shortestPerson = "James";
				if (jillHeight < jamesHeight) {
					shortestPerson = "Jill";
				}
			}
			return shortestPerson;
		} else if (direction.equals("downhill")) {
			String tallestPerson = "Jack";
			if (jillHeight > jackHeight) {
				tallestPerson = "Jill";
				if (jamesHeight > jillHeight) {
					tallestPerson = "James";
				}
			} else if (jamesHeight > jackHeight) {
				tallestPerson = "James";
				if (jillHeight < jamesHeight) {
					tallestPerson = "Jill";
				}
			}
			return tallestPerson;
		}
		return "";
	}
	public static String wizardOfOz(int maxDistance, float maxHostility) {
		boolean place1Cond1 = false;
		boolean place1Cond2 = false;
		boolean place2Cond1 = false;
		boolean place2Cond2 = false;
		boolean place3Cond1 = false;
		boolean place3Cond2 = false;
		boolean place4Cond1 = false;
		boolean place4Cond2 = false;
		if (maxDistance <= 1500) {
			place1Cond1 = true;
			place2Cond1 = true;
			place3Cond1 = true;
			place4Cond1 = true;
		}
		if (maxDistance <= 1000) {
			place1Cond1 = true;
			place2Cond1 = true;
			place3Cond1 = true;
		}
		if (maxDistance <= 600) {
			place1Cond1 = true;
			place2Cond1 = true;
		}
		if (maxDistance <= 200) {
			place1Cond1 = true;
		}
		if (maxHostility >= 9.0F) {
			place1Cond2 = true;
			place2Cond2 = true;
			place3Cond2 = true;
			place4Cond2 = true;
		} 
		if (maxHostility >= 7.0F) {
			place2Cond2 = true;
			place3Cond2 = true;
			place4Cond2 = true;
		}
		if (maxHostility >= 3.0F) {
			place3Cond2 = true;
			place4Cond2 = true;
		}
		if (maxHostility >= 1.0F) {
			place4Cond2 = true;
		}
		boolean bothConds1 = false;
		boolean bothConds2 = false;
		boolean bothConds3 = false;
		boolean bothConds4 = false;
		if (place1Cond1 && place1Cond2) {
			bothConds1 = true;
		}
		if (place2Cond1 && place2Cond2) {
			bothConds2 = true;
		}
		if (place3Cond1 && place3Cond2) {
			bothConds3 = true;
		}
		if (place4Cond1 && place4Cond2) {
			bothConds4 = true;
		}
		if (!bothConds1 && !bothConds2 && !bothConds3 && !bothConds4) {
			return "Dorothy must go back to Kansas.";
		}
		if (bothConds1) {
			return "Deadly Desert";
		} else if (bothConds2) {
			return "Munchkin Country";
		} else if (bothConds3) {
			return "Winkie Country";
		} else if (bothConds4) {
			return "Emerald City";
		}
		return "";
	}
	public static String reviveSecretMessage(String corruptedMessage) {
		
		String newString = "";
		for (int i = 0; i < corruptedMessage.length(); i++) {
			if (corruptedMessage.charAt(i) != '(' && corruptedMessage.charAt(i) != '#' && corruptedMessage.charAt(i) != '%') {
				newString += corruptedMessage.charAt(i);
			}
		}
		
		
		return newString;
	}
	public static String crackCode(String code1, String code2) {
		String rev1 = "";
		String rev2 = "";
		for (int i = code1.length()-1; i >= 0; i--) {
			rev1 += code1.charAt(i);
		}
		for (int i = code2.length()-1; i >= 0; i--) {
			rev2 += code2.charAt(i);
		}
		String retRes = "";
		for (int i = 0; i < rev1.length(); i++) {
			if (rev1.charAt(i) == rev2.charAt(i)) {
				retRes += rev1.charAt(i);
			}
		}
		return retRes;
	}
	public static int calculateDistance(String operations, int initialNumber) {
		int tempNum = initialNumber;
		while (tempNum <= 30) {
			for (int i = 0; i < operations.length(); i++) {
				if (operations.charAt(i) == '*') {
					tempNum *= 3;
				} else if (operations.charAt(i) == '/') {
					tempNum /= 2;
				} else if (operations.charAt(i) == '+') {
					tempNum += 7;
				} else if (operations.charAt(i) == '-') {
					tempNum -= 4;
				}
			}
		}
		return tempNum;
	}
	public static String escapeThumbs(int numberOfThumbs, String obstacles) {
		int obsCount = 1;
		for (int i = 0; i < obstacles.length(); i++) {
			if (obstacles.charAt(i) == ',') {
				obsCount++;
			}
		}
		if (obsCount >= numberOfThumbs) {
			return "Success! You've escaped!";
		} else if (obsCount < numberOfThumbs) {
			return "Mission failed: " + (numberOfThumbs - obsCount) + " still following!";
		}
		
		return "";
	}
	public static String timeLeft(String puzzleTimes, int minutesLeft) {
		int totalTime = 0;
		for (int i = 0; i < puzzleTimes.length(); i+=2) {
			totalTime += 2*Integer.parseInt("" + puzzleTimes.charAt(i) + puzzleTimes.charAt(i+1));
		}
		if (minutesLeft - totalTime >= 0) {
			return "You have " + (minutesLeft - totalTime) + " minutes left over!";
		} else {
			return "London is doomed...";
		}
	}
	public static String makeChange(float total, String payment) {
		float sum = 0;
		for (int i = 0; i < payment.length(); i++) {
			char character = payment.charAt(i);
			if (character == 'd') {
				sum += 1F;
			}
			if (character == 'q') {
				sum += 0.25F;
			}
			if (character == 'n') {
				sum += 0.05F;
			}
		}
		DecimalFormat df = new DecimalFormat("###.###");
		return "$" + df.format(sum-total) + " is your change.";
	}
	public static String[] prepareFood(String orders) {
		ArrayList<String> chars = new ArrayList<>(Arrays.asList(orders.split("")));
		for (int i = 0; i < chars.size(); i++) {
			if (chars.get(i).equals("*")) {
				chars.set(i, "&");
			}
		}
		String joiner = "";
		for (int i = 0; i < chars.size(); i++) {
			joiner += chars.get(i);
		}
		String[] ret = joiner.split("&");
		for (int i = 0; i < ret.length; i++) {
			String repRet = "";
			for (int j = 0; j < ret[i].length(); j++) {
				if (ret[i].charAt(j) != '!' && 
					ret[i].charAt(j) != '@' && 
					ret[i].charAt(j) != '$' && 
					ret[i].charAt(j) != '#') {
					repRet += ret[i].charAt(j);
				}
			}
			ret[i] = repRet;
		}
		String largeList = "";
		for (int i = 0; i < ret.length; i++) {
			if (ret[i].charAt(0) == 'b') {
				for (int j = 1; j < ret[i].length(); j++) {
					largeList += ret[i].charAt(j);
				}
				largeList += "&";
				for (int j = 1; j < ret[i].length(); j++) {
					largeList += ret[i].charAt(j);
				}
				largeList += "&";
			} else if (ret[i].charAt(0) != 'o') {
				largeList += ret[i];
				largeList += "&";
			}
		}
		largeList = largeList.toLowerCase();
		ArrayList<String> sorter = new ArrayList<>(Arrays.asList(largeList.split("&")));
		Collections.sort(sorter);
		String[] finRet = new String[sorter.size()];
		for (int i = 0; i < sorter.size(); i++) {
			finRet[i] = sorter.get(i);
		}
		return finRet;
	}
	public static String drivingTest(String[][] rubric, String[] actions) {
		int score = 0;
		for (int i = 0; i < actions.length; i++) {
			for (int j = 0; j < rubric.length; j++) {
				if (rubric[j][0].equals(actions[i])) {
					score += Integer.parseInt(rubric[j][1]);
				}
			}
		}
		return "With a score of " + score + ", Spongebob has " + (score < 200 ? "failed once again!" : "passed his driving test");
	}
	public static String[] musicalNight(String[] potentialMembers, String[] membersInstruments, String[] squidwardInstruments) {
		String members = "";
		for (int i = 0; i < potentialMembers.length; i++) {
			for (int j = 0; j < squidwardInstruments.length; j++) {
				if (membersInstruments[i].equals(squidwardInstruments[j])) {
					members += potentialMembers[i];
					members += "&";
				}
			}
		}
		ArrayList<String> arr = new ArrayList<>(Arrays.asList(members.split("&")));
		Collections.sort(arr);
		String[] ret = new String[arr.size()];
		for (int i = 0; i < arr.size(); i++) {
			ret[i] = arr.get(i);
		}
		if (ret.length == 0) {
			System.out.println("I guess it's just me and you Clarry : /");
			return null;
		}
		return ret;
	}
	public static String[] dayOut(String[] spongebobFavorites, String[] friends, String[][] friendsFavorites) {
		int[] favoriteCount = new int[friends.length];
		String[] favorites = new String[friends.length];
		for (int i = 0; i < favorites.length; i++) {
			favorites[i] = "";
		}
		for (int i = 0; i < spongebobFavorites.length; i++) {
			for (int j = 0; j < friends.length; j++) {
				for (int k = 0; k < friendsFavorites[j].length; k++) {
					if (spongebobFavorites[i].equalsIgnoreCase(friendsFavorites[j][k])) {
						favoriteCount[j]++;
						if (favoriteCount[j] >= 2) {
							favorites[j] = friends[j];
						}
					}
				}
			}
		}
		ArrayList<String> sort = new ArrayList<>(Arrays.asList(favorites));
		for (int i = 0; i < sort.size(); i++) {
			if (sort.get(i).equals("")) {
				sort.remove(i);
				i = 0;
			}
		}
		Collections.sort(sort);
		String[] ret = new String[sort.size()];
		for (int i = 0; i < ret.length; i++) {
			ret[i] = sort.get(i);
		}
		if (ret.length == 1 && ret[0].equals("")) {
			System.out.println("It's just a day of fine dining and breathing");
		}
		return ret;
	}
	public static String[][] bestMachine(String[] machines, float[] rating) {
		int returnSize = 0;
		float l = 0.0F;
		String[] topMachines;
		for (int i = 0; i < rating.length; i++) {
			if (l < rating[i]) {
				l = rating[i];
				returnSize++;
			} else if (l == rating[i]) {
				returnSize++;
			}
		}
		topMachines = new String[returnSize];
		
		l = 0;
		int tMIndex = 0;
		for (int i = 0; i < rating.length; i++) {
			if (l < rating[i]) {
				l = rating[i];
				topMachines[tMIndex] = machines[i];
				tMIndex++;
			} else if (l == rating[i]) {
				topMachines[tMIndex] = machines[i];
				tMIndex++;
			}
		}
		
		
		String[][] tempRet = new String[returnSize][2];
		for (int i = 0; i < tempRet.length; i++) {
			tempRet[i][0] = topMachines[i];
			tempRet[i][1] = l + "";
		}
		return tempRet;
	}
	public static void main(String[] args) {
		//System.out.println(jackAndJill(2, 3, 1, "downhill"));
		//System.out.println(wizardOfOz(1000,8));
		//System.out.println(reviveSecretMessage("HEL#L#O#%( T(((HER%(#%(#%(E"));
		//System.out.println(crackCode("aD3Kcaa4Rc__3d[a09C", "gD3Kc4d4Rc!_3dcc01C"));
		//System.out.println(calculateDistance("+**--/", 2));
		//System.out.println(escapeThumbs(8, "plant,television,chair,table"));
		//System.out.println(timeLeft("0505050102", 20));
		//System.out.println(makeChange(2.75F, "qdqdnnqd"));
		//System.out.println(Arrays.asList(prepareFood("Mi@lks#ha!@ke*bK$rUs!tyD$og*oKra$bb#y!Pat##ty*oF$riEs*bSa#l$$ad")));
		/*String[][] rubric = {{"right turn", "50"}, {"stopped at intersection", "75"}, {"left turn", "50"}, {"swerved", "-50"}, {"hit pedestrian", "-200"}};
		String[] actions = {"left turn", "right turn", "right turn", "hit pedestrian"};
		System.out.println(drivingTest(rubric, actions));*/
		/*String[] pM = {"Spongebob", "Sandy", "Mr Krab", "Pearl"};
		String[] mI = {"piano", "trumpet", "flute", "violin"};
		String[] sI = {"chime", "guitar", "flute", "piano", "drum"};
		System.out.println(Arrays.asList(musicalNight(pM, mI, sI)));*/
		//String[] sF = {"Krusty Krab", "Chum Bucket", "Treedome"};
		//String[] f = {"Patrick", "Sandy", "Mr Krab"};
		//String[][] fF = {{"Treedome", "Boating School", "Mermalair", "Chum Bucket"}, {"Krusty Krab", "Sea Needle", "Pineapple House", "Squilliam Tower"}, {"Sea Needle", "Barg n Mart", "Chum Bucket"}};
		//String[] sF = {"Barg n Mart", "Chum Bucket", "Pineapple House"};
		//String[] f = {"Squidward", "Plankton", "Gary"};
	    //String[][] fF = {{"Reef Cinema", "Barg n Mart", "Sea Needle", "Glove World", "Patrick House"}, {"Stinky Burgers", "Sunny Shore Resorts", "Chum Bucket"}, {"Mermalair", "Squilliam Tower", "Bottomite"}};
		//System.out.println(Arrays.asList(dayOut(sF, f, fF)));
		String[] machines = {"Treadmill", "Stairs Machine", "Stationary Bike", "Leg Press"};
		float[] list = {6.0F, 5.7F, 9.3F, 9.3F};
		String[][] a = bestMachine(machines, list);
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
	}
}
