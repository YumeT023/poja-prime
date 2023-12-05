package com.yumii.poja.repository;

import com.yumii.poja.repository.model.Prime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrimeRepository extends JpaRepository<Prime, String> {}
