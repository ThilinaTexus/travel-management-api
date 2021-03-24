package com.travel.platform.document;

import lombok.Builder;
import lombok.Data;

/**
 * @author Thilina Kalum
 * @since 3/15/2021
 */
@Builder
@Data
public class Coordinates {

  private Double longitude;
  private Double latitude;
}
