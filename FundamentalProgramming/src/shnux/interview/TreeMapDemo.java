package shnux.interview;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		Map<String,String> myTMap = new TreeMap(); 
		
		myTMap.put("cshnux1", "100");
		myTMap.put("dshnux2", "200");
		myTMap.put("bshnux3", "300");
		myTMap.put("eshnux4", "400");
		myTMap.put("ashnux5", "500");
		myTMap.put("ashnux5", "100");
		
		Set st = myTMap.entrySet();
		Iterator i = st.iterator();
		
		while(i.hasNext()){
			Map.Entry mp = (Map.Entry) i.next();
			System.out.print(mp.getKey()+" : ");
			System.out.println(mp.getValue());
		}
	}

}
