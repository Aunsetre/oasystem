package com.aunsetre.mapping;

import com.aunsetre.pojo.State;
import java.util.List;

public interface StateMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(State record);

    State selectByPrimaryKey(Integer id);

    List<State> selectAll();

    int updateByPrimaryKey(State record);
}