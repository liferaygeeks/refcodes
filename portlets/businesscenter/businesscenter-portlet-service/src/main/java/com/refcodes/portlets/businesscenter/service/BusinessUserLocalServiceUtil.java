package com.refcodes.portlets.businesscenter.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for BusinessUser. This utility wraps
 * {@link com.refcodes.portlets.businesscenter.service.impl.BusinessUserLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see BusinessUserLocalService
 * @see com.refcodes.portlets.businesscenter.service.base.BusinessUserLocalServiceBaseImpl
 * @see com.refcodes.portlets.businesscenter.service.impl.BusinessUserLocalServiceImpl
 * @generated
 */
public class BusinessUserLocalServiceUtil {
    private static BusinessUserLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.refcodes.portlets.businesscenter.service.impl.BusinessUserLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the business user to the database. Also notifies the appropriate model listeners.
    *
    * @param businessUser the business user
    * @return the business user that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.refcodes.portlets.businesscenter.model.BusinessUser addBusinessUser(
        com.refcodes.portlets.businesscenter.model.BusinessUser businessUser)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addBusinessUser(businessUser);
    }

    /**
    * Creates a new business user with the primary key. Does not add the business user to the database.
    *
    * @param businessUserId the primary key for the new business user
    * @return the new business user
    */
    public static com.refcodes.portlets.businesscenter.model.BusinessUser createBusinessUser(
        long businessUserId) {
        return getService().createBusinessUser(businessUserId);
    }

    /**
    * Deletes the business user with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param businessUserId the primary key of the business user
    * @return the business user that was removed
    * @throws PortalException if a business user with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.refcodes.portlets.businesscenter.model.BusinessUser deleteBusinessUser(
        long businessUserId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteBusinessUser(businessUserId);
    }

    /**
    * Deletes the business user from the database. Also notifies the appropriate model listeners.
    *
    * @param businessUser the business user
    * @return the business user that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.refcodes.portlets.businesscenter.model.BusinessUser deleteBusinessUser(
        com.refcodes.portlets.businesscenter.model.BusinessUser businessUser)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteBusinessUser(businessUser);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
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
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
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
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static com.refcodes.portlets.businesscenter.model.BusinessUser fetchBusinessUser(
        long businessUserId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchBusinessUser(businessUserId);
    }

    /**
    * Returns the business user with the matching UUID and company.
    *
    * @param uuid the business user's UUID
    * @param companyId the primary key of the company
    * @return the matching business user, or <code>null</code> if a matching business user could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.refcodes.portlets.businesscenter.model.BusinessUser fetchBusinessUserByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchBusinessUserByUuidAndCompanyId(uuid, companyId);
    }

    /**
    * Returns the business user matching the UUID and group.
    *
    * @param uuid the business user's UUID
    * @param groupId the primary key of the group
    * @return the matching business user, or <code>null</code> if a matching business user could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.refcodes.portlets.businesscenter.model.BusinessUser fetchBusinessUserByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchBusinessUserByUuidAndGroupId(uuid, groupId);
    }

    /**
    * Returns the business user with the primary key.
    *
    * @param businessUserId the primary key of the business user
    * @return the business user
    * @throws PortalException if a business user with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.refcodes.portlets.businesscenter.model.BusinessUser getBusinessUser(
        long businessUserId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getBusinessUser(businessUserId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static com.refcodes.portlets.businesscenter.model.BusinessUser getBusinessUserByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getBusinessUserByUuidAndCompanyId(uuid, companyId);
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
    public static com.refcodes.portlets.businesscenter.model.BusinessUser getBusinessUserByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getBusinessUserByUuidAndGroupId(uuid, groupId);
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
    public static java.util.List<com.refcodes.portlets.businesscenter.model.BusinessUser> getBusinessUsers(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getBusinessUsers(start, end);
    }

    /**
    * Returns the number of business users.
    *
    * @return the number of business users
    * @throws SystemException if a system exception occurred
    */
    public static int getBusinessUsersCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getBusinessUsersCount();
    }

    /**
    * Updates the business user in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param businessUser the business user
    * @return the business user that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.refcodes.portlets.businesscenter.model.BusinessUser updateBusinessUser(
        com.refcodes.portlets.businesscenter.model.BusinessUser businessUser)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateBusinessUser(businessUser);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static void clearService() {
        _service = null;
    }

    public static BusinessUserLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    BusinessUserLocalService.class.getName());

            if (invokableLocalService instanceof BusinessUserLocalService) {
                _service = (BusinessUserLocalService) invokableLocalService;
            } else {
                _service = new BusinessUserLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(BusinessUserLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(BusinessUserLocalService service) {
    }
}
