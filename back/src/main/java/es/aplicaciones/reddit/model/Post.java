package es.aplicaciones.reddit.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
@Document(collection = "posts")
public class Post {
    @Id
    private String id;
    private String nombre;
    private String cuerpo;
    private List<String> comentarios;
    private String imagen;
    private int likes;
    private int dislikes;
    private Date fecha_publicacion;
    private String id_comunidad; // a la comunidad k pertenece
    private String id_usuario; // quien lo sube
}
