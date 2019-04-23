package com.w2a.testCases;

import org.testng.annotations.Test;

import com.w2a.pages.Demo;
import com.w2a.pages.HomepageFrontend;


@Test

public class BlogTest {
	
	public void blogTest() {
		Demo demo = new Demo();
		HomepageFrontend home = demo.goToHomepageFrontend();
		home.goToBlog();
		
		}

}
