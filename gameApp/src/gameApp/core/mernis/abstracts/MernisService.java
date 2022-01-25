package gameApp.core.mernis.abstracts;

import java.time.LocalDate;

public interface MernisService {
    public boolean identityNumberVerification(String identityNumber, String firstName, String lastName, LocalDate dateOfBirth);
}
