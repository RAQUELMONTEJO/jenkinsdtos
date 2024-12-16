package com.arquitecturajava.webspring.mappers;

import com.aquitecturajava.webspring.dtos.PersonaDto;
import com.arquitecturajava.spring.models.Persona;

public class PersonaMapper {
	
	public static PersonaDto toDto(Persona persona) {
		return new PersonaDto(persona.getNombre());
	}
	
	public static Persona toBo(PersonaDto personaDto) {
		return new Persona(personaDto.getNombre());
	}

}
