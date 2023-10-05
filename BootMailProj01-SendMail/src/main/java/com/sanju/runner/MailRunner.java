package com.sanju.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sanju.service.IPurchaseOrder;

@Component
public class MailRunner implements CommandLineRunner {
	@Autowired
	private IPurchaseOrder order;

	@Override
	public void run(String... args) throws Exception {
		String[] items = { "shirts", "trouser", "watch" };
		double[] prices = { 5000, 6000, 7000 };
		String[] mails = { "s4njua@gmail" };
		String msg = order.purchase(items, prices, mails);
		System.out.println(msg);
	}

}
