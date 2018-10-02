package test;


public class ElectroMainEx{
	public static void main(String[] args){
		Buyer buyer = new Buyer(1000000);

		Audio audio = new Audio(400000);
		Notebook notebook = new Notebook(500000);
		
		buyer.buy(audio);
		buyer.buy(notebook);
		buyer.buy(audio);
	}
}