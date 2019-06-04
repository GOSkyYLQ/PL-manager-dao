package LightningProtection.mapper;

import LightningProtection.pojo.ta_contract;
import LightningProtection.pojo.ta_contractExample;

import java.util.List;

public interface ContractMapper {
    List<ta_contract> selectByExample(ta_contractExample example);
    boolean deleteByPrimaryKey(Long id);
    boolean insertSelective(ta_contract record);
}
