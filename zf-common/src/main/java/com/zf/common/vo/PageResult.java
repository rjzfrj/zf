package com.zf.common.vo;

import lombok.Data;

import java.util.List;

/**
 * @Auther: zhifeng
 * @Date: 2020/5/4 17:10
 * @Description:
 */
@Data
public class PageResult<T> {
    /**
     * 总条数
     */
    private Long total;
    /**
     * 总页数
     */

    private Integer totalPage;
    /**
     * 当前页数据
     */
    private List<T> items; //

    public PageResult(long total, List<T> list) {
        this.total = total;
        this.items = list;
    }

    public PageResult(long total, Integer totalPage, List<T> list) {
        this.total = total;
        this.totalPage = totalPage;
        this.items = list;
    }

    public PageResult() {
    }
}
