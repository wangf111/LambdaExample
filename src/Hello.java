import java.util.ArrayList;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Hello {
	
	static int count1=0;
	/*interface HelloService {
		String hello(String firstname, String lastname);
	}

	public static void main(String[] args) {

		HelloService helloService = (String firstname, String lastname) -> {
			String hello = "Hello " + firstname + " " + lastname;
			return hello;
		};
		System.out.println(helloService.hello(args[0], args[1]));

	}*/
	interface HelloService{
		String hello(String firstname,String lastname);
	}
	
	public static void main(String[] args) {
		/*HelloService hs = (x,y)->{
			String hello ="Hello "+x+" "+y;
			return hello;
		};
		System.out.println(hs.hello(args[0], args[1]));*/
		
		/*
		FileFilter fileFilter = (f) -> {
	         String extension = null;
	         String s = f.getName();
	         int i = s.lastIndexOf('.');

	         if (i > 0 && i < s.length() - 1) {
	            extension = s.substring(i + 1).toLowerCase();
	         }
	         if (extension != null) {
	            if (extension.equals("tiff") || extension.equals("tif")
	               || extension.equals("gif") || extension.equals("jpeg")
	               || extension.equals("jpg") || extension.equals("png")
	               || extension.equals("bmp")) {
	            return true;
	         } else {
	            return false;
	         }
	         }
	         return false;
	      };

	      File file = new File("C:/JDK8/Figure10.bmp");
	      System.out.println("File is an image file: " + fileFilter.accept(file));*/
//		(new Thread(()->{System.out.println("eee");})).start();
/*		List<String> list = new ArrayList<String>();
		list.add("dd");
		
		list.add("ll");
		list.add("ed");
		ListIterator<String> al = list.listIterator(1);//从下标1开始遍历 去掉1则是全部遍历
		list.listIterator(1);

		while(al.hasNext()){
			System.out.println(al.next());
		}*/
	/*	List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(2);
		list.add(30);*/
		//list.add(1,90);
		
//		Collections.sort(list, (x,y)->x.compareTo(y));
		
		
//		list.stream().forEach(x->System.out.println(x));
		/*Integer kl = list.stream().reduce(0,Integer::sum);
		System.out.println(kl);*/
		/*List<Integer> list1 = new ArrayList<Integer>();
		list1.add(100);
		list1.add(200);
		list1.add(300);
		
		Stream<List<Integer>> ls = Stream.of(list,list1);*/
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
		
		Map<String,String> map4 = new HashMap<String, String>();
		map4.put("a", "a2");
		map4.put("b", "b12");
		data.add(map4);*/
		
//		data.stream().collect(Collectors.groupingBy(x->x.get("b"),Collectors.counting())).forEach((x,y)->System.out.println(x+"->"+y));;
//		data.stream().collect(Collectors.partitioningBy(x->!x.get("b").equals("b1"),Collectors.counting())).forEach((x,y)->System.out.println(x+"->"+y));;//按照某种条件分为两部分
		
		/*data.stream().forEach(x->{
			System.out.println(x.get("a"));count1++;//lambda只能操控static的变量，局部变量只能为final
		});
		System.out.println(count1);*/
/*		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(2);
		list.add(30);
		
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(100);
		list1.add(200);
		list1.add(300);
*///		Stream.of(list,list1).flatMap(List::stream).forEach(x->System.out.println(x));//合并多个stream成一个
		/*IntSummaryStatistics kl = list1.stream().collect(Collectors.summarizingInt(Integer::intValue));
		System.out.println(kl.getSum());
		System.out.println(kl.getAverage());
		System.out.println(kl.getMax());
		System.out.println(kl.getMin());
		System.out.println(kl.getCount());*/
		
		List<Map<String,String>> data = new ArrayList<Map<String,String>>();
		Map<String,String> map1 = new HashMap<String, String>();
		map1.put("a", "a");
		map1.put("b", "b");
		data.add(map1);
		Map<String,String> map2 = new HashMap<String, String>();
		map2.put("a1", "a1");
		map2.put("b1", "b1");
		data.add(map2);
		
		
	}
}