package com.example.fintrack.entity;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Goal")
public class Goal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String goal_name;
    @Column(nullable = false)
    private Double target_amount;
    @Column(nullable = false)
    private Double current_savings;
    @Column(nullable = false)
    private Double monthly_contribution;
    @Column(nullable = false)
    private Integer term_years;
    @Column(nullable = false)
    private Boolean is_want;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
