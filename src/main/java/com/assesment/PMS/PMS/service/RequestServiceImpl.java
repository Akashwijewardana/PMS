package com.assesment.PMS.PMS.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assesment.PMS.PMS.model.Pharmcist;
import com.assesment.PMS.PMS.model.Rack;
import com.assesment.PMS.PMS.model.Request;
import com.assesment.PMS.PMS.repository.RequestRepository;
@Service
public class RequestServiceImpl implements RequestService{
	
	
	@Autowired
	private RequestRepository repository;

	@Override
	public void saveRequest(Request request) {
		// TODO Auto-generated method stub
		
		repository.save(request);
	}

	@Override
	public List<Request> getAll() {
		// TODO Auto-generated method stub
		List<Request> rackList = new ArrayList<Request>();
		repository.findAll().forEach(rackList::add);
		return rackList;
	}
	
	
	@Transactional
	@Override
	public Optional<Request> updateReq(Integer id, Request request) {
		// TODO Auto-generated method stub
		return repository.findById(id).map(e -> {
			e.setPhatmacist_id(request.getPhatmacist_id());
			e.setReq_status(request.getReq_status());
			e.setResponse(request.getResponse_date());
			e.setResponse_date(request.getResponse_date());
			return e;
	});
	
	
	}

	@Override
	public Request getByid(Integer id) {
		Optional<Request> pamcist = Optional.ofNullable(repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid ID")));
		Request pharmcist = pamcist.get();
		return pharmcist;// TODO Auto-generated method stub
		
	}


	}
