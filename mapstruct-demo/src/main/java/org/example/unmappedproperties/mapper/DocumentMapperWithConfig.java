package org.example.unmappedproperties.mapper;

import org.example.unmappedproperties.dto.DocumentDTO;
import org.example.unmappedproperties.entity.Document;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = IgnoreUnmappedMapperConfig.class)
public interface DocumentMapperWithConfig {

    DocumentMapperWithConfig INSTANCE = Mappers.getMapper(DocumentMapperWithConfig.class);

    DocumentDTO documentToDocumentDTO(Document entity);

    Document documentDTOToDocument(DocumentDTO dto);
}