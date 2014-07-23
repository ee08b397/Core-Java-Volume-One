package cn.edu.zju.zhuli1990.corejava;

import java.util.Arrays;

public class AboutTheArray {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Initialize with a fixed length..
		int[] iarr = new int[5];
		// Initialize with some elements.
		int[] arr1 = { 1, 1, 2, 3, 5, 8 };
		// Initialize with an anonymous array.
		int[] arr2 = new int[] { 2, 3, 5, 7, 11 };
		// Without initialization, it is null.
		int[] arr3;
		// An array of length 0 is not null, maybe useful or not.
		int[] arr4 = new int[0];

		iarr[2] = 12;
		// Index out of range.
		// iarr[-1] = -2;
		// iarr[5] = 15;

		// An array of objects
		String[] sarr = new String[3];

		// You can print an array like this, but not quite useful.
		System.out.println(Arrays.toString(iarr));

		// Though you've allocated space for the array.
		// Every single element is still 'null'.
		sarr[0] = new String();
		sarr[1] = "Hello";
		// This will cause an exception.
		// sarr[2].charAt(0);

		// Question: Is array an object too?
		// Think about pointer and referecne.
		// Think about deep copy and shallow copy.

		// Note that the main() function has a parammeter.
		// String[] args is the array storing the arguments from the command
		// line.
		System.out.println(args.length);
		for (String arg : args) {
			System.out.println(arg);
		}

		// The class java.util.Arrays provides some methods for you.
		// This one is the most useful.
		Arrays.sort(iarr);
		// Other APIs are for you to discover.

		// An 2-dimensional array
		int[][] arr2d1 = new int[2][3];
		int[][] arr2d2 = { { 2, 3, 4 }, { 5, 6, 7 } };
		// Allocate the space in whatever way you like.
		// Traversal with two nested foreach loop.
		for (int[] is : arr2d2) {
			for (int i : is) {
				System.out.print(i + " ");
			}
			System.out.print('\n');
		}
		
		// The length of the arrays can be different.
		int[][] arr2d3 = new int[2][];
		arr2d3[0] = new int[3];
		arr2d3[1] = new int[5];
		// It's just like the pointers in C. 
	}
}
