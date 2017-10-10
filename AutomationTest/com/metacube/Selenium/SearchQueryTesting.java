/**
 * @Date 09-October-2017
 * @author Rajat Jain
 * @version 1.0
 * @Project Selenium implementation using FireFox,Chrome and IEDriver
 */
package com.metacube.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * The Class SearchQueryTesting.
 */
public class SearchQueryTesting {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		try {
			WebDriver driver = new InternetExplorerDriver();
			driver.get("http://automationpractice.com/index.php");
			Thread.sleep(1000);
			driver.findElement(By.id("search_query_top")).click();
			driver.findElement(By.id("search_query_top")).sendKeys("Faded");
			System.out.println("test over");
			driver.findElement(By.name("submit_search")).click();
			// Thread.sleep(6000);
			// driver.quit();
		} catch (InterruptedException e) {
			System.out.println("Error: " + e);
		}
	}
}
