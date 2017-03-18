package com.refcodes.portlets.businesscenter.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.refcodes.portlets.businesscenter.model.BusinessUser;
import com.refcodes.portlets.businesscenter.service.BusinessUserLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class BusinessUserActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public BusinessUserActionableDynamicQuery() throws SystemException {
        setBaseLocalService(BusinessUserLocalServiceUtil.getService());
        setClass(BusinessUser.class);

        setClassLoader(com.refcodes.portlets.businesscenter.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("businessUserId");
    }
}
