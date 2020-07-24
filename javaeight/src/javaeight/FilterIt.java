package javaeight;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
public class FilterIt {
	public static List<String> search(List<String> list) {
		return list.stream().filter(s -> s.startsWith("gee") && s.length()>=3).collect(Collectors.toList());
	}
	
	public static void main(String args[]) {
		
		List<String> string = new ArrayList<String>();
		 string.add("geethu"); 
	        string.add("geetha"); 
	        string.add("geethanjali");
	        List<String> s = search(string); 
	        System.out.println(s);
		 
}
}
