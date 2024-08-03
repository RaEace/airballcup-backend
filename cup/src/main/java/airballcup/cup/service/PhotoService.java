package airballcup.cup.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import airballcup.cup.entity.PhotoEntity;
import airballcup.cup.repository.PhotoRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class PhotoService {

    @Autowired
    private PhotoRepository photoRepository;

    public List<PhotoEntity> getAllPhotos() {
        return photoRepository.findAll();
    }

    public PhotoEntity getPhotoById(Long id) {
        return photoRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("PhotoEntity not found"));
    }

    public PhotoEntity savePhoto(PhotoEntity photo) {
        return photoRepository.save(photo);
    }

    public void deletePhoto(Long id) {
        photoRepository.deleteById(id);
    }
}
