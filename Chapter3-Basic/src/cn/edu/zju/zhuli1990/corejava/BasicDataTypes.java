package cn.edu.zju.zhuli1990.corejava;

public class BasicDataTypes {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// First comes a hello world.
		System.out.println("Hello world.");

		// There are only 8 basic types.
		// If you need anything else, you'll need to declare a class.

		// These four are integers.
		// There is no 'unsigned' in Java. Every integer is signed.
		byte by = 0x7f;
		short sh = 0x7fff;
		int i = 0x7fffffff;
		long l = 0x7fffffffffffffffL;

		// This is boolean, not compatible with int.
		boolean b = true;

		// char takes 2 bytes.
		char c = '\u0061';
		System.out.println(c);

		// Same in C++
		float f = 1.0f;
		double d = 2.0;
	}

}
