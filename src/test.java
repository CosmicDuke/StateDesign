
public class test {
	public static void main(String[] args) {
		ImagineVendingMachine machine = new ImagineVendingMachine(5);
		machine.insert(2);
		machine.selectProduct();//this should
		
		machine.insert(1);
		machine.cancle();


		machine.insert(2);
		machine.selectProduct();
		machine.cancle();

		machine.insert(1);
		machine.cancle();


		machine.insert(2);
		machine.selectProduct();
	
	}
}
