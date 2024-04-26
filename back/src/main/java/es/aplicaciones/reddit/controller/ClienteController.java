package es.aplicaciones.reddit.controller;

import es.aplicaciones.reddit.model.Usuario;
import es.aplicaciones.reddit.services.UsuarioService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import es.aplicaciones.reddit.repositories.UsuarioRepository;

@RestController
@RequestMapping("/Cliente")
@CrossOrigin(origins = "http://localhost:4321")
public class ClienteController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/login")
    public Usuario login(@RequestParam String email, @RequestParam String password) {

        return this.usuarioService.login(email, password);
    }


}
