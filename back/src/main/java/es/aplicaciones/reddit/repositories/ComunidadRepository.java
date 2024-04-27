package es.aplicaciones.reddit.repositories;

import es.aplicaciones.reddit.model.Comunidad;
import es.aplicaciones.reddit.model.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ComunidadRepository extends MongoRepository<Comunidad, String> {
}
