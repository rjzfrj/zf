package com.zf.item.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * @Auther: zhifeng
 * @Date: 2020/5/4 19:42
 * @Description:
 */
@Table(name="tb_brand")
@Data
public class BrandDO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String image;
    private String letter;
}
