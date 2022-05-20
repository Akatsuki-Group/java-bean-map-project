package org.example.mapstruct.mappingCollections.mapper;

import org.example.mapstruct.mappingCollections.dto.CompanyDTO;
import org.example.mapstruct.mappingCollections.model.Company;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;

@Mapper(collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED,
        uses = EmployeeMapper.class)
public interface CompanyMapperAdderPreferred {

    CompanyDTO map(Company company);
}
