package am.bgd.updatedjdbctask.companypassengerlist;

import am.bgd.updatedjdbctask.service.AddressService;
import am.bgd.updatedjdbctask.service.serviceimpl.AddressServiceImpl;

/**
 * Created by User on 20.09.2020.
 */
public class AddressController {
    private AddressService addressService;
    public AddressController(){
        this.addressService = new AddressServiceImpl();
    }

}
