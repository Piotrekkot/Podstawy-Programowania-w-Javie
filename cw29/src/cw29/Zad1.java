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


public class Zad1 {

	public static void main(String[] args) 
	{
		
		
		String wyraz = "Jan III Sobieski herbu Janina ( ur.17 sierpnia 1629 w Oleksu, zm. 17 czerwca 1696 w Wilanowie) - krol Polski i wielki książę litewski od 1674, hetman wielki koronny od 1668, hetman polny koronny od 1666, marszałek wielki koronny od 1665, chorazy wielki koronny od 1656.";
		
		Pattern slowa = Pattern.compile("[()][A-Za-z]+[\\s,().]");
		Pattern date = Pattern.compile("[0-3][0-9]+\\s+[A-Za-z]+\\s+[0-9]{4}");
		Pattern lat = Pattern.compile("[0-9]{4}");
		Pattern slowaWielka = Pattern.compile("[A-Z][a-z]+[\\s,().]");
		Pattern kropki = Pattern.compile("[.]");
		
		
		Pattern[] patterns = 
			{
				Pattern.compile("[A-Za-z]+[\\s,().]"),
				Pattern.compile("[0-3][0-9]+\\s+[A-Za-z]+\\s+[0-9]{4}"),
				Pattern.compile("[0-9]{4}"),
				Pattern.compile("[A-Z][a-z]+[\\s,().]"),
				Pattern.compile("[.]")
			};
		
		
		HashMap<Pattern, String> pat = new HashMap<>();
		pat.put(Pattern.compile("\\p{L}+"), "Slow");
		pat.put(Pattern.compile("[0-3]\\d+\\s+[A-Za-z]+\\s+\\d{4}"), "Dat");
		pat.put(Pattern.compile("\\d{4}"), "Lat");
		pat.put(Pattern.compile("\\p{Lu}[a-z]+"), "Slow z wielkej litery");
		pat.put(Pattern.compile("\\."), "Kropek");
		
			for (Map.Entry<Pattern, String> set : pat.entrySet()) 
			{
				int count = 0;
				Matcher mat = set.getKey().matcher(wyraz);
					while(mat.find())
						count++;
				System.out.println("Ilosc " + set.getValue() + " " + count);
			}
			
		
			
	}
}