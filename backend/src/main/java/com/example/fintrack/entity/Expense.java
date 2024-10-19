package com.example.fintrack.entity;
import javax.persistence.*;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Expense")
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Double amount;
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date date;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private ExpenseType type;
    private String description;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    // Getters and Setters
    public enum ExpenseType {
        Needs,
        Wants,
        Savings
    }
}
