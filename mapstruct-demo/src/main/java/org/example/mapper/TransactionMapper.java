package org.example.mapper;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;

import org.mapstruct.Mapper;

import org.example.dto.TransactionDTO;
import org.example.entity.Transaction;

@Mapper
abstract class TransactionMapper {

    public TransactionDTO toTransactionDTO(Transaction transaction) {
        TransactionDTO transactionDTO = new TransactionDTO();
        transactionDTO.setUuid(transaction.getUuid());
        transactionDTO.setTotalInCents(transaction.getTotal().multiply(new BigDecimal("100")).longValue());
        return transactionDTO;
    }

    public abstract List<TransactionDTO> toTransactionDTO(Collection<Transaction> transactions);
}
