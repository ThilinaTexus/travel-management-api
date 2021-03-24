package com.travel.platform.document;

import java.time.Instant;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Transient;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;

import com.travel.platform.model.Audit;

import lombok.Data;
import lombok.ToString;

/**
 * @author Thilina Kalum
 * @since 2/22/2021
 */
@Data
@ToString(callSuper = true)
@Document(collection = "CITY")
public class CityDocument extends Audit<String> {

  private String name;
  private HashTagDocument hashTagDocument;
  private String description;
//
//  @Id
//  public String getId() {
//    return super.getId();
//  }
//
//  @CreatedDate
//  public Instant getCreatedAt() {
//    return super.getCreatedAt();
//  }
//
//  @CreatedBy
//  public String getCreatedBy() {
//    return (String)super.getCreatedBy();
//  }
//
//  @LastModifiedDate
//  public Instant getModifiedAt() {
//    return super.getModifiedAt();
//  }
//
//  @LastModifiedBy
//  public String getModifiedBy() {
//    return (String)super.getModifiedBy();
//  }
//
//  @Version
//  public long getVersion() {
//    return super.getVersion();
//  }
//
//  @Transient
//  public long getModelVersion() {
//    return super.getVersion();
//  }
//
//  public CityDocument() {
//  }
//
//  public String toString() {
//    return "Brand(super=" + super.toString() + ")";
//  }
//
//  public boolean equals(final Object o) {
//    if (o == this) {
//      return true;
//    } else if (!(o instanceof CityDocument)) {
//      return false;
//    } else {
//      CityDocument other = (CityDocument)o;
//      if (!other.canEqual(this)) {
//        return false;
//      } else {
//        return super.equals(o);
//      }
//    }
//  }
//
//  protected boolean canEqual(final Object other) {
//    return other instanceof CityDocument;
//  }
//
//  public int hashCode() {
//    int result = super.hashCode();
//    return result;
//  }
}
