import java.util.*;
import java.util.regex.*;
import java.io.*;

public class JSON_Alex { 
	public void run() throws Exception {
		Scanner file = new Scanner(new File("json.dat"));
		String json = "";
		int bracks = 0;
		while (file.hasNext()) {
			String x = file.nextLine();
			json += x;
			json += "\n";
			if (x.matches(".*\\{.*")) bracks++;
			if (x.matches(".*}.*")) bracks--;
			if (bracks == 0) break;
		}
		while(file.hasNext()) {
			String[] search = file.nextLine().split(" ");
			System.out.println(find(search, json));
		}
	}
	public String find(String[] search, String json) {
		if (search.length == 1) {
			if (search[0].matches("\\d+")) {
				int index = Integer.parseInt(search[0]);
				json = json.substring(json.indexOf("\"")+1);
				for (int i = 0; i < index; i++) {
					json = json.substring(json.indexOf("\"")+1);
					json = json.substring(json.indexOf("\"")+1);
				}
				return json.substring(0, json.indexOf("\""));
			}
			Pattern codePattern = Pattern.compile("\"" + search[0] + "\": \".*\"");
	        Matcher matcher = codePattern.matcher(json);
	        if (matcher.find()) return matcher.group(0).substring(matcher.group(0).substring(0, matcher.group(0).length()-1).lastIndexOf("\"") + 1, matcher.group(0).length()-1);
	        else {
	        	codePattern = Pattern.compile("\"" + search[0] + "\": \\d");
	        	matcher = codePattern.matcher(json);
	        	matcher.find();
	        	return matcher.group(0).substring(matcher.group(0).substring(1).indexOf("\"") + 4);
	        }
		}
		String thing1 = "{";
		String thing2 = "}";
		if (search[1].matches("\\d+")) {
			thing1 = "[";
			thing2 = "]";
		}
		json = json.substring(json.indexOf(search[0]) - 1);
		int bracks = 0;
		for (int i = search[0].length() + 4; i < json.length(); i++) {
			if (json.substring(i, i+1).equals(thing1)) bracks++;
			if (json.substring(i, i+1).equals(thing2)) bracks--;
			if (bracks == 0) {
				json = "\t" + json.substring(search[0].length()+4, i+1);
				break;
			}
		}
		String[] newSearch = new String[search.length-1];
		for (int i = 1; i < search.length; i++) {
			newSearch[i-1] = search[i];
		}
		return find(newSearch, json);
	}
	public static void main(String[] args) throws Exception {
		new JSON_Alex().run();
	}
}