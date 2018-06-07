package com.aunsetre.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Data
public class User {
    private Integer id;

    private String name;

    private String pwd;

    private String email;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone ="GMT+8")
    private Date retime;

    private Integer state;

    private Integer rid;

    private Integer logid;


}