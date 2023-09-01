package cl.usm.hdd.adminusuario.services;

import cl.usm.hdd.adminusuario.entities.Usuario;

import java.util.List;

public interface UsuariosService {
    List<Usuario> getAll();
    Usuario create(Usuario usuario);
    Usuario find(String email);
}
