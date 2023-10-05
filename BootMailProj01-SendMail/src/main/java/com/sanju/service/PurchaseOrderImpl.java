package com.sanju.service;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.internet.MimeMessage;

@Service("purchaseOrder")
public class PurchaseOrderImpl implements IPurchaseOrder {

	@Autowired
	private JavaMailSender sender;

	@Value("${spring.mail.username}")
	private String fromMail;

	@Override
	public String purchase(String[] items, double[] prices, String[] emails) throws Exception {
		double billAmt = 0.0;
		for (double price : prices) {
			billAmt += price;
		}
		String msg = Arrays.toString(items) + " with prices " + Arrays.toString(prices)
				+ " are purchased with BillAmount " + billAmt;
		String status = sendMail(msg, emails);
		return null;
	}

	public String sendMail(String msg, String[] emails) throws Exception {
		MimeMessage message = sender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message, true);
		helper.setFrom(fromMail);
		helper.setTo(emails);
		helper.setSubject("open it to know it");
		helper.setSentDate(new Date());
		helper.setText(msg);
		helper.addAttachment("bike.jpg", new ClassPathResource("bike.jpg"));
		sender.send(message);
		return "mail send";
	}

}
