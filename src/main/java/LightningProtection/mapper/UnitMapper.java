package LightningProtection.mapper;

import LightningProtection.pojo.ta_construction_unit;
import LightningProtection.pojo.ta_construction_unitExample;

import java.util.List;

public interface UnitMapper {
    ta_construction_unit selectByPrimaryKey(int id);
    List<ta_construction_unit> selectByExample(ta_construction_unitExample example);
    boolean deleteByPrimaryKey(Long id);
    boolean insertSelective(ta_construction_unit record);
}
