package com.travel.platform.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.travel.platform.document.CityDocument;

/**
 * @author Thilina Kalum
 * @since 2/22/2021
 */
@Repository
public interface CityRepositoryApi extends BaseRepositoryApi<CityDocument> {

  Optional<CityDocument> findByName(String cityName);
}
