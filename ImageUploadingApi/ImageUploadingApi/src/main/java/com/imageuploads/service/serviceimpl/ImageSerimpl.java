package com.imageuploads.service.serviceimpl;

import com.imageuploads.dto.ImageDto;
import com.imageuploads.entity.Image;
import com.imageuploads.repo.ImageRepo;
import com.imageuploads.service.ImageServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImageSerimpl implements ImageServ {
    @Autowired
    ImageRepo imageRepo;

    @Override
    public Image save(ImageDto imageDto) {
       Image image =  new Image();
       image.setId(imageDto.getId());
       image.setName(imageDto.getName());
       image.setDescription(imageDto.getDescription());
       image.setType(imageDto.getType());
       image.setImage(imageDto.getImage());
       return  imageRepo.save(image);
    }

    @Override
    public List<Image> getalldata() {
        List<Image> data = imageRepo.findAll();
        return data;
    }

    @Override
    public void deleteById(long id) {
      imageRepo.deleteById(id);
    }

    @Override
    public Image getById(long id) {
        Image image = imageRepo.findById(id).get();
        return image;
    }





}
