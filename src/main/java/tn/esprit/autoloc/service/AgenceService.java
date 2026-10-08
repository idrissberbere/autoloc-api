package tn.esprit.autoloc.service;

import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.entite.Agence;
import tn.esprit.autoloc.repository.AgenceRepository;

import java.util.List;

@Service
public class AgenceService implements IAgenceService {

    private final AgenceRepository agenceRepository;

    public AgenceService(AgenceRepository agenceRepository) {
        this.agenceRepository = agenceRepository;
    }

    @Override
    public Agence AddAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public void deleteAgence(Long id) {
        agenceRepository.deleteById(id);
    }

    @Override
    public Agence UpdateAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public List<Agence> FindAll() {
        return agenceRepository.findAll();
    }
}