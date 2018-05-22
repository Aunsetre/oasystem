package com.aunsetre.mapping;

import com.aunsetre.pojo.Role;
import java.util.List;

public interface RoleMapper {
    int deleteByPrimaryKey(Integer rid);

    int insert(Role record);

    Role selectByPrimaryKey(Integer rid);

    List<Role> selectAll();

    int updateByPrimaryKey(Role record);
}