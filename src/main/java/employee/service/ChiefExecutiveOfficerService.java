package employee.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import employee.bean.ChiefExecutiveOfficerBean;
import employee.entity.ChiefExecutiveOfficer;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/")
public class ChiefExecutiveOfficerService {

	@EJB
	ChiefExecutiveOfficerBean chiefExecutiveOfficerBean;
	
	@Path("searchChiefExecutiveOfficers")
	@POST
	public List<ChiefExecutiveOfficer> searchChiefExecutiveOfficers(ChiefExecutiveOfficer chiefExecutiveOfficerSearch) throws Exception {
		
		return chiefExecutiveOfficerBean.searchChiefExecutiveOfficers(chiefExecutiveOfficerSearch);
	}
	
	@Path("getChiefExecutiveOfficerCount")
	@POST
	public ChiefExecutiveOfficer getChiefExecutiveOfficerCount(ChiefExecutiveOfficer chiefExecutiveOfficerSearch) throws Exception {
		
		return chiefExecutiveOfficerBean.getChiefExecutiveOfficerCount(chiefExecutiveOfficerSearch);
	}
	
	@Path("getChiefExecutiveOfficer")
	@POST
	public ChiefExecutiveOfficer getChiefExecutiveOfficer(ChiefExecutiveOfficer chiefExecutiveOfficer) throws Exception {
		
		return chiefExecutiveOfficerBean.getChiefExecutiveOfficer(chiefExecutiveOfficer);
	}
	
	@Path("saveChiefExecutiveOfficer")
	@POST
	public ChiefExecutiveOfficer saveChiefExecutiveOfficer(ChiefExecutiveOfficer chiefExecutiveOfficer) throws Exception {
		
		return chiefExecutiveOfficerBean.saveChiefExecutiveOfficer(chiefExecutiveOfficer);
	}
	
	@Path("updateChiefExecutiveOfficerActive")
	@POST
	public ChiefExecutiveOfficer updateChiefExecutiveOfficerActive(ChiefExecutiveOfficer chiefExecutiveOfficer) throws Exception {
		
		return chiefExecutiveOfficerBean.updateChiefExecutiveOfficerActive(chiefExecutiveOfficer);
	}
}