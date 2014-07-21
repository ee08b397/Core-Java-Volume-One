package cn.edu.zju.zhuli1990.corejava;

public class AboutTheString {
	public static void main(String[] args) {
		String str;

		// This looks like <string> in C++.
		str = "This is a string";
		System.out.println(str);

		// str[2] is not allowed, use charAt() instead.
		str.charAt(2);

		// You can't change a letter in the string.
		// But you can replace it with another string.
		str = "This is another string";

		// '+' for String is a special case in Java.
		// Operator overloading is forbidden in java, but this one is possible.
		// Sun did some trick for it.
		str = str + " add something";

		// Just like substr in C++.
		str.substring(1, 2);

		// char[] is array, String is class.
		// They can be converted to each other.
		char[] arr = str.toCharArray();
		// char array is revisable.
		arr[0] = 't';

		String str1;
		str1 = String.copyValueOf(arr);
		System.out.println(str1);

		// The difference between '==' and 'equals'.
		// == checks for reference
		// equals checks for value only.
		str = new String("Hello");
		if (str == "Hello") {
			System.out.println("1 ==");
		}
		if (str.equals("Hello")) {
			System.out.println("2 equals()");
		}
		str = "Hello";
		if (str == "Hello") {
			System.out.println("3 ==");
		}

		// An empty string is a still string.
		// The length is zero.
		str = "";

		// null is nothing at all, like NULL pointer in C++.
		// Here in Java, it's null reference.
		str = null;
		// If you try this, you'll cause exception.
		// str.charAt(2);
		
		// What if I need something like <string> in C++?
		// Every object needs initialization.
		StringBuilder sb = new StringBuilder();
		sb.append('a');
		sb.append(1.2);
		sb.append("Hello");
		sb.setCharAt(2, 'b');
		str = sb.toString();
		System.out.println(str);
		// It looks a bit verbose, but it serves the same purpose of a C++ string.
	}
}
