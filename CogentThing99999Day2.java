package thingus;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.stream.Collectors;

public class CogentThing99999Day2 {
	public static String removeAllCharacter(String s, String toRemove) {
		return s.replaceAll(toRemove, "");
	}
	
	public static void swapWithoutAux(int a, int b) {
		System.out.println("Before Swap\na: " + a + " | b: " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swap\na: " + a + " | b: " + b);
	}
	
	public static String removeWhitespaces(String s) {
		return s.replaceAll(" ", "");
	}
	
	public static boolean containsSameElements(int[] arr1, int[] arr2) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		return Arrays.equals(arr1, arr2);
	}
	
	public static int findThirdLargest(List<Integer> l) {
		if(l.size() < 3)
			return Integer.MIN_VALUE;
		Collections.sort(l);
		return l.get(l.size() - 3);
	}
	
	public int findThirdLargest(int[] arr) {
		if(arr.length < 3)
			return Integer.MIN_VALUE;
		Arrays.sort(arr);
		return arr[arr.length - 3];
	}
	
	public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm)
    {
        HashMap<String, Integer> temp
            = hm.entrySet()
                  .stream()
                  .sorted((i1, i2)
                              -> i1.getValue().compareTo(
                                  i2.getValue()))
                  .collect(Collectors.toMap(
                      Map.Entry::getKey,
                      Map.Entry::getValue,
                      (e1, e2) -> e1, LinkedHashMap::new));
 
        return temp;
    } //Code from GeeksForGeeks, this was a difficult one.
	
	public static boolean balancedString(String s) {
		if(s.length()%2 == 1)
			return false;
		
		Stack<Character> braceStack = new Stack<Character>();
		for(int i = 0; i < s.length(); i ++) {
			if(s.charAt(i) != 91 && s.charAt(i) != 93 && s.charAt(i) != 123 && s.charAt(i) != 125
					&& s.charAt(i) != 40 && s.charAt(i) != 41)
				return false;
			
			try {
				switch(s.charAt(i)) {
					case 40,91,123:
						braceStack.push(s.charAt(i));
						break;
					case 41,93,125:
						braceStack.pop();
						break;
				}
			} catch (Exception e) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		String test = "([{)]}";
		System.out.println(balancedString(test));
	}
}
