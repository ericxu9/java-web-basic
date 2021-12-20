package org.xumiao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.xumiao.domain.TaobaoOrder;
import org.xumiao.domain.TaobaoOrderExample;

public interface TaobaoOrderDao {
    long countByExample(TaobaoOrderExample example);

    int deleteByExample(TaobaoOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TaobaoOrder record);

    int insertSelective(TaobaoOrder record);

    List<TaobaoOrder> selectByExample(TaobaoOrderExample example);

    TaobaoOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TaobaoOrder record, @Param("example") TaobaoOrderExample example);

    int updateByExample(@Param("record") TaobaoOrder record, @Param("example") TaobaoOrderExample example);

    int updateByPrimaryKeySelective(TaobaoOrder record);

    int updateByPrimaryKey(TaobaoOrder record);
}