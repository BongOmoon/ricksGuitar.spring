package io.wayseekers.ricksGuitar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.wayseekers.ricksGuitar.domain.instrument.Instrument;

@Repository
public interface InstrumentRepository extends JpaRepository<Instrument, Integer>{

}