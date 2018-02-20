package com.neemre.btcdcli4j.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Block extends BlockBase<String> {
    public Block(String hash, Integer confirmations, Integer size, Integer height, Integer version, String merkleRoot, List<String> tx, Long time, Long nonce, String bits, BigDecimal difficulty, String chainWork, String previousBlockHash, String nextBlockHash) {
        super(hash, confirmations, size, height, version, merkleRoot, tx, time, nonce, bits, difficulty, chainWork, previousBlockHash, nextBlockHash);
    }
}