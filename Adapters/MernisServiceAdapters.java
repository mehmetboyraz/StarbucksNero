package Adapters;

import java.rmi.RemoteException;

import Abstract.ICustomerCheckSevice;

import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapters implements ICustomerCheckSevice{

    public boolean CheckIfRealPerson(Customer customer) throws RemoteException{
    	
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		return client.TCKimlikNoDogrula(customer.getNationalityId(), customer.getName(),
				customer.getLastname(), customer.getYear()) ;
    	
    };
	}


