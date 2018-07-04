package com.aunsetre.mapping;

import com.aunsetre.pojo.Userrole;
import java.util.List;

public interface UserroleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Userrole record);

    Userrole selectByPrimaryKey(Integer id);

    List<Userrole> selectAll();

    int updateByPrimaryKey(Userrole record);
}