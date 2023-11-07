package d2d.sncf.projetserveur.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import d2d.sncf.projetserveur.entity.UserEntity;


@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    // Méthodes pour récupérer et gérer les utilisateurs
}
