package org.example.mapper;

import org.example.dto.UserBodyImperialValuesDTO;
import org.example.entity.UserBodyValues;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class UserBodyValuesMapperUnitTest {

    @Test
    public void givenUserBodyImperialValuesDTOToUserBodyValuesObject_whenMaps_thenCorrect() {
        UserBodyImperialValuesDTO dto  = new UserBodyImperialValuesDTO();
        dto.setInch(10);
        dto.setPound(100);

        UserBodyValues obj = UserBodyValuesMapper.INSTANCE.userBodyValuesMapper(dto);

        assertNotNull(obj);
        assertEquals(25.4, obj.getCentimeter(), 0);
        assertEquals(45.35, obj.getKilogram(), 0);
    }

    @Test
    public void givenUserBodyImperialValuesDTOWithInchToUserBodyValuesObject_whenMaps_thenCorrect() {
        UserBodyImperialValuesDTO dto = new UserBodyImperialValuesDTO();
        dto.setInch(10);

        UserBodyValues obj = UserBodyValuesMapper.INSTANCE.userBodyValuesMapper(dto);

        assertNotNull(obj);
        assertEquals(25.4, obj.getCentimeter(), 0);
    }

    @Test
    public void givenUserBodyImperialValuesDTOWithPoundToUserBodyValuesObject_whenMaps_thenCorrect() {
        UserBodyImperialValuesDTO dto = new UserBodyImperialValuesDTO();
        dto.setPound(100);

        UserBodyValues obj = UserBodyValuesMapper.INSTANCE.userBodyValuesMapper(dto);

        assertNotNull(obj);
        assertEquals(45.35, obj.getKilogram(), 0);
    }
}