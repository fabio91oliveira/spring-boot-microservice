package br.com.devdata.workando.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.devdata.workando.model.Usuario;
import br.com.devdata.workando.repository.UsuarioRepository;

/**
 * Controlador da entidade usuario
 * @author fabio.oliveira
 *
 */
@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	private UsuarioRepository usuarioRepository;

	@Autowired
	public UsuarioController(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}

	/**
	 * Recupera todos os usuarios
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public Iterable<Usuario> findAll() {
		return usuarioRepository.findAll();
	}

	/**
	 * Salva/cria usuarios
	 * @param usuario
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST)
	public Usuario create(@RequestBody Usuario usuario) {
		return (Usuario) usuarioRepository.save(usuario);
	}
}
