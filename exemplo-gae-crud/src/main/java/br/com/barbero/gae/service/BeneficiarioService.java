package br.com.barbero.gae.service;

import java.util.List;

import br.com.barbero.gae.bean.Beneficiario;

public interface BeneficiarioService {
	
	public void salvar(Beneficiario entity);
	public void salvarTodos(List<Beneficiario> entity);
	public List<Beneficiario> list();

}
