package cn.edu.zju.zhuli1990.corejava;

public class BlocksAndStructures {
	public static void main(String[] args) {
		// {} is a block.
		// Things inside a block have their life cycle within the "{}".
		// Outside the block, they're gone.
		int i = 0;
		{
			// This is not allowed in Java, but it was OK in C.
			// Because it's not good practice to use variables with same name.
			// int i;
			
			// Do whatever you like.
			int x = 3;
			System.out.println(x + i);
		}
		
		// if-else statement
		if (i == 0) {
			System.out.println("if: i == 0");
		} else if (i == 1) {
			System.out.println("else if: i == 1");
		} else {
			System.out.println("else: whatever");
		}
		
		// switch-case statement
		switch (i) {
		case 0:
			System.out.println("switch: i == 0");
			break;
		case 1:
			System.out.println("switch: i == 1");
			break;
		default:
			System.out.println("default path");
			break;
		}
		
		// while loop
		i = 3;
		while (i > 0) {
			System.out.println(i);
			--i;
		}
		
		// for loop
		for (i = 0; i < 3; ++i) {
			System.out.println(i);
		}
		
		// foreach loop
		int[] arr = {1, 1, 2, 3, 5, 8};
		for (int element : arr) {
			element = element * 2;
			// The data in arr[] is not changed.
			// $element is a only copy of data from arr[]. 
			System.out.println(element);
		}
		for (i = 0; i < arr.length; ++i) {
			System.out.println(arr[i]);
		}
		
		// break is similar to the 'break' in C.
		// But you may break with a label.
		a_label:
		while (true) {
			System.out.println("Ready to break the loop.");
			// After breaking, you'll no longer enter the loop right after this label.
			break a_label;
		}
		System.out.println("Break with a label.");
		
		// continue is the same with C
		i = 0;
		while (i < 2) {
			++i;
			System.out.println("continue.");
			continue;
			// Anything after 'continue' is ignored
			// ++i;
		}
	}
}
