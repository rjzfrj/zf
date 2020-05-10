package com.zf.item.service;

import com.zf.common.vo.PageResult;
import com.zf.item.model.BrandDO;

import java.util.List;

/**
 * @Auther: zhifeng
 * @Date: 2020/5/4 17:20
 * @Description:
 */

public interface BrandService {



    public PageResult<BrandDO> listPage(Integer page, Integer rows, String sortBy, Boolean desc, String key);

    /**
     * 新增brand,并且维护中间表
     * @param brand
     * @param cids
     */
    void saveBrand(BrandDO brand, List<Long> cids);
}
