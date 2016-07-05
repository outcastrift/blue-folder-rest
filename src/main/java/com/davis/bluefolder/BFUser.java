package com.davis.bluefolder;

import java.util.Date;

/**
 * This software was created for
 * All rights to this software belong to
 * appropriate licenses and restrictions apply.
 * Created by Samuel Davis on 7/5/16.
 * Class Description
 * Java representation of a Blue Folder User.
 */
public class BFUser {
    //System Information
    private String userType;
    private int allowAPI;
    private int timeZoneOffset;
    private int loginCount;
    private int sendSystemNotifications;
    private int inactive;
    private String timeObserveDST;


    //User Information
    private String lastName;
    private String middleName;
    private String fullName;
    private String displayName;
    private String cultureName;
    private String firstName;
    private String phone;
    private String phoneFax;
    private String userName;
    private String userId;
    private String email;
    private String phoneMobile;
    private String textMsgAddress;
    //Job Information
    private String jobTitle;
    private String defaultLaborTypeID;
    //Home Address
    private String addressHome_City;
    private String addressHome_Street;
    private String addressHome_State;
    private String addressHome_PostalCode;
    private String addressHome_Country;
    //Work Address
    private String addressWork_Street;
    private String addressWork_City;
    private String addressWork_State;
    private String addressWork_PostalCode;
    private String addressWork_Country;

    private Date dateTimeCreated;
    private Date dateLastLogin;

    private Date workHoursStart;
    private Date workHoursEnd;





    public int getAllowAPI() {
        return allowAPI;
    }

    public void setAllowAPI(int allowAPI) {
        this.allowAPI = allowAPI;
    }

    public int getTimeZoneOffset() {
        return timeZoneOffset;
    }

    public void setTimeZoneOffset(int timeZoneOffset) {
        this.timeZoneOffset = timeZoneOffset;
    }

    public int getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(int loginCount) {
        this.loginCount = loginCount;
    }

    public int getSendSystemNotifications() {
        return sendSystemNotifications;
    }

    public void setSendSystemNotifications(int sendSystemNotifications) {
        this.sendSystemNotifications = sendSystemNotifications;
    }

    public int getInactive() {
        return inactive;
    }

    public void setInactive(int inactive) {
        this.inactive = inactive;
    }

    public String getTimeObserveDST() {
        return timeObserveDST;
    }

    public void setTimeObserveDST(String timeObserveDST) {
        this.timeObserveDST = timeObserveDST;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getCultureName() {
        return cultureName;
    }

    public void setCultureName(String cultureName) {
        this.cultureName = cultureName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhoneFax() {
        return phoneFax;
    }

    public void setPhoneFax(String phoneFax) {
        this.phoneFax = phoneFax;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneMobile() {
        return phoneMobile;
    }

    public void setPhoneMobile(String phoneMobile) {
        this.phoneMobile = phoneMobile;
    }

    public String getTextMsgAddress() {
        return textMsgAddress;
    }

    public void setTextMsgAddress(String textMsgAddress) {
        this.textMsgAddress = textMsgAddress;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getDefaultLaborTypeID() {
        return defaultLaborTypeID;
    }

    public void setDefaultLaborTypeID(String defaultLaborTypeID) {
        this.defaultLaborTypeID = defaultLaborTypeID;
    }

    public String getAddressHome_City() {
        return addressHome_City;
    }

    public void setAddressHome_City(String addressHome_City) {
        this.addressHome_City = addressHome_City;
    }

    public String getAddressHome_Street() {
        return addressHome_Street;
    }

    public void setAddressHome_Street(String addressHome_Street) {
        this.addressHome_Street = addressHome_Street;
    }

    public String getAddressHome_State() {
        return addressHome_State;
    }

    public void setAddressHome_State(String addressHome_State) {
        this.addressHome_State = addressHome_State;
    }

    public String getAddressHome_PostalCode() {
        return addressHome_PostalCode;
    }

    public void setAddressHome_PostalCode(String addressHome_PostalCode) {
        this.addressHome_PostalCode = addressHome_PostalCode;
    }

    public String getAddressHome_Country() {
        return addressHome_Country;
    }

    public void setAddressHome_Country(String addressHome_Country) {
        this.addressHome_Country = addressHome_Country;
    }

    public String getAddressWork_Street() {
        return addressWork_Street;
    }

    public void setAddressWork_Street(String addressWork_Street) {
        this.addressWork_Street = addressWork_Street;
    }

    public String getAddressWork_City() {
        return addressWork_City;
    }

    public void setAddressWork_City(String addressWork_City) {
        this.addressWork_City = addressWork_City;
    }

    public String getAddressWork_State() {
        return addressWork_State;
    }

    public void setAddressWork_State(String addressWork_State) {
        this.addressWork_State = addressWork_State;
    }

    public String getAddressWork_PostalCode() {
        return addressWork_PostalCode;
    }

    public void setAddressWork_PostalCode(String addressWork_PostalCode) {
        this.addressWork_PostalCode = addressWork_PostalCode;
    }

    public String getAddressWork_Country() {
        return addressWork_Country;
    }

    public void setAddressWork_Country(String addressWork_Country) {
        this.addressWork_Country = addressWork_Country;
    }

    public Date getDateTimeCreated() {
        return dateTimeCreated;
    }

    public void setDateTimeCreated(Date dateTimeCreated) {
        this.dateTimeCreated = dateTimeCreated;
    }

    public Date getDateLastLogin() {
        return dateLastLogin;
    }

    public void setDateLastLogin(Date dateLastLogin) {
        this.dateLastLogin = dateLastLogin;
    }

    public Date getWorkHoursStart() {
        return workHoursStart;
    }

    public void setWorkHoursStart(Date workHoursStart) {
        this.workHoursStart = workHoursStart;
    }

    public Date getWorkHoursEnd() {
        return workHoursEnd;
    }

    public void setWorkHoursEnd(Date workHoursEnd) {
        this.workHoursEnd = workHoursEnd;
    }


}
