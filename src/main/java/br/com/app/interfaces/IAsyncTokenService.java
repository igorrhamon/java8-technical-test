package br.com.app.interfaces;

import br.com.app.named.Credentials;
import br.com.app.named.User;
import br.com.app.named.UserToken;
import com.arjuna.ats.jta.exceptions.NotImplementedException;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

public interface IAsyncTokenService {

    CompletableFuture<User> authenticate(Credentials credentials);

    CompletableFuture<UserToken> requestToken(User user);

    default Future<UserToken> issueToken(Credentials credentials) throws NotImplementedException {
        throw new NotImplementedException(); //TODO: Implement this
    }

}