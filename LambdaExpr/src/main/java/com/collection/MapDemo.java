package com.collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.hibernate.query.sqm.tree.domain.AbstractSqmSpecificPluralPartPath;

import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "sanju");
		map.put(2, "mahesh");
		map.put(3, "naaga");
		map.put(4, "naaga");
		String val = "naaga";
		if (map.containsValue(val)) {

		}
		Set<Integer> keySet = map.keySet();
		Set<Entry<Integer, String>> entrySet = map.entrySet();

		Object[] objects = map.values().toArray();
		Object[] keys = keySet.toArray();

		Iterator<Integer> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			Integer key = (Integer) iterator.next();
			System.out.println(key);
		}

		Iterator<Entry<Integer, String>> iterator2 = entrySet.iterator();
		while (iterator2.hasNext()) {
			Map.Entry<java.lang.Integer, java.lang.String> entry = (Map.Entry<java.lang.Integer, java.lang.String>) iterator2
					.next();
			String value = entry.getValue();
			entry.getKey();
		}
	}
}
