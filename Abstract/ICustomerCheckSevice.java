package Abstract;

import java.rmi.RemoteException;

import Entities.Customer;

public interface ICustomerCheckSevice {
	boolean CheckIfRealPerson(Customer customer) throws RemoteException;

}
