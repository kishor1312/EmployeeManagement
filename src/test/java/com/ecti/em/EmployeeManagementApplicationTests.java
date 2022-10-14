package com.ecti.em;

import com.ecti.em.sample.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class EmployeeManagementApplicationTests {

	private Calculator cal = new Calculator();

	@Test
	void contextLoads() {
	}

	@Test
	void testAddNumbers() {
		int var1 = 2;
		int var2 = 3;
		int expectedResult = 5;
		int actualResult = cal.addNumbers(var1, var2);
		assertThat(actualResult).isEqualTo(expectedResult);
	}

	@Test
	void testSubstractNumbers() {
		int var1 = 2;
		int var2 = 3;
		int expectedResult = -1;
		int actualResult = cal.substractNumbers(var1, var2);
		assertThat(actualResult).isEqualTo(expectedResult);
	}

	@Test
	@Disabled
	void testMultiplyNumbers() {
		int var1 = 2;
		int var2 = 3;
		int expectedResult = 6;
		int actualResult = cal.multiplyNumbers(var1, var2);
		assertThat(actualResult).isEqualTo(expectedResult);
	}

	@Test
	void testDivideNumbers1() {
		int var1 = 2;
		int var2 = 3;
		int expectedResult = 0;
		int actualResult = cal.divideNumbers(var1, var2);
		assertThat(actualResult).isEqualTo(expectedResult);
	}

	@Test
	void testDivideNumbers2() {
		int var1 = 2;
		int var2 = 0;
		Exception ex = Assertions.assertThrows(Exception.class, () -> {
			cal.divideNumbers(var1, var2);
		});
		assertEquals(ex.getMessage(), "/ by zero");
	}
}
