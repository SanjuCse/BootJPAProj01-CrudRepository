package com.collection;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import lombok.ToString;

@ToString
class Customer {

}

public class MapDemo3 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "rise");
		map.put(2, "dal");
		map.put(3, "roti");
		Set<Entry<Integer, String>> entrySet = map.entrySet();

//		Iterator<Entry<Integer, String>> iterator = entrySet.iterator();
//		System.out.println("Key\tValue");
//		while (iterator.hasNext()) {
//			Map.Entry<java.lang.Integer, java.lang.String> entry = (Map.Entry<java.lang.Integer, java.lang.String>) iterator
//					.next();
//			System.out.println(entry.getKey() + "\t" + entry.getValue());
//		}

//		Enumeration<Entry<Integer, String>> enumeration = Collections.enumeration(entrySet);
//		System.out.println("Key\tValue");
//		while (enumeration.hasMoreElements()) {
//			Map.Entry<java.lang.Integer, java.lang.String> entry = (Map.Entry<java.lang.Integer, java.lang.String>) enumeration
//					.nextElement();
//			System.out.println(entry.getKey() + "\t" + entry.getValue());
//		}

//		Object[] array = entrySet.toArray();
//		for (Object object : array) {
//			System.out.println(object);
//		}
	}
}
