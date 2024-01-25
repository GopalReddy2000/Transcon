package com.Getapcs.Trans.BASECLASS;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PriceListDynamicValue {
	private static final String FILE_PATH = "counter.properties";
	private static final String COUNTER_KEY = "counter";

	public static String generateDynamicValue() {
		int counter = getCounter();
		String dynamicValue = "TEST Price_List " + String.format("%02d", counter);
		incrementCounter();
		return dynamicValue;
	}

	private static int getCounter() {
		Properties properties = new Properties();
		try (FileReader reader = new FileReader(FILE_PATH)) {
			properties.load(reader);
		} catch (IOException e) {
			// File doesn't exist or couldn't be read, default to 1
			return 1;
		}

		return Integer.parseInt(properties.getProperty(COUNTER_KEY, "1"));
	}

	private static void incrementCounter() {
		Properties properties = new Properties();
		int counter = getCounter() + 1;
		properties.setProperty(COUNTER_KEY, String.valueOf(counter));

		try (FileWriter writer = new FileWriter(FILE_PATH)) {
			properties.store(writer, null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
