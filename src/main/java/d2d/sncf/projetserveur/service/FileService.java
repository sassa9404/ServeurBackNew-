package d2d.sncf.projetserveur.service;

import java.io.File;
import java.time.LocalDateTime;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import d2d.sncf.projetserveur.entity.FileEntity;
import d2d.sncf.projetserveur.repository.FileRepository;
import d2d.sncf.projetserveur.repository.UserRepository;

@Service
public class FileService {

    
 
//    private final FileRepository fileRepository;

//on injecte le repository dans le service 
    // public FileService(FileRepository fileRepository){
    //     this.fileRepository = fileRepository;
    // }
    //      private final UserRepository userRepository;

    //   public void UserService(UserRepository userRepository){
    //     this.userRepository = userRepository;

    // }


    public void uploadFile(MultipartFile file, LocalDateTime expirationDate, String recipientEmail) {
        // Logique pour sauvegarder le fichier sur le serveur (voir ci-dessous)
        String fileName = file.getOriginalFilename();
        String filePath = "chemin/vers/le/dossier/de/stockage/" + fileName;
    }
        // Récupérer l'utilisateur par son adresse e-mail
        // User user = userRepository.findByEmail(recipientEmail)
        //         .orElseThrow(() -> new ResourceNotFoundException("User not found with email " + recipientEmail));

        // Enregistrer les informations du fichier dans la base de données
    //     File newFile = new File(filePath);
    //     newFile.setFileName(fileName);
    //     newFile.setFilePath(filePath);
    //     newFile.setExpirationDate(expirationDate);
    //     newFile.setUser(user);

    //     fileRepository.save(newFile);
    // }

    // public File getFileById(Long fileId) {
    //     return fileRepository.findById(fileId)
    //             .orElseThrow(() -> new ResourceNotFoundException("File not found with id " + fileId));
    // }

    // public void deleteFile(Long fileId) {
    //     fileRepository.deleteById(fileId);
    // }
}

