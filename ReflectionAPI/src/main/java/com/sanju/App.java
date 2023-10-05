package com.sanju;

import java.awt.print.Pageable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
	static Student student2;

	private static void setStudent() {
		student2 = new Student();
	}

	public static void main(String[] args)
			throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		Student student = new Student();
//		Field[] declaredFields = student.getClass().getDeclaredFields();
//		for (Field field : declaredFields) {
//			field.setAccessible(true);
//			Object object = field.get(student);
//			System.out.println(field.getName() + " - " + object);
//		}

		Method[] methods = student.getClass().getDeclaredMethods();
		for (Method method : methods) {
			method.setAccessible(true);
			String name = method.getName();
			System.out.println(name);
			Parameter[] parameters = method.getParameters();
			for (Parameter parameter : parameters) {
				System.out.println(parameter.getName() + " - " + parameter.getType().getSimpleName());
			}

			if (method.getName().equals("m1")) {
				Object invoke = method.invoke(student, 1, 2);
			} else {
				method.invoke(student, args);
			}
			int modifiers = method.getModifiers();
			System.out.println("Modifiers are - " + modifiers);
			System.out.println("---------------------------------------");
		}
		System.out.println(student);
	}
}
