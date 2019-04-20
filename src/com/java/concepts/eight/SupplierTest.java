package com.java.concepts.eight;

import java.util.function.DoubleSupplier;
import java.util.logging.Logger;

public class SupplierTest {

	public static void main(String[] args)
	{
		Logger logger = Logger.getLogger("...");
		DoubleSupplier randomSupplier;
		randomSupplier = () -> Math.random();                  
		randomSupplier = Math::random;                         

		logger.info(randomSupplier.toString());
	}
}
