package LightningProtection.mapper;

import LightningProtection.pojo.ta_project_kance;
import LightningProtection.pojo.ta_project_kanceExample;

import java.util.List;

public interface KanceMapper {
    List<ta_project_kance> selectByExample(ta_project_kanceExample example);
    boolean deleteByPrimaryKey(Long id);
    boolean insertSelective(ta_project_kance record);
}
