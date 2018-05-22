package com.aunsetre.mapping;

import com.aunsetre.pojo.Log;
import java.util.List;

public interface LogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Log record);

    Log selectByPrimaryKey(Integer id);

    List<Log> selectAll();

    int updateByPrimaryKey(Log record);
}