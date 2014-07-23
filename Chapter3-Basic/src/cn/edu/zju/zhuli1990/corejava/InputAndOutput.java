package cn.edu.zju.zhuli1990.corejava;

import java.io.Console;
import java.util.Date;
import java.util.Scanner;

public class InputAndOutput {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Output is relatively easy.
		System.out.print("Line 1\n");
		// println saves you an '\n'.
		System.out.println("Line 2");
		// printf is similar to printf() in C.
		System.out.printf("Line %d\n", 3);
		// printf() can print formatted date in specific language.
		System.out.printf("%tc\n", new Date());

		// Input is a bit more complex.
		Scanner scanner = new Scanner(System.in);
		// Read an integer from stdin.
		int i = scanner.nextInt();
		// Read a line from stdin.
		String str = new String();
		str = scanner.next();
		
		// Is there anything like EOF in Java?
		double d;
		while (scanner.hasNextDouble()) {
			d = scanner.nextDouble();
			System.out.println(d + " * 2 = " + d * 2);
		}
		// Ctrl + Z ends the input, just like EOF does.

		// A console object is available for you.
		Console console = System.console();
		if (console == null) {
			// You'll get this when running Eclipse.
			System.out.println("Console object is not available.");
		} else {
			// Read a line with this console.
			str = console.readLine();
			// Read a line of password, it will be invisible.
			char[] passwd = console.readPassword();
		}
	}
}
