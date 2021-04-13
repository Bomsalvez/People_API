package dev.senzalla.peopleapi.dto.mapper;

import dev.senzalla.peopleapi.dto.request.PersonDTO;
import dev.senzalla.peopleapi.entities.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO dto);

    PersonDTO toDTO(Person dto);
}
