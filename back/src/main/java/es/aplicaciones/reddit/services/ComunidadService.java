package es.aplicaciones.reddit.services;

import es.aplicaciones.reddit.repositories.ComunidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComunidadService {

    @Autowired
    private ComunidadRepository comunidadRepository;
}
