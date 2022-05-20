package org.example.unmappedproperties.mapper;

import org.example.unmappedproperties.dto.CarDTO;
import org.example.unmappedproperties.entity.Car;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CarMapper {
    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    CarDTO carToCarDTO(Car car);
}