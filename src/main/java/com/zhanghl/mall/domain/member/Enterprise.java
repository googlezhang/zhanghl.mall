package com.zhanghl.mall.domain.member;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.URL;

import com.zhanghl.mall.domain.member.constants.AccountConstant;

/**
 * 类Enterprise.java的实现描述：企业用户
 * 
 * @author hongliang.zhanghl 2012-7-11 下午10:12:45
 */
public class Enterprise {

    /**
     * id主键
     */
    private Integer   id;

    // 帐户信息
    // =========================================
    /**
     * 用户名|必填
     */
    @NotEmpty(message = "{com.zhanghl.mall.validation.username.NotEmpty.message}")
    @Size(min = 4, max = 20, message = "{com.zhanghl.mall.validation.username.Size.message}")
    private String    username;
    /**
     * 密码|必填
     */
    @NotEmpty
    private String    password;
    // =========================================
    // 联系人信息
    // =========================================
    /**
     * 联系人姓名|必填
     */
    @NotEmpty
    private String    contactPersonName;
    /**
     * 所在部门|必填 值如下： 1、办公室 2、市场部 3、采购部 4、技术部 5、人力资源 6、其他
     */
    @NotEmpty
    private Short     department;
    /**
     * 固定电话|必填
     */
    @NotEmpty
    private String    phoneNumber;
    /**
     * 手机号码|非必填
     */
    private String    cellphoneNumber;
    /**
     * 电子邮箱|必填
     */
    @NotEmpty
    @Email
    private String    email;
    // =========================================
    // 公司信息
    // =========================================
    /**
     * 公司名称|必填
     */
    @NotEmpty
    private String    companyName;
    // =========================================
    /**
     * 公司所在地 省/直辖市-地级市/区-县/市/开发区 通过https://passport.360buy.com/new/registcompany.aspx页面ajax请求获取 第0级，加载在页面上，省份或直辖市
     * 第1级地区：https://passport.360buy.com/new/AjaxService.aspx?action=GetAreas&level=1&parentId=1
     * 第2级地区：https://passport.360buy.com/new/AjaxService.aspx?action=GetAreas&level=2&parentId=72
     */
    /**
     * 省/直辖市|必填
     */
    @NotEmpty
    private Short     companyProvince;
    /**
     * 地级市/区|必填
     */
    @NotEmpty
    private Short     companyCity;
    /**
     * 县/市/开发区
     */
    @NotEmpty
    private Short     companyDistrict;
    /**
     * 公司地址|必填
     */
    @NotEmpty
    private String    companyAddress;
    /**
     * 购买类型/用途|可以选多个|必填 逗号分割的多个数字值 1、IT设备 2、数码通讯 3、办公用品耗材 4、大家电 5、项目合作-政府采购 6、礼品
     */
    @NotEmpty
    private String    purchaseType;
    // 以下为选填内容
    /**
     * 公司网址|可选
     */
    @URL
    private String    companyWebsite;
    /**
     * 企业人数|可选 1、1-49 2、50-99 3、100-499 4、500-999 5、1000以上
     */
    private Short     numberOfEmployees;
    /**
     * 公司行业|可选 1、计算机硬件及网络设备 2、计算机软件 3、IT服务（系统/数据/维护）/多领域经营 4、互联网/电子商务 5、网络游戏 6、通讯（设备/运营/增值服务） 7、电子技术/半导体/集成电路
     * 8、仪器仪表及工业自动化 9、金融/银行/投资/基金/证券 10、保险 11、房地产/建筑/建材/工程 12、家居/室内设计/装饰装潢 13、物业管理/商业中心 14、广告/会展/公关/市场推广
     * 15、媒体/出版/影视/文化/艺术 16、印刷/包装/造纸 17、咨询/管理产业/法律/财会 18、教育/培训 19、检验/检测/认证 20、中介服务 21、贸易/进出口 22、零售/批发
     * 23、快速消费品（食品/饮料/烟酒/化妆品 24、耐用消费品（服装服饰/纺织/皮革/家具/家电） 25、办公用品及设备 26、礼品/玩具/工艺美术/收藏品 27、大型设备/机电设备/重工业 28、加工制造（原料加工/模具）
     * 29、汽车/摩托车（制造/维护/配件/销售/服务） 30、交通/运输/物流 31、医药/生物工程 32、医疗/护理/美容/保健 33、医疗设备/器械 34、酒店/餐饮 35、娱乐/体育/休闲 36、旅游/度假
     * 37、石油/石化/化工 38、能源/矿产/采掘/冶炼 39、电气/电力/水利 40、航空/航天 41、学术/科研 42、政府/公共事业/非盈利机构 43、环保 44、农/林/牧/渔 45、跨领域经营 46、其它
     */
    private Short     companyIndustry;
    /**
     * 公司性质|可选 1、政府机关/事业单位 2、国营 3、私营 4、中外合资 5、外资 6、其他
     */
    private Short     companyType;
    /**
     * 是否订阅优惠信息 值为"Y"或者"N" 用于EDM
     */
    private Character subscribe;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getContactPersonName() {
        return contactPersonName;
    }

    public void setContactPersonName(String contactPersonName) {
        this.contactPersonName = contactPersonName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCellphoneNumber() {
        return cellphoneNumber;
    }

    public void setCellphoneNumber(String cellphoneNumber) {
        this.cellphoneNumber = cellphoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getPurchaseType() {
        return purchaseType;
    }

    public void setPurchaseType(String purchaseType) {
        this.purchaseType = purchaseType;
    }

    public String getCompanyWebsite() {
        return companyWebsite;
    }

    public void setCompanyWebsite(String companyWebsite) {
        this.companyWebsite = companyWebsite;
    }

    public Short getDepartment() {
        return department;
    }

    public void setDepartment(Short department) {
        this.department = department;
    }

    public Short getCompanyProvince() {
        return companyProvince;
    }

    public void setCompanyProvince(Short companyProvince) {
        this.companyProvince = companyProvince;
    }

    public Short getCompanyCity() {
        return companyCity;
    }

    public void setCompanyCity(Short companyCity) {
        this.companyCity = companyCity;
    }

    public Short getCompanyDistrict() {
        return companyDistrict;
    }

    public void setCompanyDistrict(Short companyDistrict) {
        this.companyDistrict = companyDistrict;
    }

    public Short getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Short numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public Short getCompanyIndustry() {
        return companyIndustry;
    }

    public void setCompanyIndustry(Short companyIndustry) {
        this.companyIndustry = companyIndustry;
    }

    public Short getCompanyType() {
        return companyType;
    }

    public void setCompanyType(Short companyType) {
        this.companyType = companyType;
    }

    public Character getSubscribe() {
        return subscribe;
    }

    public void setSubscribe(Character subscribe) {
        this.subscribe = subscribe;
    }

    public boolean isSubscribe() {
        if (AccountConstant.YES.equals(subscribe)) {
            return true;
        }
        return false;
    }
}
