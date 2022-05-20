package org.example.unmappedproperties.mapper;

import org.example.unmappedproperties.dto.DocumentDTO;
import org.example.unmappedproperties.entity.Document;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DocumentMapperMappingIgnore {

    DocumentMapperMappingIgnore INSTANCE = Mappers.getMapper(DocumentMapperMappingIgnore.class);

    @Mapping(target = "comments", ignore = true)
    DocumentDTO documentToDocumentDTO(Document entity);

    @Mapping(target = "modificationTime", ignore = true)
    Document documentDTOToDocument(DocumentDTO dto);

}