package tn.esprit.nourane_landoulsi_4iet_i3.Vehicule.Controller;import org.springframework.http.ResponseEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.nourane_landoulsi_4iet_i3.Domain.Vehicule;
import tn.esprit.nourane_landoulsi_4iet_i3.services.IVehiculeService;

import java.util.List;

@RestController
@RequestMapping("/vehicules")
@RequiredArgsConstructor
public class VehiculeRestController {

    private final IVehiculeService vehiculeService;

    @PostMapping
    public Vehicule createVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.createVehicule(vehicule);
    }

    @GetMapping
    public List<Vehicule> getAllVehicules() {
        return vehiculeService.getAllVehicules();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Vehicule> getVehiculeById(@PathVariable Long id) {
        Vehicule vehicule = vehiculeService.getVehiculeById(id);
        return vehicule != null ? ResponseEntity.ok(vehicule)
                : ResponseEntity.notFound().build();
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<Vehicule> getVehiculeByName(@PathVariable String name) {
        Vehicule vehicule = vehiculeService.getVehiculeByName(name);
        return vehicule != null ? ResponseEntity.ok(vehicule)
                : ResponseEntity.notFound().build();
    }

    @GetMapping("/search/{name}")
    public ResponseEntity<Vehicule> findVehiculeByName(@PathVariable String name) {
        Vehicule vehicule = vehiculeService.findVehiculeByName(name);
        return vehicule != null ? ResponseEntity.ok(vehicule)
                : ResponseEntity.notFound().build();
    }

    @PutMapping
    public Vehicule updateVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.updateVehicule(vehicule);
    }

    @DeleteMapping("/{id}")
    public void deleteVehiculeById(@PathVariable Long id) {
        vehiculeService.deleteVehiculeById(id);
    }
}