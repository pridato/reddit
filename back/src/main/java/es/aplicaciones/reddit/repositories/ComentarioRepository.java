package es.aplicaciones.reddit.repositories;

import es.aplicaciones.reddit.model.Comentario;
import es.aplicaciones.reddit.model.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ComentarioRepository extends MongoRepository<Comentario, String> {
}
