package refactoring;


public class Refactorable {
	private MyCollection _orders = new MyCollection();
	private String _name = "Cutomer Name";
	
	void printOwing(){
		Enumeration e = _orders.elements();
		double oustanding = 0.0;
		
		//print banner
		printBanner();
		
		//calculate outstanding
		oustanding = calculateOustanding(e, oustanding);
		
		//print details
		printDetails(oustanding);
	}

	public double calculateOustanding(Enumeration e, double oustanding) {
		while(e.hasMoreElements()){
			Order each = (Order) e.nextElement();
			oustanding += each.getAmount();
		}
		return oustanding;
	}

	public void printDetails(double oustanding) {
		System.out.println("name: " + _name);
		System.out.println("amount: " + oustanding);
	}

	public void printBanner() {
		System.out.println("***********************");
		System.out.println("**** Customer Owes ****");
		System.out.println("***********************");
	}
	
}
