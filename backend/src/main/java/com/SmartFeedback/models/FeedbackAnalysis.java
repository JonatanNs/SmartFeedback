package com.SmartFeedback.models;

import com.SmartFeedback.models.enums.Sentiment;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

@Entity
@Table(name = "feedbackAnalysis")
@Data
public class FeedbackAnalysis {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private Feedback feedback_id;

    @Enumerated(EnumType.STRING) // Les enums de type string
    private Sentiment sentiment;

    @Column(nullable = false)
    private String summary; //résumé

    @CreatedDate
    private String createdAt;
}
