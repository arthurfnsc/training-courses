package br.com.arthurfnsc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.arthurfnsc.models.Institution;

public interface InstitutionRepository extends JpaRepository<Institution, Long> {

}
