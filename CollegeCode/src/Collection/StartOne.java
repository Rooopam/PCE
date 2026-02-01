package Collection;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class StartOne {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(50);
		ts.add(40);
		ts.add(30);
		ts.add(20);
		System.out.println(ts);
		
		ArrayList lt = new ArrayList();
		lt.add(50);
		lt.add(40);
		lt.add(30);
		lt.add(20);
		System.out.println(lt);
		Collections.sort(lt);
		System.out.println(lt);
		
		ArrayDeque ad = new ArrayDeque();
		ad.add(50);
		ad.add(40);
		ad.add(30);
		ad.add(20);
		System.out.println(ad);
		ArrayList al=new ArrayList();
		al.addAll(ad);
		Collections.sort(al);
		System.out.println(al);

	}

}
