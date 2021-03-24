package com.travel.platform.repository;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * @author Thilina Kalum
 * @since 2/22/2021
 */
@NoRepositoryBean
public interface BaseRepositoryApi<T> extends MongoRepository<T, ObjectId> {

  @Query("{'id': ?0}")
  Optional<T> findById(ObjectId id);

  @Query("{'id' : {'$in' : ?0}}")
  List<T> byIds(List<ObjectId> ids);
}
