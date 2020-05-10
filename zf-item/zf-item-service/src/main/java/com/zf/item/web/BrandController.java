package com.zf.item.web;

import com.zf.common.vo.PageResult;
import com.zf.item.model.BrandDO;
import com.zf.item.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: zhifeng
 * @Date: 2020/5/4 17:18
 * @Description:
 */
@RestController
@RequestMapping("/brand")
public class BrandController {
    @Autowired
    private BrandService brandService;
    @ResponseBody
    @GetMapping("/page")
    public ResponseEntity<PageResult> listPage(@RequestParam(value="page",defaultValue = "1")Integer page,
                                               @RequestParam(value = "rows",defaultValue = "10") Integer rows,
                                               @RequestParam(value = "sortBy" ,required = false) String sortBy,
                                               @RequestParam(value = "desc",defaultValue = "false")Boolean desc,
                                               @RequestParam(value = "key",required = false)String key
    ){
        PageResult<BrandDO> brandDOPageResult = brandService.listPage(page, rows, sortBy, desc, key);
       return ResponseEntity.ok(brandDOPageResult);
    }

//    @PostMapping
//    public ResponseEntity<Void> save(BrandDO brand,@RequestParam("categories") List<Long> categories){
//
//    }


}
