package ma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.classes.Compte;
@Repository
public interface CompteRepository extends JpaRepository<Compte, Long> {


}
