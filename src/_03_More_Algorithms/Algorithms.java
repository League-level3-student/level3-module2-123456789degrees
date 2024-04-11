package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {
    
    public static String multiply(int num1, int num2) {
        String ans = "";
        ans += num1;
        ans += " x ";
        ans += num2;
        ans += " = ";
        ans += num1*num2;
        return ans;
    }
    
    public static int findBrokenEgg(List<String> eggs) {
    	int ans = -1;
        for (int i = 0; i < eggs.size(); i++) {
        	if (eggs.get(i).equals("cracked")) {
        		ans = i;
        		break;
        	}
        }
        return ans;
    }
    public static int countPearls(List<Boolean> oysters) {
    	int ans = 0;
    	for (int i = 0; i < oysters.size(); i++) {
    		if (oysters.get(i)) {
    			ans++;
    		}
    	}
		return ans;
    }
    public static double findTallest(List<Double> peeps) {
    	double ans = 0;
    	for (int i = 0; i < peeps.size(); i++) {
    		if (peeps.get(i) > ans) {
    			ans = peeps.get(i);
    		}
    	}
    	return ans;
    }
    public static String findLongestWord(List<String> words) {
    	String ans = "";
    	int length = 0;
    	for (int i = 0; i < words.size(); i++) {
    		if (words.get(i).length() > length) {
    			ans = words.get(i);
    			length = words.get(i).length();
    		}
    	}
    	return ans;
    }
    public static boolean containsSOS(List<String> message) {
    	boolean ans = false;
    	for (int i = 0; i < message.size(); i++) {
    		if (message.get(i).equals("... --- ...")) {
    			ans = true;
    			break;
    		}
    	}
    	return ans;
    }
    public static List<Double> sortScores(List<Double> results) {
    	for (int i = 0; i < results.size(); i++) {
    		for (int j = 0; j < results.size() - 1; j++) {
    			if (results.get(j) > results.get(j + 1)) {
    				double temp = results.get(j);
    				results.set(j, results.get(j+1));
    				results.set(j+1, temp);
    			}
    		}
    	}
    	return results;
    }
}
