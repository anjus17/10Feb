package org.test;

import org.testng.annotations.Test;

public class Testparallel2 {

	@Test
	private void tp1() {
		System.out.println("Test Parallel 1 " +Thread.currentThread().getId());
	}

	@Test
	private void tp2() {
		System.out.println("Test Parallel 2 " +Thread.currentThread().getId());
	}

	@Test
	private void tp3() {
		System.out.println("Test Parallel 3 " +Thread.currentThread().getId());
	}

	@Test
	private void tp4() {
		System.out.println("Test Parallel 4 " +Thread.currentThread().getId());
	}

	@Test
	private void tp5() {
		System.out.println("Test Parallel 5 " +Thread.currentThread().getId());
	}

	
}
