package Collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

public class arr {

	public static void main(String[] args) {
		ArrayList list = new ArrayList(); {
			list.add("10");
			list.add("20");
			list.add("30");
			list.add("40");
//			Enumeration	el=list.elements();
//
//			while(el.hasMoreElements()) {
//				System.out.println(el.nextElement());
			
		}
	for (int i=0;i< list.size();i++) {
			System.out.println(list.get(i));
//			list.add(i);
	}
		for(Object x:list) {
		System.out.println(x);
		}
		 Iterator it = list.iterator();
		 while (it.hasNext()) {
			 System.out.println(it.next());
		}
		ListIterator lt=list.listIterator(); {
			while (lt.hasPrevious()) {
				System.out.println(lt.previous());
			}
			
		     
		}
	}
}
