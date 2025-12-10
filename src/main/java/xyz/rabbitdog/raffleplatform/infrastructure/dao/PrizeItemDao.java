package xyz.rabbitdog.raffleplatform.infrastructure.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import xyz.rabbitdog.raffleplatform.infrastructure.po.PrizeItem;

@Mapper
public interface PrizeItemDao extends BaseMapper<PrizeItem> {
}
