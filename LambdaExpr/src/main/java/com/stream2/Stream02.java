package com.stream2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream02 {
	public static void main(String[] args) {
//		List<String> nameList = List.of("sanjay", "kanhu", "manda", "mahesh", "sanjukta");
//		Stream<String> nameList = Stream.of("sanjay", "kanhu", "manda", "mahesh", "sanjukta");
//		List<String> removedNames = nameList.dropWhile(name -> name.startsWith("san")).collect(Collectors.toList());
//		System.out.println(nameList.toList());
//		System.out.println(removedNames);.

//		// create a stream of names
//        Stream<String> stream
//            = Stream.of("aman", "amar", "suraj",
//                        "suvam", "Zahafuj");
// 
//        // apply dropWhile to drop all the names
//        // matches passed predicate
//        List<String> list
//            = stream.dropWhile(name -> (name.charAt(0) == 'a'))
//                  .collect(Collectors.toList());
// 
//        // print list
//        System.out.println(list);

		Stream.of("India", "Australia", "Newzealand", "", "England", "Srilanka").dropWhile(o -> !o.isEmpty())
				.forEach(System.out::println);
//		System.out.println();
//		Stream.of("India", "", "Australia", "", "England", "Srilanka").dropWhile(o -> !o.isEmpty())
//				.forEach(System.out::println);
	}
}
