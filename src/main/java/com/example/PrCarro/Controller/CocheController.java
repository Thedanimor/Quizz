package com.example.PrCarro.Controller;

import com.example.PrCarro.Model.Coche;
import com.example.PrCarro.Service.CocheService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/coches")
public class CocheController {

    @Autowired
    private CocheService cocheService;

    @PostMapping
    public ResponseEntity<Coche> crearCoche(@RequestBody Coche coche) {
        return ResponseEntity.ok(cocheService.guardarCoche(coche));
    }

    @PutMapping("/{matricula}")
    public ResponseEntity<Coche> actualizarCoche(@PathVariable String matricula, @RequestBody Coche coche) {
        return ResponseEntity.ok(cocheService.actualizarCoche(matricula, coche));
    }

    @DeleteMapping("/{matricula}")
    public ResponseEntity<Void> borrarCoche(@PathVariable String matricula) {
        cocheService.borrarCoche(matricula);
        return ResponseEntity.noContent().build();
    }
}
