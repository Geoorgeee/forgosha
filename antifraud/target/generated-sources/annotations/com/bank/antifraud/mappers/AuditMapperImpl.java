package com.bank.antifraud.mappers;

import com.bank.antifraud.dto.AuditDto;
import com.bank.antifraud.entity.AuditEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-21T15:14:26+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.10 (Amazon.com Inc.)"
)
@Component
public class AuditMapperImpl implements AuditMapper {

    @Override
    public AuditDto toDto(AuditEntity audit) {
        if ( audit == null ) {
            return null;
        }

        AuditDto auditDto = new AuditDto();

        auditDto.setId( audit.getId() );
        auditDto.setEntityType( audit.getEntityType() );
        auditDto.setOperationType( audit.getOperationType() );
        auditDto.setCreatedBy( audit.getCreatedBy() );
        auditDto.setModifiedBy( audit.getModifiedBy() );
        auditDto.setCreatedAt( audit.getCreatedAt() );
        auditDto.setModifiedAt( audit.getModifiedAt() );
        auditDto.setNewEntityJson( audit.getNewEntityJson() );
        auditDto.setEntityJson( audit.getEntityJson() );

        return auditDto;
    }
}
