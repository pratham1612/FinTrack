
package com.example.fintrack.entity;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private AccountType account_type;
    @Column(nullable = false)
    private Double balance;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    // Getters and Setters
    public enum AccountType {
        Income,
        Savings,
        Investments,
        Expenses
    }
}
