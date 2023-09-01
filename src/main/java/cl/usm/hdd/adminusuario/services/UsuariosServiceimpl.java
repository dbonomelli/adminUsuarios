package cl.usm.hdd.adminusuario.services;

import cl.usm.hdd.adminusuario.entities.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UsuariosServiceimpl implements UsuariosService{
    private static List<Usuario> usuarios = new ArrayList<>();
    @Override
    public List<Usuario> getAll() {
        return usuarios;
    }

    @Override
    public Usuario create(Usuario usuario) {
        usuarios.add(usuario);
        return usuario;
    }

    @Override
    public Usuario find(String email) {
        return usuarios.stream().filter((aux)->aux.getEmail().equalsIgnoreCase(email)).findFirst().orElse(null);
    }
}
