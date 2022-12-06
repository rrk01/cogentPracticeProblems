package thingus;

import java.util.Arrays;

public class CogentProblemSet5 {
	public static void print2dArray(int[][] a) { //Problem 1
		for(int i = 0; i < a.length; i ++) {
			for(int j = 0; j < a[i].length; j ++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void addMatrices(int[][] a, int[][] b) { //Problem 2, code from problem set 3
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
	
	public static void sortAcrossColumns(int[][] a) { //Problem 3
		Arrays.sort(a);
	}
	
	public static boolean matricesEqual(int[][] a, int[][] b) { //Problem 4
		return a.equals(b);
	}
	
	public static int[][] transpose(int[][] a) { //Problem 5
		int[][] t = new int[a[0].length][a.length];
		for(int i = 0; i < a.length; i ++) {
			for(int j = 0; j < a[0].length; j ++) {
				t[j][i] = a[i][j];
			}
		}
		return t;
	}
	
	public static void normalAndTrace(int[][] a) { //Problem 7
		if(a.length != a[0].length) {
			System.out.println("Invalid entry.");
			return;
		}
		double normal = 0.0;
		int trace = 0;
		for(int i = 0; i < a.length; i ++)
			for(int j = 0; j < a[i].length; j ++) {
				normal += a[i][j] * a[i][j];
				if(i == j)
					trace += a[i][j];
			}
		normal = Math.sqrt(normal);
		
		System.out.println("Normal = " + normal + "\nTrace = " + trace);
		
	}
	
	public static void printBoundary(int[][] a) { //Problem 8
		for(int i = 0; i < a.length; i ++)
			for(int j = 0; j < a[i].length; j ++)
				if(i == 0 || i == a.length - 1 || j == 0 || j == a[i].length - 1)
					System.out.println(a[i][j]);
	}
	
	public static int[] rotateArray(int[] arr, int places) { //Code from problem set 4
		int[] newArr = new int[arr.length];
		for(int i = 0; i < arr.length; i ++) {
			newArr[i] = arr[places % arr.length];
		}
		return newArr;
	}
	
	public static int[][] rotateMatrix(int[][] a, int places) { //Problem 9
		int[][] newArr = new int[a.length][a[0].length];
		for(int i = 0; i < a.length; i ++) {
			newArr[i] = rotateArray(a[i], places);
		}
		return newArr;
	}
	
	//Assuming a square 2d array
	public static int sumDiagonals(int[][] a) {
		int sum = 0;
		if(a.length % 2 == 1) { //If odd length edge
			for(int i = 0; i < a.length; i ++) 
				for(int j = 0; j < a.length; j ++) 
					if(i != j)
						sum += a[i][j] + a[i][a.length - 1 - j]; //Add all elements except for center
				
			sum += a[a.length/2 + 1][a[0].length/2 + 1]; //Add center element once at the end
		}else{ //If even length edge
			for(int i = 0; i < a.length; i ++) 
				for(int j = 0; j < a.length; j ++) 
					sum += a[i][j] + a[i][a.length - 1 - j]; //We do not need to make an exception for the center
		}
		return sum;
	}
	
	public static void swapWithoutAux(int a, int b) { //Code from problem set 2
		//System.out.println("Before Swap\na: " + a + " | b: " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        //System.out.println("After Swap\na: " + a + " | b: " + b);
	}
	
	public static void interchangeLastElementAcrossRows(int[][] a) { //Problem 11
		int temp;
		for(int i = 0; i < a.length; i ++) {
			temp = a[i][0];
			a[i][0] = a[i][a[i].length - 1];
			a[i][a[i].length - 1] = temp;
		}
	}
	
	public static void interchangeLastElementAcrossColumns(int[][] a) { //Problem 12
		int temp;
		for(int i = 0; i < a[0].length; i ++) {
			temp = a[0][i];
			a[0][i] = a[a[i].length - 1][i];
			a[a[i].length - 1][i] = temp;
		}
	}
	public static void main(String[] args) {
		/*int[][] test = {{3,1,5},{6,9,7}};
		print2dArray(transpose(test));*/ //Problem 5
	}
}
