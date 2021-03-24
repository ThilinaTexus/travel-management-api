package com.travel.platform.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.travel.platform.document.StateDocument;

/**
 * @author Thilina Kalum
 * @since 2/22/2021
 */
@Repository
public interface StateRepositoryApi extends BaseRepositoryApi<StateDocument> {

  Optional<StateDocument> findByName(String stateName);
}
