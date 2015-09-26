import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class tt {
	public static void main(String[] args) {
		Map<String,List<Map<String,String>>> map  = new HashMap<String, List<Map<String,String>>>();
		List<Map<String,String>> t1 = new ArrayList<Map<String,String>>();
		Map<String,String> map1 = new HashMap<String, String>();
		map1.put("speed", "1");
		map1.put("power", "1");
		t1.add(map1);
		
		Map<String,String> map2 = new HashMap<String, String>();
		map2.put("speed", "2");
		map2.put("power", "2");
		t1.add(map2);
		map.put("t1", t1);
		List<Map<String,String>> t2 = new ArrayList<Map<String,String>>();
		Map<String,String> map3 = new HashMap<String, String>();
		map3.put("speed", "1");
		map3.put("power", "2");
		t2.add(map3);
		
		Map<String,String> map4 = new HashMap<String, String>();
		map4.put("speed", "2");
		map4.put("power", "3");
		t2.add(map4);
		
		
		map.put("t2", t2);
		
		
		List<Map<String, String>> firstMap = new ArrayList<Map<String,String>>();
		
		int i=0;
		for(Entry<String, List<Map<String, String>>> entry : map.entrySet()){
			if(i==0){
				firstMap.addAll(entry.getValue());
			}else{
				
			}
					
			i++;		
		}
		
		
		
	}
}
