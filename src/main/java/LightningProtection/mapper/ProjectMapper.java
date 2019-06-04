package LightningProtection.mapper;

import LightningProtection.pojo.ta_project;
import LightningProtection.pojo.ta_projectExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProjectMapper {
    ta_project selectByPrimaryKey(Long id);
    List<ta_project> selectByExample(ta_projectExample example);
    void deleteByExample(ta_projectExample example);
    boolean deleteByPrimaryKey(Long id);
    boolean insertSelective(ta_project record);
    void updateByPrimaryKeySelective(ta_project taProject);
    boolean UpdateByPrimaryKeySelective(ta_project taProject);
}
