package thingus;

import java.util.ArrayList;

class A {
	public void sampleText() {
		System.out.println("Sample Text");
	}
}

class B extends A {
	@Override
	public void sampleText() {
		System.out.println("Lorem ipsum");
	}
} //Problem 10

public class CogentProblemSet3 {
	public static ArrayList<String> findAllSubstring(String s) { //Problem 1
		ArrayList<String> toReturn = new ArrayList<String>();
		
		if(s.length() <= 1) {
			toReturn.add(s);
			return toReturn;
		}else{
			for(int i = 0; i < s.length(); i ++) {
				for(int j = i+1; j <= s.length(); j ++) {
					String newSubstring = "";
					newSubstring += s.substring(i, j);
					toReturn.add(newSubstring);
				}
			}
		}
		
		return toReturn;
	}
	
	public static String reverseString(String s) { //Problem 2
		String rev = "";
		for(int i = s.length()-1; i >= 0; i --) {
			rev += s.charAt(i);
		}
		return rev;
	}
	
	public static boolean isPalindrome(String s) { //Problem 3
		return s.equals(reverseString(s));
	}
	
	public static void addMatrices(int[][] a, int[][] b) { //Problem 4
		if(a.length == b.length && a[0].length == b[0].length) {
			for(int i = 0; i < a.length; i ++) {
				for(int j = 0; j < a[0].length; j ++) {
					int c = a[i][j]+b[i][j];
					System.out.print("[" + c + "] ");
				}
				System.out.println();
			}
		}else {
			System.out.println("Invalid entry.");
		}
	}
	
	public static void multiplyMatrices(int[][] a, int[][] b) { //Problem 5
		int temp = 0;
		if(a[0].length == b.length) {
			for(int k = 0; k < a.length; k ++) {
				for(int j = 0; j < b[0].length; j ++) {
					temp = 0;
					for(int i = 0; i < a[0].length; i ++) {
						temp += a[k][i] * b[i][j];
					}
					System.out.print("[" + temp + "] ");
				}
				System.out.println();
			}
		}else {
			System.out.println("Invalid entry.");
		}
	}
	
	public static void replaceString(String s, String toReplace) { //Problem 6 (??????)
		toReplace = s;
	}
	
	public static int binarySearch(int arr[], int l, int r, int x)
    { //Problem 8, code from GeeksForGeeks
        if (r>=l)
        {
            int mid = l + (r - l)/2;
  
            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
               return mid;
  
            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
               return binarySearch(arr, l, mid-1, x);
  
            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid+1, r, x);
        }
  
        // We reach here when element is not present
        //  in array
        return -1;
    }
	
	public static void main(String[] args) {
		//System.out.println(findAllSubstring("asdf")); //Problem 1
		
		//System.out.println(reverseString("asdf")); //Problem 2
		
		//System.out.println(isPalindrome("racecar")); //Problem 3
		
		/*int[][] matrixA = {{1,1},{1,1}}; //Problem 4
		int[][] matrixB = {{2,2},{2,2}};
		addMatrices(matrixA, matrixB);*/
		
		/*int[][] matrixAA = {{3,4},{7,2},{5,9}};
		int[][] matrixBB = {{3,1,5},{6,9,7}};
		multiplyMatrices(matrixAA, matrixBB);*/ //Problem 5
		
		//System.out.println(Math.random()); //Problem 7
		
		/*int arr[] = {2,3,4,10,40};
        int n = arr.length;
        int x = 10;
        int result = binarySearch(arr,0,n-1,x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " +
                                                 result);*/ //Problem 8, code from GeeksForGeeks
		
	}
}
