package xyz.rabbitdog.raffleplatform.domain.strategy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import xyz.rabbitdog.raffleplatform.domain.strategy.model.valobj.PrizeItemVO;
import xyz.rabbitdog.raffleplatform.domain.types.enums.StrategyTypes;

import java.util.List;
import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DrawStrategyEntity<T> {
    private String name;
    private Integer strategyId;

    private List<PrizeItemVO> prizeItemVOList;

    private Map<T, PrizeItemVO> table;

    private StrategyTypes types;
}