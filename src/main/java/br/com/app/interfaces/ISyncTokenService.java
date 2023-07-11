package br.com.app.interfaces;

import br.com.app.named.Credentials;
import br.com.app.named.User;
import br.com.app.named.UserToken;
import com.arjuna.ats.jta.exceptions.NotImplementedException;

public interface ISyncTokenService {

    User authenticate(Credentials credentials);

    UserToken requestToken(User user);

    default UserToken issueToken(Credentials credentials) throws NotImplementedException {
        throw new NotImplementedException(); //TODO: Implement this
    }

}