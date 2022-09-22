package com.portfolio.vb.Repository;

import com.portfolio.vb.Entity.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface REducacion extends JpaRepository<Educacion, Integer>{
    
    public Optional<Educacion> findByNombreE(String nombreE);
    public boolean existsByNombreE(String nombreE);
    
    
}
