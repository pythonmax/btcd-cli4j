package com.neemre.btcdcli4j.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BlockDetailed extends BlockBase<RawTransaction> {
    public BlockDetailed(String hash, Integer confirmations, Integer size, Integer height, Integer version, String merkleRoot, List<RawTransaction> tx, Long time, Long nonce, String bits, BigDecimal difficulty, String chainWork, String previousBlockHash, String nextBlockHash) {
        super(hash, confirmations, size, height, version, merkleRoot, tx, time, nonce, bits, difficulty, chainWork, previousBlockHash, nextBlockHash);
    }
}