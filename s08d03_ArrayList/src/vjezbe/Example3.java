package vjezbe;


import java.util.ArrayList;

public class Example3 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.println(list.size());
		
		list.add(5);
		System.out.println(list.size());
		
		for (int i = 0; i < 5; i++) {
			list.add((int) (Math.random() * 4));
		}
		System.out.println(list);
		
		list.add(0, 15);
		System.out.println(list);
		
		list.remove(0);
		System.out.println(list);
		
		list.remove(Integer.valueOf(3));
		System.out.println(list);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(-20);
		list2.add(-50);
		
		list.addAll(list2);
		System.out.println(list);
		
		System.out.println(list.contains(-20));
		
		System.out.println(list.indexOf(-20));
		
		list.clear();
		System.out.println(list.isEmpty());
		
		list.add(100);
		System.out.println(list);
		
		list.set(0, 5);
		list.add(0, 5);
		System.out.println(list);
		
	}

}
