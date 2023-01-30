package com.imageuploads.service;

import com.imageuploads.dto.ImageDto;
import com.imageuploads.entity.Image;

import java.util.List;
import java.util.Optional;

public interface ImageServ {
  Image save(ImageDto imageDto);

  List<Image> getalldata();


  void deleteById(long id);

  Image getById(long id);



}
