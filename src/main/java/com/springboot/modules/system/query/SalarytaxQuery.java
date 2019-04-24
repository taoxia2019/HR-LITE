package com.springboot.modules.system.query;

import com.springboot.modules.system.entity.SalaryTax;
import com.springboot.utils.BaseQuery;

public class SalarytaxQuery extends BaseQuery<SalaryTax> {

    private static final long serialVersionUID = 1L;
    private String xingming;

    public String getXingming() {
        return xingming;
    }

    public void setXingming(String xingming) {
        this.xingming = xingming;
    }
}
