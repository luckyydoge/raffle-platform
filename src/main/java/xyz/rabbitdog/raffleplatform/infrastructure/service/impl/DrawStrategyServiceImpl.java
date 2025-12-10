package xyz.rabbitdog.raffleplatform.infrastructure.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import xyz.rabbitdog.raffleplatform.infrastructure.dao.DrawStrategyDao;
import xyz.rabbitdog.raffleplatform.infrastructure.po.DrawStrategy;
import xyz.rabbitdog.raffleplatform.infrastructure.service.DrawStrategyService;

@Service
public class DrawStrategyServiceImpl extends ServiceImpl<DrawStrategyDao, DrawStrategy> implements DrawStrategyService {
}
