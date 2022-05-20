package org.example.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import org.example.dto.CarDTO;
import org.example.entity.Car;

@Mapper
public interface CarMapper {
    
    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);
    
    CarDTO carToCarDTO(Car car);
}
