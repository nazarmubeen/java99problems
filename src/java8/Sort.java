package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sort {

	public static void main(String[] args)
	{
		
		List<String> list=new ArrayList<>(Arrays.asList("jhdsvh","nazar","mubeen","gsx"));
		Collections.sort(list);
		System.out.println(list);
		
		String[] strarray={"sahkx","skjqsjkqw","iouowh","aasdsa"};
		
		Arrays.sort(strarray,(String a,String b) -> Integer.compare(a.length(),b.length()));
		
		System.out.println(Arrays.toString(strarray));
		
		String[] arr = { "program", "creek", "program", "creek", "java", "web",
		"program" };
		
		
	}
	
}
