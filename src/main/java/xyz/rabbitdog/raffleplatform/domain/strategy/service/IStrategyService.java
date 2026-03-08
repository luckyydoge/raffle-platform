package xyz.rabbitdog.raffleplatform.domain.strategy.service;

import xyz.rabbitdog.raffleplatform.domain.strategy.model.valobj.PrizeItemVO;

public interface IStrategyService {
    PrizeItemVO draw(Integer strategyId);
}
