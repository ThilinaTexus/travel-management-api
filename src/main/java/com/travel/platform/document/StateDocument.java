package com.travel.platform.document;

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
@Document(collection = "STATE")
public class StateDocument extends Audit<String> {

  private String name;
  private HashTagDocument hashTagDocument;
  private String description;
}
