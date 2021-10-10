package Abstract;

import java.rmi.RemoteException;

import Entities.Customer;

public interface ICustomerService {
	
	void Save(Customer customer) throws RemoteException, Throwable;

}
