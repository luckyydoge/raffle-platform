package xyz.rabbitdog.raffleplatform.infrastructure.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import xyz.rabbitdog.raffleplatform.infrastructure.dao.PrizeItemDao;
import xyz.rabbitdog.raffleplatform.infrastructure.po.PrizeItem;
import xyz.rabbitdog.raffleplatform.infrastructure.service.PrizeItemService;

@Service
public class PrizeItemServiceImpl extends ServiceImpl<PrizeItemDao, PrizeItem> implements PrizeItemService {
}
