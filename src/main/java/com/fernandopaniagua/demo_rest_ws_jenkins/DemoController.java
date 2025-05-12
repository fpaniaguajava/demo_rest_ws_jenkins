package com.fernandopaniagua.demo_rest_ws_jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class DemoController {
    @GetMapping("/batman-amstrad")
    public Map<String, Object> getBatmanAmstradInfo() {
        return Map.of(
                "titulo", "Batman",
                "plataforma", "Amstrad CPC",
                "desarrollador", "Ocean Software",
                "año", 1986,
                "genero", "Aventura isométrica",
                "descripcion", "Batman es un videojuego de aventura en perspectiva isométrica lanzado en 1986, donde el jugador debe reunir las piezas del Batmóvil y rescatar a Robin dentro de una cueva laberíntica."
        );
    }
}
