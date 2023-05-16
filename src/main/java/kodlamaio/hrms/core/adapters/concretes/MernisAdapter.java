package kodlamaio.hrms.core.adapters.concretes;

import kodlamaio.hrms.core.adapters.abstracts.MernisService;
import kodlamaio.hrms.entities.concretes.Applicant;
import org.springframework.stereotype.Service;
import tr.gov.nvi.tckimlik.WS.SHAKPSPublicSoap;

@Service
public class MernisAdapter implements MernisService {

    // TODO: Why does not work this?
    /*
     * private KPSPublicSoapProxy kpsPublicSoapProxy;
     *
     * @Autowired public MernisAdapter(KPSPublicSoapProxy kpsPublicSoapProxy) {
     * super(); this.kpsPublicSoapProxy = kpsPublicSoapProxy; }
     */

    @Override
    public boolean checkPerson(Applicant applicant) throws Exception {

        SHAKPSPublicSoap kpsPublicSoapProxy = new SHAKPSPublicSoap();

        return kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(applicant.getIdentityNumber()),
                applicant.getFirstName().toUpperCase(), applicant.getLastName().toUpperCase(),
                applicant.getBirthYear());
    }
}