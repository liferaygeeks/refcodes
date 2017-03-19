package com.refcodes.portlets.businesscenter.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.refcodes.portlets.businesscenter.NoSuchBusinessUserException;
import com.refcodes.portlets.businesscenter.model.BusinessUser;
import com.refcodes.portlets.businesscenter.model.impl.BusinessUserImpl;
import com.refcodes.portlets.businesscenter.model.impl.BusinessUserModelImpl;
import com.refcodes.portlets.businesscenter.service.persistence.BusinessUserPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the business user service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BusinessUserPersistence
 * @see BusinessUserUtil
 * @generated
 */
public class BusinessUserPersistenceImpl extends BasePersistenceImpl<BusinessUser>
    implements BusinessUserPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link BusinessUserUtil} to access the business user persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = BusinessUserImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(BusinessUserModelImpl.ENTITY_CACHE_ENABLED,
            BusinessUserModelImpl.FINDER_CACHE_ENABLED, BusinessUserImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(BusinessUserModelImpl.ENTITY_CACHE_ENABLED,
            BusinessUserModelImpl.FINDER_CACHE_ENABLED, BusinessUserImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(BusinessUserModelImpl.ENTITY_CACHE_ENABLED,
            BusinessUserModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(BusinessUserModelImpl.ENTITY_CACHE_ENABLED,
            BusinessUserModelImpl.FINDER_CACHE_ENABLED, BusinessUserImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(BusinessUserModelImpl.ENTITY_CACHE_ENABLED,
            BusinessUserModelImpl.FINDER_CACHE_ENABLED, BusinessUserImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
            new String[] { String.class.getName() },
            BusinessUserModelImpl.UUID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(BusinessUserModelImpl.ENTITY_CACHE_ENABLED,
            BusinessUserModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_UUID_UUID_1 = "businessUser.uuid IS NULL";
    private static final String _FINDER_COLUMN_UUID_UUID_2 = "businessUser.uuid = ?";
    private static final String _FINDER_COLUMN_UUID_UUID_3 = "(businessUser.uuid IS NULL OR businessUser.uuid = '')";
    public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(BusinessUserModelImpl.ENTITY_CACHE_ENABLED,
            BusinessUserModelImpl.FINDER_CACHE_ENABLED, BusinessUserImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
            new String[] { String.class.getName(), Long.class.getName() },
            BusinessUserModelImpl.UUID_COLUMN_BITMASK |
            BusinessUserModelImpl.GROUPID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(BusinessUserModelImpl.ENTITY_CACHE_ENABLED,
            BusinessUserModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
            new String[] { String.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "businessUser.uuid IS NULL AND ";
    private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "businessUser.uuid = ? AND ";
    private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(businessUser.uuid IS NULL OR businessUser.uuid = '') AND ";
    private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "businessUser.groupId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(BusinessUserModelImpl.ENTITY_CACHE_ENABLED,
            BusinessUserModelImpl.FINDER_CACHE_ENABLED, BusinessUserImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
            new String[] {
                String.class.getName(), Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
        new FinderPath(BusinessUserModelImpl.ENTITY_CACHE_ENABLED,
            BusinessUserModelImpl.FINDER_CACHE_ENABLED, BusinessUserImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
            new String[] { String.class.getName(), Long.class.getName() },
            BusinessUserModelImpl.UUID_COLUMN_BITMASK |
            BusinessUserModelImpl.COMPANYID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(BusinessUserModelImpl.ENTITY_CACHE_ENABLED,
            BusinessUserModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
            new String[] { String.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "businessUser.uuid IS NULL AND ";
    private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "businessUser.uuid = ? AND ";
    private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(businessUser.uuid IS NULL OR businessUser.uuid = '') AND ";
    private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "businessUser.companyId = ?";
    private static final String _SQL_SELECT_BUSINESSUSER = "SELECT businessUser FROM BusinessUser businessUser";
    private static final String _SQL_SELECT_BUSINESSUSER_WHERE = "SELECT businessUser FROM BusinessUser businessUser WHERE ";
    private static final String _SQL_COUNT_BUSINESSUSER = "SELECT COUNT(businessUser) FROM BusinessUser businessUser";
    private static final String _SQL_COUNT_BUSINESSUSER_WHERE = "SELECT COUNT(businessUser) FROM BusinessUser businessUser WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "businessUser.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No BusinessUser exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No BusinessUser exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(BusinessUserPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "uuid"
            });
    private static BusinessUser _nullBusinessUser = new BusinessUserImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<BusinessUser> toCacheModel() {
                return _nullBusinessUserCacheModel;
            }
        };

    private static CacheModel<BusinessUser> _nullBusinessUserCacheModel = new CacheModel<BusinessUser>() {
            @Override
            public BusinessUser toEntityModel() {
                return _nullBusinessUser;
            }
        };

    public BusinessUserPersistenceImpl() {
        setModelClass(BusinessUser.class);
    }

    /**
     * Returns all the business users where uuid = &#63;.
     *
     * @param uuid the uuid
     * @return the matching business users
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BusinessUser> findByUuid(String uuid) throws SystemException {
        return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

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
    @Override
    public List<BusinessUser> findByUuid(String uuid, int start, int end)
        throws SystemException {
        return findByUuid(uuid, start, end, null);
    }

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
    @Override
    public List<BusinessUser> findByUuid(String uuid, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
            finderArgs = new Object[] { uuid };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
            finderArgs = new Object[] { uuid, start, end, orderByComparator };
        }

        List<BusinessUser> list = (List<BusinessUser>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (BusinessUser businessUser : list) {
                if (!Validator.equals(uuid, businessUser.getUuid())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_BUSINESSUSER_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_UUID_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(BusinessUserModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                if (!pagination) {
                    list = (List<BusinessUser>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<BusinessUser>(list);
                } else {
                    list = (List<BusinessUser>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first business user in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching business user
     * @throws com.refcodes.portlets.businesscenter.NoSuchBusinessUserException if a matching business user could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BusinessUser findByUuid_First(String uuid,
        OrderByComparator orderByComparator)
        throws NoSuchBusinessUserException, SystemException {
        BusinessUser businessUser = fetchByUuid_First(uuid, orderByComparator);

        if (businessUser != null) {
            return businessUser;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchBusinessUserException(msg.toString());
    }

    /**
     * Returns the first business user in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching business user, or <code>null</code> if a matching business user could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BusinessUser fetchByUuid_First(String uuid,
        OrderByComparator orderByComparator) throws SystemException {
        List<BusinessUser> list = findByUuid(uuid, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last business user in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching business user
     * @throws com.refcodes.portlets.businesscenter.NoSuchBusinessUserException if a matching business user could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BusinessUser findByUuid_Last(String uuid,
        OrderByComparator orderByComparator)
        throws NoSuchBusinessUserException, SystemException {
        BusinessUser businessUser = fetchByUuid_Last(uuid, orderByComparator);

        if (businessUser != null) {
            return businessUser;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchBusinessUserException(msg.toString());
    }

    /**
     * Returns the last business user in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching business user, or <code>null</code> if a matching business user could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BusinessUser fetchByUuid_Last(String uuid,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByUuid(uuid);

        if (count == 0) {
            return null;
        }

        List<BusinessUser> list = findByUuid(uuid, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

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
    @Override
    public BusinessUser[] findByUuid_PrevAndNext(long businessUserId,
        String uuid, OrderByComparator orderByComparator)
        throws NoSuchBusinessUserException, SystemException {
        BusinessUser businessUser = findByPrimaryKey(businessUserId);

        Session session = null;

        try {
            session = openSession();

            BusinessUser[] array = new BusinessUserImpl[3];

            array[0] = getByUuid_PrevAndNext(session, businessUser, uuid,
                    orderByComparator, true);

            array[1] = businessUser;

            array[2] = getByUuid_PrevAndNext(session, businessUser, uuid,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected BusinessUser getByUuid_PrevAndNext(Session session,
        BusinessUser businessUser, String uuid,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_BUSINESSUSER_WHERE);

        boolean bindUuid = false;

        if (uuid == null) {
            query.append(_FINDER_COLUMN_UUID_UUID_1);
        } else if (uuid.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_UUID_UUID_3);
        } else {
            bindUuid = true;

            query.append(_FINDER_COLUMN_UUID_UUID_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(BusinessUserModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindUuid) {
            qPos.add(uuid);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(businessUser);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<BusinessUser> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the business users where uuid = &#63; from the database.
     *
     * @param uuid the uuid
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByUuid(String uuid) throws SystemException {
        for (BusinessUser businessUser : findByUuid(uuid, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(businessUser);
        }
    }

    /**
     * Returns the number of business users where uuid = &#63;.
     *
     * @param uuid the uuid
     * @return the number of matching business users
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByUuid(String uuid) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

        Object[] finderArgs = new Object[] { uuid };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_BUSINESSUSER_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_UUID_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns the business user where uuid = &#63; and groupId = &#63; or throws a {@link com.refcodes.portlets.businesscenter.NoSuchBusinessUserException} if it could not be found.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the matching business user
     * @throws com.refcodes.portlets.businesscenter.NoSuchBusinessUserException if a matching business user could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BusinessUser findByUUID_G(String uuid, long groupId)
        throws NoSuchBusinessUserException, SystemException {
        BusinessUser businessUser = fetchByUUID_G(uuid, groupId);

        if (businessUser == null) {
            StringBundler msg = new StringBundler(6);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("uuid=");
            msg.append(uuid);

            msg.append(", groupId=");
            msg.append(groupId);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchBusinessUserException(msg.toString());
        }

        return businessUser;
    }

    /**
     * Returns the business user where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the matching business user, or <code>null</code> if a matching business user could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BusinessUser fetchByUUID_G(String uuid, long groupId)
        throws SystemException {
        return fetchByUUID_G(uuid, groupId, true);
    }

    /**
     * Returns the business user where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching business user, or <code>null</code> if a matching business user could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BusinessUser fetchByUUID_G(String uuid, long groupId,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { uuid, groupId };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_UUID_G,
                    finderArgs, this);
        }

        if (result instanceof BusinessUser) {
            BusinessUser businessUser = (BusinessUser) result;

            if (!Validator.equals(uuid, businessUser.getUuid()) ||
                    (groupId != businessUser.getGroupId())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(4);

            query.append(_SQL_SELECT_BUSINESSUSER_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_G_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_G_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_G_UUID_2);
            }

            query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                qPos.add(groupId);

                List<BusinessUser> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
                        finderArgs, list);
                } else {
                    BusinessUser businessUser = list.get(0);

                    result = businessUser;

                    cacheResult(businessUser);

                    if ((businessUser.getUuid() == null) ||
                            !businessUser.getUuid().equals(uuid) ||
                            (businessUser.getGroupId() != groupId)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
                            finderArgs, businessUser);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (BusinessUser) result;
        }
    }

    /**
     * Removes the business user where uuid = &#63; and groupId = &#63; from the database.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the business user that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BusinessUser removeByUUID_G(String uuid, long groupId)
        throws NoSuchBusinessUserException, SystemException {
        BusinessUser businessUser = findByUUID_G(uuid, groupId);

        return remove(businessUser);
    }

    /**
     * Returns the number of business users where uuid = &#63; and groupId = &#63;.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the number of matching business users
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByUUID_G(String uuid, long groupId)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

        Object[] finderArgs = new Object[] { uuid, groupId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_BUSINESSUSER_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_G_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_G_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_G_UUID_2);
            }

            query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                qPos.add(groupId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the business users where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @return the matching business users
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BusinessUser> findByUuid_C(String uuid, long companyId)
        throws SystemException {
        return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

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
    @Override
    public List<BusinessUser> findByUuid_C(String uuid, long companyId,
        int start, int end) throws SystemException {
        return findByUuid_C(uuid, companyId, start, end, null);
    }

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
    @Override
    public List<BusinessUser> findByUuid_C(String uuid, long companyId,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C;
            finderArgs = new Object[] { uuid, companyId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C;
            finderArgs = new Object[] {
                    uuid, companyId,
                    
                    start, end, orderByComparator
                };
        }

        List<BusinessUser> list = (List<BusinessUser>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (BusinessUser businessUser : list) {
                if (!Validator.equals(uuid, businessUser.getUuid()) ||
                        (companyId != businessUser.getCompanyId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(4 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(4);
            }

            query.append(_SQL_SELECT_BUSINESSUSER_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_C_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_C_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_C_UUID_2);
            }

            query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(BusinessUserModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                qPos.add(companyId);

                if (!pagination) {
                    list = (List<BusinessUser>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<BusinessUser>(list);
                } else {
                    list = (List<BusinessUser>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

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
    @Override
    public BusinessUser findByUuid_C_First(String uuid, long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchBusinessUserException, SystemException {
        BusinessUser businessUser = fetchByUuid_C_First(uuid, companyId,
                orderByComparator);

        if (businessUser != null) {
            return businessUser;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(", companyId=");
        msg.append(companyId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchBusinessUserException(msg.toString());
    }

    /**
     * Returns the first business user in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching business user, or <code>null</code> if a matching business user could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BusinessUser fetchByUuid_C_First(String uuid, long companyId,
        OrderByComparator orderByComparator) throws SystemException {
        List<BusinessUser> list = findByUuid_C(uuid, companyId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

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
    @Override
    public BusinessUser findByUuid_C_Last(String uuid, long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchBusinessUserException, SystemException {
        BusinessUser businessUser = fetchByUuid_C_Last(uuid, companyId,
                orderByComparator);

        if (businessUser != null) {
            return businessUser;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(", companyId=");
        msg.append(companyId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchBusinessUserException(msg.toString());
    }

    /**
     * Returns the last business user in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching business user, or <code>null</code> if a matching business user could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BusinessUser fetchByUuid_C_Last(String uuid, long companyId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByUuid_C(uuid, companyId);

        if (count == 0) {
            return null;
        }

        List<BusinessUser> list = findByUuid_C(uuid, companyId, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

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
    @Override
    public BusinessUser[] findByUuid_C_PrevAndNext(long businessUserId,
        String uuid, long companyId, OrderByComparator orderByComparator)
        throws NoSuchBusinessUserException, SystemException {
        BusinessUser businessUser = findByPrimaryKey(businessUserId);

        Session session = null;

        try {
            session = openSession();

            BusinessUser[] array = new BusinessUserImpl[3];

            array[0] = getByUuid_C_PrevAndNext(session, businessUser, uuid,
                    companyId, orderByComparator, true);

            array[1] = businessUser;

            array[2] = getByUuid_C_PrevAndNext(session, businessUser, uuid,
                    companyId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected BusinessUser getByUuid_C_PrevAndNext(Session session,
        BusinessUser businessUser, String uuid, long companyId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_BUSINESSUSER_WHERE);

        boolean bindUuid = false;

        if (uuid == null) {
            query.append(_FINDER_COLUMN_UUID_C_UUID_1);
        } else if (uuid.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_UUID_C_UUID_3);
        } else {
            bindUuid = true;

            query.append(_FINDER_COLUMN_UUID_C_UUID_2);
        }

        query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(BusinessUserModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindUuid) {
            qPos.add(uuid);
        }

        qPos.add(companyId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(businessUser);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<BusinessUser> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the business users where uuid = &#63; and companyId = &#63; from the database.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByUuid_C(String uuid, long companyId)
        throws SystemException {
        for (BusinessUser businessUser : findByUuid_C(uuid, companyId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(businessUser);
        }
    }

    /**
     * Returns the number of business users where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @return the number of matching business users
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByUuid_C(String uuid, long companyId)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

        Object[] finderArgs = new Object[] { uuid, companyId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_BUSINESSUSER_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_C_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_C_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_C_UUID_2);
            }

            query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                qPos.add(companyId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the business user in the entity cache if it is enabled.
     *
     * @param businessUser the business user
     */
    @Override
    public void cacheResult(BusinessUser businessUser) {
        EntityCacheUtil.putResult(BusinessUserModelImpl.ENTITY_CACHE_ENABLED,
            BusinessUserImpl.class, businessUser.getPrimaryKey(), businessUser);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
            new Object[] { businessUser.getUuid(), businessUser.getGroupId() },
            businessUser);

        businessUser.resetOriginalValues();
    }

    /**
     * Caches the business users in the entity cache if it is enabled.
     *
     * @param businessUsers the business users
     */
    @Override
    public void cacheResult(List<BusinessUser> businessUsers) {
        for (BusinessUser businessUser : businessUsers) {
            if (EntityCacheUtil.getResult(
                        BusinessUserModelImpl.ENTITY_CACHE_ENABLED,
                        BusinessUserImpl.class, businessUser.getPrimaryKey()) == null) {
                cacheResult(businessUser);
            } else {
                businessUser.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all business users.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(BusinessUserImpl.class.getName());
        }

        EntityCacheUtil.clearCache(BusinessUserImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the business user.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(BusinessUser businessUser) {
        EntityCacheUtil.removeResult(BusinessUserModelImpl.ENTITY_CACHE_ENABLED,
            BusinessUserImpl.class, businessUser.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(businessUser);
    }

    @Override
    public void clearCache(List<BusinessUser> businessUsers) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (BusinessUser businessUser : businessUsers) {
            EntityCacheUtil.removeResult(BusinessUserModelImpl.ENTITY_CACHE_ENABLED,
                BusinessUserImpl.class, businessUser.getPrimaryKey());

            clearUniqueFindersCache(businessUser);
        }
    }

    protected void cacheUniqueFindersCache(BusinessUser businessUser) {
        if (businessUser.isNew()) {
            Object[] args = new Object[] {
                    businessUser.getUuid(), businessUser.getGroupId()
                };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
                Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
                businessUser);
        } else {
            BusinessUserModelImpl businessUserModelImpl = (BusinessUserModelImpl) businessUser;

            if ((businessUserModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        businessUser.getUuid(), businessUser.getGroupId()
                    };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
                    Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
                    businessUser);
            }
        }
    }

    protected void clearUniqueFindersCache(BusinessUser businessUser) {
        BusinessUserModelImpl businessUserModelImpl = (BusinessUserModelImpl) businessUser;

        Object[] args = new Object[] {
                businessUser.getUuid(), businessUser.getGroupId()
            };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);

        if ((businessUserModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
            args = new Object[] {
                    businessUserModelImpl.getOriginalUuid(),
                    businessUserModelImpl.getOriginalGroupId()
                };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
        }
    }

    /**
     * Creates a new business user with the primary key. Does not add the business user to the database.
     *
     * @param businessUserId the primary key for the new business user
     * @return the new business user
     */
    @Override
    public BusinessUser create(long businessUserId) {
        BusinessUser businessUser = new BusinessUserImpl();

        businessUser.setNew(true);
        businessUser.setPrimaryKey(businessUserId);

        String uuid = PortalUUIDUtil.generate();

        businessUser.setUuid(uuid);

        return businessUser;
    }

    /**
     * Removes the business user with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param businessUserId the primary key of the business user
     * @return the business user that was removed
     * @throws com.refcodes.portlets.businesscenter.NoSuchBusinessUserException if a business user with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BusinessUser remove(long businessUserId)
        throws NoSuchBusinessUserException, SystemException {
        return remove((Serializable) businessUserId);
    }

    /**
     * Removes the business user with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the business user
     * @return the business user that was removed
     * @throws com.refcodes.portlets.businesscenter.NoSuchBusinessUserException if a business user with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BusinessUser remove(Serializable primaryKey)
        throws NoSuchBusinessUserException, SystemException {
        Session session = null;

        try {
            session = openSession();

            BusinessUser businessUser = (BusinessUser) session.get(BusinessUserImpl.class,
                    primaryKey);

            if (businessUser == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchBusinessUserException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(businessUser);
        } catch (NoSuchBusinessUserException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected BusinessUser removeImpl(BusinessUser businessUser)
        throws SystemException {
        businessUser = toUnwrappedModel(businessUser);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(businessUser)) {
                businessUser = (BusinessUser) session.get(BusinessUserImpl.class,
                        businessUser.getPrimaryKeyObj());
            }

            if (businessUser != null) {
                session.delete(businessUser);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (businessUser != null) {
            clearCache(businessUser);
        }

        return businessUser;
    }

    @Override
    public BusinessUser updateImpl(
        com.refcodes.portlets.businesscenter.model.BusinessUser businessUser)
        throws SystemException {
        businessUser = toUnwrappedModel(businessUser);

        boolean isNew = businessUser.isNew();

        BusinessUserModelImpl businessUserModelImpl = (BusinessUserModelImpl) businessUser;

        if (Validator.isNull(businessUser.getUuid())) {
            String uuid = PortalUUIDUtil.generate();

            businessUser.setUuid(uuid);
        }

        Session session = null;

        try {
            session = openSession();

            if (businessUser.isNew()) {
                session.save(businessUser);

                businessUser.setNew(false);
            } else {
                session.merge(businessUser);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !BusinessUserModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((businessUserModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        businessUserModelImpl.getOriginalUuid()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
                    args);

                args = new Object[] { businessUserModelImpl.getUuid() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
                    args);
            }

            if ((businessUserModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        businessUserModelImpl.getOriginalUuid(),
                        businessUserModelImpl.getOriginalCompanyId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
                    args);

                args = new Object[] {
                        businessUserModelImpl.getUuid(),
                        businessUserModelImpl.getCompanyId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
                    args);
            }
        }

        EntityCacheUtil.putResult(BusinessUserModelImpl.ENTITY_CACHE_ENABLED,
            BusinessUserImpl.class, businessUser.getPrimaryKey(), businessUser);

        clearUniqueFindersCache(businessUser);
        cacheUniqueFindersCache(businessUser);

        return businessUser;
    }

    protected BusinessUser toUnwrappedModel(BusinessUser businessUser) {
        if (businessUser instanceof BusinessUserImpl) {
            return businessUser;
        }

        BusinessUserImpl businessUserImpl = new BusinessUserImpl();

        businessUserImpl.setNew(businessUser.isNew());
        businessUserImpl.setPrimaryKey(businessUser.getPrimaryKey());

        businessUserImpl.setUuid(businessUser.getUuid());
        businessUserImpl.setBusinessUserId(businessUser.getBusinessUserId());
        businessUserImpl.setGroupId(businessUser.getGroupId());
        businessUserImpl.setCompanyId(businessUser.getCompanyId());
        businessUserImpl.setFirstName(businessUser.getFirstName());
        businessUserImpl.setLastName(businessUser.getLastName());
        businessUserImpl.setEmail(businessUser.getEmail());
        businessUserImpl.setOwnerShip(businessUser.getOwnerShip());
        businessUserImpl.setCategoryId(businessUser.getCategoryId());
        businessUserImpl.setPhoneNumber(businessUser.getPhoneNumber());
        businessUserImpl.setCreatedDate(businessUser.getCreatedDate());
        businessUserImpl.setCreatedBy(businessUser.getCreatedBy());
        businessUserImpl.setUpdatedDate(businessUser.getUpdatedDate());
        businessUserImpl.setUpdatedBy(businessUser.getUpdatedBy());

        return businessUserImpl;
    }

    /**
     * Returns the business user with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the business user
     * @return the business user
     * @throws com.refcodes.portlets.businesscenter.NoSuchBusinessUserException if a business user with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BusinessUser findByPrimaryKey(Serializable primaryKey)
        throws NoSuchBusinessUserException, SystemException {
        BusinessUser businessUser = fetchByPrimaryKey(primaryKey);

        if (businessUser == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchBusinessUserException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return businessUser;
    }

    /**
     * Returns the business user with the primary key or throws a {@link com.refcodes.portlets.businesscenter.NoSuchBusinessUserException} if it could not be found.
     *
     * @param businessUserId the primary key of the business user
     * @return the business user
     * @throws com.refcodes.portlets.businesscenter.NoSuchBusinessUserException if a business user with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BusinessUser findByPrimaryKey(long businessUserId)
        throws NoSuchBusinessUserException, SystemException {
        return findByPrimaryKey((Serializable) businessUserId);
    }

    /**
     * Returns the business user with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the business user
     * @return the business user, or <code>null</code> if a business user with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BusinessUser fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        BusinessUser businessUser = (BusinessUser) EntityCacheUtil.getResult(BusinessUserModelImpl.ENTITY_CACHE_ENABLED,
                BusinessUserImpl.class, primaryKey);

        if (businessUser == _nullBusinessUser) {
            return null;
        }

        if (businessUser == null) {
            Session session = null;

            try {
                session = openSession();

                businessUser = (BusinessUser) session.get(BusinessUserImpl.class,
                        primaryKey);

                if (businessUser != null) {
                    cacheResult(businessUser);
                } else {
                    EntityCacheUtil.putResult(BusinessUserModelImpl.ENTITY_CACHE_ENABLED,
                        BusinessUserImpl.class, primaryKey, _nullBusinessUser);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(BusinessUserModelImpl.ENTITY_CACHE_ENABLED,
                    BusinessUserImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return businessUser;
    }

    /**
     * Returns the business user with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param businessUserId the primary key of the business user
     * @return the business user, or <code>null</code> if a business user with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BusinessUser fetchByPrimaryKey(long businessUserId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) businessUserId);
    }

    /**
     * Returns all the business users.
     *
     * @return the business users
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BusinessUser> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    public List<BusinessUser> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

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
    @Override
    public List<BusinessUser> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<BusinessUser> list = (List<BusinessUser>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_BUSINESSUSER);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_BUSINESSUSER;

                if (pagination) {
                    sql = sql.concat(BusinessUserModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<BusinessUser>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<BusinessUser>(list);
                } else {
                    list = (List<BusinessUser>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the business users from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (BusinessUser businessUser : findAll()) {
            remove(businessUser);
        }
    }

    /**
     * Returns the number of business users.
     *
     * @return the number of business users
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_BUSINESSUSER);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    @Override
    protected Set<String> getBadColumnNames() {
        return _badColumnNames;
    }

    /**
     * Initializes the business user persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.refcodes.portlets.businesscenter.model.BusinessUser")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<BusinessUser>> listenersList = new ArrayList<ModelListener<BusinessUser>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<BusinessUser>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(BusinessUserImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
