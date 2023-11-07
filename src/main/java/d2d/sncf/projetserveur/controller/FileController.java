package d2d.sncf.projetserveur.controller;


import java.io.File;
import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import d2d.sncf.projetserveur.entity.FileEntity;
import d2d.sncf.projetserveur.service.FileService;

@RestController
@RequestMapping("/api/files")
public class FileController {

    // injecter le service dans le controlleur 
    private final FileService fileService;

    public FileController(FileService fileService){
        this.fileService = fileService;

    }
// ici on va mettre en place une methode POST pour pouvoir upload un fichier 
    // @PostMapping("/")
    // public ResponseEntity<FileEntity> uploadFile(@RequestParam("file") MultipartFile file,
    //                                          @RequestParam("expiration") LocalDateTime expiration, // a revoir doc Spring 
    //                                          @RequestParam(value = "email") String email) {
        
       

    //     return ResponseEntity.ok(fileService.uploadFile(file, expiration, email) );
    // }


@PostMapping("/upload")
    public void uploadFile(@RequestParam("file") MultipartFile file,
                           @RequestParam("expirationDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime expirationDate,
                           @RequestParam("recipientEmail") String recipientEmail) {
        fileService.uploadFile(file, expirationDate, recipientEmail);
    }

    // @GetMapping("/{fileId}")
    // public File getFileById(@PathVariable Long fileId) {
    //     return fileService.getFileById(fileId);
    // }

    // @DeleteMapping("/{fileId}")
    // public void deleteFile(@PathVariable Long fileId) {
    //     fileService.deleteFile(fileId);
    // }



    // @GetMapping("/{id}")
    // public ResponseEntity<byte[]> downloadFile(@PathVariable Long id) {
    //     return null;
        // Appel de la méthode du service pour récupérer le fichier et le renvoyer en
        // réponse
        // ...
    // }


}
    

