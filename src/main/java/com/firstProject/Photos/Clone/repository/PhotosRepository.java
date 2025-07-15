package com.firstProject.Photos.Clone.repository;

import com.firstProject.Photos.Clone.Model.Photo;
import org.springframework.data.repository.CrudRepository;

public interface PhotosRepository extends CrudRepository<Photo, Integer> {

}
