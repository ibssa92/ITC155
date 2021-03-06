import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Assignment4 {

	public static void main(String[] args) {
		// create a map
		Map<String, String> nameMap = new HashMap<String, String>();
		
		//add key value pairs
		nameMap.put("Lebron", "James");
		nameMap.put("Kobe", "Bryant");
		nameMap.put("Michael", "Jordan");
		nameMap.put("Magic", "Johnson");
		nameMap.put("Larry", "Bird");
		
		System.out.println(isUnique(nameMap));

	}
	
	
	public static boolean isUnique(Map<String, String> map) {
	    Set<String> values = new HashSet();
	    for (String value : map.values()) {
	    	if (values.contains(value)) {
	    		return false;
	    	} else {
	    		values.add(value);
	    	}
	    }
		return true;
	}

}
