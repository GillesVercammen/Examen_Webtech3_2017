package edu.ap.quote;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

	public class Quote {
		//http://stackoverflow.com/questions/4716503/reading-a-plain-text-file-in-java
		//i'm trying 
		String readFile(String fileName) throws IOException {
		    BufferedReader reader = new BufferedReader(new FileReader(fileName));
		    try {
		        StringBuilder builder = new StringBuilder();
		        String line = reader.readLine();

		        while (line != null) {
		            builder.append(line);
		            builder.append("\n");
		            line = reader.readLine();
		        }
		        return builder.toString();
		    } finally {
		        reader.close();
		    }
		}
		
		private String readQuote = readFile("oscar_wilde.txt");
		//split op wat???
		String lines[] = readQuote.split("");
		
		public String getAllQuotes () {
			return readQuote;
		}
	}
	

