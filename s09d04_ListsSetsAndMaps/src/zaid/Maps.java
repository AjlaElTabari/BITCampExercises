package zaid;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;

public class Maps {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(5, "Ognjen");
		map.put(10, "Hajrudin");
		map.put(1, "Edvin");
		map.put(8, "Dinko");
		
		System.out.println(map);
		
		TreeMap<String, String> map2 = new TreeMap<>();
		map2.put("Ajla", "Uvijek prati");
		map2.put("Hajrudin", "Uvijek pita cudna pitanja");
		map2.put("Tomislav", "Ko je to?");
		
		System.out.println(map2.get("Tomislav"));
		
		TreeMap<HashMap<PriorityQueue<Double>, LinkedList<Integer>>, TreeSet<Double>> map3;
		ArrayList<ArrayList<Integer>> list2d = new ArrayList<>();
		ArrayList<Integer> red = new ArrayList<>();
		red.add(5);
		red.add(2);
		red.add(1);
		
		ArrayList<Integer> red2 = new ArrayList<>();
		list2d.add(red);
		list2d.add(red2);
		
		HashMap<String, Integer> map4 = new HashMap<>();
		map4.put("a", 5);
		map4.put("bb", 15);
		map4.put("b", 4);
		
		System.out.println(map4);
	}

}
