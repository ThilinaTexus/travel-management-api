package com.travel.platform.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Repository;

import com.travel.platform.document.AttractionsDocument;

/**
 * @author Thilina Kalum
 * @since 2/22/2021
 */
@Repository
public interface AttractionRepositoryApi extends BaseRepositoryApi<AttractionsDocument> {

  boolean findByXidExists(String xid);

  List<AttractionsDocument> findByBoundingBoxId(ObjectId boundingBoxId);
}
