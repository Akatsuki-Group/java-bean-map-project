package org.example.mapper;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import org.example.dto.CarDTO;
import org.example.entity.Car;

public class CarMapperUnitTest {

    @Test
    public void givenCarEntitytoCar_whenMaps_thenCorrect() {
        
        Car entity  = new Car();
        entity.setId(1);
        entity.setName("Toyota");
        
        CarDTO carDto = CarMapper.INSTANCE.carToCarDTO(entity);

        assertEquals(carDto.getId(), entity.getId());
        assertEquals(carDto.getName(), entity.getName());
    }
}
