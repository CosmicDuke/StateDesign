
public class DispenseState implements State {

	private ImagineVendingMachine machine;
	
	public DispenseState(ImagineVendingMachine machine) {
		this.machine=machine;
	}
	@Override
	public void insert(int n) {
		System.out.println("Wait for product to be dispensed");
		
	}

	@Override
	public void selectProduct() {
		System.out.println("Wait for product to be dispensed");
		
	}

	@Override
	public void cancle() {
		System.out.println("Cancle not possible product already selected");
		
	}

	@Override
	public void dispense() {
		System.out.println("Coming!!!");
		machine.release();
		if (machine.getCount() == 0) {
			System.out.println("Cong, you got the last one!");
			machine.SetState(machine.getSoldOut());
		} else {
			machine.SetState(machine.getNoMoney());
		}
		
	}

}
