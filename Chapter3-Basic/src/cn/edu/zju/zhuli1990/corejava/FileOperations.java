package cn.edu.zju.zhuli1990.corejava;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileOperations {
	public static void main(String[] args) {
		String inputFileName = "in.txt";
		String outputFileName = "out.txt";
		
		try {
			Scanner in = new Scanner(Paths.get(inputFileName));
			PrintWriter out = new PrintWriter(outputFileName);
			
			// The usage is similar to standard IO, despite the different source.
			// in.next();
			// out.print("Hello");
			
			in.close();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
