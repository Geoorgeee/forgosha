package com.bank.antifraud.mappers;

import com.bank.antifraud.dto.SuspiciousPhoneTransferDto;
import com.bank.antifraud.entity.SuspiciousPhoneTransferEntity;
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
public class SuspiciousPhoneTransferMapperImpl implements SuspiciousPhoneTransferMapper {

    @Override
    public SuspiciousPhoneTransferDto toDto(SuspiciousPhoneTransferEntity suspiciousTransfer) {
        if ( suspiciousTransfer == null ) {
            return null;
        }

        SuspiciousPhoneTransferDto suspiciousPhoneTransferDto = new SuspiciousPhoneTransferDto();

        suspiciousPhoneTransferDto.setId( suspiciousTransfer.getId() );
        suspiciousPhoneTransferDto.setPhoneTransferId( suspiciousTransfer.getPhoneTransferId() );
        suspiciousPhoneTransferDto.setIsBlocked( suspiciousTransfer.getIsBlocked() );
        suspiciousPhoneTransferDto.setIsSuspicious( suspiciousTransfer.getIsSuspicious() );
        suspiciousPhoneTransferDto.setBlockedReason( suspiciousTransfer.getBlockedReason() );
        suspiciousPhoneTransferDto.setSuspiciousReason( suspiciousTransfer.getSuspiciousReason() );

        return suspiciousPhoneTransferDto;
    }

    @Override
    public SuspiciousPhoneTransferEntity toEntity(SuspiciousPhoneTransferDto suspiciousTransfer) {
        if ( suspiciousTransfer == null ) {
            return null;
        }

        SuspiciousPhoneTransferEntity suspiciousPhoneTransferEntity = new SuspiciousPhoneTransferEntity();

        suspiciousPhoneTransferEntity.setPhoneTransferId( suspiciousTransfer.getPhoneTransferId() );
        suspiciousPhoneTransferEntity.setIsBlocked( suspiciousTransfer.getIsBlocked() );
        suspiciousPhoneTransferEntity.setIsSuspicious( suspiciousTransfer.getIsSuspicious() );
        suspiciousPhoneTransferEntity.setBlockedReason( suspiciousTransfer.getBlockedReason() );
        suspiciousPhoneTransferEntity.setSuspiciousReason( suspiciousTransfer.getSuspiciousReason() );

        return suspiciousPhoneTransferEntity;
    }

    @Override
    public List<SuspiciousPhoneTransferDto> toListDto(List<SuspiciousPhoneTransferEntity> suspiciousTransfers) {
        if ( suspiciousTransfers == null ) {
            return null;
        }

        List<SuspiciousPhoneTransferDto> list = new ArrayList<SuspiciousPhoneTransferDto>( suspiciousTransfers.size() );
        for ( SuspiciousPhoneTransferEntity suspiciousPhoneTransferEntity : suspiciousTransfers ) {
            list.add( toDto( suspiciousPhoneTransferEntity ) );
        }

        return list;
    }

    @Override
    public SuspiciousPhoneTransferEntity mergeToEntity(SuspiciousPhoneTransferDto phoneTransfer, SuspiciousPhoneTransferEntity suspiciousTransfer) {
        if ( phoneTransfer == null ) {
            return suspiciousTransfer;
        }

        suspiciousTransfer.setPhoneTransferId( phoneTransfer.getPhoneTransferId() );
        suspiciousTransfer.setIsBlocked( phoneTransfer.getIsBlocked() );
        suspiciousTransfer.setIsSuspicious( phoneTransfer.getIsSuspicious() );
        suspiciousTransfer.setBlockedReason( phoneTransfer.getBlockedReason() );
        suspiciousTransfer.setSuspiciousReason( phoneTransfer.getSuspiciousReason() );

        return suspiciousTransfer;
    }
}
