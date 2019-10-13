package BuilderFramework;

import org.testng.annotations.Test;

public class BuiderPattern {
	
	
	
	//two filter 
	@Test(groups= {"Smoke Test"})
	public void TestBuilderPattern_1() {
		
		ListingPage lp = new ListingPage();
		lp.applyPriceFilter("1000").applyRatingFilter("4");

	}
	
	//applying one filter one sorter
	@Test(groups= {"Functional Test"})
	public void TestBuilderPattern_2() {
		
		ListingPage lp = new ListingPage();
		lp.applyPriceFilter("2000").applyhightoLowSorter("High to low");

	}
	
	//applying 2 filter one sorter
	@Test(groups= {"Smoke Test"})
	public void TestBuilderPattern_3() {
		
		ListingPage lp = new ListingPage();
		lp.applyPriceFilter("2000").applylowtoHighSorter("Low to High").applyDurationFilter("5");

	}

}
