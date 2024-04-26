package es.aplicaciones.reddit.services;

import es.aplicaciones.reddit.model.Usuario;
import es.aplicaciones.reddit.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    /**
     * Metodo para hacer el login del usuario
     * @param email
     * @param password
     * @return objeto usuario a front
     */
    public Usuario login(String email, String password) {
        System.out.println(this.usuarioRepository.findByEmailAndPassword(email, password));
        return this.usuarioRepository.findByEmailAndPassword(email, password);
    }
}
