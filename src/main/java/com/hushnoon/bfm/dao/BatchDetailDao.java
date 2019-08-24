package com.hushnoon.bfm.dao;

import java.util.Set;

import com.hushnoon.bfm.model.BatchDetail;

public interface BatchDetailDao {
	
	boolean addBatchDetail(BatchDetail batchDetail);
	Set<BatchDetail> getAll();
	

}
