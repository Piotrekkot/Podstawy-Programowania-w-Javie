package cw26;

import java.io.*;

public class filereader {

	public static void main(String[] args) {

		try (FileReader fr = new FileReader("Z:/workspaceppj/cw26/src/cw26/1.txt")) {
			fr.read();

			int b;
			while ((b = fr.read()) != -1) {
				System.out.print((char) b);
			}

		} catch (IOException e) {

			e.printStackTrace();
		}
		
		

	}
}
