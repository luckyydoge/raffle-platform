package xyz.rabbitdog.raffleplatform.domain.types.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum StrategyTypes {
    O1("o1", "基于表的o1算法"),
    OLogN("ologn", "基于区间二分的ologn算法"),
    ;
    private final String code;
    private final String desc;
}
