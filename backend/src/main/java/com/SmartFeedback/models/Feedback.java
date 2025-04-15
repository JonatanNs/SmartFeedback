package com.SmartFeedback.models;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import java.time.LocalDateTime;

@Entity
@Table(name = "feedback")
@Data
@EntityListeners(AuditingEntityListener.class)
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @ManyToOne
    @JoinColumn(name = "product_feedback_id", nullable = false)
    private ProductFeedback productFeedback;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false, columnDefinition = "TEXT")
    @Lob
    private String content;

    private int star; // 1 à 5 étoiles

    @CreatedDate // Remplit createdAt automatiquement à l’insertion
    private LocalDateTime createdAt;
}
