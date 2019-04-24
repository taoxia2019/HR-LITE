package com.springboot.modules.system.web;

import com.springboot.modules.system.dto.SalarytaxDto;
import com.springboot.modules.system.query.SalarytaxQuery;
import com.springboot.modules.system.service.SalarytaxService;
import com.springboot.utils.BaseController;
import com.springboot.utils.PageResultSet;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.RequestWrapper;

@Controller
@RequestMapping("/salarybase")
public class SalaryController extends BaseController {

    @Autowired
    private SalarytaxService salarytaxService;
    @GetMapping
    @RequiresPermissions("salary:base")
    public String salarylist(){
        return "salary/salarylist";
    }

    @ResponseBody
    @RequestMapping("/taxlist")
    @RequiresPermissions("salary:base")
    public PageResultSet<SalarytaxDto> list(SalarytaxQuery salarytaxQuery) {
        return salarytaxService.findByPage(salarytaxQuery);
    }

}
