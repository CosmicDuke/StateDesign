
public class SoldOutState implements State{

	private ImagineVendingMachine machine;
	
	public SoldOutState(ImagineVendingMachine machine) {
		this.machine=machine;
	}
	@Override
	public void insert(int n) {
		System.out.println("The machine is sold out");
		
	}

	@Override
	public void selectProduct() {
		System.out.println("The machine is sold out");
		
	}

	@Override
	public void cancle() {
		System.out.println("The machine is sold out");
		
	}

	@Override
	public void dispense() {
		System.out.println("No dispensed, The machine is sold out");
		
	}

}
