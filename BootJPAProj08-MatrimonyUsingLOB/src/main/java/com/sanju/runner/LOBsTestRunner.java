package com.sanju.runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sanju.entities.MarriageSeekar;
import com.sanju.service.IMatrimonyServiceMgmt;

@Component
public class LOBsTestRunner implements CommandLineRunner {

	@Autowired
	IMatrimonyServiceMgmt service;

	@Override
	public void run(String... args) throws Exception {
		String seekarName = "sanju";
		String seekarAddr = "Ganjam";
		String seekarPhotoPath = "C:\\Users\\sanju\\Downloads\\photo_2023-08-10_13-08-54.jpg";
		byte[] photoData = new byte[new FileInputStream(seekarPhotoPath).available()];
		boolean isIndian = true;
		String seekarBioDataPath = "‪C:/Users/sanju/Documents/DriverData.txt";
		File file = new File(seekarBioDataPath);
		FileReader reader = new FileReader(file);
		char bioDataContent[] = new char[(int) file.length()];
		reader.read(bioDataContent);

		MarriageSeekar marriageSeekar = new MarriageSeekar(seekarName, seekarAddr, photoData, bioDataContent, isIndian);
		String seekarMsg = service.registerMarriageSeekar(marriageSeekar);
		System.out.println(seekarMsg);
	}
}
