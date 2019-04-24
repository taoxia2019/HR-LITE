package com.springboot.modules.system.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.springboot.core.exception.CrmException;
import com.springboot.modules.system.dto.SalarytaxDto;

import com.springboot.modules.system.entity.SalaryTax;
import com.springboot.modules.system.mapper.SalarytaxMapper;
import com.springboot.modules.system.query.SalarytaxQuery;
import com.springboot.modules.system.service.SalarytaxService;
import com.springboot.utils.PageResultSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.weekend.Weekend;
import tk.mybatis.mapper.weekend.WeekendCriteria;

import java.util.List;

@Service
public class SalarytaxServiceImpl implements SalarytaxService {

    @Autowired
    private SalarytaxMapper salarytaxMapper;

    @Override
    public PageResultSet<SalarytaxDto> findByPage(SalarytaxQuery salarytaxQuery) {
        if (!StringUtils.isEmpty(salarytaxQuery.getOrderBy())) {
            PageHelper.orderBy(salarytaxQuery.getOrderBy());
        }
        Weekend<SalaryTax> weekend = Weekend.of(SalaryTax.class);
        WeekendCriteria<SalaryTax, Object> criteria = weekend.weekendCriteria();
        /*Weekend<User> example = Weekend.of(User.class);
        WeekendCriteria<User, Object> criteria = example.weekendCriteria();*/
        if (!StringUtils.isEmpty(salarytaxQuery.getXingming())) {
            criteria.andLike(SalaryTax::getXingming, salarytaxQuery.getXingming());
        }

        PageResultSet<SalarytaxDto> resultSet = new PageResultSet<>();
        Page<SalarytaxDto> page = PageHelper.offsetPage(salarytaxQuery.getOffset(), salarytaxQuery.getLimit()).doSelectPage(() -> salarytaxMapper.selectByExample(weekend));
        resultSet.setRows(page);
        resultSet.setTotal(page.getTotal());
        return resultSet;
    }

    @Override
    public void createSalaryTax(SalaryTax salaryTax) throws CrmException {

    }

    @Override
    public void updateSalaryTax(SalaryTax salaryTax) {

    }

    @Override
    public void deleteSalaryTax(Integer userId) {

    }

    @Override
    public SalaryTax findOne(Integer id) {

        return null;
    }

    @Override
    public List<SalaryTax> findAll() {
        return salarytaxMapper.selectAll();
    }

    @Override
    public SalaryTax findByXingming(String xingming) {
        return null;
    }
}
