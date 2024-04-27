package es.aplicaciones.reddit.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@ToString
@Document(collection = "comunidades")
public class Comunidad {
    @Id
    private String id;
    private String nombre;
    private int participantes;
    private List<String> posts; // lista de los id de cada post
}
