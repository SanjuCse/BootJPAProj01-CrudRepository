package com.sanju;

public class SingleTon implements Cloneable {
//	Eager Initialization
//	private static SingleTon obj = new SingleTon();

//	Lazy Initialization
	private static SingleTon obj = null;

	private SingleTon() {
	}

	public static SingleTon factory() {
		if (obj == null) {
			obj = new SingleTon();
			return obj;
		}
		return obj;
	}

	public void temp() {
		System.out.println("Temp Method: " + this);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		SingleTon obj = SingleTon.factory();
		SingleTon obj2 = SingleTon.factory();
		System.out.println(obj);
		System.out.println(obj2);
		System.out.println("-------------------------------");
		obj.temp();
		obj2.temp();

		SingleTon cloneObj = (SingleTon) obj.clone();
		System.out.println(cloneObj);
		cloneObj.temp();
	}
}
