package com.zf.mytest.client;

import com.zf.item.api.BrandApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Auther: zhifeng
 * @Date: 2019/5/10 21:20
 * @Description:
 */
@FeignClient(value = "item-service")
public interface BrandClient extends BrandApi {
}
