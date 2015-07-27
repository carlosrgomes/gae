package br.com.barbero.gae.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.barbero.gae.beans.Pessoa;

@RestController
@RequestMapping("pessoa")
public class PessoaController {
	
	@RequestMapping(value="/listar", method=RequestMethod.GET)
    public List<Pessoa> listarPessoa() {
    	ArrayList<Pessoa> listarPessoa =  new ArrayList<>();
    	
    	for (int i = 0; i < 10; i++) {
			Pessoa pessoa = new Pessoa();
			pessoa.setEmail("email" + i);
			pessoa.setNome("nome"+i);
			listarPessoa.add(pessoa);
		}
    	
    	return listarPessoa;
    	
    }

	
}
