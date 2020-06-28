package sef.module9.activity;
//Needs to be completed

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.*; 
import sef.module9.sample.MapSample;


public class MapActivity {

		public static void main(String[] args) {
			//1 - Type code to create a HashMap of key value pair
			//where key is id of type String and value is a name
			
			Map map = new HashMap();
			map.put("Name", "John Doe");
			map.put("Date", new Date());
			map.put("age", new Integer(42));
			map.put("weight", new Float(80.5f));
			
			//2 - Call print method to print the map passed as its parameter.
			
			System.out.println(map.get("c"));
			
			
			new MapActivity().print(map);
		}
		
		void print(Map map)
		{
			//3 - Type code to print this map
			Set keySet = map.keySet();
			
			System.out.println("*************************************");
			System.out.println("Key\t\t\tValue");
			Iterator it=keySet.iterator();
			while(it.hasNext())
			{
				String key=(String)it.next();
				System.out.println(key+"\t"+"\t"+"\t"+map.get(key));
			}
			
			System.out.println("*************************************");
		}
	}
