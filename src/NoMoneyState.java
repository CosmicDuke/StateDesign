
public class NoMoneyState implements State {
	
	private ImagineVendingMachine machine;
	
	public NoMoneyState(ImagineVendingMachine machine) {
		this.machine=machine;
	}
	
	public void insert(int n) {
		System.out.println("You inserted: $"+n+" amount.");
		machine.SetState(machine.getHasMoney());
	}

	public void selectProduct() {
		System.out.println("Insert money to get this product");
		
	}

	public void cancle() {
		System.out.println("Nothing to cancle");
		
	}

	public void dispense() {
		System.out.println("Nothing to dispense, insert money and select product");
	}

	

	
}
