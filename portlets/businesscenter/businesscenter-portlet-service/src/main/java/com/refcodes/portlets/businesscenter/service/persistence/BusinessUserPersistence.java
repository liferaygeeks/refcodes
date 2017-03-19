package com.refcodes.portlets.businesscenter.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.refcodes.portlets.businesscenter.model.BusinessUser;

/**
 * The persistence interface for the business user service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BusinessUserPersistenceImpl
 * @see BusinessUserUtil
 * @generated
 */
public interface BusinessUserPersistence extends BasePersistence<BusinessUser> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link BusinessUserUtil} to access the business user persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the business users where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching business users
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.refcodes.portlets.businesscenter.model.BusinessUser> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the business users where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.refcodes.portlets.businesscenter.model.impl.BusinessUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of business users
    * @param end the upper bound of the range of business users (not inclusive)
    * @return the range of matching business users
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.refcodes.portlets.businesscenter.model.BusinessUser> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the business users where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.refcodes.portlets.businesscenter.model.impl.BusinessUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of business users
    * @param end the upper bound of the range of business users (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching business users
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.refcodes.portlets.businesscenter.model.BusinessUser> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first business user in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching business user
    * @throws com.refcodes.portlets.businesscenter.NoSuchBusinessUserException if a matching business user could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.refcodes.portlets.businesscenter.model.BusinessUser findByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.refcodes.portlets.businesscenter.NoSuchBusinessUserException;

    /**
    * Returns the first business user in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching business user, or <code>null</code> if a matching business user could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.refcodes.portlets.businesscenter.model.BusinessUser fetchByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last business user in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching business user
    * @throws com.refcodes.portlets.businesscenter.NoSuchBusinessUserException if a matching business user could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.refcodes.portlets.businesscenter.model.BusinessUser findByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.refcodes.portlets.businesscenter.NoSuchBusinessUserException;

    /**
    * Returns the last business user in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching business user, or <code>null</code> if a matching business user could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.refcodes.portlets.businesscenter.model.BusinessUser fetchByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the business users before and after the current business user in the ordered set where uuid = &#63;.
    *
    * @param businessUserId the primary key of the current business user
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next business user
    * @throws com.refcodes.portlets.businesscenter.NoSuchBusinessUserException if a business user with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.refcodes.portlets.businesscenter.model.BusinessUser[] findByUuid_PrevAndNext(
        long businessUserId, java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.refcodes.portlets.businesscenter.NoSuchBusinessUserException;

    /**
    * Removes all the business users where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of business users where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching business users
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the business user where uuid = &#63; and groupId = &#63; or throws a {@link com.refcodes.portlets.businesscenter.NoSuchBusinessUserException} if it could not be found.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching business user
    * @throws com.refcodes.portlets.businesscenter.NoSuchBusinessUserException if a matching business user could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.refcodes.portlets.businesscenter.model.BusinessUser findByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.refcodes.portlets.businesscenter.NoSuchBusinessUserException;

    /**
    * Returns the business user where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching business user, or <code>null</code> if a matching business user could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.refcodes.portlets.businesscenter.model.BusinessUser fetchByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the business user where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching business user, or <code>null</code> if a matching business user could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.refcodes.portlets.businesscenter.model.BusinessUser fetchByUUID_G(
        java.lang.String uuid, long groupId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the business user where uuid = &#63; and groupId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the business user that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.refcodes.portlets.businesscenter.model.BusinessUser removeByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.refcodes.portlets.businesscenter.NoSuchBusinessUserException;

    /**
    * Returns the number of business users where uuid = &#63; and groupId = &#63;.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the number of matching business users
    * @throws SystemException if a system exception occurred
    */
    public int countByUUID_G(java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the business users where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the matching business users
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.refcodes.portlets.businesscenter.model.BusinessUser> findByUuid_C(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the business users where uuid = &#63; and companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.refcodes.portlets.businesscenter.model.impl.BusinessUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param start the lower bound of the range of business users
    * @param end the upper bound of the range of business users (not inclusive)
    * @return the range of matching business users
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.refcodes.portlets.businesscenter.model.BusinessUser> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the business users where uuid = &#63; and companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.refcodes.portlets.businesscenter.model.impl.BusinessUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param start the lower bound of the range of business users
    * @param end the upper bound of the range of business users (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching business users
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.refcodes.portlets.businesscenter.model.BusinessUser> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first business user in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching business user
    * @throws com.refcodes.portlets.businesscenter.NoSuchBusinessUserException if a matching business user could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.refcodes.portlets.businesscenter.model.BusinessUser findByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.refcodes.portlets.businesscenter.NoSuchBusinessUserException;

    /**
    * Returns the first business user in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching business user, or <code>null</code> if a matching business user could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.refcodes.portlets.businesscenter.model.BusinessUser fetchByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last business user in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching business user
    * @throws com.refcodes.portlets.businesscenter.NoSuchBusinessUserException if a matching business user could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.refcodes.portlets.businesscenter.model.BusinessUser findByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.refcodes.portlets.businesscenter.NoSuchBusinessUserException;

    /**
    * Returns the last business user in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching business user, or <code>null</code> if a matching business user could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.refcodes.portlets.businesscenter.model.BusinessUser fetchByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the business users before and after the current business user in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param businessUserId the primary key of the current business user
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next business user
    * @throws com.refcodes.portlets.businesscenter.NoSuchBusinessUserException if a business user with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.refcodes.portlets.businesscenter.model.BusinessUser[] findByUuid_C_PrevAndNext(
        long businessUserId, java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.refcodes.portlets.businesscenter.NoSuchBusinessUserException;

    /**
    * Removes all the business users where uuid = &#63; and companyId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of business users where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the number of matching business users
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the business user in the entity cache if it is enabled.
    *
    * @param businessUser the business user
    */
    public void cacheResult(
        com.refcodes.portlets.businesscenter.model.BusinessUser businessUser);

    /**
    * Caches the business users in the entity cache if it is enabled.
    *
    * @param businessUsers the business users
    */
    public void cacheResult(
        java.util.List<com.refcodes.portlets.businesscenter.model.BusinessUser> businessUsers);

    /**
    * Creates a new business user with the primary key. Does not add the business user to the database.
    *
    * @param businessUserId the primary key for the new business user
    * @return the new business user
    */
    public com.refcodes.portlets.businesscenter.model.BusinessUser create(
        long businessUserId);

    /**
    * Removes the business user with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param businessUserId the primary key of the business user
    * @return the business user that was removed
    * @throws com.refcodes.portlets.businesscenter.NoSuchBusinessUserException if a business user with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.refcodes.portlets.businesscenter.model.BusinessUser remove(
        long businessUserId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.refcodes.portlets.businesscenter.NoSuchBusinessUserException;

    public com.refcodes.portlets.businesscenter.model.BusinessUser updateImpl(
        com.refcodes.portlets.businesscenter.model.BusinessUser businessUser)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the business user with the primary key or throws a {@link com.refcodes.portlets.businesscenter.NoSuchBusinessUserException} if it could not be found.
    *
    * @param businessUserId the primary key of the business user
    * @return the business user
    * @throws com.refcodes.portlets.businesscenter.NoSuchBusinessUserException if a business user with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.refcodes.portlets.businesscenter.model.BusinessUser findByPrimaryKey(
        long businessUserId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.refcodes.portlets.businesscenter.NoSuchBusinessUserException;

    /**
    * Returns the business user with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param businessUserId the primary key of the business user
    * @return the business user, or <code>null</code> if a business user with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.refcodes.portlets.businesscenter.model.BusinessUser fetchByPrimaryKey(
        long businessUserId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the business users.
    *
    * @return the business users
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.refcodes.portlets.businesscenter.model.BusinessUser> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.refcodes.portlets.businesscenter.model.BusinessUser> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the business users.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.refcodes.portlets.businesscenter.model.impl.BusinessUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of business users
    * @param end the upper bound of the range of business users (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of business users
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.refcodes.portlets.businesscenter.model.BusinessUser> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the business users from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of business users.
    *
    * @return the number of business users
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
