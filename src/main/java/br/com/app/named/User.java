package br.com.app.named;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Value;

@Data
@ApplicationScoped
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String userId;
}