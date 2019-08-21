/*
 * Copyright 2015-2018 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package com.example.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.project.Calculator;
import com.slickqa.jupiter.SlickBaseTest;
import com.slickqa.jupiter.annotations.Step;
import com.slickqa.jupiter.annotations.TestCaseInfo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculatorTests extends SlickBaseTest {

	@Test
	@TestCaseInfo(
			title = "Adds two numbers",
			purpose = "Check that simple adding works",
			component = "Basic Calculations",
			feature = "Adding",
			steps = {
					@Step(step = "Enter first number",
							expectation = "Number displays"),
					@Step(step = "Press plus button",
							expectation = "First number still displays"),
					@Step(step = "Enter second number",
							expectation = "Second number diplays"),
					@Step(step = "Press equals",
							expectation = "Correct answer displays"),
			},
			author = "Nancy Tester"
			//triageNote = "If known failure add reason here and it will display in slick"
	)
	void addsTwoNumbers() {
		Calculator calculator = new Calculator();
		assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
	}

	@ParameterizedTest(name = "{0} + {1} = {2}")
	@CsvSource({
			"0,    1,   1",
			"1,    2,   3",
			"49,  51, 100",
			"1,  100, 101"
	})
	void add(int first, int second, int expectedResult) {
		Calculator calculator = new Calculator();
		assertEquals(expectedResult, calculator.add(first, second),
				() -> first + " + " + second + " should equal " + expectedResult);
	}
}
