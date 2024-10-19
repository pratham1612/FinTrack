
package com.example.fintrack.repository;

import com.example.fintrack.entity.IncomeSource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncomeSourceRepository extends JpaRepository<IncomeSource, Long> {
}
