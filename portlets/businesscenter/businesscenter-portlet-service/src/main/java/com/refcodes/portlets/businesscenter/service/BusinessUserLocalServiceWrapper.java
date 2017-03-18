package com.refcodes.portlets.businesscenter.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BusinessUserLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see BusinessUserLocalService
 * @generated
 */
public class BusinessUserLocalServiceWrapper implements BusinessUserLocalService,
    ServiceWrapper<BusinessUserLocalService> {
    private BusinessUserLocalService _businessUserLocalService;

    public BusinessUserLocalServiceWrapper(
        BusinessUserLocalService businessUserLocalService) {
        _businessUserLocalService = businessUserLocalService;
    }

    /**
    * Adds the business user to the database. Also notifies the appropriate model listeners.
    *
    * @param businessUser the business user
    * @return the business user that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.refcodes.portlets.businesscenter.model.BusinessUser addBusinessUser(
        com.refcodes.portlets.businesscenter.model.BusinessUser businessUser)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _businessUserLocalService.addBusinessUser(businessUser);
    }

    /**
    * Creates a new business user with the primary key. Does not add the business user to the database.
    *
    * @param businessUserId the primary key for the new business user
    * @return the new business user
    */
    @Override
    public com.refcodes.portlets.businesscenter.model.BusinessUser createBusinessUser(
        long businessUserId) {
        return _businessUserLocalService.createBusinessUser(businessUserId);
    }

    /**
    * Deletes the business user with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param businessUserId the primary key of the business user
    * @return the business user that was removed
    * @throws PortalException if a business user with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.refcodes.portlets.businesscenter.model.BusinessUser deleteBusinessUser(
        long businessUserId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _businessUserLocalService.deleteBusinessUser(businessUserId);
    }

    /**
    * Deletes the business user from the database. Also notifies the appropriate model listeners.
    *
    * @param businessUser the business user
    * @return the business user that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.refcodes.portlets.businesscenter.model.BusinessUser deleteBusinessUser(
        com.refcodes.portlets.businesscenter.model.BusinessUser businessUser)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _businessUserLocalService.deleteBusinessUser(businessUser);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _businessUserLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _businessUserLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.refcodes.portlets.businesscenter.model.impl.BusinessUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _businessUserLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.refcodes.portlets.businesscenter.model.impl.BusinessUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _businessUserLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _businessUserLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _businessUserLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.refcodes.portlets.businesscenter.model.BusinessUser fetchBusinessUser(
        long businessUserId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _businessUserLocalService.fetchBusinessUser(businessUserId);
    }

    /**
    * Returns the business user with the matching UUID and company.
    *
    * @param uuid the business user's UUID
    * @param companyId the primary key of the company
    * @return the matching business user, or <code>null</code> if a matching business user could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.refcodes.portlets.businesscenter.model.BusinessUser fetchBusinessUserByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _businessUserLocalService.fetchBusinessUserByUuidAndCompanyId(uuid,
            companyId);
    }

    /**
    * Returns the business user matching the UUID and group.
    *
    * @param uuid the business user's UUID
    * @param groupId the primary key of the group
    * @return the matching business user, or <code>null</code> if a matching business user could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.refcodes.portlets.businesscenter.model.BusinessUser fetchBusinessUserByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _businessUserLocalService.fetchBusinessUserByUuidAndGroupId(uuid,
            groupId);
    }

    /**
    * Returns the business user with the primary key.
    *
    * @param businessUserId the primary key of the business user
    * @return the business user
    * @throws PortalException if a business user with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.refcodes.portlets.businesscenter.model.BusinessUser getBusinessUser(
        long businessUserId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _businessUserLocalService.getBusinessUser(businessUserId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _businessUserLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns the business user with the matching UUID and company.
    *
    * @param uuid the business user's UUID
    * @param companyId the primary key of the company
    * @return the matching business user
    * @throws PortalException if a matching business user could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.refcodes.portlets.businesscenter.model.BusinessUser getBusinessUserByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _businessUserLocalService.getBusinessUserByUuidAndCompanyId(uuid,
            companyId);
    }

    /**
    * Returns the business user matching the UUID and group.
    *
    * @param uuid the business user's UUID
    * @param groupId the primary key of the group
    * @return the matching business user
    * @throws PortalException if a matching business user could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.refcodes.portlets.businesscenter.model.BusinessUser getBusinessUserByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _businessUserLocalService.getBusinessUserByUuidAndGroupId(uuid,
            groupId);
    }

    /**
    * Returns a range of all the business users.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.refcodes.portlets.businesscenter.model.impl.BusinessUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of business users
    * @param end the upper bound of the range of business users (not inclusive)
    * @return the range of business users
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.refcodes.portlets.businesscenter.model.BusinessUser> getBusinessUsers(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _businessUserLocalService.getBusinessUsers(start, end);
    }

    /**
    * Returns the number of business users.
    *
    * @return the number of business users
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getBusinessUsersCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _businessUserLocalService.getBusinessUsersCount();
    }

    /**
    * Updates the business user in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param businessUser the business user
    * @return the business user that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.refcodes.portlets.businesscenter.model.BusinessUser updateBusinessUser(
        com.refcodes.portlets.businesscenter.model.BusinessUser businessUser)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _businessUserLocalService.updateBusinessUser(businessUser);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _businessUserLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _businessUserLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _businessUserLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public BusinessUserLocalService getWrappedBusinessUserLocalService() {
        return _businessUserLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedBusinessUserLocalService(
        BusinessUserLocalService businessUserLocalService) {
        _businessUserLocalService = businessUserLocalService;
    }

    @Override
    public BusinessUserLocalService getWrappedService() {
        return _businessUserLocalService;
    }

    @Override
    public void setWrappedService(
        BusinessUserLocalService businessUserLocalService) {
        _businessUserLocalService = businessUserLocalService;
    }
}
