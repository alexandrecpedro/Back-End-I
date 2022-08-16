package DentistClinic.service;

import DentistClinic.dao.IDao;
import DentistClinic.model.Address;

public class AddressService {
    /** Attribute **/
    private IDao<Address> addressIDao;

    /** Constructor **/
    public AddressService(IDao<Address> addressIDao) {
        this.addressIDao = addressIDao;
    }

    /** Method **/
    public Address save(Address address) {
        return addressIDao.save(address);
    }
}
