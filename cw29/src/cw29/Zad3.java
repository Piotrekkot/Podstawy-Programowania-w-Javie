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

public class Zad3 {

	public static void main(String[] args) {
		String[][] info = new String[3][100];
		try 
		{
			Pattern[] server = {Pattern.compile("[\\.\\d]{10}"),Pattern.compile("[/\\d]{8,10}"),Pattern.compile("\\>.+\\n?")};
			StringBuffer log= readFile("Z:/zdr/ppj/serverLog.txt");
			for(int i = 0; i < server.length ; i++)
			{
				Matcher pars = server[i].matcher(log.toString());
				int index = 0;
				while(pars.find() && index < 100)
					info[i][index++] = pars.group();
			}
			for(int i = 0; i < info.length; i ++)
				System.out.println(Arrays.toString(info[i]));
			
			
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
