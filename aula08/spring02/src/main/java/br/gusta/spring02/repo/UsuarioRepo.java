package br.gusta.spring02.repo;

import org.springframework.data.repository.CrudRepository;

import br.gusta.spring02.model.Usuario;
// CRUD = Create, Read, Update e Delete
public interface UsuarioRepo extends CrudRepository <Usuario, Integer>{
    public Usuario findByEmailAndSenha(String email, String senha);


    
}
