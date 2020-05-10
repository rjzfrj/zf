package com.zf.item.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zf.common.vo.PageResult;
import com.zf.item.mapper.BrandMapper;
import com.zf.item.model.BrandDO;
import com.zf.item.service.BrandService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @Auther: zhifeng
 * @Date: 2019/5/10 18:51
 * @Description:
 */
@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandMapper brandMapper;

    public PageResult<BrandDO> listPage(Integer page, Integer rows, String sortBy, Boolean desc, String key) {
        PageHelper.startPage(page,rows);
        Example example=new Example(BrandDO.class);
        Example.Criteria criteria = example.createCriteria();
        if(StringUtils.isNotBlank(key)){
            criteria.orLike("name",key).andEqualTo("letter",key);

        }
        if(StringUtils.isNotBlank(sortBy)){
            String sortStr=sortBy+" "+( desc?"DESC":"ASC");
            example.setOrderByClause(sortStr);
        }
        List<BrandDO> list = brandMapper.selectByExample(example);
        if(CollectionUtils.isEmpty(list)){
            return  new PageResult<BrandDO>(0,null);
        }
        PageInfo pageInfo=new PageInfo(list);

        return new PageResult<BrandDO>(pageInfo.getTotal(),pageInfo.getList());
    }

    @Override
    public void saveBrand(BrandDO brand, List<Long> cids) {

    }
}
