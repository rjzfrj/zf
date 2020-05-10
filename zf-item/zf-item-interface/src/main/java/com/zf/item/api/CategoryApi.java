package com.zf.item.api;

import com.zf.item.model.CategoryDO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Auther: zhifeng
 * @Date: 2020/5/10 21:49
 * @Description:
 */
@RequestMapping("brand")
public interface CategoryApi {

    @GetMapping("list")
    public ResponseEntity<List<CategoryDO>> queryByParentId(
            @RequestParam(value = "pid", defaultValue = "0") Long pid);
}
