package com.Selenium;

import org.testng.annotations.Test;


/*
//Create the TestNG.xml file 
//TestNG.xml file will control all the Test folder let saw I have 100 TestCases amoung 100 
//I want to execute only 40 TestCases we can achieve by using TestNG.xml file
//At the End as we need to do control the TestNG xml file by using MAVEN
*/

public class SeleniumTest {

@Test
public void BrowserAutomation() {
	
	System.out.println("BrowserAutomation");
	
}

@Test
public void ElementsUI() {
	
	System.out.println("ElementsUI");
	
}

}
