package com.travel.platform.model;

import java.time.Instant;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

/**
 * @author Thilina Kalum
 * @since 2/22/2021
 */
@Data
public class Audit<U> {

  @Id
  private ObjectId id;
  @CreatedDate
  private Instant createdAt;
  @CreatedBy
  private U createdBy;
  @LastModifiedDate
  private Instant modifiedAt;
  @LastModifiedBy
  private U modifiedBy;
  @Version
  private long version;
  private Status status;

  public String getId() {
    return this.id != null ? this.id.toHexString() : null;
  }

  @JsonIgnore
  public ObjectId getIdAsObject() {
    return id;
  }

  public enum Status {
    ACTIVE, INACTIVE, DELETED
  }
}

