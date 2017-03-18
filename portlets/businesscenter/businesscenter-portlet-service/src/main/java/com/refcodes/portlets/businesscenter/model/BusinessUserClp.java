package com.refcodes.portlets.businesscenter.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.refcodes.portlets.businesscenter.service.BusinessUserLocalServiceUtil;
import com.refcodes.portlets.businesscenter.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class BusinessUserClp extends BaseModelImpl<BusinessUser>
    implements BusinessUser {
    private String _uuid;
    private long _businessUserId;
    private String _businessUserUuid;
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
    private BaseModel<?> _businessUserRemoteModel;

    public BusinessUserClp() {
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
    public long getPrimaryKey() {
        return _businessUserId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setBusinessUserId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _businessUserId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public String getUuid() {
        return _uuid;
    }

    @Override
    public void setUuid(String uuid) {
        _uuid = uuid;

        if (_businessUserRemoteModel != null) {
            try {
                Class<?> clazz = _businessUserRemoteModel.getClass();

                Method method = clazz.getMethod("setUuid", String.class);

                method.invoke(_businessUserRemoteModel, uuid);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getBusinessUserId() {
        return _businessUserId;
    }

    @Override
    public void setBusinessUserId(long businessUserId) {
        _businessUserId = businessUserId;

        if (_businessUserRemoteModel != null) {
            try {
                Class<?> clazz = _businessUserRemoteModel.getClass();

                Method method = clazz.getMethod("setBusinessUserId", long.class);

                method.invoke(_businessUserRemoteModel, businessUserId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getBusinessUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getBusinessUserId(), "uuid",
            _businessUserUuid);
    }

    @Override
    public void setBusinessUserUuid(String businessUserUuid) {
        _businessUserUuid = businessUserUuid;
    }

    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _groupId = groupId;

        if (_businessUserRemoteModel != null) {
            try {
                Class<?> clazz = _businessUserRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_businessUserRemoteModel, groupId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(long companyId) {
        _companyId = companyId;

        if (_businessUserRemoteModel != null) {
            try {
                Class<?> clazz = _businessUserRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_businessUserRemoteModel, companyId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getFirstName() {
        return _firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        _firstName = firstName;

        if (_businessUserRemoteModel != null) {
            try {
                Class<?> clazz = _businessUserRemoteModel.getClass();

                Method method = clazz.getMethod("setFirstName", String.class);

                method.invoke(_businessUserRemoteModel, firstName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getLastName() {
        return _lastName;
    }

    @Override
    public void setLastName(String lastName) {
        _lastName = lastName;

        if (_businessUserRemoteModel != null) {
            try {
                Class<?> clazz = _businessUserRemoteModel.getClass();

                Method method = clazz.getMethod("setLastName", String.class);

                method.invoke(_businessUserRemoteModel, lastName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getEmail() {
        return _email;
    }

    @Override
    public void setEmail(String email) {
        _email = email;

        if (_businessUserRemoteModel != null) {
            try {
                Class<?> clazz = _businessUserRemoteModel.getClass();

                Method method = clazz.getMethod("setEmail", String.class);

                method.invoke(_businessUserRemoteModel, email);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getOwnerShip() {
        return _ownerShip;
    }

    @Override
    public void setOwnerShip(String ownerShip) {
        _ownerShip = ownerShip;

        if (_businessUserRemoteModel != null) {
            try {
                Class<?> clazz = _businessUserRemoteModel.getClass();

                Method method = clazz.getMethod("setOwnerShip", String.class);

                method.invoke(_businessUserRemoteModel, ownerShip);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getCategoryId() {
        return _categoryId;
    }

    @Override
    public void setCategoryId(long categoryId) {
        _categoryId = categoryId;

        if (_businessUserRemoteModel != null) {
            try {
                Class<?> clazz = _businessUserRemoteModel.getClass();

                Method method = clazz.getMethod("setCategoryId", long.class);

                method.invoke(_businessUserRemoteModel, categoryId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPhoneNumber() {
        return _phoneNumber;
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        _phoneNumber = phoneNumber;

        if (_businessUserRemoteModel != null) {
            try {
                Class<?> clazz = _businessUserRemoteModel.getClass();

                Method method = clazz.getMethod("setPhoneNumber", String.class);

                method.invoke(_businessUserRemoteModel, phoneNumber);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getCreatedDate() {
        return _createdDate;
    }

    @Override
    public void setCreatedDate(Date createdDate) {
        _createdDate = createdDate;

        if (_businessUserRemoteModel != null) {
            try {
                Class<?> clazz = _businessUserRemoteModel.getClass();

                Method method = clazz.getMethod("setCreatedDate", Date.class);

                method.invoke(_businessUserRemoteModel, createdDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getCreatedBy() {
        return _createdBy;
    }

    @Override
    public void setCreatedBy(long createdBy) {
        _createdBy = createdBy;

        if (_businessUserRemoteModel != null) {
            try {
                Class<?> clazz = _businessUserRemoteModel.getClass();

                Method method = clazz.getMethod("setCreatedBy", long.class);

                method.invoke(_businessUserRemoteModel, createdBy);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getUpdatedDate() {
        return _updatedDate;
    }

    @Override
    public void setUpdatedDate(Date updatedDate) {
        _updatedDate = updatedDate;

        if (_businessUserRemoteModel != null) {
            try {
                Class<?> clazz = _businessUserRemoteModel.getClass();

                Method method = clazz.getMethod("setUpdatedDate", Date.class);

                method.invoke(_businessUserRemoteModel, updatedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getUpdatedBy() {
        return _updatedBy;
    }

    @Override
    public void setUpdatedBy(long updatedBy) {
        _updatedBy = updatedBy;

        if (_businessUserRemoteModel != null) {
            try {
                Class<?> clazz = _businessUserRemoteModel.getClass();

                Method method = clazz.getMethod("setUpdatedBy", long.class);

                method.invoke(_businessUserRemoteModel, updatedBy);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getBusinessUserRemoteModel() {
        return _businessUserRemoteModel;
    }

    public void setBusinessUserRemoteModel(BaseModel<?> businessUserRemoteModel) {
        _businessUserRemoteModel = businessUserRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _businessUserRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_businessUserRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            BusinessUserLocalServiceUtil.addBusinessUser(this);
        } else {
            BusinessUserLocalServiceUtil.updateBusinessUser(this);
        }
    }

    @Override
    public BusinessUser toEscapedModel() {
        return (BusinessUser) ProxyUtil.newProxyInstance(BusinessUser.class.getClassLoader(),
            new Class[] { BusinessUser.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        BusinessUserClp clone = new BusinessUserClp();

        clone.setUuid(getUuid());
        clone.setBusinessUserId(getBusinessUserId());
        clone.setGroupId(getGroupId());
        clone.setCompanyId(getCompanyId());
        clone.setFirstName(getFirstName());
        clone.setLastName(getLastName());
        clone.setEmail(getEmail());
        clone.setOwnerShip(getOwnerShip());
        clone.setCategoryId(getCategoryId());
        clone.setPhoneNumber(getPhoneNumber());
        clone.setCreatedDate(getCreatedDate());
        clone.setCreatedBy(getCreatedBy());
        clone.setUpdatedDate(getUpdatedDate());
        clone.setUpdatedBy(getUpdatedBy());

        return clone;
    }

    @Override
    public int compareTo(BusinessUser businessUser) {
        long primaryKey = businessUser.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof BusinessUserClp)) {
            return false;
        }

        BusinessUserClp businessUser = (BusinessUserClp) obj;

        long primaryKey = businessUser.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(29);

        sb.append("{uuid=");
        sb.append(getUuid());
        sb.append(", businessUserId=");
        sb.append(getBusinessUserId());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", firstName=");
        sb.append(getFirstName());
        sb.append(", lastName=");
        sb.append(getLastName());
        sb.append(", email=");
        sb.append(getEmail());
        sb.append(", ownerShip=");
        sb.append(getOwnerShip());
        sb.append(", categoryId=");
        sb.append(getCategoryId());
        sb.append(", phoneNumber=");
        sb.append(getPhoneNumber());
        sb.append(", createdDate=");
        sb.append(getCreatedDate());
        sb.append(", createdBy=");
        sb.append(getCreatedBy());
        sb.append(", updatedDate=");
        sb.append(getUpdatedDate());
        sb.append(", updatedBy=");
        sb.append(getUpdatedBy());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(46);

        sb.append("<model><model-name>");
        sb.append("com.refcodes.portlets.businesscenter.model.BusinessUser");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>uuid</column-name><column-value><![CDATA[");
        sb.append(getUuid());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>businessUserId</column-name><column-value><![CDATA[");
        sb.append(getBusinessUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>companyId</column-name><column-value><![CDATA[");
        sb.append(getCompanyId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>firstName</column-name><column-value><![CDATA[");
        sb.append(getFirstName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>lastName</column-name><column-value><![CDATA[");
        sb.append(getLastName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>email</column-name><column-value><![CDATA[");
        sb.append(getEmail());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>ownerShip</column-name><column-value><![CDATA[");
        sb.append(getOwnerShip());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>categoryId</column-name><column-value><![CDATA[");
        sb.append(getCategoryId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>phoneNumber</column-name><column-value><![CDATA[");
        sb.append(getPhoneNumber());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>createdDate</column-name><column-value><![CDATA[");
        sb.append(getCreatedDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>createdBy</column-name><column-value><![CDATA[");
        sb.append(getCreatedBy());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>updatedDate</column-name><column-value><![CDATA[");
        sb.append(getUpdatedDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>updatedBy</column-name><column-value><![CDATA[");
        sb.append(getUpdatedBy());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
