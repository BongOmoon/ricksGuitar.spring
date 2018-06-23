package io.wayseekers.ricksGuitar.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.wayseekers.ricksGuitar.domain.instrument.Instrument;
import io.wayseekers.ricksGuitar.repository.InstrumentRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class InstrumentServiceImpl implements InstrumentService {

	@Autowired
	private InstrumentRepository instrumentRepository;

//	@Autowired
//	private InstrumentSpecRepository instrumentSpecRepository;

	public InstrumentServiceImpl() {

	}

	@Transactional
	@Override
	public Instrument save(Instrument i) {
		return instrumentRepository.save(i);
	}
	
	@Transactional
	@Override
	public List<Instrument> search(Instrument iSearch) {
		List<Instrument> matchingInstrument = new ArrayList<>();
		for(Iterator iter = instrumentRepository.findAll().iterator(); iter.hasNext() ; ) {
			Instrument i = (Instrument) iter.next();
			
			if(iSearch.getBuilder() != null && !i.getBuilder().equals(iSearch.getBuilder()))
				continue;
			if(iSearch.getModel() != null && iSearch.getModel() != "" && !i.getModel().equals(iSearch.getModel()))
				continue;
			if(iSearch.getTopWood() != null && !i.getTopWood().equals(iSearch.getTopWood()))
				continue;
			if(iSearch.getBackWood() != null && !i.getBuilder().equals(iSearch.getBackWood()))
				continue;
			if(iSearch.getType() != null && !i.getType().equals(iSearch.getType()))
				continue;
			matchingInstrument.add(i);
			System.out.println("확인잉ㄴ인일ㄴㅇㄴㄹ먄ㅇㄹ허ㅏㅁㅇㅎ러ㅏㅁㅇ러옪라ㅓㅁㄴ오");
		}
		
		return matchingInstrument;
	}
	
	@Transactional
	@Override
	public List<Instrument> findAll() {
		return (List<Instrument>) instrumentRepository.findAll();
	}
	
	@Transactional
	@Override
	public void delete(Integer id) {
		instrumentRepository.delete(id);
	}
	
	@Transactional
	@Override
	public Instrument getById(Integer id) {
		return instrumentRepository.findOne(id);
	}
//	@Override
//	public InstrumentSpec addSpec(InstrumentSpec iSpec, Long id) {
//		Instrument i = instrumentRepository.findOne(id);
//		InstrumentSpec saveEntity = new InstrumentSpec(i);
//	    return instrumentSpecRepository.save(saveEntity);
//	}

}
