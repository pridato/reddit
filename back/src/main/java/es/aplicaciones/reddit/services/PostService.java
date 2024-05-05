package es.aplicaciones.reddit.services;

import es.aplicaciones.reddit.model.Post;
import es.aplicaciones.reddit.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    /**
     * metodo devuelve todos los posts ordenados por fecha anterior
     * @return
     */
    public List<Post> getPosts() {
        return this.postRepository.findAll().stream()
                .sorted(Comparator.comparing(Post::getFecha_publicacion).reversed())
                .collect(Collectors.toList());

    }

    /**
     * metodo para dar like o dislike a un post
     * @param id
     * @return
     */
    public Post toggleLike(String id, Boolean like) {
        Post post = this.postRepository.findById(id).orElse(null);
        if (post == null) {
            return null;
        }
        // si like es false, se resta un like
        post.setLikes(like ? post.getLikes() + 1 : post.getLikes() - 1);
        return this.postRepository.save(post);
    }
}
