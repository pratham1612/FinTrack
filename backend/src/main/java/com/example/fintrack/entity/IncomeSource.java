package com.example.fintrack.entity;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "IncomeSource")
@Entity
public class IncomeSource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String source_name;
    @Column(nullable = false)
    private Double amount;
    @Column(nullable = false)
    private String frequency;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
