package com.springboot.modules.system.dto;

import com.springboot.modules.system.entity.SalaryTax;

public class SalarytaxDto {

    private Integer id;
    private String xingming;
    private String zhengzhaoleixing;
    private String zhengzhaohaoma;
    private String benqishouru;
    private String benqimianshuishouru;
    private String jibenyanglaobaoxian;
    private String jibenyiliaobaoxianfei;

    public SalarytaxDto() {
    }
    public  SalarytaxDto(SalaryTax salaryTax){
        this.id=salaryTax.getId();
        this.xingming=salaryTax.getXingming();
        this.zhengzhaoleixing=salaryTax.getZhengzhaoleixing();
        this.zhengzhaohaoma=salaryTax.getZhengzhaohaoma();
        this.benqishouru=salaryTax.getBenqishouru();
        this.benqimianshuishouru=salaryTax.getBenqimianshuishouru();
        this.jibenyanglaobaoxian=salaryTax.getJibenyanglaobaoxian();
        this.jibenyiliaobaoxianfei=salaryTax.getJibenyiliaobaoxianfei();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getXingming() {
        return xingming;
    }

    public void setXingming(String xingming) {
        this.xingming = xingming;
    }

    public String getZhengzhaoleixing() {
        return zhengzhaoleixing;
    }

    public void setZhengzhaoleixing(String zhengzhaoleixing) {
        this.zhengzhaoleixing = zhengzhaoleixing;
    }

    public String getZhengzhaohaoma() {
        return zhengzhaohaoma;
    }

    public void setZhengzhaohaoma(String zhengzhaohaoma) {
        this.zhengzhaohaoma = zhengzhaohaoma;
    }

    public String getBenqishouru() {
        return benqishouru;
    }

    public void setBenqishouru(String benqishouru) {
        this.benqishouru = benqishouru;
    }

    public String getBenqimianshuishouru() {
        return benqimianshuishouru;
    }

    public void setBenqimianshuishouru(String benqimianshuishouru) {
        this.benqimianshuishouru = benqimianshuishouru;
    }

    public String getJibenyanglaobaoxian() {
        return jibenyanglaobaoxian;
    }

    public void setJibenyanglaobaoxian(String jibenyanglaobaoxian) {
        this.jibenyanglaobaoxian = jibenyanglaobaoxian;
    }

    public String getJibenyiliaobaoxianfei() {
        return jibenyiliaobaoxianfei;
    }

    public void setJibenyiliaobaoxianfei(String jibenyiliaobaoxianfei) {
        this.jibenyiliaobaoxianfei = jibenyiliaobaoxianfei;
    }
}
