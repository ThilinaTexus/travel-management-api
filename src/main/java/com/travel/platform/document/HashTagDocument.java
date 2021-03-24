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
@Document(collection = "HASH_TAG")
public class HashTagDocument extends Audit<String> {

  private String hashTag;
  private HashTagType type;
}
