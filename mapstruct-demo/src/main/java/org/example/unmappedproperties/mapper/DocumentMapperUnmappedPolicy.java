package org.example.unmappedproperties.mapper;

import org.example.unmappedproperties.dto.DocumentDTO;
import org.example.unmappedproperties.entity.Document;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DocumentMapperUnmappedPolicy {

    DocumentMapperUnmappedPolicy INSTANCE = Mappers.getMapper(DocumentMapperUnmappedPolicy.class);

    DocumentDTO documentToDocumentDTO(Document entity);

    Document documentDTOToDocument(DocumentDTO dto);
}