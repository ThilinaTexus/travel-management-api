package com.travel.platform.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.travel.platform.document.CountryDocument;

/**
 * @author Thilina Kalum
 * @since 2/22/2021
 */
@Repository
public interface CountryRepositoryApi extends BaseRepositoryApi<CountryDocument> {

  Optional<CountryDocument> findByName(String countryName);
}
