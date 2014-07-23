package cn.edu.zju.zhuli1990.corejava;

public class Operators {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// An introduction to operators you have in Java.
		int i;

		// Arithmetic operators
		i = 1 + 1;
		i = 1 - 2;
		i = 2 * 3;
		i = 4 / 5;
		i = 7 % 3;

		// 4 / 5 == 0
		// 4.0 / 5.0 == 0.8
		double d;
		d = 4.0 / 5.0;

		// Self increment/decrement operators
		// Use them on integers.
		++i;
		i++;
		--i;
		i--;

		// You can use them on floating point numbers.
		// But not suggested.
		d++;

		// Comparison operators
		if (i >= 1) {
		} else if (i <= 1) {
		} else if (i > 1) {
		} else if (i < 1) {
		} else if (i != 1) {
		} else if (i == 1) {
		}

		// Logical operators
		boolean bx = true, by = false;
		if (bx && by) {
		} else if (bx || by) {
		} else if (!bx) {
		}

		// Bitwise operators
		i = 1 & 3;
		i = 2 | 1;
		i = 2 ^ 3;
		i = ~1;
		i = -1 >> 2;
		i = 12 << 2;
		i = -1 >>> 2;
		
		// Assignment operators
		i = 1;
		
		i += 1;
		i -= 1;
		i *= 1;
		i /= 1;
		i %= 1;
		
		i <<= 1;
		i >>= 1;
		i >>>= 1;
		i &= 1;
		i |= 1;
		i ^= 1;
		
		// Type conversion.
		long l = 1; // automatic from int to long
		short s = (short)100000; // forced from int to short
		
		// There is no syntax like this in Java.
		// short s = short(100000);
		// But they work in C++.
		
		// There is no 'sizeof' operator in Java.
		// You're not expected to care about those byte-related matters.
		
		// Last but not least, the conditional operator
		i = (i == 1 ? 2 : 3);
	}
}
