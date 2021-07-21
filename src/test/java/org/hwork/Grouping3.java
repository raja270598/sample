package org.hwork;

import org.testng.annotations.Test;

public class Grouping3 {
	@Test(groups="@smoke")
	private void test1() {
		System.out.println("method 1");


	}
	@Test(groups="@sanity")
	private void test2() {
		System.out.println("method 2");

	}
	@Test(groups="@reg",dependsOnGroups = "@smoke")
	private void test3() {
		System.out.println("method 3");
	}

	@Test(groups="@smoke")
	private void test4() {
		System.out.println("method 4");
	}
	@Test(groups="@sanity",dependsOnGroups = "smoke",alwaysRun = true)
	private void test5() {
		System.out.println("method 5");
	}


	@Test(groups="@reg")
	private void test6() {
		System.out.println("method 6");
	}




}
