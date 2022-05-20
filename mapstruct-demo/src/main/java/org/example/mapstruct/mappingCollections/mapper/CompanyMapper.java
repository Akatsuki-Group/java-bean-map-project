package org.example.mapstruct.mappingCollections.mapper;

import org.example.mapstruct.mappingCollections.dto.CompanyDTO;
import org.example.mapstruct.mappingCollections.model.Company;
import org.mapstruct.Mapper;

@Mapper(uses = EmployeeMapper.class)
public interface CompanyMapper {

    CompanyDTO map(Company company);
}
