package thingus;

import java.util.ArrayList;
import java.util.Collections;

public class CogentThing99999 {
	public int FindBiggerBetweenTwo(int a, int b) {
		if(a>b)
			return a;
		else
			return b;
	}
	
	public void swap(int a, int b) {
		System.out.println("Before Swap\na: " + a + " | b: " + b);
		int c = a;
		a = b;
		b = c;
		System.out.println("After Swap\na: " + a + " | b: " + b);
		
	}
	
	public void swapWithoutVar(int a, int b) {
		System.out.println("Before Swap\na: " + a + " | b: " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swap\na: " + a + " | b: " + b);
	}
	
	public boolean isOddTernary(int a) {
		return a%2==0 ? false : true;
	}
	
	public int findBiggest(int[] arr) {
		int largest = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i ++) {
			if(arr[i] > largest)
				largest = arr[i];
		}
		return largest;
	}
	public int findSmallest(int[] arr) {
		int smallest = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length; i ++) {
			if(arr[i] > smallest)
				smallest = arr[i];
		}
		return smallest;
	}
	public void isVowel(char a) {
		if(a == 65 || a == 69 || a == 73 || a == 79 || a == 85 || a == 97 || a == 101 || a == 105 || a == 109 || a == 111 || a == 117) {
			System.out.println("Vowel");
		}else {
			System.out.println("Not Vowel");
		}
	}
	public int[] secondMinMax(ArrayList<Integer> a) {
		int[] seconds = new int[2];
		Collections.sort(a);
		if(seconds.length < 2)
			return seconds;
		else {
			seconds[0] = a.get(1);
			seconds[1] = a.get(a.size() - 1);
		}
		return seconds;
	}
	public boolean isAnagram(String s) {
		s = s.toLowerCase();
		String revS = "";
		for(int i = s.length() - 1; i >= 0; i--)
			revS += s.charAt(i);
		return s.equals(revS);
	}
	
	public static void main(String[] args) {
		
	}
	
}
