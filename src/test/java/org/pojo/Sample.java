package org.pojo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Sample {

@BeforeClass
public static void StartDate()
{
System.out.println("Hi EveryOne Good Morning");
}
	
@AfterClass
public static void endDate()
{
System.out.println("We have 5 Annotations in JUnit");
}

@Before
public void startBrowser()
{
System.out.println("Today we are going to learn about JUnit");
}

@After
public void endBrowser()
{
System.out.println("It is used to perform unit testing by the developers");
}

@Test
public void tcl()
{
	System.out.println("Junit is Java Unit Testing");
}
}



