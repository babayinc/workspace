
public class TestTax {
	public static void main(String[] args) {
		
		//Tax t = new Tax();
		
		NJTax t = new NJTax();
		
		t.grossIncome = 40000;
		t.numberOfDependens = 2;
		t.state = "NJ";
				
		double yourTax = t.calcTax();
		
		System.out.println("Your tax is " + t.adjustForStudents(yourTax));
		
		String girlF = "Masha";
		if (girlF == "Masha") {
			System.out.println("True");
		}
		
	}
}
