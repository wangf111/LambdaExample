package aa;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C {
	public static void main(String[] args) {
		Integer [] ak = {11,22,33};
		List<Integer> a = Arrays.asList(ak);
		Integer al = a.stream().reduce(0, (acc,el)->acc+el);
		System.out.println(al.intValue());
		System.out.println("l");
//		a.stream().
		/*Integer k = Collections.min(a);
		Collections.
		System.out.println(k);*/
	}
}
