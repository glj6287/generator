package hyoms.model;

import java.util.Date;

public class CUser {
    private Long id;

    private String customerId;

    private String name;

    private String nickName;

    private String imei;

    private String certNo;

    private String mobile;

    private String email;

    private String realStatus;

    private String innerBlackStatus;

    private String blackStatus;

    private String cheatStatus;

    private String pwd;

    private String contactType;

    private String contactName;

    private String contactMobile;

    private String status;

    private String driverLicense;

    private String drivingLicense;

    private Date createDate;

    private Date updateDate;

    private String updateUser;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei == null ? null : imei.trim();
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo == null ? null : certNo.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getRealStatus() {
        return realStatus;
    }

    public void setRealStatus(String realStatus) {
        this.realStatus = realStatus == null ? null : realStatus.trim();
    }

    public String getInnerBlackStatus() {
        return innerBlackStatus;
    }

    public void setInnerBlackStatus(String innerBlackStatus) {
        this.innerBlackStatus = innerBlackStatus == null ? null : innerBlackStatus.trim();
    }

    public String getBlackStatus() {
        return blackStatus;
    }

    public void setBlackStatus(String blackStatus) {
        this.blackStatus = blackStatus == null ? null : blackStatus.trim();
    }

    public String getCheatStatus() {
        return cheatStatus;
    }

    public void setCheatStatus(String cheatStatus) {
        this.cheatStatus = cheatStatus == null ? null : cheatStatus.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getContactType() {
        return contactType;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType == null ? null : contactType.trim();
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }

    public String getContactMobile() {
        return contactMobile;
    }

    public void setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile == null ? null : contactMobile.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense == null ? null : driverLicense.trim();
    }

    public String getDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(String drivingLicense) {
        this.drivingLicense = drivingLicense == null ? null : drivingLicense.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }
}