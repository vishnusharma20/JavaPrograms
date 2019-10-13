package BuilderFramework;

public interface Filter {
	
	public ListingPage applyPriceFilter(String price);
	public ListingPage applyRatingFilter(String rating);
	public ListingPage applyDurationFilter(String duration);
	
}

interface Sorter{
	
	public ListingPage applylowtoHighSorter(String lowtoHigh);
	public ListingPage applyhightoLowSorter(String hightoLow);
}
