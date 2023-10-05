package com.sanju;

abstract class I6 {
	protected abstract void name();
}

public class StaticMethod2 extends I6 {

	@Override
	protected void name() {
		System.out.println("name method");
	}

}
