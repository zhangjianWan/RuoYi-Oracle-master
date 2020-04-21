package com.ruoyi.shiyan.domain;

import java.util.Date;

/**
 * @Author zhangjian
 * @Description //TODO 站点信息
 * @Date 16:46 2020/3/24
 **/
public class TbSewagePlabt {
    private Short id;

    private String oid;

    private String poid;

    private String waterName;

    private String waterCode;

    private String waterType;

    private String waterLng;

    private String waterLat;

    private String detailedLocation;

    private String operatingUnitCode;

    private String rankCode;

    private String kpiSort;

    private Date loadTime;

    private String deleteFlag;

    private String waterTypeName;

    private String area;

    private String industryCategory;

    private String corporateCode;

    private String officePhone;

    private String onlineOrNot;

    private String isDiscontinued;

    private String enterpriseType;

    private String corporateName;

    private String enterpriseNet;

    private String contactPerson;

    private String mobilePhone;

    private Date streamTime;

    private String emailAdress;

    private String postalCode;

    private String fax;

    private String operatingStatus;

    private String alarmMethod;

    private String isSewagePlant;

    private String isLandfill;

    private String designCapability;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid == null ? null : oid.trim();
    }

    public String getPoid() {
        return poid;
    }

    public void setPoid(String poid) {
        this.poid = poid == null ? null : poid.trim();
    }

    public String getWaterName() {
        return waterName;
    }

    public void setWaterName(String waterName) {
        this.waterName = waterName == null ? null : waterName.trim();
    }

    public String getWaterCode() {
        return waterCode;
    }

    public void setWaterCode(String waterCode) {
        this.waterCode = waterCode == null ? null : waterCode.trim();
    }

    public String getWaterType() {
        return waterType;
    }

    public void setWaterType(String waterType) {
        this.waterType = waterType == null ? null : waterType.trim();
    }

    public String getWaterLng() {
        return waterLng;
    }

    public void setWaterLng(String waterLng) {
        this.waterLng = waterLng == null ? null : waterLng.trim();
    }

    public String getWaterLat() {
        return waterLat;
    }

    public void setWaterLat(String waterLat) {
        this.waterLat = waterLat == null ? null : waterLat.trim();
    }

    public String getDetailedLocation() {
        return detailedLocation;
    }

    public void setDetailedLocation(String detailedLocation) {
        this.detailedLocation = detailedLocation == null ? null : detailedLocation.trim();
    }

    public String getOperatingUnitCode() {
        return operatingUnitCode;
    }

    public void setOperatingUnitCode(String operatingUnitCode) {
        this.operatingUnitCode = operatingUnitCode == null ? null : operatingUnitCode.trim();
    }

    public String getRankCode() {
        return rankCode;
    }

    public void setRankCode(String rankCode) {
        this.rankCode = rankCode == null ? null : rankCode.trim();
    }

    public String getKpiSort() {
        return kpiSort;
    }

    public void setKpiSort(String kpiSort) {
        this.kpiSort = kpiSort == null ? null : kpiSort.trim();
    }

    public Date getLoadTime() {
        return loadTime;
    }

    public void setLoadTime(Date loadTime) {
        this.loadTime = loadTime;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag == null ? null : deleteFlag.trim();
    }

    public String getWaterTypeName() {
        return waterTypeName;
    }

    public void setWaterTypeName(String waterTypeName) {
        this.waterTypeName = waterTypeName == null ? null : waterTypeName.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getIndustryCategory() {
        return industryCategory;
    }

    public void setIndustryCategory(String industryCategory) {
        this.industryCategory = industryCategory == null ? null : industryCategory.trim();
    }

    public String getCorporateCode() {
        return corporateCode;
    }

    public void setCorporateCode(String corporateCode) {
        this.corporateCode = corporateCode == null ? null : corporateCode.trim();
    }

    public String getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone == null ? null : officePhone.trim();
    }

    public String getOnlineOrNot() {
        return onlineOrNot;
    }

    public void setOnlineOrNot(String onlineOrNot) {
        this.onlineOrNot = onlineOrNot == "0" ? "否" : "是";
    }

    public String getIsDiscontinued() {
        return isDiscontinued;
    }

    public void setIsDiscontinued(String isDiscontinued) {
        this.isDiscontinued = isDiscontinued == "1" ? "是" : "否";
    }

    public String getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(String enterpriseType) {
        this.enterpriseType = enterpriseType == null ? null : enterpriseType.trim();
    }

    public String getCorporateName() {
        return corporateName;
    }

    public void setCorporateName(String corporateName) {
        this.corporateName = corporateName == null ? null : corporateName.trim();
    }

    public String getEnterpriseNet() {
        return enterpriseNet;
    }

    public void setEnterpriseNet(String enterpriseNet) {
        this.enterpriseNet = enterpriseNet == null ? null : enterpriseNet.trim();
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson == null ? null : contactPerson.trim();
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone == null ? null : mobilePhone.trim();
    }

    public Date getStreamTime() {
        return streamTime;
    }

    public void setStreamTime(Date streamTime) {
        this.streamTime = streamTime;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress == null ? null : emailAdress.trim();
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode == null ? null : postalCode.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getOperatingStatus() {
        return operatingStatus;
    }

    public void setOperatingStatus(String operatingStatus) {
        this.operatingStatus = operatingStatus == null ? null : operatingStatus.trim();
    }

    public String getAlarmMethod() {
        return alarmMethod;
    }

    public void setAlarmMethod(String alarmMethod) {
        this.alarmMethod = alarmMethod == null ? null : alarmMethod.trim();
    }

    public String getIsSewagePlant() {
        return isSewagePlant;
    }

    public void setIsSewagePlant(String isSewagePlant) {
        this.isSewagePlant = isSewagePlant == null ? null : isSewagePlant.trim();
    }

    public String getDesignCapability() {
        return designCapability;
    }

    public void setDesignCapability(String designCapability) {
        this.designCapability = designCapability == null ? null : designCapability.trim();
    }

    public String getIsLandfill() {
        return isLandfill;
    }

    public void setIsLandfill(String isLandfill) {
        this.isLandfill = isLandfill;
    }

    @Override
    public String toString() {
        return "TbSewagePlabt{" +
                "id=" + id +
                ", oid='" + oid + '\'' +
                ", poid='" + poid + '\'' +
                ", waterName='" + waterName + '\'' +
                ", waterCode='" + waterCode + '\'' +
                ", waterType='" + waterType + '\'' +
                ", waterLng='" + waterLng + '\'' +
                ", waterLat='" + waterLat + '\'' +
                ", detailedLocation='" + detailedLocation + '\'' +
                ", operatingUnitCode='" + operatingUnitCode + '\'' +
                ", rankCode='" + rankCode + '\'' +
                ", kpiSort='" + kpiSort + '\'' +
                ", loadTime=" + loadTime +
                ", deleteFlag='" + deleteFlag + '\'' +
                ", waterTypeName='" + waterTypeName + '\'' +
                ", area='" + area + '\'' +
                ", industryCategory='" + industryCategory + '\'' +
                ", corporateCode='" + corporateCode + '\'' +
                ", officePhone='" + officePhone + '\'' +
                ", onlineOrNot='" + onlineOrNot + '\'' +
                ", isDiscontinued='" + isDiscontinued + '\'' +
                ", enterpriseType='" + enterpriseType + '\'' +
                ", corporateName='" + corporateName + '\'' +
                ", enterpriseNet='" + enterpriseNet + '\'' +
                ", contactPerson='" + contactPerson + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", streamTime=" + streamTime +
                ", emailAdress='" + emailAdress + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", fax='" + fax + '\'' +
                ", operatingStatus='" + operatingStatus + '\'' +
                ", alarmMethod='" + alarmMethod + '\'' +
                ", isSewagePlant='" + isSewagePlant + '\'' +
                ", isLandfill='" + isLandfill + '\'' +
                ", designCapability='" + designCapability + '\'' +
                '}';
    }
}