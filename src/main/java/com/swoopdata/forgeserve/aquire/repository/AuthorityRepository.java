package com.swoopdata.forgeserve.aquire.repository;

import com.swoopdata.forgeserve.aquire.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
