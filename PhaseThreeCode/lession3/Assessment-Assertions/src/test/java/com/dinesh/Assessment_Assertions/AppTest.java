package com.dinesh.Assessment_Assertions;



import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class AppTest {

	App app;

	@BeforeAll
	static void callAtBeginning() {
		System.out.println("BeforeAll called...Din");
	}

	@AfterAll
	static void callAtEnd() {
		System.out.println("AfterAll called...Din");
	}

	@AfterEach
	void callAfterEach() {
		System.out.println("AfterEach called...Din");
	}

	@BeforeEach
	void callBeforeEach() {
		System.out.println("BeforeEach called...Din");
	}

	@Test // Signals to JUnit this is a test method
	void testDivide() {
		App theApp = new App();

		int result = theApp.divideNumbers(200, 50);

		assertEquals(4, result);

		assertEquals(4, result);

		assertNotEquals(350, result);

//		Assert for multiple values
		assertAll(
				() -> assertEquals(4, result), 
				() -> assertEquals(4, result), 
				() -> assertNotEquals(200, result));
		
	}

	
	

}