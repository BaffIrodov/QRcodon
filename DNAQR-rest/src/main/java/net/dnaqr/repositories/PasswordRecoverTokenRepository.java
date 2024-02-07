package net.dnaqr.repositories;

import net.dnaqr.entities.PasswordRecoverToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PasswordRecoverTokenRepository extends JpaRepository<PasswordRecoverToken, Long> {
    PasswordRecoverToken findPasswordRecoverTokenByEmail(String email);
    PasswordRecoverToken findPasswordRecoverTokenBySimpleConfirmationToken(String simpleToken);
}