package com.travel.platform.repository;

import org.springframework.stereotype.Repository;

import com.travel.platform.document.HashTagDocument;

/**
 * @author Thilina Kalum
 * @since 2/22/2021
 */
@Repository
public interface HashTagRepositoryApi extends BaseRepositoryApi<HashTagDocument> {

  boolean existsByHashTag(String tag);
}
