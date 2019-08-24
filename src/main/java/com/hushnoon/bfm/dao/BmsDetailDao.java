package com.hushnoon.bfm.dao;

import com.hushnoon.bfm.model.BmsDetail;

public interface BmsDetailDao {
	boolean addBMSDetail(BmsDetail bmsDetail);
	BmsDetail getBmsDetailById(int id);
}
