package com.travel.platform.document;

import java.math.BigDecimal;

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
@Document(collection = "INTEREST")
public class InterestDocument extends Audit<String> {

  private String name;
  private HashTagDocument hashTag;
  private HashTagDocument tags;
  private BigDecimal pricePerPerson;
  private String description;
  private String image;
}
