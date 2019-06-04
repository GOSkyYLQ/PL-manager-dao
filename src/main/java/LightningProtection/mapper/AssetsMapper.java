package LightningProtection.mapper;

import LightningProtection.pojo.ta_assets;
import LightningProtection.pojo.ta_assetsExample;

import java.util.List;

public interface AssetsMapper {
    List<ta_assets> selectByExample(ta_assetsExample example);
    boolean deleteByPrimaryKey(Long id);
    boolean insertSelective(ta_assets record);
}
