package xyz.rabbitdog.raffleplatform.infrastructure.po;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class PrizeItem {
    private Integer id;
    private Integer itemId;
    private String name;
    private Integer strategyId;
    private BigDecimal probability;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
