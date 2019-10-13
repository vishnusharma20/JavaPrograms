package BuilderFramework;

import java.util.ArrayList;

public class ListingPage implements Filter,Sorter {
	
	
	@Override
	public ListingPage applylowtoHighSorter(String lowtoHigh) {
		
		System.out.println("Apply low to Hight sorter" + lowtoHigh);
		return this;
	}

	@Override
	public ListingPage applyhightoLowSorter(String hightoLow) {
		System.out.println("Apply High to low sorter : " + hightoLow);
		return this;
	}

	@Override
	public ListingPage applyPriceFilter(String price) {
		System.out.println("Apply price filter : " + price);
		
		if(price.equals("2000") ) {
			System.out.println("Count of hotel is 100");
		}
		if(price.equals("1000")) {
			System.out.println("Count of hotel is 70");
		}
		
		return this;
	}

	@Override
	public ListingPage applyRatingFilter(String rating) {
		System.out.println("Apply rating filter : " + rating);
		System.out.println("Count of hotel is 50");
		return this;
	}

	@Override
	public ListingPage applyDurationFilter(String duration) {
		System.out.println("Apply duration filter : " + duration);
		System.out.println("Count of hotel is 40");
		return this;
	}
	
	
}
