package dictionary;

import java.util.HashMap;
import java.util.Map;

public class DictionaryPractice {

	public static void main(String[] args) {
		// English to Spanish Dictionary
		Map<String, String> engSpanDic = new HashMap();
		// putting things in Dictionary
		engSpanDic.put("Monday", "Lunes");
		engSpanDic.put("Tuesday", "Murtes");
		engSpanDic.put("Wednesday", "Miersoles");
		engSpanDic.put("Tuesday", "Juneves");
		engSpanDic.put("Thrusday", "Vernes");
		engSpanDic.put("Friday", "");
		engSpanDic.put("Saturday", "");
		engSpanDic.put("Sunday", "");
		// Retrieve things from dictionary
		System.out.println(engSpanDic.get("Monday"));
		System.out.println(engSpanDic.get("Tuesday"));
		System.out.println(engSpanDic.get("Wednesday"));
		// Print out all keys
		System.out.println(engSpanDic.keySet());
		// List out all values
		System.out.println(engSpanDic.values());
		// size
		System.out.println("The Size of our Dictionary is : " + engSpanDic.size());
		System.out.println("\n");
		// Creating Shoppinglist
		Map<String, Boolean> shoppingList = new HashMap<>();
		// Put some Stuff in List
		shoppingList.put("Pizza", true);
		shoppingList.put("Pizza Sause", Boolean.TRUE);
		shoppingList.put("Salt", Boolean.FALSE);
		shoppingList.put("Sugar", Boolean.FALSE);
		// reterive
		System.out.println(shoppingList.get("Pizza") + "\n" + shoppingList.get("Sugar"));
		// Key-Value pair
		System.out.println(shoppingList);
		//is Empty ?
		System.out.println("Is Empty ? :"+shoppingList.isEmpty());
		//remove 
		shoppingList.remove("Sugar");
		//update the value 
		shoppingList.replace("Salt", Boolean.TRUE);
		
		// clear the dic
		shoppingList.clear();
		System.out.println(shoppingList.toString());
	}

}
