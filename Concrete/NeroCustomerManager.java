package Concrete;

import Abstract.BaseCustomerManager;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager{

	@Override
	public void Save(Customer customer) {
		System.out.println("Nero m��terisi eklendi ; "+ customer.getName());
		
	}

	
		
	}




