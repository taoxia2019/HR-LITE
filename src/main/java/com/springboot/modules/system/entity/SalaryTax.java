package com.springboot.modules.system.entity;

import javax.persistence.*;

@Table(name="tax")
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

    public String getShiyebaoxianfei() {
        return shiyebaoxianfei;
    }

    public void setShiyebaoxianfei(String shiyebaoxianfei) {
        this.shiyebaoxianfei = shiyebaoxianfei;
    }

    public String getZhufanggongjijin() {
        return zhufanggongjijin;
    }

    public void setZhufanggongjijin(String zhufanggongjijin) {
        this.zhufanggongjijin = zhufanggongjijin;
    }

    public String getLeijizinvjiaoyu() {
        return leijizinvjiaoyu;
    }

    public void setLeijizinvjiaoyu(String leijizinvjiaoyu) {
        this.leijizinvjiaoyu = leijizinvjiaoyu;
    }

    public String getLeijijixujiaoyu() {
        return leijijixujiaoyu;
    }

    public void setLeijijixujiaoyu(String leijijixujiaoyu) {
        this.leijijixujiaoyu = leijijixujiaoyu;
    }

    public String getLeijizhufangdaikuanlixi() {
        return leijizhufangdaikuanlixi;
    }

    public void setLeijizhufangdaikuanlixi(String leijizhufangdaikuanlixi) {
        this.leijizhufangdaikuanlixi = leijizhufangdaikuanlixi;
    }

    public String getLeijizhufangzujin() {
        return leijizhufangzujin;
    }

    public void setLeijizhufangzujin(String leijizhufangzujin) {
        this.leijizhufangzujin = leijizhufangzujin;
    }

    public String getLeijishanyanglaoren() {
        return leijishanyanglaoren;
    }

    public void setLeijishanyanglaoren(String leijishanyanglaoren) {
        this.leijishanyanglaoren = leijishanyanglaoren;
    }

    public String getQiyenianjin() {
        return qiyenianjin;
    }

    public void setQiyenianjin(String qiyenianjin) {
        this.qiyenianjin = qiyenianjin;
    }

    public String getShangyejiankangbaoxian() {
        return shangyejiankangbaoxian;
    }

    public void setShangyejiankangbaoxian(String shangyejiankangbaoxian) {
        this.shangyejiankangbaoxian = shangyejiankangbaoxian;
    }

    public String getShuiyanyanglaobaoxian() {
        return shuiyanyanglaobaoxian;
    }

    public void setShuiyanyanglaobaoxian(String shuiyanyanglaobaoxian) {
        this.shuiyanyanglaobaoxian = shuiyanyanglaobaoxian;
    }

    public String getQita() {
        return qita;
    }

    public void setQita(String qita) {
        this.qita = qita;
    }

    public String getZhunyukouchudejuanzenge() {
        return zhunyukouchudejuanzenge;
    }

    public void setZhunyukouchudejuanzenge(String zhunyukouchudejuanzenge) {
        this.zhunyukouchudejuanzenge = zhunyukouchudejuanzenge;
    }

    public String getJianmianshuie() {
        return jianmianshuie;
    }

    public void setJianmianshuie(String jianmianshuie) {
        this.jianmianshuie = jianmianshuie;
    }

    public String getLeijiyingbutuishuie() {
        return leijiyingbutuishuie;
    }

    public void setLeijiyingbutuishuie(String leijiyingbutuishuie) {
        this.leijiyingbutuishuie = leijiyingbutuishuie;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getCreatdate() {
        return creatdate;
    }

    public void setCreatdate(String creatdate) {
        this.creatdate = creatdate;
    }
}
