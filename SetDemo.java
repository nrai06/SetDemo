import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class SetDemo {
	public static void main(String[] args) {
		Set<Integer> set=new HashSet<>();
		set.add(20);
		set.add(90);
		set.add(10);
		set.add(50);
		set.add(89);
		System.out.println("Hashset " +set);
		
		boolean isElementAvailable=set.contains(110);
		if(isElementAvailable)
			System.out.println("element found");
		else
			System.out.println("Element not found");
		//delete
//		boolean removed=set.remove(1);
//		System.out.println(removed);
//		System.out.println(set.size() +":" +set);
		//iteration
		
		System.out.println("For Each Loop--------");
		for(Integer Value:set) {
		System.out.println(Value);
		}
		
		System.out.println("Iterator------");
		Iterator<Integer> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		set=new LinkedHashSet<>();
		set.add(20);
		set.add(90);
		set.add(10);
		set.add(50);
		set.add(89);
		System.out.println("linkedhashset " +set);
		
		set=new TreeSet<>();
		set.add(20);
		set.add(90);
		set.add(10);
		set.add(50);
		set.add(89);
		System.out.println("Treeset " +set);
		
		
	}

}
