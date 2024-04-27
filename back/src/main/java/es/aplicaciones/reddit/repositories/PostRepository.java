package es.aplicaciones.reddit.repositories;

import es.aplicaciones.reddit.model.Post;
import es.aplicaciones.reddit.model.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {
}
