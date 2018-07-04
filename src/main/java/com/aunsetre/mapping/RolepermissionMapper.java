package com.aunsetre.mapping;

import com.aunsetre.pojo.Rolepermission;
import java.util.List;

public interface RolepermissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Rolepermission record);

    Rolepermission selectByPrimaryKey(Integer id);

    List<Rolepermission> selectAll();

    int updateByPrimaryKey(Rolepermission record);
}