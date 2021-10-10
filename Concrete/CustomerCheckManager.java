package Concrete;

import Abstract.ICustomerCheckSevice;
import Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckSevice {
	public boolean CheckIfRealPerson(Customer customer) {
		return true;
		}

}
