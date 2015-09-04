package br.com.barbero.gae.controller;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import br.com.barbero.gae.bean.Beneficiario;
import br.com.barbero.gae.service.BeneficiarioService;

public class BeneficiarioController extends  MultiActionController{
	
	private BeneficiarioService beneficiarioService;

	public ModelAndView init(HttpServletRequest request, HttpServletResponse response) throws Exception {

		ModelAndView model = new ModelAndView("cadastro");
		
		model.addObject("lista", beneficiarioService.list());
		
		return model;
	}
	
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) throws Exception {
			
		
			ModelAndView model = new ModelAndView("cadastro");
		
			String nome = request.getParameter("nome");
			String endereco = request.getParameter("endereco");
			
			List<Beneficiario> lista =  new ArrayList<Beneficiario>();
			
			for (int i = 0 ; i<10000 ; i++) {
				Beneficiario beneficiario =  new Beneficiario();
				beneficiario.setNome(nome+i);
				beneficiario.setEndereco(endereco);
				lista.add(beneficiario);
			}
			
			
			beneficiarioService.salvarTodos(lista);
			
			model.addObject("lista", beneficiarioService.list());
			
			return model;
		}
		
	public void setBeneficiarioService(BeneficiarioService beneficiarioService) {
		this.beneficiarioService = beneficiarioService;
	}
}