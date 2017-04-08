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
		while(e.hasMoreElements()){
			Order each = (Order) e.nextElement();
			outstanding += each.getAmount();
		}
		
	}
	//print details
	System.out.println("name: " + _name);
	System.out.println("amount: " + outstanding);

	public void printBanner() {
		System.out.println("***********************");
		System.out.println("**** Customer Owes ****");
		System.out.println("***********************");
	}
	
}
