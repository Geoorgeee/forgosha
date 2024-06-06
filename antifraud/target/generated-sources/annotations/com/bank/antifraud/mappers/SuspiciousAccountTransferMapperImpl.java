package com.bank.antifraud.mappers;

import com.bank.antifraud.dto.SuspiciousAccountTransferDto;
import com.bank.antifraud.entity.SuspiciousAccountTransferEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-21T15:14:26+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.10 (Amazon.com Inc.)"
)
@Component
public class SuspiciousAccountTransferMapperImpl implements SuspiciousAccountTransferMapper {

    @Override
    public SuspiciousAccountTransferDto toDto(SuspiciousAccountTransferEntity suspiciousTransfer) {
        if ( suspiciousTransfer == null ) {
            return null;
        }

        SuspiciousAccountTransferDto suspiciousAccountTransferDto = new SuspiciousAccountTransferDto();

        suspiciousAccountTransferDto.setId( suspiciousTransfer.getId() );
        suspiciousAccountTransferDto.setAccountTransferId( suspiciousTransfer.getAccountTransferId() );
        suspiciousAccountTransferDto.setIsBlocked( suspiciousTransfer.getIsBlocked() );
        suspiciousAccountTransferDto.setIsSuspicious( suspiciousTransfer.getIsSuspicious() );
        suspiciousAccountTransferDto.setBlockedReason( suspiciousTransfer.getBlockedReason() );
        suspiciousAccountTransferDto.setSuspiciousReason( suspiciousTransfer.getSuspiciousReason() );

        return suspiciousAccountTransferDto;
    }

    @Override
    public SuspiciousAccountTransferEntity toEntity(SuspiciousAccountTransferDto suspiciousTransfer) {
        if ( suspiciousTransfer == null ) {
            return null;
        }

        SuspiciousAccountTransferEntity suspiciousAccountTransferEntity = new SuspiciousAccountTransferEntity();

        suspiciousAccountTransferEntity.setAccountTransferId( suspiciousTransfer.getAccountTransferId() );
        suspiciousAccountTransferEntity.setIsBlocked( suspiciousTransfer.getIsBlocked() );
        suspiciousAccountTransferEntity.setIsSuspicious( suspiciousTransfer.getIsSuspicious() );
        suspiciousAccountTransferEntity.setBlockedReason( suspiciousTransfer.getBlockedReason() );
        suspiciousAccountTransferEntity.setSuspiciousReason( suspiciousTransfer.getSuspiciousReason() );

        return suspiciousAccountTransferEntity;
    }

    @Override
    public List<SuspiciousAccountTransferDto> toListDto(List<SuspiciousAccountTransferEntity> suspiciousTransfers) {
        if ( suspiciousTransfers == null ) {
            return null;
        }

        List<SuspiciousAccountTransferDto> list = new ArrayList<SuspiciousAccountTransferDto>( suspiciousTransfers.size() );
        for ( SuspiciousAccountTransferEntity suspiciousAccountTransferEntity : suspiciousTransfers ) {
            list.add( toDto( suspiciousAccountTransferEntity ) );
        }

        return list;
    }

    @Override
    public SuspiciousAccountTransferEntity mergeToEntity(SuspiciousAccountTransferDto accountTransfer, SuspiciousAccountTransferEntity suspiciousTransfer) {
        if ( accountTransfer == null ) {
            return suspiciousTransfer;
        }

        suspiciousTransfer.setAccountTransferId( accountTransfer.getAccountTransferId() );
        suspiciousTransfer.setIsBlocked( accountTransfer.getIsBlocked() );
        suspiciousTransfer.setIsSuspicious( accountTransfer.getIsSuspicious() );
        suspiciousTransfer.setBlockedReason( accountTransfer.getBlockedReason() );
        suspiciousTransfer.setSuspiciousReason( accountTransfer.getSuspiciousReason() );

        return suspiciousTransfer;
    }
}
