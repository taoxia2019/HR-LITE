package com.springboot;

import com.springboot.modules.system.entity.SalaryTax;
import com.springboot.modules.system.mapper.SalarytaxMapper;
import com.springboot.modules.system.service.SalarytaxService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.springboot.modules.system.entity.User;

import tk.mybatis.mapper.mapperhelper.EntityHelper;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Autowired
	private SalarytaxMapper salarytaxMapper;

	@Autowired
	private SalarytaxService salarytaxService;

	@Test
	public void contextLoads() {
		EntityHelper.getOrderByClause(User.class);
	}
	@Test
	public  void testSalarytaxMapper(){
		List<SalaryTax> salaryTaxes = salarytaxMapper.selectAll();
		System.out.println(salaryTaxes.size());
	}

	@Test
	public void testSalarytaxService(){
		List<SalaryTax> all = salarytaxService.findAll();
		all.forEach(salaryTax -> {
			System.out.println(salaryTax.getZhengzhaohaoma());
		});

	}

}
