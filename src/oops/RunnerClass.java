package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Employee E1 = new Employee();
		
		E1.Name = "Mike";
		E1.EmpID = 1000;
		E1.Department = "HR";
		
	/*	System.out.println(E1.Name);
		System.out.println(E1.EmpID);
		System.out.println(E1.Department);
		*/
		E1.Display();
		
		Employee E2 = new Employee("Jack", 1001, "Finance");
		E2.Display();
			
		Bank B = new Bank();
		B.DisplayBalane();
		
		int Bal = B.GetBalance();
		
		System.out.println("The Banalnce is " + B.GetBalance());
		System.out.println("The Balance is" + Bal);
		
		BOABank B1 = new BOABank();
		B1.CCBalance();
		B1.DisplayBalane();
	
	OverLoadingExample obj = new OverLoadingExample();
	
	int RecArea = obj.GetArea(3,4); //polymorphy eine methode mit selben namen und mehreren parametern
	int SQArea = obj.GetArea(4);

	
	//Overriding Example
	
	B1.CloseAccount(1236);
	B.CloseAccount(123456);
	
	
	Chrome Ch =new Chrome();
	Ch.OpenBrowser();
	Ch.Show();
	
	Browser Br = new Chrome();
	Br.OpenBrowser();
	Br.CloseBrowser();
	Br.DisplayName();
	
	
	HondaCar car1 = new HondaCar();
	
	CarInterface car2 = new HondaCar();
	
	
	
	EncaapsulationEx En = new EncaapsulationEx();
	
	En.setBalance(3000);
	System.out.println(En.getBalance());
	
	

		
		
	}
	
	}


	
	
	

