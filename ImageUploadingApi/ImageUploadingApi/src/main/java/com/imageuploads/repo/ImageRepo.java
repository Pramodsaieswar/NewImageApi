package com.imageuploads.repo;

import com.imageuploads.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepo  extends JpaRepository<Image,Long> {
}
