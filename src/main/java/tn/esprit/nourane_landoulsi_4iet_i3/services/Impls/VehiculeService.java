package tn.esprit.nourane_landoulsi_4iet_i3.services.Impls;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.nourane_landoulsi_4iet_i3.Domain.Vehicule;
import tn.esprit.nourane_landoulsi_4iet_i3.Repositories.IVehiculeRepository;
import tn.esprit.nourane_landoulsi_4iet_i3.services.IVehiculeService;

import java.util.List;
@Service
@RequiredArgsConstructor
public class VehiculeService implements IVehiculeService {

    private final IVehiculeRepository iVehiculeRepository;

    @Override
    public Vehicule createVehicule(Vehicule vehicule) {
        return iVehiculeRepository.save(vehicule);
    }

    @Override
    public Vehicule getVehiculeById(Long id) {
        return iVehiculeRepository.findById(id).orElse(null);
    }




    @Override
    public Vehicule updateVehicule(Vehicule vehicule) {
        return iVehiculeRepository.save(vehicule);
    }

    @Override
    public void deleteVehiculeById(Long id) {
        iVehiculeRepository.deleteById(id);
    }



    @Override
    public List<Vehicule> getAllVehicules() {
        return iVehiculeRepository.findAll();
    }

    @Override
    public Vehicule getVehiculeByName(String name) {
        return iVehiculeRepository.findFirstByMarque(name);
    }

    @Override
    public Vehicule findVehiculeByName(String name) {
        return iVehiculeRepository.findFirstByMarque(name);
    }




}