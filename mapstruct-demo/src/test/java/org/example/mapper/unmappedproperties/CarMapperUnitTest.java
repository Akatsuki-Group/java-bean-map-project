package org.example.mapper.unmappedproperties;

import org.example.unmappedproperties.dto.CarDTO;
import org.example.unmappedproperties.entity.Car;
import org.example.unmappedproperties.mapper.CarMapper;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarMapperUnitTest {

    @Test
    public void givenCarEntitytoCar_whenMaps_thenCorrect() {
        Car entity = new Car();
        entity.setId(1);
        entity.setName("Toyota");

        CarDTO carDto = CarMapper.INSTANCE.carToCarDTO(entity);

        assertThat(carDto.getId()).isEqualTo(entity.getId());
        assertThat(carDto.getName()).isEqualTo(entity.getName());
    }
}
