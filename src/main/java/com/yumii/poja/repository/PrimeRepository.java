package com.yumii.poja.repository;

import com.yumii.poja.repository.model.Prime;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PrimeRepository extends JpaRepository<Prime, String> {
  @Query("select p from Prime p order by p.creationDatetime desc")
  List<Prime> findLast10thPrimes(Pageable pageable);
}
