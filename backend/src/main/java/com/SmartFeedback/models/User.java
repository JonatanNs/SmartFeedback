package com.SmartFeedback.models;

import com.SmartFeedback.models.enums.Provider;
import com.SmartFeedback.models.enums.Role;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "user")
@Data
// activer les "auditeurs d'événements" JPA comme CreatedDate et LastModifiedDate
@EntityListeners(AuditingEntityListener.class)

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(unique = true, nullable = false)
    private String email;

    private String password;

    @Enumerated(EnumType.STRING) // Les enums de type string
    private Provider provider;

    @Enumerated(EnumType.STRING)
    private Role role;

    @CreatedDate //Remplit createdAt automatiquement à l’insertion
    @Column(updatable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate //Met à jour updatedAt automatiquement à chaque save()
    private LocalDateTime updatedAt;
}

