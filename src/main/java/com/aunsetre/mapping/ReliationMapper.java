package com.aunsetre.mapping;

import com.aunsetre.pojo.Reliation;
import java.util.List;

public interface ReliationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Reliation record);

    Reliation selectByPrimaryKey(Integer id);

    List<Reliation> selectAll();

    int updateByPrimaryKey(Reliation record);
}