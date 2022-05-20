package org.example.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import org.example.dto.CustomerDto;
import org.example.entity.Customer;

@Mapper
public interface CustomerDtoMapper {

    @Mapping(source = "firstName", target = "forename")
    @Mapping(source = "lastName", target = "surname")
    CustomerDto from(Customer customer);
}
