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
@Entity
@Table(name = "base_entity", schema = "", catalog = "")
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Basic(fetch=FetchType.LAZY)
    private String createBy;

    @Basic(fetch=FetchType.LAZY)
    private Timestamp createTime;

    @Basic(fetch=FetchType.LAZY)
    private String updateBy;

    @Basic(fetch=FetchType.LAZY)
    private Timestamp updateTime;

    @Basic(fetch=FetchType.LAZY)
    private Integer status;

    @Basic(fetch=FetchType.LAZY)
    private Integer isDel;

    private String remark;
}
