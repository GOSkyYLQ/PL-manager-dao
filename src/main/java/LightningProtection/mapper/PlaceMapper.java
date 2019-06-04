package LightningProtection.mapper;

import LightningProtection.pojo.ta_project_place;
import LightningProtection.pojo.ta_project_placeExample;

import java.util.List;

public interface PlaceMapper {
    List<ta_project_place> selectByExample(ta_project_placeExample example);
    boolean deleteByPrimaryKey(Long id);
    boolean insertSelective(ta_project_place record);
}
