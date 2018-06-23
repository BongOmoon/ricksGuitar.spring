package io.wayseekers.ricksGuitar.domain.instrument;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.wayseekers.ricksGuitar.domain.BaseTimeEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Entity
public class Instrument extends BaseTimeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(nullable = false)
	private String serialNumber;
    
	@Column(length = 100, nullable = false)
	private String price;

	@Enumerated(EnumType.STRING)
	private InstrumentType instrumentType;
	
	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	private Builders builder;
	
	@Column(nullable = true)
	private String model;
	
	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	private Type type;
	
	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	private Wood backWood;
	
	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	private Wood topWood;

	@Column(nullable = true)
	private int numStrings;
	
	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	private Style style;
	
//    @OneToOne(fetch = FetchType.LAZY, cascade =  CascadeType.ALL, mappedBy = "instrument")
//    private InstrumentSpec instrumentSpec;

}