package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class SimpleObjectReverseSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          ArrayList al= new ArrayList();
          al.add(100);
          al.add(25);
          al.add(75);
          al.add(50);
          al.add(20);
          al.add(35);
          System.out.println(al);
          Collections.sort(al);
	Collections.reverse(al);
	System.out.println(al);
	
	}
	

}
