package cw29;


import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Zad2 {

	public static void main(String[] args) {
	
	
	try 
	{
		Pattern telefon = Pattern.compile("\\+?[\\d]{2}?\\(?\\.?\\d?\\d?\\)?[\\-\\_\\d ]{5,10}");
		Matcher telematch = telefon.matcher(readFile("Z:/zdr/ppj/telFormat.txt").toString());
		int count = 0;
		while(telematch.find())
		{
			count++;
			System.out.println(telematch.group());
		}
		System.out.println("Znaleziono " + count + " numerow telefonu");
		
	} catch (IOException e) 
	{
		e.printStackTrace();
	}
	
	

	}

	public static StringBuffer readFile(String path) throws IOException
	{
		FileReader fr = new FileReader(path);
		StringBuffer kBuff = new StringBuffer();
		int tmp;
		while ((tmp = fr.read()) != -1) 
		{
			kBuff.append((char)tmp);
		}
		fr.close();
		return kBuff;
	}
}
