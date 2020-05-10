package com.zf.item.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Auther: zhifeng
 * @Date: 2019/5/10 08:43
 * @Description:
 */
@Data
@Table(name="tb_category")
public class CategoryDO {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long parentId;
    private Boolean isParent;
    private Integer sort;

}
