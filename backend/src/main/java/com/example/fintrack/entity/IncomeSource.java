
package com.example.fintrack.entity;

import javax.persistence.*;

@Entity
@Table(name = "IncomeSource")
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

    // Getters and Setters
}
