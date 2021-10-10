package Concrete;

import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckSevice;
import Adapters.MernisServiceAdapters;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager  {
	ICustomerCheckSevice customerCheckService;
	
	
	public StarbucksCustomerManager(ICustomerCheckSevice customerCheckService) {
		this.customerCheckService = customerCheckService;
	}


	@Override
	public void Save(Customer customer) throws RemoteException { 
		 {
			
		if(this.customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("Starbucks müþterisi eklendi ; "+ customer.getName());
			
		}else {
			System.out.println("Geçersiz kiþi bilgileri");
		}
		
		
		
	}
		 
	}


}
