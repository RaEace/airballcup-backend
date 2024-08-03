package airballcup.cup.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import airballcup.cup.dto.PhotoDTO;
import airballcup.cup.entity.PhotoEntity;
import airballcup.cup.service.PhotoService;

@RestController
@RequestMapping("/photo")
public class PhotoController {

    @Autowired
    private PhotoService photoService;

    @GetMapping
    public ResponseEntity<List<PhotoEntity>> getAllPhotos() {
        List<PhotoEntity> allPhotos = photoService.getAllPhotos();
        return ResponseEntity.ok(allPhotos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PhotoEntity> getPhoto(@PathVariable Long id) {
        PhotoEntity photo = photoService.getPhotoById(id);
        return ResponseEntity.ok(photo);
    }

    @PostMapping
    public ResponseEntity<PhotoEntity> createPhoto(@RequestBody PhotoDTO photoDTO) {
        PhotoEntity photo = new PhotoEntity();
        photo.setUrl(photoDTO.getUrl());
        photo.setDate(photoDTO.getDate());
        PhotoEntity savedPhoto = photoService.savePhoto(photo);
        return ResponseEntity.ok(savedPhoto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePhoto(@PathVariable Long id) {
        photoService.deletePhoto(id);
        return ResponseEntity.noContent().build();
    }
}
