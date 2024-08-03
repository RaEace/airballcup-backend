package airballcup.cup.service.mapper;

import airballcup.cup.dto.PhotoDTO;
import airballcup.cup.entity.PhotoEntity;

public class PhotoMapper {

    public static PhotoEntity mapDTOToEntity(PhotoDTO photoDTO) {
        PhotoEntity photoEntity = new PhotoEntity();
        photoEntity.setUrl(photoDTO.getUrl());
        photoEntity.setDate(photoDTO.getDate());
        return photoEntity;
    }
}
