package employee.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import employee.bean.CityBean;
import employee.entity.City;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/")
public class CityService {

	@EJB
	CityBean cityBean;
	
	@Path("searchCitys")
	@POST
	public List<City> searchCitys(City citySearch) throws Exception {
		
		return cityBean.searchCitys(citySearch);
	}
	
	@Path("getCityCount")
	@POST
	public City getCityCount(City citySearch) throws Exception {
		
		return cityBean.getCityCount(citySearch);
	}
	
	@Path("getCity")
	@POST
	public City getCity(City city) throws Exception {
		
		return cityBean.getCity(city);
	}
	
	@Path("saveCity")
	@POST
	public City saveCity(City city) throws Exception {
		
		return cityBean.saveCity(city);
	}
	
	@Path("updateCityActive")
	@POST
	public City updateCityActive(City city) throws Exception {
		
		return cityBean.updateCityActive(city);
	}
}