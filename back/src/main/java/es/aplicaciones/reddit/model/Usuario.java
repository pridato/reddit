package es.aplicaciones.reddit.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@Document(collection = "usuarios")
public class Usuario {
    @Id
    private String id;
    private String email;
    private String password;
    private String nombre;
}
