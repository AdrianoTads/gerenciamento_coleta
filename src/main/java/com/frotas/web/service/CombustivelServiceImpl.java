package com.frotas.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.frotas.web.domain.Combustivel;
import com.frotas.web.repository.CombustivelDao;

@Service @Transactional(readOnly = false)
public class CombustivelServiceImpl implements CombustivelService {
	
	@Autowired
	private CombustivelDao dao;

	@Override
	public void save(Combustivel combustivel) {
		dao.save(combustivel);// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Combustivel combustivel) {
		dao.update(combustivel);// TODO Auto-generated method stub		
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);// TODO Auto-generated method stub
		
	}

	@Override @Transactional(readOnly = true)
	public Combustivel findById(Long id) {
		return dao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Combustivel> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
