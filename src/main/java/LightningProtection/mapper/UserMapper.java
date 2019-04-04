package LightningProtection.mapper;

import LightningProtection.pojo.ta_auth_user;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    List<ta_auth_user> userLogin(@Param("username") String username, @Param("password") String password);
    //int userRegister(ta_auth_user adduser);
}
