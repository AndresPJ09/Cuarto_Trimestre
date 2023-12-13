package com.sena.continentes.Controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sena.continentes.Entity.Pais;
import com.sena.continentes.IService.IPaisServices;

@CrossOrigin(originPatterns = "*")
@RestController
@RequestMapping("v1/api/paises")
public class PaisController {

    @Autowired
    private IPaisServices paisService;

    @GetMapping
    public List<Pais> findAll() {
        return paisService.findAll();
    }

    @GetMapping("{id}")
    public Optional<Pais> findById(@PathVariable Long id) {
        return paisService.findById(id);
    }

    @PostMapping
    public Pais save(@RequestBody Pais pais) {
        return paisService.save(pais);
    }

    @PutMapping("{id}")
    public void save(@RequestBody Pais pais, @PathVariable Long id) {
        paisService.update(pais, id);
    }

    @PutMapping("deleted-at/{id}")
    public void deletedAt(@PathVariable Long id) {
        paisService.deletedAt(id);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        paisService.delete(id);
    }
}
