package es.aplicaciones.reddit.services;

import es.aplicaciones.reddit.model.Comunidad;
import es.aplicaciones.reddit.repositories.ComunidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComunidadService {

    @Autowired
    private ComunidadRepository comunidadRepository;

    /**
     * metodo que devuelve la lista de todas las comunidades creadas
     * @return
     */
    public List<Comunidad> getComunidades() {
        return comunidadRepository.findAll();
    }

    /**
     * metodo retorna una comunidad a partir de su id
     * @param id
     * @return
     */
    public Comunidad getComunidad(String id) {
        return comunidadRepository.findById(id).orElse(null);
    }
}
