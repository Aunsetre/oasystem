package com.aunsetre.mapping;

import com.aunsetre.pojo.Authority;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AuthorityMapper {
    int deleteByPrimaryKey(Integer aid);

    int insert(Authority record);

    Authority selectByPrimaryKey(Integer aid);

    List<Authority> selectAll();

    int updateByPrimaryKey(Authority record);
}