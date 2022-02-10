package com.dinesh.Assessment_Stander_test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

//@SuppressWarnings("unused")
@TestInstance(Lifecycle.PER_CLASS)
class AppTest {

	App app;

	@BeforeAll
	static void callAtBeginning() {
		System.out.println("BeforeAll called...Dinesh");
	}

	@AfterAll
	static void callAtEnd() {
		System.out.println("AfterAll called...Dinesh");
	}

	@AfterEach
	void callAfterEach() {
		System.out.println("AfterEach called...Dinesh");
	}

	@BeforeEach
	void callBeforeEach() {
		System.out.println("BeforeEach called...Dinesh");
	}


	
	@ParameterizedTest
	@ValueSource(strings = {"anand", "madam", "dinesh"})
	@DisplayName("Check For Palindrome")

	@EnabledOnOs(OS.WINDOWS)
	@EnabledOnJre(JRE.JAVA_17)
	void testPalindrome(String value) {
		assertEquals(true, new App().checkPalindrome(value));
	}
	
	
	

}