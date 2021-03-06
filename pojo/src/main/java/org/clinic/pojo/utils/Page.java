package org.clinic.pojo.utils;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class Page {
    private Integer pageIndex;

    private Integer count;

    private Integer pageSize;

    private Integer pageCount;

    private Integer from;

    private List list;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        count = count==0?1:count;
        this.count = count;
        pageCount = this.count%pageSize == 0?this.count/pageSize:this.count/pageSize+1;
    }
}
