package com.zf.item.service;

import com.zf.item.mapper.CategoryMapper;
import com.zf.item.model.CategoryDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @Auther: zhifeng
 * @Date: 2020/5/10 08:48
 * @Description:
 */
@Service
public class CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    public List<CategoryDO> queryListByParent(Long pid) {
        CategoryDO category = new CategoryDO();
        category.setParentId(pid);
        return this.categoryMapper.select(category);
    }
}