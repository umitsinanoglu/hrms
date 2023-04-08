package kodlamaio.hrms.core.adapters.concretes;

import kodlamaio.hrms.core.adapters.abstracts.MernisService;
import kodlamaio.hrms.entities.concretes.Candidate;
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
    public boolean checkPerson(Candidate candidate) throws Exception {

        SHAKPSPublicSoap kpsPublicSoapProxy = new SHAKPSPublicSoap();

        return kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(candidate.getIdentityNumber()),
                candidate.getFirstName().toUpperCase(), candidate.getLastName().toUpperCase(),
                candidate.getBirthYear());
    }
}