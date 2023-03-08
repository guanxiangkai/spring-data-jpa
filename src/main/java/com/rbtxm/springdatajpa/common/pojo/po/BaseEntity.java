package com.rbtxm.springdatajpa.common.pojo.po;

import jakarta.persistence.*;
import lombok.Data;
import java.sql.Timestamp;
import java.util.UUID;

/**
 * @Author: guanxiangkai
 * @Description:
 * @Data: 2023年03月07日 周二 19时38分19秒
 **/
@Data
@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String createBy;

    private Timestamp createTime;

    private String updateBy;

    private Timestamp updateTime;

    private Integer status;

    private Integer isDel;

    private String remark;
}
