package br.com.devdata.workando.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.devdata.workando.model.Vaga;
import br.com.devdata.workando.repository.VagaRepository;

/**
 * Controlador da entidade Vaga
 * @author fabio.oliveira
 *
 */
@RestController
@RequestMapping("/vaga")
public class VagaController {

	private VagaRepository vagaRepository;

	@Autowired
	public VagaController(VagaRepository vagaRepository) {
		this.vagaRepository = vagaRepository;
	}

	/**
	 * Recupera todas as vagas
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public Iterable<Vaga> findAll() {
		return vagaRepository.findAll();
	}

	/**
	 * Salva/cria vaga
	 * @param vaga
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST)
	public Vaga create(@RequestBody Vaga vaga) {
		return (Vaga) vagaRepository.save(vaga);
	}
}
