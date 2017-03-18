package com.refcodes.portlets.businesscenter.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class BusinessUserSoap implements Serializable {
    private String _uuid;
    private long _businessUserId;
    private long _groupId;
    private long _companyId;
    private String _firstName;
    private String _lastName;
    private String _email;
    private String _ownerShip;
    private long _categoryId;
    private String _phoneNumber;
    private Date _createdDate;
    private long _createdBy;
    private Date _updatedDate;
    private long _updatedBy;

    public BusinessUserSoap() {
    }

    public static BusinessUserSoap toSoapModel(BusinessUser model) {
        BusinessUserSoap soapModel = new BusinessUserSoap();

        soapModel.setUuid(model.getUuid());
        soapModel.setBusinessUserId(model.getBusinessUserId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setFirstName(model.getFirstName());
        soapModel.setLastName(model.getLastName());
        soapModel.setEmail(model.getEmail());
        soapModel.setOwnerShip(model.getOwnerShip());
        soapModel.setCategoryId(model.getCategoryId());
        soapModel.setPhoneNumber(model.getPhoneNumber());
        soapModel.setCreatedDate(model.getCreatedDate());
        soapModel.setCreatedBy(model.getCreatedBy());
        soapModel.setUpdatedDate(model.getUpdatedDate());
        soapModel.setUpdatedBy(model.getUpdatedBy());

        return soapModel;
    }

    public static BusinessUserSoap[] toSoapModels(BusinessUser[] models) {
        BusinessUserSoap[] soapModels = new BusinessUserSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static BusinessUserSoap[][] toSoapModels(BusinessUser[][] models) {
        BusinessUserSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new BusinessUserSoap[models.length][models[0].length];
        } else {
            soapModels = new BusinessUserSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static BusinessUserSoap[] toSoapModels(List<BusinessUser> models) {
        List<BusinessUserSoap> soapModels = new ArrayList<BusinessUserSoap>(models.size());

        for (BusinessUser model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new BusinessUserSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _businessUserId;
    }

    public void setPrimaryKey(long pk) {
        setBusinessUserId(pk);
    }

    public String getUuid() {
        return _uuid;
    }

    public void setUuid(String uuid) {
        _uuid = uuid;
    }

    public long getBusinessUserId() {
        return _businessUserId;
    }

    public void setBusinessUserId(long businessUserId) {
        _businessUserId = businessUserId;
    }

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    public long getCompanyId() {
        return _companyId;
    }

    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    public String getFirstName() {
        return _firstName;
    }

    public void setFirstName(String firstName) {
        _firstName = firstName;
    }

    public String getLastName() {
        return _lastName;
    }

    public void setLastName(String lastName) {
        _lastName = lastName;
    }

    public String getEmail() {
        return _email;
    }

    public void setEmail(String email) {
        _email = email;
    }

    public String getOwnerShip() {
        return _ownerShip;
    }

    public void setOwnerShip(String ownerShip) {
        _ownerShip = ownerShip;
    }

    public long getCategoryId() {
        return _categoryId;
    }

    public void setCategoryId(long categoryId) {
        _categoryId = categoryId;
    }

    public String getPhoneNumber() {
        return _phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        _phoneNumber = phoneNumber;
    }

    public Date getCreatedDate() {
        return _createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        _createdDate = createdDate;
    }

    public long getCreatedBy() {
        return _createdBy;
    }

    public void setCreatedBy(long createdBy) {
        _createdBy = createdBy;
    }

    public Date getUpdatedDate() {
        return _updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        _updatedDate = updatedDate;
    }

    public long getUpdatedBy() {
        return _updatedBy;
    }

    public void setUpdatedBy(long updatedBy) {
        _updatedBy = updatedBy;
    }
}
