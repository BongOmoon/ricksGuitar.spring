package io.wayseekers.ricksGuitar.controller;

import java.util.List;

import javax.transaction.Transactional;

import io.wayseekers.ricksGuitar.domain.instrument.Instrument;

public interface InstrumentService {

    @Transactional
    Instrument save(Instrument instrument);
 
/*    @Transactional
    InstrumentSpec addSpec(InstrumentSpec iSpec, Long id);
*/
    @Transactional
    Instrument getById(Integer id);
    
    @Transactional
    void delete(Integer id);
    
    List<Instrument> search(Instrument iSearch);
    
    @Transactional
    List<Instrument> findAll();
}