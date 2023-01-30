package com.imageuploads.controller;

import com.imageuploads.dto.ImageDto;
import com.imageuploads.entity.Image;
import com.imageuploads.repo.ImageRepo;
import com.imageuploads.service.ImageServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/imageapi")
public class ImageCont {

    @Autowired
    ImageServ imageServ;
    @Autowired
    ImageRepo imageRepo;
    @PostMapping("/upload")
    public ResponseEntity<Image>uploadimage (@RequestBody ImageDto imageDto){
      Image image = imageServ.save(imageDto);
return ResponseEntity.status(HttpStatus.OK).body( image);

    }

    @GetMapping("/getdata")
    public ResponseEntity<List<Image>> getall(){
        List<Image> listofdata = imageServ.getalldata();
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(listofdata);
    }


    @PostMapping("/delete/{id}")
    public void  deleteById(@PathVariable("id") Long id){
        imageServ.deleteById(id);
    }

    @GetMapping("/getbyid/{id}")
    public ResponseEntity<Image> getById(@PathVariable("id")Long id){
       Image image = imageServ.getById(id);
       return  ResponseEntity.status(HttpStatus.OK).body(image);
    }

    @PostMapping("/updatedata/{id}")
    public ResponseEntity<Image> updateDataById( @PathVariable("id") long id, @RequestBody ImageDto imageDto){
        Image images =  imageRepo.findById(id).get();
        images.setName(imageDto.getName());
        images.setDescription(imageDto.getDescription());
        images.setImage(imageDto.getImage());
        images.setType(imageDto.getType());
        Image updatedata = imageRepo.save(images);
        return ResponseEntity.status(HttpStatus.OK).body(updatedata);
    }

  //  @PostMapping("/update/{id}")
//
//    public Image updateById(@RequestBody ImageDto imageDto,@PathVariable("id") Long id){
//        Optional<Image> image = imageServ.getBYId(id);
//
//        return
//    }



}
