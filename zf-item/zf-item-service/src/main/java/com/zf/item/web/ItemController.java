package com.zf.item.web;

import com.zf.common.enums.ExceptionEnum;
import com.zf.common.exception.BusinessException;
import com.zf.item.model.Item;
import com.zf.item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: zhifeng
 * @Date: 2020/4/26 22:06
 * @Description:
 */
@RestController
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @PostMapping("/save")
    @ResponseBody
    public ResponseEntity<Item> saveItem(Item item){
        if(item.getPrice()==null){
            throw new BusinessException(ExceptionEnum.ITEM_PRICE_NOT_NULL);
        }
        Item item1 = itemService.saveItem(item);
        return  ResponseEntity.ok(item1);

    }
}
