package com.zf.item.api;


import com.zf.common.vo.PageResult;
import com.zf.item.model.BrandDO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author: 98050
 * Time: 2018-10-11 20:04
 * Feature:品牌服务接口
 */
@RequestMapping("brand")
public interface BrandApi {
    /**
     * 根据品牌id集合，查询品牌信息
     * @param ids
     * @return
     */
    @GetMapping("list")
    List<BrandDO> queryBrandByIds(@RequestParam("ids") List<Long> ids);

    @ResponseBody
    @GetMapping("/page")
    public ResponseEntity<PageResult> listPage(@RequestParam(value="page",defaultValue = "1")Integer page,
                                               @RequestParam(value = "rows",defaultValue = "10") Integer rows,
                                               @RequestParam(value = "sortBy" ,required = false) String sortBy,
                                               @RequestParam(value = "desc",defaultValue = "false")Boolean desc,
                                               @RequestParam(value = "key",required = false)String key
    );

}
