package com.bank.antifraud.mappers;

import com.bank.antifraud.dto.SuspiciousCardTransferDto;
import com.bank.antifraud.entity.SuspiciousCardTransferEntity;
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
public class SuspiciousCardTransferMapperImpl implements SuspiciousCardTransferMapper {

    @Override
    public SuspiciousCardTransferDto toDto(SuspiciousCardTransferEntity suspiciousTransfer) {
        if ( suspiciousTransfer == null ) {
            return null;
        }

        SuspiciousCardTransferDto suspiciousCardTransferDto = new SuspiciousCardTransferDto();

        suspiciousCardTransferDto.setId( suspiciousTransfer.getId() );
        suspiciousCardTransferDto.setCardTransferId( suspiciousTransfer.getCardTransferId() );
        suspiciousCardTransferDto.setIsBlocked( suspiciousTransfer.getIsBlocked() );
        suspiciousCardTransferDto.setIsSuspicious( suspiciousTransfer.getIsSuspicious() );
        suspiciousCardTransferDto.setBlockedReason( suspiciousTransfer.getBlockedReason() );
        suspiciousCardTransferDto.setSuspiciousReason( suspiciousTransfer.getSuspiciousReason() );

        return suspiciousCardTransferDto;
    }

    @Override
    public SuspiciousCardTransferEntity toEntity(SuspiciousCardTransferDto suspiciousTransfer) {
        if ( suspiciousTransfer == null ) {
            return null;
        }

        SuspiciousCardTransferEntity suspiciousCardTransferEntity = new SuspiciousCardTransferEntity();

        suspiciousCardTransferEntity.setCardTransferId( suspiciousTransfer.getCardTransferId() );
        suspiciousCardTransferEntity.setIsBlocked( suspiciousTransfer.getIsBlocked() );
        suspiciousCardTransferEntity.setIsSuspicious( suspiciousTransfer.getIsSuspicious() );
        suspiciousCardTransferEntity.setBlockedReason( suspiciousTransfer.getBlockedReason() );
        suspiciousCardTransferEntity.setSuspiciousReason( suspiciousTransfer.getSuspiciousReason() );

        return suspiciousCardTransferEntity;
    }

    @Override
    public List<SuspiciousCardTransferDto> toListDto(List<SuspiciousCardTransferEntity> suspiciousTransfers) {
        if ( suspiciousTransfers == null ) {
            return null;
        }

        List<SuspiciousCardTransferDto> list = new ArrayList<SuspiciousCardTransferDto>( suspiciousTransfers.size() );
        for ( SuspiciousCardTransferEntity suspiciousCardTransferEntity : suspiciousTransfers ) {
            list.add( toDto( suspiciousCardTransferEntity ) );
        }

        return list;
    }

    @Override
    public SuspiciousCardTransferEntity mergeToEntity(SuspiciousCardTransferDto cardTransfer, SuspiciousCardTransferEntity suspiciousTransfer) {
        if ( cardTransfer == null ) {
            return suspiciousTransfer;
        }

        suspiciousTransfer.setCardTransferId( cardTransfer.getCardTransferId() );
        suspiciousTransfer.setIsBlocked( cardTransfer.getIsBlocked() );
        suspiciousTransfer.setIsSuspicious( cardTransfer.getIsSuspicious() );
        suspiciousTransfer.setBlockedReason( cardTransfer.getBlockedReason() );
        suspiciousTransfer.setSuspiciousReason( cardTransfer.getSuspiciousReason() );

        return suspiciousTransfer;
    }
}
