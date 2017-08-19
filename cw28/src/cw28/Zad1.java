package cw28;

import java.io.Console;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zad1 {

	public static void main(String[] args) {
		Console console = System.console();
		if(console == null){
			System.err.println("Console unavailable");
			System.exit(1);
			
		}
		while(true){
			String reg = console.readLine("inRegex ('q' to quit) ->");
			if("q".equals(reg)) return;
			String inp = console.readLine("");
			Pattern pattern = Pattern.compile(reg);
			Matcher matcher = pattern.matcher(inp);
			
			boolean found = false;
			while(matcher.find()){
				found = true;
				console.format("",
						matcher.group(),
						matcher.start(),
						matcher.end());
			}
			if(!found){
				console.format("");
			}
		}

	}

}
