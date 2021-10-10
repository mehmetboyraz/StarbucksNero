import Entities.Customer;


import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapters;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
public class Main {

	public static void main(String[] args) throws RemoteException, Throwable  {
		
		Customer customer1 =new Customer(1, "MEHMET ERTUÐRUL", "BOYRAZ", 
				Long.parseLong("11813401694"),1998);
		
		BaseCustomerManager customermanager = new NeroCustomerManager() {
		
		};
		BaseCustomerManager customermanager1 = new StarbucksCustomerManager(new MernisServiceAdapters()){};
		customermanager.Save(customer1);
		customermanager1.Save(customer1);
		
	
	}
}
