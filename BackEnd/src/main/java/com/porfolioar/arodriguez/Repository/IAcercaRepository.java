package com.porfolioar.arodriguez.Repository;


import com.porfolioar.arodriguez.Entity.Acerca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAcercaRepository extends JpaRepository<Acerca, Long> {
}
