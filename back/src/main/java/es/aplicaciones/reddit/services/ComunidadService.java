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

    public List<Comunidad> getComunidades() {
        return comunidadRepository.findAll();
    }
}
