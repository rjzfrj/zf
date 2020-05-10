package com.zf.item.web;

import com.zf.item.model.CategoryDO;
import com.zf.item.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: zhifeng
 * @Date: 2019/5/10 08:46
 * @Description:
 */
@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    /**
     * 根据父节点查询商品类目
     * @param pid
     * @return
     */
    @GetMapping("list")
    public ResponseEntity<List<CategoryDO>> queryByParentId(
            @RequestParam(value = "pid", defaultValue = "0") Long pid) {
        List<CategoryDO> list = this.categoryService.queryListByParent(pid);
        if (list == null || list.size() < 1) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(list);
    }
}
