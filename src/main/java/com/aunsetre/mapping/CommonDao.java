package com.aunsetre.mapping;

import org.springframework.stereotype.Repository;

/**
 * @Author: Aunsetre
 * @DATE: 2018-06-15 15:40:01
 */
@Repository
public interface CommonDao {
    String getMysqlVersion();
}
