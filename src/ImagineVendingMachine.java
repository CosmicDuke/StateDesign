

public class ImagineVendingMachine {

	private int count;
	private State noMoney;
	private State hasMoney;
	//private State sold;
	private State soldOut;
	private State state;
	private State Dispense;
	
	public ImagineVendingMachine(int count) {
		this.count = count;
		
		noMoney = new NoMoneyState(this);
		hasMoney = new HasMoneyState(this);
		//sold = new SoldState(this);
		soldOut = new SoldOutState(this);
		Dispense = new DispenseState(this);
		
		if(this.count > 0) {
			state = noMoney;
		}
		else {
			state = soldOut;
		}
	}
	
	public void insert(int n) {
		 state.insert(n);
	}
	
	public void dispense() {
		state.dispense();
	}
	
	public void cancle() {
		state.cancle();
	}
	
	public void selectProduct() {
		state.selectProduct();
		state.dispense();	
	}
	
	public void SetState(State state) {
		this.state=state;
	}
	
	public State getHasMoney() {
		return hasMoney;
	}

	

	public State getDispense() {
		// TODO Auto-generated method stub
		return Dispense;
	}

	public State getSoldOut() {
		// TODO Auto-generated method stub
		return soldOut;
	}

	public State getNoMoney() {
		// TODO Auto-generated method stub
		return noMoney;
	}

	public void release() {
		System.out.println("A goods is coming out");
		count -= 1;
	}

	public int getCount() {
		return count;
	}

	
	
}
