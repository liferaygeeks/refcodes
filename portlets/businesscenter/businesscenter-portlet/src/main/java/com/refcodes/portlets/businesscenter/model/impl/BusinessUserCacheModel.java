package com.refcodes.portlets.businesscenter.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.refcodes.portlets.businesscenter.model.BusinessUser;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing BusinessUser in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see BusinessUser
 * @generated
 */
public class BusinessUserCacheModel implements CacheModel<BusinessUser>,
    Externalizable {
    public String uuid;
    public long businessUserId;
    public long groupId;
    public long companyId;
    public String firstName;
    public String lastName;
    public String email;
    public String ownerShip;
    public long categoryId;
    public String phoneNumber;
    public long createdDate;
    public long createdBy;
    public long updatedDate;
    public long updatedBy;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(29);

        sb.append("{uuid=");
        sb.append(uuid);
        sb.append(", businessUserId=");
        sb.append(businessUserId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", firstName=");
        sb.append(firstName);
        sb.append(", lastName=");
        sb.append(lastName);
        sb.append(", email=");
        sb.append(email);
        sb.append(", ownerShip=");
        sb.append(ownerShip);
        sb.append(", categoryId=");
        sb.append(categoryId);
        sb.append(", phoneNumber=");
        sb.append(phoneNumber);
        sb.append(", createdDate=");
        sb.append(createdDate);
        sb.append(", createdBy=");
        sb.append(createdBy);
        sb.append(", updatedDate=");
        sb.append(updatedDate);
        sb.append(", updatedBy=");
        sb.append(updatedBy);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public BusinessUser toEntityModel() {
        BusinessUserImpl businessUserImpl = new BusinessUserImpl();

        if (uuid == null) {
            businessUserImpl.setUuid(StringPool.BLANK);
        } else {
            businessUserImpl.setUuid(uuid);
        }

        businessUserImpl.setBusinessUserId(businessUserId);
        businessUserImpl.setGroupId(groupId);
        businessUserImpl.setCompanyId(companyId);

        if (firstName == null) {
            businessUserImpl.setFirstName(StringPool.BLANK);
        } else {
            businessUserImpl.setFirstName(firstName);
        }

        if (lastName == null) {
            businessUserImpl.setLastName(StringPool.BLANK);
        } else {
            businessUserImpl.setLastName(lastName);
        }

        if (email == null) {
            businessUserImpl.setEmail(StringPool.BLANK);
        } else {
            businessUserImpl.setEmail(email);
        }

        if (ownerShip == null) {
            businessUserImpl.setOwnerShip(StringPool.BLANK);
        } else {
            businessUserImpl.setOwnerShip(ownerShip);
        }

        businessUserImpl.setCategoryId(categoryId);

        if (phoneNumber == null) {
            businessUserImpl.setPhoneNumber(StringPool.BLANK);
        } else {
            businessUserImpl.setPhoneNumber(phoneNumber);
        }

        if (createdDate == Long.MIN_VALUE) {
            businessUserImpl.setCreatedDate(null);
        } else {
            businessUserImpl.setCreatedDate(new Date(createdDate));
        }

        businessUserImpl.setCreatedBy(createdBy);

        if (updatedDate == Long.MIN_VALUE) {
            businessUserImpl.setUpdatedDate(null);
        } else {
            businessUserImpl.setUpdatedDate(new Date(updatedDate));
        }

        businessUserImpl.setUpdatedBy(updatedBy);

        businessUserImpl.resetOriginalValues();

        return businessUserImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        uuid = objectInput.readUTF();
        businessUserId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        firstName = objectInput.readUTF();
        lastName = objectInput.readUTF();
        email = objectInput.readUTF();
        ownerShip = objectInput.readUTF();
        categoryId = objectInput.readLong();
        phoneNumber = objectInput.readUTF();
        createdDate = objectInput.readLong();
        createdBy = objectInput.readLong();
        updatedDate = objectInput.readLong();
        updatedBy = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (uuid == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(uuid);
        }

        objectOutput.writeLong(businessUserId);
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(companyId);

        if (firstName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(firstName);
        }

        if (lastName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(lastName);
        }

        if (email == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(email);
        }

        if (ownerShip == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(ownerShip);
        }

        objectOutput.writeLong(categoryId);

        if (phoneNumber == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(phoneNumber);
        }

        objectOutput.writeLong(createdDate);
        objectOutput.writeLong(createdBy);
        objectOutput.writeLong(updatedDate);
        objectOutput.writeLong(updatedBy);
    }
}
