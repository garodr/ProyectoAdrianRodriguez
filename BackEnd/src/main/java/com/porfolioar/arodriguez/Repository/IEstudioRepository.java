package com.porfolioar.arodriguez.Repository;


import com.porfolioar.arodriguez.Entity.Estudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEstudioRepository extends JpaRepository<Estudio, Long> {
}
