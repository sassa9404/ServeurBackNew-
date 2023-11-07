package d2d.sncf.projetserveur.repository;
import java.io.File;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import d2d.sncf.projetserveur.entity.FileEntity;
import d2d.sncf.projetserveur.entity.UserEntity;


@Repository
public interface FileRepository extends JpaRepository<FileEntity, Long> {
    List<File> findByExpirationDateBeforeAndUser(LocalDateTime currentDate, UserEntity user);
    // Méthodes pour récupérer et gérer les fichiers
}
