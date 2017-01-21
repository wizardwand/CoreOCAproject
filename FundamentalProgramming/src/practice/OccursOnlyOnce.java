package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class OccursOnlyOnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] i = {59 ,88 ,14 ,8 ,85 ,1 ,94 ,74 ,57 ,96 ,39 ,2 ,47 ,43 ,35 ,17 ,53 ,52 ,92 ,31 ,99 ,48 ,94 ,30 ,92 ,60 ,32 ,45 ,88 ,13 ,39 ,50 ,22 ,65 ,89 ,46 ,65 ,76 ,57 ,67 ,99 ,35 ,76 ,46 ,85 ,82 ,45 ,62 ,53 ,80 ,74 ,22 ,31 ,52 ,82 ,13 ,41 ,96 ,2 ,1 ,80 ,62 ,4 ,20 ,50 ,89 ,59 ,67 ,60 ,8 ,41 ,14 ,47 ,48 ,17 ,4 ,43 ,30 ,32};
		Map <Integer , Integer> iMap = new HashMap<>();
		for(int ii = 0 ; ii < i.length ; ii++){
			if(!iMap.containsKey(i[ii])){
				iMap.put(i[ii], 1);
			}else{
				Integer tp = iMap.get(i[ii]);
				tp++;
				iMap.put(i[ii], tp);
			}
		}
		System.out.println(getUnique(iMap));
	}

	private static int getUnique(Map<Integer, Integer> iMap) {
		Set set = iMap.keySet();
		Iterator m = set.iterator();
		
		while(m.hasNext()){
			Integer tmp = (Integer) m.next();	
			if(iMap.get(tmp) == 1){
				return tmp;
			}
		}
		return 0;
	}

}
