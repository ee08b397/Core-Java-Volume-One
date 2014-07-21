package cn.edu.zju.zhuli1990.corejava;

public class MathFunctions {
	public static void main(String[] args) {
		// There're some useful functions in Math.
		// They're all static, so you can use them separately at your will. 
		Math.sin(0.0);
		Math.exp(2);
		Math.log10(100);
		Math.min(3, 5);
		Math.pow(2, 7);
		// etc.

		// Also there're two constants PI and E available.
		int i = 0; // Don't care about the value, it's the 'i'
		if (Math.pow(Math.E, i * Math.PI) + 1 == 0) {
			// Euler's Identity
		}
	}
}
