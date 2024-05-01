package es.aplicaciones.reddit.controller;

import es.aplicaciones.reddit.model.Comunidad;
import es.aplicaciones.reddit.services.ComunidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Comunidad")
@CrossOrigin(origins = "http://localhost:4321")
public class ComunidadController {

    @Autowired
    private ComunidadService comunidadService;

    @GetMapping("/comunidades")
    public List<Comunidad> login() {

        return this.comunidadService.getComunidades();
    }

    @GetMapping("comunidad")
    public Comunidad comunidad(@RequestParam String id) {
        return this.comunidadService.getComunidad(id);
    }
}
