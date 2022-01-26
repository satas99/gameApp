package gameApp.core.mernis.concretes;

import java.rmi.RemoteException;
import java.time.LocalDate;
import java.util.Locale;

import gameApp.core.mernis.abstracts.MernisService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisManager implements MernisService {

	@Override
	  public boolean identityNumberVerification(String identityNumber, String firstName, String lastName, LocalDate dateOfBirth) {

        KPSPublicSoapProxy kp = new KPSPublicSoapProxy();

        boolean result = true;
        try {
            result = kp.TCKimlikNoDogrula(Long.parseLong(identityNumber), firstName.toUpperCase(new Locale("tr")),
                    lastName.toUpperCase(new Locale("tr")), dateOfBirth.getYear());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }

        if(result) {
            return true;
        }else {
            return true;
        }
    }

}
