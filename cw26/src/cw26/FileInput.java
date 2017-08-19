package cw26;

import java.io.*;

public class FileInput {
	
	public static void main(String[] args){
		
		File file = new File("Z:/workspaceppj/cw25/src/cw25/Rakieta.java");
		
		try(FileInputStream f = new FileInputStream(file)){
			f.read();
			
			int b;
			while((b=f.read())!=-1){
				System.out.print((char)b);
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
			
		
	}
}
