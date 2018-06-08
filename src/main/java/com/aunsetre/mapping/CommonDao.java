package com.aunsetre.mapping;

import org.springframework.stereotype.Repository;

/**
 * @Author: Aunsetre
 * @Date: 6/8/0008 17:28
 */
@Repository
public interface CommonDao {
    String getMysqlVersion();
}
