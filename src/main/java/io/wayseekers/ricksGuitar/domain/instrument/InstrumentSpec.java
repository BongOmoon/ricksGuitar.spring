//package io.wayseekers.ricksGuitar.domain.instrument;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.EnumType;
//import javax.persistence.Enumerated;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
//
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//@AllArgsConstructor
//@NoArgsConstructor
//@Getter @Setter
//@Entity
//public class InstrumentSpec {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "id")
//	private Long id;
//	
//	@Enumerated(EnumType.STRING)
//	private InstrumentType instrumentType;
////	
////	@Enumerated(EnumType.STRING)
//	private String builder;
//
//	private String model;
//	
//	@Enumerated(EnumType.STRING)
//	private Type type;
//	
//	@Enumerated(EnumType.STRING)
//	private Wood backWood;
//	
//	@Enumerated(EnumType.STRING)
//	private Wood topWood;
//
//	private int numStrings;
//	
//	@Enumerated(EnumType.STRING)
//	private Style style;
//
//	@OneToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "instrument_id")
//	private Instrument instrument;
//
////	@Builder
////	public InstrumentSpec(InstrumentType instrumentType, String builder, String model, Type type,
////			Wood backWood, Wood topWood, int numStrings, Style style, Instrument instrument) {
////		
////		this.instrumentType = instrumentType;
////		this.builder = builder;
////		this.model = model;
////		this.type = type;
////		this.backWood = backWood;
////		this.topWood = topWood;
////		this.numStrings = numStrings;
////		this.style = style;
////		this.instrument = instrument;
////	}
//
//	public InstrumentSpec(Instrument i) {
//		this.instrument = i;
//	}
//}
