package com.travel.platform.document;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * @author Thilina Kalum
 * @since 3/16/2021
 */
@Data
public class GeoDetails {

  private String country;
  @JsonProperty("country-code")
  private String countryCode;
  private String address;
  private String city;
  private Map<String, String> timezone;
  private String latitude;
  private String longitude;
  @JsonProperty("postal-code")
  private String postalCode;
  @JsonProperty("location-tags")
  private List<String> locationTags;
  @JsonProperty("location-type")
  private String locationType;
  private String state;
  @JsonProperty("currency-code")
  private String currencyCode;
  @JsonProperty("country-code3")
  private String countryCode3;
  @JsonProperty("address-components")
  private Map<String, String> addressComponents;
}
