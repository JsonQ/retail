package com.bigzone.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

public class AccountEntity {
    private int    accountId   ;  //账号ID
    private String account     ;  //账号
    private String name        ;  //姓名
    private int    compId      ;  //公司ID
    private String compCode    ;  //公司编码
    private String compName    ;  //公司名称
    private int    pryAccountId;  //主账号ID
    private String pryAccount  ;  //主账号
    private String pryAcctName ;  //主账号姓名
    private int    sex         ;  //性别 1.先生 2.女士
    private int    roleId;
    private String roleCode;
    private String roleName;
    private int    storeId;
    private String storeCode;
    private String storeName;
    @JsonIgnore
    private String password    ;  //密码
    private String position    ;  //职位
    private String phone      ;  //手机号码
    private String wechat      ;  //微信号
    private String email       ;  //邮箱
    private int    type        ;  //账户类型 0.平台工作人员 1.工厂用户 2.经销商用户
    private int    status      ;  //账号状态
    private Date   startDate   ;  //账号有效期起
    private Date   endDate     ;  //账号有效期止
    private int    standard    ;  //计费标准 1.按月度 2.按季度 3.按年度
    private String mode        ;  //修改密码方式
    private String resBrand    ;  //负责品牌
    private String resSeries   ;  //负责系列
    private String resArea     ;  //负责区域
    private int    loginCount	   ;  //登陆次数
    private Date   lockedDate	   ;  //锁定日期
    private Date   lastLoginDate ;  //最后登录时间
    private Date   lastActionTime;  //最后与服务器交互的时间（用于API接口）

    //平台用户字段
    private String Department	; //部门
    private int isView	; //1.是 ；0.否；  1表示经销商子账户可以查看单价、建议零售价

    private int userType ;		//平台工作人员的Type

    private int compStatus     ; //工厂或经销商企业资料审核状态

    //登录人所属工厂或经销商名称
    private String fullName;
    private int isViewMess;
    private int IscontrolAgcy;



    public int getIscontrolAgcy() { return IscontrolAgcy; }
    public void setIscontrolAgcy(int iscontrolAgcy) { IscontrolAgcy = iscontrolAgcy; }
    public int getIsViewMess() { return isViewMess; }
    public void setIsViewMess(int isViewMess) { this.isViewMess = isViewMess; }
    public int getAccountId() {
        return accountId;
    }
    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }
    public String getAccount() {
        return account;
    }
    public void setAccount(String account) {
        this.account = account;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCompId() {
        return compId;
    }
    public void setCompId(int compId) {
        this.compId = compId;
    }
    public String getCompCode() {
        return compCode;
    }
    public void setCompCode(String compCode) {
        this.compCode = compCode;
    }
    public String getCompName() {
        return compName;
    }
    public void setCompName(String compName) {
        this.compName = compName;
    }
    public int getPryAccountId() {
        return pryAccountId;
    }
    public void setPryAccountId(int pryAccountId) {
        this.pryAccountId = pryAccountId;
    }
    public String getPryAccount() {
        return pryAccount;
    }
    public void setPryAccount(String pryAccount) {
        this.pryAccount = pryAccount;
    }
    public String getPryAcctName() {
        return pryAcctName;
    }
    public void setPryAcctName(String pryAcctName) {
        this.pryAcctName = pryAcctName;
    }
    public int getSex() {
        return sex;
    }
    public void setSex(int sex) {
        this.sex = sex;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getWechat() {
        return wechat;
    }
    public void setWechat(String wechat) {
        this.wechat = wechat;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getType() {
        return type;
    }
    public void setType(int type) {
        this.type = type;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getEndDate() {
        return endDate;
    }
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    public int getStandard() {
        return standard;
    }
    public void setStandard(int standard) {
        this.standard = standard;
    }
    public String getMode() {
        return mode;
    }
    public void setMode(String mode) {
        this.mode = mode;
    }
    public String getResBrand() {
        return resBrand;
    }
    public void setResBrand(String resBrand) {
        this.resBrand = resBrand;
    }
    public String getResSeries() {
        return resSeries;
    }
    public void setResSeries(String resSeries) {
        this.resSeries = resSeries;
    }
    public String getResArea() {
        return resArea;
    }
    public void setResArea(String resArea) {
        this.resArea = resArea;
    }
    public int getLoginCount() {
        return loginCount;
    }
    public void setLoginCount(int loginCount) {
        this.loginCount = loginCount;
    }
    public Date getLockedDate() {
        return lockedDate;
    }
    public void setLockedDate(Date lockedDate) {
        this.lockedDate = lockedDate;
    }
    public Date getLastLoginDate() {
        return lastLoginDate;
    }
    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }
    public String getDepartment() {
        return Department;
    }
    public void setDepartment(String department) {
        Department = department;
    }
    public int getUserType() {
        return userType;
    }
    public void setUserType(int userType) {
        this.userType = userType;
    }
    public Date getLastActionTime() {
        return lastActionTime;
    }
    public void setLastActionTime(Date lastActionTime) {
        this.lastActionTime = lastActionTime;
    }
    public int getCompStatus() {
        return compStatus;
    }
    public void setCompStatus(int compStatus) {
        this.compStatus = compStatus;
    }
    public String getfullName() {
        return fullName;
    }
    public void setfullName(String fullName) {
        this.fullName = fullName;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public String getStoreCode() {
        return storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
    public int getIsView() {
        return isView;
    }
    public void setIsView(int isView) {
        this.isView = isView;
    }

}
