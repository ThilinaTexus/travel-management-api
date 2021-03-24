package com.travel.platform.document;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.index.Indexed;
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
@Document(collection = "ATTRACTION")
public class AttractionsDocument extends Audit<String> {

  private String name;
  @Indexed(unique = true)
  private String xid;
  @Indexed
  private HashTagDocument hashTagDocument;
  private String description;
  private Coordinates coordinates;
  private ObjectId boundingBoxId;
  @Indexed
  private List<String> tags;
  @Indexed
  private List<String> interestTags;
  private GeoDetails geoDetails;
}
