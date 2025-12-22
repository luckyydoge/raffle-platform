package xyz.rabbitdog.raffleplatform.domain.strategy.model.valobj;

import lombok.Builder;
import java.math.BigDecimal;

@Builder // 尝试添加 @Builder
public record PrizeItemVO(
        Integer itemId,
        String name,
        Integer strategyId,
        BigDecimal probability
) { }