package com.aunsetre.service.service.impl;

import com.aunsetre.mapping.CommonDao;
import com.aunsetre.service.CommonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: Aunsetre
 * @Date: 6/8/0008 17:34
 */
@Service
public class CommonServiceImpl implements CommonService {
    @Resource
    CommonDao commonDao;
    @Override
    /**
     * 获取Mysql版本
     */
    public String getMysqlVersion() {

        return commonDao.getMysqlVersion();
    }
}
