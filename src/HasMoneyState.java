import java.util.Random;
public class HasMoneyState implements State {

	private ImagineVendingMachine machine;
	Random random = new Random(System.currentTimeMillis());
	public HasMoneyState(ImagineVendingMachine machine) {
		this.machine = machine;
	}

	@Override
	public void insert(int n) {
		System.out.println("You have inserted "+n+" amount.");
		
	}

	@Override
	public void selectProduct() {
		int winner = random.nextInt(5);
		System.out.println("You selected "+winner+".");
		if(winner != 0) {
			
			machine.SetState(machine.getDispense());
		}
		else {
			machine.SetState(machine.getSoldOut());
		}
	}
		
	

	@Override
	public void cancle() {
		System.out.println("Money returned");
		machine.SetState(machine.getNoMoney());
		
	}

	@Override
	public void dispense() {
		System.out.println("You need to select product first");
		
	}
	
	
}
