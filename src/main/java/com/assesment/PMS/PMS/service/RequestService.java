package com.assesment.PMS.PMS.service;

import java.util.List;
import java.util.Optional;

import com.assesment.PMS.PMS.model.Request;

public interface RequestService {

	void saveRequest(Request request);

	public List<Request> getAll();

	public Optional<Request> updateReq(Integer id, Request request);

	Request getByid(Integer id);

}
