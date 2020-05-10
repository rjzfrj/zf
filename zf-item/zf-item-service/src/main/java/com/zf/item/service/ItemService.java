package com.zf.item.service;

import com.zf.item.model.Item;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @Auther: zhifeng
 * @Date: 2020/4/23 22:14
 * @Description:
 */
@Service
public class ItemService {

    public Item saveItem(Item item){
        int i = new Random().nextInt(100);
        item.setId(i);
        return item;
    }
}
