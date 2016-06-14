package br.com.arthurfnsc.services;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import br.com.arthurfnsc.models.Institution;
import br.com.arthurfnsc.repositories.InstitutionRepository;

@Service
public class InstitutionService {

    @Resource
    private InstitutionRepository repository;

    public Institution save(final Institution institution) {
        return this.repository.save(institution);
    }
}
