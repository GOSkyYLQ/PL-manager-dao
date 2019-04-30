package LightningProtection.mapper;

import LightningProtection.pojo.ta_project;
import LightningProtection.pojo.ta_projectExample;

import java.util.List;

public interface ProjectMapper {
    ta_project selectByPrimaryKey(int id);
    List<ta_project> selectByExample(ta_projectExample example);
    void deleteByExample(ta_projectExample example);
    boolean deleteByPrimaryKey(Long id);
    int insertSelective(ta_project record);
}
