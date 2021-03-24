package com.travel.platform.model;

import org.bson.types.ObjectId;

import lombok.Data;

/**
 * @author Thilina Kalum
 * @since 2/22/2021
 */
@Data
public class HashTag {

  private ObjectId id;
  private ObjectId hashTag;
}
