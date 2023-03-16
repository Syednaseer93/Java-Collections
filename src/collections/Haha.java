package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Haha {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(1,"qwe");
		hm.put(2, "asd");
		hm.put(3, "ghk");
		Set s=hm.entrySet(); //	WE ARE STORING EVERY ENTRY INTO PREDEFINED SET VARIABLE s
		Iterator it=s.iterator();//
		while(it.hasNext())
		{
			Map.Entry entry=(Entry) it.next();
			System.out.println(entry.getKey()+"  "+entry.getValue());
			
			
		}
		
		
		
		
		
	}

}
