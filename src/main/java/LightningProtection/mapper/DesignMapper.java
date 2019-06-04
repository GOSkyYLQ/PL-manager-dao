package LightningProtection.mapper;

import LightningProtection.pojo.ta_project_design;
import LightningProtection.pojo.ta_project_designExample;

import java.util.List;

public interface DesignMapper {
    List<ta_project_design> selectByExample(ta_project_designExample example);
    boolean deleteByPrimaryKey(Long id);
    boolean insertSelective(ta_project_design record);
}
