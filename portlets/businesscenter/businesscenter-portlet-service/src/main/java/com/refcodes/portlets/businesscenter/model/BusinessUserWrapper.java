package com.refcodes.portlets.businesscenter.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link BusinessUser}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BusinessUser
 * @generated
 */
public class BusinessUserWrapper implements BusinessUser,
    ModelWrapper<BusinessUser> {
    private BusinessUser _businessUser;

    public BusinessUserWrapper(BusinessUser businessUser) {
        _businessUser = businessUser;
    }

    @Override
    public Class<?> getModelClass() {
        return BusinessUser.class;
    }

    @Override
    public String getModelClassName() {
        return BusinessUser.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("uuid", getUuid());
        attributes.put("businessUserId", getBusinessUserId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("firstName", getFirstName());
        attributes.put("lastName", getLastName());
        attributes.put("email", getEmail());
        attributes.put("ownerShip", getOwnerShip());
        attributes.put("categoryId", getCategoryId());
        attributes.put("phoneNumber", getPhoneNumber());
        attributes.put("createdDate", getCreatedDate());
        attributes.put("createdBy", getCreatedBy());
        attributes.put("updatedDate", getUpdatedDate());
        attributes.put("updatedBy", getUpdatedBy());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String uuid = (String) attributes.get("uuid");

        if (uuid != null) {
            setUuid(uuid);
        }

        Long businessUserId = (Long) attributes.get("businessUserId");

        if (businessUserId != null) {
            setBusinessUserId(businessUserId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        String firstName = (String) attributes.get("firstName");

        if (firstName != null) {
            setFirstName(firstName);
        }

        String lastName = (String) attributes.get("lastName");

        if (lastName != null) {
            setLastName(lastName);
        }

        String email = (String) attributes.get("email");

        if (email != null) {
            setEmail(email);
        }

        String ownerShip = (String) attributes.get("ownerShip");

        if (ownerShip != null) {
            setOwnerShip(ownerShip);
        }

        Long categoryId = (Long) attributes.get("categoryId");

        if (categoryId != null) {
            setCategoryId(categoryId);
        }

        String phoneNumber = (String) attributes.get("phoneNumber");

        if (phoneNumber != null) {
            setPhoneNumber(phoneNumber);
        }

        Date createdDate = (Date) attributes.get("createdDate");

        if (createdDate != null) {
            setCreatedDate(createdDate);
        }

        Long createdBy = (Long) attributes.get("createdBy");

        if (createdBy != null) {
            setCreatedBy(createdBy);
        }

        Date updatedDate = (Date) attributes.get("updatedDate");

        if (updatedDate != null) {
            setUpdatedDate(updatedDate);
        }

        Long updatedBy = (Long) attributes.get("updatedBy");

        if (updatedBy != null) {
            setUpdatedBy(updatedBy);
        }
    }

    /**
    * Returns the primary key of this business user.
    *
    * @return the primary key of this business user
    */
    @Override
    public long getPrimaryKey() {
        return _businessUser.getPrimaryKey();
    }

    /**
    * Sets the primary key of this business user.
    *
    * @param primaryKey the primary key of this business user
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _businessUser.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the uuid of this business user.
    *
    * @return the uuid of this business user
    */
    @Override
    public java.lang.String getUuid() {
        return _businessUser.getUuid();
    }

    /**
    * Sets the uuid of this business user.
    *
    * @param uuid the uuid of this business user
    */
    @Override
    public void setUuid(java.lang.String uuid) {
        _businessUser.setUuid(uuid);
    }

    /**
    * Returns the business user ID of this business user.
    *
    * @return the business user ID of this business user
    */
    @Override
    public long getBusinessUserId() {
        return _businessUser.getBusinessUserId();
    }

    /**
    * Sets the business user ID of this business user.
    *
    * @param businessUserId the business user ID of this business user
    */
    @Override
    public void setBusinessUserId(long businessUserId) {
        _businessUser.setBusinessUserId(businessUserId);
    }

    /**
    * Returns the business user uuid of this business user.
    *
    * @return the business user uuid of this business user
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getBusinessUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _businessUser.getBusinessUserUuid();
    }

    /**
    * Sets the business user uuid of this business user.
    *
    * @param businessUserUuid the business user uuid of this business user
    */
    @Override
    public void setBusinessUserUuid(java.lang.String businessUserUuid) {
        _businessUser.setBusinessUserUuid(businessUserUuid);
    }

    /**
    * Returns the group ID of this business user.
    *
    * @return the group ID of this business user
    */
    @Override
    public long getGroupId() {
        return _businessUser.getGroupId();
    }

    /**
    * Sets the group ID of this business user.
    *
    * @param groupId the group ID of this business user
    */
    @Override
    public void setGroupId(long groupId) {
        _businessUser.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this business user.
    *
    * @return the company ID of this business user
    */
    @Override
    public long getCompanyId() {
        return _businessUser.getCompanyId();
    }

    /**
    * Sets the company ID of this business user.
    *
    * @param companyId the company ID of this business user
    */
    @Override
    public void setCompanyId(long companyId) {
        _businessUser.setCompanyId(companyId);
    }

    /**
    * Returns the first name of this business user.
    *
    * @return the first name of this business user
    */
    @Override
    public java.lang.String getFirstName() {
        return _businessUser.getFirstName();
    }

    /**
    * Sets the first name of this business user.
    *
    * @param firstName the first name of this business user
    */
    @Override
    public void setFirstName(java.lang.String firstName) {
        _businessUser.setFirstName(firstName);
    }

    /**
    * Returns the last name of this business user.
    *
    * @return the last name of this business user
    */
    @Override
    public java.lang.String getLastName() {
        return _businessUser.getLastName();
    }

    /**
    * Sets the last name of this business user.
    *
    * @param lastName the last name of this business user
    */
    @Override
    public void setLastName(java.lang.String lastName) {
        _businessUser.setLastName(lastName);
    }

    /**
    * Returns the email of this business user.
    *
    * @return the email of this business user
    */
    @Override
    public java.lang.String getEmail() {
        return _businessUser.getEmail();
    }

    /**
    * Sets the email of this business user.
    *
    * @param email the email of this business user
    */
    @Override
    public void setEmail(java.lang.String email) {
        _businessUser.setEmail(email);
    }

    /**
    * Returns the owner ship of this business user.
    *
    * @return the owner ship of this business user
    */
    @Override
    public java.lang.String getOwnerShip() {
        return _businessUser.getOwnerShip();
    }

    /**
    * Sets the owner ship of this business user.
    *
    * @param ownerShip the owner ship of this business user
    */
    @Override
    public void setOwnerShip(java.lang.String ownerShip) {
        _businessUser.setOwnerShip(ownerShip);
    }

    /**
    * Returns the category ID of this business user.
    *
    * @return the category ID of this business user
    */
    @Override
    public long getCategoryId() {
        return _businessUser.getCategoryId();
    }

    /**
    * Sets the category ID of this business user.
    *
    * @param categoryId the category ID of this business user
    */
    @Override
    public void setCategoryId(long categoryId) {
        _businessUser.setCategoryId(categoryId);
    }

    /**
    * Returns the phone number of this business user.
    *
    * @return the phone number of this business user
    */
    @Override
    public java.lang.String getPhoneNumber() {
        return _businessUser.getPhoneNumber();
    }

    /**
    * Sets the phone number of this business user.
    *
    * @param phoneNumber the phone number of this business user
    */
    @Override
    public void setPhoneNumber(java.lang.String phoneNumber) {
        _businessUser.setPhoneNumber(phoneNumber);
    }

    /**
    * Returns the created date of this business user.
    *
    * @return the created date of this business user
    */
    @Override
    public java.util.Date getCreatedDate() {
        return _businessUser.getCreatedDate();
    }

    /**
    * Sets the created date of this business user.
    *
    * @param createdDate the created date of this business user
    */
    @Override
    public void setCreatedDate(java.util.Date createdDate) {
        _businessUser.setCreatedDate(createdDate);
    }

    /**
    * Returns the created by of this business user.
    *
    * @return the created by of this business user
    */
    @Override
    public long getCreatedBy() {
        return _businessUser.getCreatedBy();
    }

    /**
    * Sets the created by of this business user.
    *
    * @param createdBy the created by of this business user
    */
    @Override
    public void setCreatedBy(long createdBy) {
        _businessUser.setCreatedBy(createdBy);
    }

    /**
    * Returns the updated date of this business user.
    *
    * @return the updated date of this business user
    */
    @Override
    public java.util.Date getUpdatedDate() {
        return _businessUser.getUpdatedDate();
    }

    /**
    * Sets the updated date of this business user.
    *
    * @param updatedDate the updated date of this business user
    */
    @Override
    public void setUpdatedDate(java.util.Date updatedDate) {
        _businessUser.setUpdatedDate(updatedDate);
    }

    /**
    * Returns the updated by of this business user.
    *
    * @return the updated by of this business user
    */
    @Override
    public long getUpdatedBy() {
        return _businessUser.getUpdatedBy();
    }

    /**
    * Sets the updated by of this business user.
    *
    * @param updatedBy the updated by of this business user
    */
    @Override
    public void setUpdatedBy(long updatedBy) {
        _businessUser.setUpdatedBy(updatedBy);
    }

    @Override
    public boolean isNew() {
        return _businessUser.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _businessUser.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _businessUser.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _businessUser.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _businessUser.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _businessUser.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _businessUser.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _businessUser.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _businessUser.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _businessUser.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _businessUser.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new BusinessUserWrapper((BusinessUser) _businessUser.clone());
    }

    @Override
    public int compareTo(BusinessUser businessUser) {
        return _businessUser.compareTo(businessUser);
    }

    @Override
    public int hashCode() {
        return _businessUser.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<BusinessUser> toCacheModel() {
        return _businessUser.toCacheModel();
    }

    @Override
    public BusinessUser toEscapedModel() {
        return new BusinessUserWrapper(_businessUser.toEscapedModel());
    }

    @Override
    public BusinessUser toUnescapedModel() {
        return new BusinessUserWrapper(_businessUser.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _businessUser.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _businessUser.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _businessUser.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof BusinessUserWrapper)) {
            return false;
        }

        BusinessUserWrapper businessUserWrapper = (BusinessUserWrapper) obj;

        if (Validator.equals(_businessUser, businessUserWrapper._businessUser)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public BusinessUser getWrappedBusinessUser() {
        return _businessUser;
    }

    @Override
    public BusinessUser getWrappedModel() {
        return _businessUser;
    }

    @Override
    public void resetOriginalValues() {
        _businessUser.resetOriginalValues();
    }
}
