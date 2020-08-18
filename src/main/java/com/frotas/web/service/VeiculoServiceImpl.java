package com.frotas.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.frotas.web.domain.Veiculo;
import com.frotas.web.repository.VeiculoDao;

@Service @Transactional(readOnly = false)
public class VeiculoServiceImpl implements VeiculoService {
	
	@Autowired
	private VeiculoDao  dao;

	@Override
	public void save(Veiculo veiculo) {
		dao.save(veiculo);// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Veiculo veiculo) {
		dao.update(veiculo);// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);// TODO Auto-generated method stub
		
	}

	@Override @Transactional(readOnly = true)
	public Veiculo findById(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Veiculo> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
