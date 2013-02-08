/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portlet.social.model;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.AttachedModel;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the SocialActivitySet service. Represents a row in the &quot;SocialActivitySet&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portlet.social.model.impl.SocialActivitySetModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portlet.social.model.impl.SocialActivitySetImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SocialActivitySet
 * @see com.liferay.portlet.social.model.impl.SocialActivitySetImpl
 * @see com.liferay.portlet.social.model.impl.SocialActivitySetModelImpl
 * @generated
 */
public interface SocialActivitySetModel extends AttachedModel,
	BaseModel<SocialActivitySet> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a social activity set model instance should use the {@link SocialActivitySet} interface instead.
	 */

	/**
	 * Returns the primary key of this social activity set.
	 *
	 * @return the primary key of this social activity set
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this social activity set.
	 *
	 * @param primaryKey the primary key of this social activity set
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the activity set ID of this social activity set.
	 *
	 * @return the activity set ID of this social activity set
	 */
	public long getActivitySetId();

	/**
	 * Sets the activity set ID of this social activity set.
	 *
	 * @param activitySetId the activity set ID of this social activity set
	 */
	public void setActivitySetId(long activitySetId);

	/**
	 * Returns the group ID of this social activity set.
	 *
	 * @return the group ID of this social activity set
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this social activity set.
	 *
	 * @param groupId the group ID of this social activity set
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this social activity set.
	 *
	 * @return the company ID of this social activity set
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this social activity set.
	 *
	 * @param companyId the company ID of this social activity set
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this social activity set.
	 *
	 * @return the user ID of this social activity set
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this social activity set.
	 *
	 * @param userId the user ID of this social activity set
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this social activity set.
	 *
	 * @return the user uuid of this social activity set
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this social activity set.
	 *
	 * @param userUuid the user uuid of this social activity set
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the create date of this social activity set.
	 *
	 * @return the create date of this social activity set
	 */
	public long getCreateDate();

	/**
	 * Sets the create date of this social activity set.
	 *
	 * @param createDate the create date of this social activity set
	 */
	public void setCreateDate(long createDate);

	/**
	 * Returns the modified date of this social activity set.
	 *
	 * @return the modified date of this social activity set
	 */
	public long getModifiedDate();

	/**
	 * Sets the modified date of this social activity set.
	 *
	 * @param modifiedDate the modified date of this social activity set
	 */
	public void setModifiedDate(long modifiedDate);

	/**
	 * Returns the fully qualified class name of this social activity set.
	 *
	 * @return the fully qualified class name of this social activity set
	 */
	public String getClassName();

	public void setClassName(String className);

	/**
	 * Returns the class name ID of this social activity set.
	 *
	 * @return the class name ID of this social activity set
	 */
	public long getClassNameId();

	/**
	 * Sets the class name ID of this social activity set.
	 *
	 * @param classNameId the class name ID of this social activity set
	 */
	public void setClassNameId(long classNameId);

	/**
	 * Returns the class p k of this social activity set.
	 *
	 * @return the class p k of this social activity set
	 */
	public long getClassPK();

	/**
	 * Sets the class p k of this social activity set.
	 *
	 * @param classPK the class p k of this social activity set
	 */
	public void setClassPK(long classPK);

	/**
	 * Returns the type of this social activity set.
	 *
	 * @return the type of this social activity set
	 */
	public int getType();

	/**
	 * Sets the type of this social activity set.
	 *
	 * @param type the type of this social activity set
	 */
	public void setType(int type);

	/**
	 * Returns the activity count of this social activity set.
	 *
	 * @return the activity count of this social activity set
	 */
	public int getActivityCount();

	/**
	 * Sets the activity count of this social activity set.
	 *
	 * @param activityCount the activity count of this social activity set
	 */
	public void setActivityCount(int activityCount);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(SocialActivitySet socialActivitySet);

	public int hashCode();

	public CacheModel<SocialActivitySet> toCacheModel();

	public SocialActivitySet toEscapedModel();

	public SocialActivitySet toUnescapedModel();

	public String toString();

	public String toXmlString();
}