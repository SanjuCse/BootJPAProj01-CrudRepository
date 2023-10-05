package com.sanju.service;

import java.util.Random;

public class StudentServiceMgmt {
	public int getRank(int no) {
		return new Random().nextInt(100);
	}
}
