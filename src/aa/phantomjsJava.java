package aa;

import java.util.ArrayList;
import java.util.List;

public class phantomjsJava {
	public static void main(String[] args) {
		List<Integer> dataStatusList = new ArrayList<Integer>();
		dataStatusList.add(3);
		dataStatusList.add(2);
		dataStatusList.add(6);
		int  k=dataStatusList.stream().filter(obj->{
			return obj<4;
			}).reduce(
				       0,
				       (a, b) -> a + b);
		
		System.out.println(k);
	}
}
