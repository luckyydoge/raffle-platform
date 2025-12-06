package xyz.rabbitdog.raffleplatform.infrastructure.po;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class DrawStrategy {
    private Integer id;
    private Integer strategyId;
    private String name;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
