package thingus;

import java.util.ArrayList;
import java.util.List;

public class CogentProblemSet4 {
	public static boolean searchArr(int[] a, int toFind) { //Problem 1
		for(int i : a)
			if(i == toFind)
				return true;
		return false;
	}
	
	public static void findLargest(List<Integer> a) { //Problem 2
		int largest = Integer.MIN_VALUE;
		for(int i : a)
			if(i > largest)
				largest = i;
		
		System.out.println(largest);
	}
	
	public static void bubbleSort(int[] arr) {  //Problem 3&5 
        int temp = 0;  
        for(int i = 0; i < arr.length; i ++) {  
        	for(int j = 1; j < (arr.length - i); j ++){  
        		if(arr[j - 1] > arr[j]) {  
        			temp = arr[j - 1];  
        			arr[j - 1] = arr[j];  
        			arr[j] = temp;  
                 }  

            }  
        }  
    }
	
	public static void bubbleSortDescending(int[] arr) {  //Problem 4
        int temp = 0;  
        for(int i = 0; i < arr.length; i ++) {  
        	for(int j = 1; j < (arr.length - i); j ++){  
        		if(arr[j-1] < arr[j]) {    
        			temp = arr[j - 1];  
        			arr[j - 1] = arr[j];  
        			arr[j] = temp;  
                 }

            }
        }
    }
	
	public static List<Integer> removeDuplicates(int[] arr) { //Problem 6
		List<Integer> temp = new ArrayList<Integer>();
		for(int i : arr)
			temp.add(i);
		return temp;
	}
	
	public static int[] mergeArrays(int[] a, int[] b) { //Problem 7
		int[] merged = new int[a.length + b.length];
		for(int i = 0; i < a.length; i ++)
			merged[i] = a[i];
		for(int i = a.length; i < a.length + b.length; i ++)
			merged[i] = b[i - a.length];
		return merged;
	}
	
	public static boolean arraysEqual(int[] a, int[] b) { //Problem 8
		return a.equals(b);
	}
	
	public static int[] removeInstances(int[] a, int toRemove) { //Problem 9
		int count = 0;
		int count1 = 0;
		for(int i : a)
			if(i != toRemove)
				count ++;
		int[] toReturn = new int[count];
		for(int i = 0; i < count; i ++)
			if(a[i] != toRemove) {
				toReturn[count1] = a[i];
				count1 ++;
			}
		return toReturn;
	}
	
	public static List<Integer> commonElements(int[] arr) { //Problem 10
		List<Integer> temp = new ArrayList<Integer>();
		if(temp.size() <= 1)
			return temp;
		for(int i = 0; i < arr.length; i ++) {
			for(int j = i + 1; j < arr.length; j ++) {
				if(arr[i] == arr[j] && !temp.contains(arr[i])) {
					temp.add(arr[j]);
				}
			}
		}
		return temp;
	}
	
	public static int[] copyArray(int[] arr) { //Problem 11
		int[] newArr = new int[arr.length];
		for(int i = 0; i < arr.length; i ++)
			newArr[i] = arr[i];
		return newArr;
	}
	
	public static int[] rotateArray(int[] arr, int places) { //Problem 12
		int[] newArr = new int[arr.length];
		for(int i = 0; i < arr.length; i ++) {
			newArr[i] = arr[places % arr.length];
		}
		return newArr;
	}
}
