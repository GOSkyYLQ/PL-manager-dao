package LightningProtection.mapper;

import LightningProtection.pojo.ta_project_build;
import LightningProtection.pojo.ta_project_buildExample;

import java.util.List;

public interface BuildMapper {
    List<ta_project_build> selectByExample(ta_project_buildExample example);
    boolean deleteByPrimaryKey(Long id);
    boolean insertSelective(ta_project_build record);
}
