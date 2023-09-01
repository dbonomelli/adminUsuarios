package cl.usm.hdd.adminusuario.controllers;

import cl.usm.hdd.adminusuario.entities.Usuario;
import cl.usm.hdd.adminusuario.services.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import javax.xml.ws.Response;
import java.util.List;

@RestController
public class UsuariosController {
    @Autowired
    private UsuariosService usuariosService;
    @GetMapping("/usuarios")
    public ResponseEntity<List<Usuario>> getAll(){
        try{
            List<Usuario> lista = usuariosService.getAll();
            return ResponseEntity.ok(lista);
        }catch (Exception ex){
            return ResponseEntity.internalServerError().body(null);
        }
    }
    @PostMapping("/usuarios")
    public ResponseEntity<Usuario> create(@RequestBody Usuario usuario){
        try{
            Usuario usuarionuevo = usuariosService.create(usuario);
            return ResponseEntity.ok(usuarionuevo);
        }catch (Exception ex){
            return ResponseEntity.internalServerError().body(null);
        }
    }
    @GetMapping("/usuarios/{email}")
    public ResponseEntity<Usuario> find(@PathVariable String email){
        try{
            Usuario usuario = usuariosService.find(email);
            return ResponseEntity.ok(usuario);
        }catch (Exception ex){
            return ResponseEntity.internalServerError().body(null);
        }
    }


}
