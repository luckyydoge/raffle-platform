package xyz.rabbitdog.raffleplatform.domain.strategy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PrizeItemEntity {
    private Integer itemId;
    private String name;
    private Integer strategyId;
    private BigDecimal probability;
}