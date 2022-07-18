package employee.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import employee.bean.CertificateBean;
import employee.entity.Certificate;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/")
public class CertificateService {

	@EJB
	CertificateBean certificateBean;
	
	@Path("searchCertificates")
	@POST
	public List<Certificate> searchCertificates(Certificate certificateSearch) throws Exception {
		
		return certificateBean.searchCertificates(certificateSearch);
	}
	
	@Path("getCertificateCount")
	@POST
	public Certificate getCertificateCount(Certificate certificateSearch) throws Exception {
		
		return certificateBean.getCertificateCount(certificateSearch);
	}
	
	@Path("getCertificate")
	@POST
	public Certificate getCertificate(Certificate certificate) throws Exception {
		
		return certificateBean.getCertificate(certificate);
	}
	
	@Path("saveCertificate")
	@POST
	public Certificate saveCertificate(Certificate certificate) throws Exception {
		
		return certificateBean.saveCertificate(certificate);
	}
	
	@Path("updateCertificateActive")
	@POST
	public Certificate updateCertificateActive(Certificate certificate) throws Exception {
		
		return certificateBean.updateCertificateActive(certificate);
	}
}