package com.neemre.btcdcli4j.core.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.neemre.btcdcli4j.core.common.Defaults;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public class BlockBase<T> extends Entity {
    private String hash;
    private Integer confirmations;
    private Integer size;
    private Integer height;
    private Integer version;
    @JsonProperty("merkleroot")
    private String merkleRoot;
    private List<T> tx;
    private Long time;
    private Long nonce;
    private String bits;
    @Setter(AccessLevel.NONE)
    private BigDecimal difficulty;
    @JsonProperty("chainwork")
    private String chainWork;
    @JsonProperty("previousblockhash")
    private String previousBlockHash;
    @JsonProperty("nextblockhash")
    private String nextBlockHash;

    public void setDifficulty(BigDecimal difficulty) {
        this.difficulty = difficulty.setScale(Defaults.DECIMAL_SCALE, Defaults.ROUNDING_MODE);
    }
}
