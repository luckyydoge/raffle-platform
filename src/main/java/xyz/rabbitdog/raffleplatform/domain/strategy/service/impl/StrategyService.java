package xyz.rabbitdog.raffleplatform.domain.strategy.service.impl;

import org.springframework.stereotype.Service;
import xyz.rabbitdog.raffleplatform.domain.strategy.model.valobj.PrizeItemVO;
import xyz.rabbitdog.raffleplatform.domain.strategy.repository.IStrategyRepository;
import xyz.rabbitdog.raffleplatform.domain.strategy.service.IStrategyService;

@Service
public class StrategyService implements IStrategyService {
    private final IStrategyRepository strategyRepository;

    StrategyService(IStrategyRepository strategyRepository) {
        this.strategyRepository = strategyRepository;
    }

    @Override
    public PrizeItemVO draw(Integer strategyId) {

        return null;
    }
}
