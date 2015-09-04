package br.com.barbero.gae.service;

import java.util.List;

import br.com.barbero.gae.bean.Beneficiario;
import br.com.barbero.gae.dao.beneficiario.impl.BeneficiarioDaoImpl;

public class BeneficiarioServiceImpl implements BeneficiarioService {
	
	private BeneficiarioDaoImpl beneficiarioDaoImpl;

	@Override
	public void salvar(Beneficiario entity) {
		beneficiarioDaoImpl.save(entity);
	}

	@Override
	public void salvarTodos(List<Beneficiario> entity) {
		beneficiarioDaoImpl.saveAll(entity);
	}

	@Override
	public List<Beneficiario> list() {
		List<Beneficiario> list = beneficiarioDaoImpl.list();
		return list;
	}
	
	public void setBeneficiarioDaoImpl(BeneficiarioDaoImpl beneficiarioDaoImpl) {
		this.beneficiarioDaoImpl = beneficiarioDaoImpl;
	}

}
