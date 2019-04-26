package com.springboot.modules.system.entity;

import lombok.Data;

import javax.persistence.*;

@Table(name="tax")
@Data
public class SalaryTax {

    /**
     * 编号
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String xingming;
    private String zhengzhaoleixing;
    private String zhengzhaohaoma;
    private String benqishouru;
    private String benqimianshuishouru;
    private String jibenyanglaobaoxian;
    private String jibenyiliaobaoxianfei;
    private String shiyebaoxianfei;
    private String zhufanggongjijin;
    private String leijizinvjiaoyu;
    private String leijijixujiaoyu;
    private String leijizhufangdaikuanlixi;
    private String leijizhufangzujin;
    private String leijishanyanglaoren;
    private String qiyenianjin;
    private String shangyejiankangbaoxian;
    private String shuiyanyanglaobaoxian;
    private String qita;
    private String zhunyukouchudejuanzenge;
    private String jianmianshuie;
    private String leijiyingbutuishuie;
    private String dept;
    private String creatdate;

}
