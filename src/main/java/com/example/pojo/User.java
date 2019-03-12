package com.example.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;

/**
 * @program: demo
 * @description: 用户实体类
 * @author: Mr.gao
 * @create: 2019-03-11 17:39
 **/
@Data
@Table(name="iit_user")
public class User {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer id;
    private  String name;
    private  String cnName;
    private  String mobilePhone;
    private  String eMail;
    private  String idNum;
    private String password;
    private Date createTime;

}
