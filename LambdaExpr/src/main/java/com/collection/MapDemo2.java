package com.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
	public static void main(String[] args) {
//		Map<Integer, String> map = Map.of(01, "sanju", 02, "kanhu", 03, "mahesh", 04, "Mahesh");
		Map<Integer, String> map = new HashMap<>();
		map.put(01, "sanju");
		map.put(02, null);
		map.put(null, "mahesh");
		map.put(null, null);
//		System.out.println(map);
//		String remove = map.remove(02);
//		System.out.println(map);
//
//		Map<Integer, String> map2 = new LinkedHashMap();
//		map2.putAll(map);
//		System.out.println(map2);

//		Set<Integer> set = new HashSet<>();
//		set.add(2);
//		set.add(null);
//		set.add(3);
//		set.add(4);
//		set.add(null);
//		set.add(4);
//		System.out.println(set);

//		String name = "sanju";
//		String name2 = "mahsh";
//		List<String> favColors = new ArrayList<>();
//		favColors.add("Black");
//		favColors.add("White");
//		favColors.add("Red");
//
//		Map<String, List<String>> map3 = new HashMap<>();
//		map3.put(name, favColors);
//		List<String> list = map3.get("sanju");
//		System.out.println(name + " - " + list);

		List<String> sanjuFavColors = new ArrayList<>();
		sanjuFavColors.add("Black");
		sanjuFavColors.add("White");
		sanjuFavColors.add("Red");

		List<String> maheshFavColors = new ArrayList<>();
		maheshFavColors.add("Blue");
		maheshFavColors.add("Green");
		maheshFavColors.add("Red");
		System.out.println(sanjuFavColors);
		System.out.println(maheshFavColors);
	}
}
