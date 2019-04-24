package com.springboot.modules.system.service;

import com.springboot.core.exception.CrmException;
import com.springboot.modules.system.dto.SalarytaxDto;
import com.springboot.modules.system.entity.SalaryTax;
import com.springboot.modules.system.query.SalarytaxQuery;
import com.springboot.modules.system.query.UserQuery;
import com.springboot.utils.PageResultSet;

import java.util.List;
import java.util.Set;

public interface SalarytaxService {
    PageResultSet<SalarytaxDto> findByPage(SalarytaxQuery salarytaxQuery);

    /**
     * 创建用户
     * @param
     */
    void createSalaryTax(SalaryTax salaryTax) throws CrmException;

    void updateSalaryTax(SalaryTax salaryTax);

    void deleteSalaryTax(Integer userId);

    SalaryTax findOne(Integer id);

    List<SalaryTax> findAll();

    /**
     * 根据用户名查找用户
     * @param
     * @return
     */
    public SalaryTax findByXingming(String xingming);




}
