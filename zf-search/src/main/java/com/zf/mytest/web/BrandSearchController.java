package com.zf.mytest.web;

import com.zf.common.vo.PageResult;


import com.zf.item.model.BrandDO;
import com.zf.mytest.client.BrandClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Auther: zhifeng
 * @Date: 2020/5/4 17:18
 * @Description:
 */
@RestController
@RequestMapping("/search")
public class BrandSearchController {
    @Autowired
    private BrandClient brandClient;
    @ResponseBody
    @GetMapping("/page")
    public ResponseEntity<PageResult> listPage(@RequestParam(value="page",defaultValue = "1")Integer page,
                                               @RequestParam(value = "rows",defaultValue = "10") Integer rows,
                                               @RequestParam(value = "sortBy" ,required = false) String sortBy,
                                               @RequestParam(value = "desc",defaultValue = "false")Boolean desc,
                                               @RequestParam(value = "key",required = false)String key
    ){
        ResponseEntity<PageResult> pageResultResponseEntity = brandClient.listPage(page, rows, sortBy, desc, key);
        return pageResultResponseEntity;
    }

//    @PostMapping
//    public ResponseEntity<Void> save(BrandDO brand,@RequestParam("categories") List<Long> categories){
//
//    }


}
