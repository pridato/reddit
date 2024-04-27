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
@Document(collection = "comentarios")
public class Comentario {
    @Id
    private String id;
    private String contenido;
    private Date fecha;
    private String usuario_id;
    private List<String> respuestas;
    private List<String> comentarios_padres;
}
