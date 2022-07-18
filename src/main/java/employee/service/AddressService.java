package employee.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import employee.bean.AddressBean;
import employee.entity.Address;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/")
public class AddressService {

	@EJB
	AddressBean addressBean;
	
	@Path("searchAddresss")
	@POST
	public List<Address> searchAddresss(Address addressSearch) throws Exception {
		
		return addressBean.searchAddresss(addressSearch);
	}
	
	@Path("getAddressCount")
	@POST
	public Address getAddressCount(Address addressSearch) throws Exception {
		
		return addressBean.getAddressCount(addressSearch);
	}
	
	@Path("getAddress")
	@POST
	public Address getAddress(Address address) throws Exception {
		
		return addressBean.getAddress(address);
	}
	
	@Path("saveAddress")
	@POST
	public Address saveAddress(Address address) throws Exception {
		
		return addressBean.saveAddress(address);
	}
	
	@Path("updateAddressActive")
	@POST
	public Address updateAddressActive(Address address) throws Exception {
		
		return addressBean.updateAddressActive(address);
	}
}