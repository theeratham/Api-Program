package pcc.apitest.apiprogram.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sso_user_test" , catalog = "ssotest")
public class ApiEntity {
    private String ssoType;
    private String systemId;
    private String systemName;
    private String systemTransactions;
    private String systemPrivileges;
    private String systemUserGroup;
    private String systemLocationGroup;
    private String userId;
    private String userFullName;
    private String userRdOfficeCode;
    private String userOfficeCode;
    private String clientLocation;
    private String locationMachineNumber;
    private String tokenId;
    private Date requestDate;

    public ApiEntity() {
        super();
    }

    public ApiEntity(String ssoType, String systemId, String systemName, String systemTransactions, String systemPrivileges, String systemUserGroup, String systemLocationGroup, String userId, String userFullName, String userRdOfficeCode, String userOfficeCode, String clientLocation, String locationMachineNumber, String tokenId, Date requestDate) {
        super();
        this.ssoType = ssoType;
        this.systemId = systemId;
        this.systemName = systemName;
        this.systemTransactions = systemTransactions;
        this.systemPrivileges = systemPrivileges;
        this.systemUserGroup = systemUserGroup;
        this.systemLocationGroup = systemLocationGroup;
        this.userId = userId;
        this.userFullName = userFullName;
        this.userRdOfficeCode = userRdOfficeCode;
        this.userOfficeCode = userOfficeCode;
        this.clientLocation = clientLocation;
        this.locationMachineNumber = locationMachineNumber;
        this.tokenId = tokenId;
        this.requestDate = requestDate;
    }

    @Column(name = "ssotype" , length = 50)
    public String getSsoType() {
        return ssoType;
    }

    public void setSsoType(String ssoType) {
        this.ssoType = ssoType;
    }

    @Column(name = "systemid" , length = 50)
    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    @Column(name = "systemname" , length = 250)
    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    @Column(name = "systemtransactions" , length = 250)
    public String getSystemTransactions() {
        return systemTransactions;
    }

    public void setSystemTransactions(String systemTransactions) {
        this.systemTransactions = systemTransactions;
    }

    @Column(name = "systemprivileges" , length = 250)
    public String getSystemPrivileges() {
        return systemPrivileges;
    }

    public void setSystemPrivileges(String systemPrivileges) {
        this.systemPrivileges = systemPrivileges;
    }

    @Column(name = "systemusergroup" , length = 50)
    public String getSystemUserGroup() {
        return systemUserGroup;
    }

    public void setSystemUserGroup(String systemUserGroup) {
        this.systemUserGroup = systemUserGroup;
    }

    @Column(name = "systemlocationgroup" , length = 50)
    public String getSystemLocationGroup() {
        return systemLocationGroup;
    }

    public void setSystemLocationGroup(String systemLocationGroup) {
        this.systemLocationGroup = systemLocationGroup;
    }

    @Column(name = "userid" , length = 200)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Column(name = "userfullname" , length = 500)
    public String getUserFullName() {
        return userFullName;
    }

    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    @Column(name = "userrdofficecode" , length = 250)
    public String getUserRdOfficeCode() {
        return userRdOfficeCode;
    }

    public void setUserRdOfficeCode(String userRdOfficeCode) {
        this.userRdOfficeCode = userRdOfficeCode;
    }

    @Column(name = "userofficecode" , length = 250)
    public String getUserOfficeCode() {
        return userOfficeCode;
    }

    public void setUserOfficeCode(String userOfficeCode) {
        this.userOfficeCode = userOfficeCode;
    }

    @Column(name = "clientlocation" , length = 250)
    public String getClientLocation() {
        return clientLocation;
    }

    public void setClientLocation(String clientLocation) {
        this.clientLocation = clientLocation;
    }

    @Column(name = "locationmachinenumber" , length = 500)
    public String getLocationMachineNumber() {
        return locationMachineNumber;
    }

    public void setLocationMachineNumber(String locationMachineNumber) {
        this.locationMachineNumber = locationMachineNumber;
    }

    @Column(name = "tokenid" , length = 1000)
    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    @Id
    @Column(name = "request_date" , nullable = false)
    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }
}
