package es.aplicaciones.reddit.repositories;

import es.aplicaciones.reddit.model.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {
    public Usuario findByEmailAndPassword(String email, String password);
}
