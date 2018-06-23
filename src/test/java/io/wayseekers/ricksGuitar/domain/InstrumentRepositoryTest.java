/*package io.wayseekers.ricksGuitar.domain;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import io.wayseekers.ricksGuitar.domain.instrument.Instrument;
import io.wayseekers.ricksGuitar.repository.InstrumentRepository;
import io.wayseekers.ricksGuitar.repository.InstrumentSpecRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InstrumentRepositoryTest {

	@Autowired
	InstrumentRepository iRepository;

	@Autowired
	InstrumentSpecRepository iSpecRepository;
	
	@After
	public void cleanup() {

		iRepository.deleteAll();
	}

	@Test
	public void 악기post테스트() {
		// given
		iRepository.save(Instrument.builder()
				.serialNumber("10120204")
				.price("10000")
				.build());
		
		// when
		List<Instrument> iList = iRepository.findAll();
		
		// then
		Instrument i = iList.get(0);
		assertThat(i.getSerialNumber(), is("10120204"));
		assertThat(i.getPrice(), is("10000"));
	}
	
	@Test
	public void 악기spec_post테스트() {
		// given
		iSpecRepository.save(InstrumentSpec.builder()
				.serialNumber("10120204")
				.instrumentType(InstrumentType.GUITAR)
				.builder(Builders.FENDER)
				.model("asd")
				.type(Type.ACOUSTIC)
				.backWood(Wood.ALDER)
				.topWood(Wood.ADIRONDACK)
				.numStrings(6)
				.style(Style.A)
				.instrument(null)
				.build());
		
		// when	
		List<InstrumentSpec> iSpecList = iSpecRepository.findAll();
		
		// then
		InstrumentSpec iSpec = iSpecList.get(0);
		assertThat(iSpec.getBuilder(), is(Builders.FENDER));
	}
	
	@Test
    public void BaseTimeEntity_적용() {
        //given
        LocalDateTime now = LocalDateTime.now();
        
		iRepository.save(Instrument.builder()
				.serialNumber("10120204")
				.price("10000")
				.build());
        //when
		List<Instrument> iList = iRepository.findAll();

        //then
		Instrument i = iList.get(0);
        assertTrue(i.getCreatedDate().isAfter(now));
        assertTrue(i.getModifiedDate().isAfter(now));
    }
}
*/