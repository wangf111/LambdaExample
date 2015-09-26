import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;



public class phantomjsTest {
public static void main(String[] args) throws IOException {
/*	Runtime rt = Runtime.getRuntime();
	rt.exec("phantomjs highcharts-convert.js -infile options.json -outfile chart.png -scale 2.5 -width 300 -constr Chart -callback callback.js");
*/
	List<Integer> list = Stream.of(1,2,3,4).collect(Collectors.toList());
	/*Integer kl = list.stream().min(Comparator.comparingInt(x->x)).get();
	Integer maxV = list.stream().max(Comparator.comparingInt(x->x)).get();
	System.out.println(kl+"--"+maxV);
	Integer ll = list.stream().reduce(1,(val,el)->val*el);
	System.out.println(ll);
	Integer sum = list.stream().mapToInt(i->i).sum();//
	System.out.println(sum);
	
	list.stream().mapToInt(i->i).distinct().forEach(x->{System.out.println(x);});//È¥³ýÖØ¸´*/
	/*int kk = IntStream.of(1, 2, 3, 4)
            .filter(e -> e > 2)
            .peek(e -> System.out.println("Filtered value: " + e))
            .map(e -> e * e)
            .peek(e -> System.out.println("Mapped value: " + e))
            .sum();
	System.out.println(kk);
	Filtered value: 3
	Mapped value: 9
	Filtered value: 4
	Mapped value: 16
	25*/
	//System.out.println(System.getProperties().getProperty("os.name"));
	/*Map<String,String> tmpMap = new HashMap<String,String>();
	tmpMap.put("3", "4");
	tmpMap.forEach((x,y)->{System.out.println(x+"-->"+y);});
	List<List<String>> kak = new ArrayList<List<String>>();
	List<String> k = new ArrayList<String>();
	k.add("1");
	k.add("2");
	k.add("5%");
	kak.add(k);
	List<String> k1 = new ArrayList<String>();
	k1.add("12");
	k1.add("23");
	k1.add("15%");
	kak.add(k1);
	System.out.println(kak.toString());
	double aa =  kak.stream().map(x->{
		String xData = x.get(2);
		return xData.substring(0, xData.length()-1);
	}).mapToDouble(x->Double.valueOf(x)).max().getAsDouble();
	System.out.println(aa);*/
//	Optional<Integer> ll = list.stream().reduce((val,el)->{return el+=val;});
	
//	Integer ll = list.stream().reduce(0,(el,val)->val+el);
//	System.out.println(ll);
	
	/*List<Map<String,String>> data = new ArrayList<Map<String,String>>();
	Map<String,String> map1 = new HashMap<String, String>();
	map1.put("a", "a");
	map1.put("b", "b");
	data.add(map1);
	Map<String,String> map2 = new HashMap<String, String>();
	map2.put("a", "a1");
	map2.put("b", "b");
	data.add(map2);
	
	Map<String,String> map3 = new HashMap<String, String>();
	map3.put("a", "a1");
	map3.put("b", "b1");
	data.add(map3);
	
	data.stream().collect(Collectors.groupingBy(x->x.get("b"))).forEach((x,y)->{
		System.out.println();
	});;*/
	/*
	List<List<String>> ak = new ArrayList<List<String>>();
	List<String> list1 = new ArrayList<String>();
	list1.add("1");
	list1.add("2");
	list1.add("3");
	ak.add(list1);
	List<String> list2 = new ArrayList<String>();
	list2.add("2");
	list2.add("4");
	list2.add("2");
	ak.add(list2);
	String  al= ak.stream().reduce((x,y)->{
		 if(Double.valueOf(x.get(2))>Double.valueOf(y.get(2))){
			 return x;
		 }else{
			 return y;
		 }
	}).get().get(0);
	System.out.println(al);*/
	
	
	
	
	
	}

}
