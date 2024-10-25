package com.example.PrCarro.Controller;

import com.example.PrCarro.Model.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
    import com.example.PrCarro.Service.*;

@RestController
@RequestMapping("/personas")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @PostMapping
    public ResponseEntity<Persona> crearPersona(@RequestBody Persona persona) {
        return ResponseEntity.ok(personaService.guardarPersona(persona));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Persona> actualizarPersona(@PathVariable Long id, @RequestBody Persona persona) {
        return ResponseEntity.ok(personaService.actualizarPersona(id, persona));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> borrarPersona(@PathVariable Long id) {
        personaService.borrarPersona(id);
        return ResponseEntity.noContent().build();
    }
}