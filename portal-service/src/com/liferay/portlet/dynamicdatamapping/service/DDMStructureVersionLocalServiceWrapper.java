/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.liferay.portlet.dynamicdatamapping.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DDMStructureVersionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see DDMStructureVersionLocalService
 * @generated
 */
@ProviderType
public class DDMStructureVersionLocalServiceWrapper
	implements DDMStructureVersionLocalService,
		ServiceWrapper<DDMStructureVersionLocalService> {
	public DDMStructureVersionLocalServiceWrapper(
		DDMStructureVersionLocalService ddmStructureVersionLocalService) {
		_ddmStructureVersionLocalService = ddmStructureVersionLocalService;
	}

	/**
	* Adds the d d m structure version to the database. Also notifies the appropriate model listeners.
	*
	* @param ddmStructureVersion the d d m structure version
	* @return the d d m structure version that was added
	*/
	@Override
	public com.liferay.portlet.dynamicdatamapping.model.DDMStructureVersion addDDMStructureVersion(
		com.liferay.portlet.dynamicdatamapping.model.DDMStructureVersion ddmStructureVersion) {
		return _ddmStructureVersionLocalService.addDDMStructureVersion(ddmStructureVersion);
	}

	/**
	* Creates a new d d m structure version with the primary key. Does not add the d d m structure version to the database.
	*
	* @param ddmStructureVersionId the primary key for the new d d m structure version
	* @return the new d d m structure version
	*/
	@Override
	public com.liferay.portlet.dynamicdatamapping.model.DDMStructureVersion createDDMStructureVersion(
		long ddmStructureVersionId) {
		return _ddmStructureVersionLocalService.createDDMStructureVersion(ddmStructureVersionId);
	}

	/**
	* Deletes the d d m structure version from the database. Also notifies the appropriate model listeners.
	*
	* @param ddmStructureVersion the d d m structure version
	* @return the d d m structure version that was removed
	*/
	@Override
	public com.liferay.portlet.dynamicdatamapping.model.DDMStructureVersion deleteDDMStructureVersion(
		com.liferay.portlet.dynamicdatamapping.model.DDMStructureVersion ddmStructureVersion) {
		return _ddmStructureVersionLocalService.deleteDDMStructureVersion(ddmStructureVersion);
	}

	/**
	* Deletes the d d m structure version with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ddmStructureVersionId the primary key of the d d m structure version
	* @return the d d m structure version that was removed
	* @throws PortalException if a d d m structure version with the primary key could not be found
	*/
	@Override
	public com.liferay.portlet.dynamicdatamapping.model.DDMStructureVersion deleteDDMStructureVersion(
		long ddmStructureVersionId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ddmStructureVersionLocalService.deleteDDMStructureVersion(ddmStructureVersionId);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.model.PersistedModel deletePersistedModel(
		com.liferay.portal.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ddmStructureVersionLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ddmStructureVersionLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _ddmStructureVersionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portlet.dynamicdatamapping.model.impl.DDMStructureVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _ddmStructureVersionLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portlet.dynamicdatamapping.model.impl.DDMStructureVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _ddmStructureVersionLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _ddmStructureVersionLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _ddmStructureVersionLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.liferay.portlet.dynamicdatamapping.model.DDMStructureVersion fetchDDMStructureVersion(
		long ddmStructureVersionId) {
		return _ddmStructureVersionLocalService.fetchDDMStructureVersion(ddmStructureVersionId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _ddmStructureVersionLocalService.getActionableDynamicQuery();
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _ddmStructureVersionLocalService.getBeanIdentifier();
	}

	/**
	* Returns the d d m structure version with the primary key.
	*
	* @param ddmStructureVersionId the primary key of the d d m structure version
	* @return the d d m structure version
	* @throws PortalException if a d d m structure version with the primary key could not be found
	*/
	@Override
	public com.liferay.portlet.dynamicdatamapping.model.DDMStructureVersion getDDMStructureVersion(
		long ddmStructureVersionId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ddmStructureVersionLocalService.getDDMStructureVersion(ddmStructureVersionId);
	}

	@Override
	public java.util.List<com.liferay.portlet.dynamicdatamapping.model.DDMStructureVersion> getDDMStructureVersions(
		long ddmStructureId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.portlet.dynamicdatamapping.model.DDMStructureVersion> orderByComparator) {
		return _ddmStructureVersionLocalService.getDDMStructureVersions(ddmStructureId,
			start, end, orderByComparator);
	}

	/**
	* Returns a range of all the d d m structure versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portlet.dynamicdatamapping.model.impl.DDMStructureVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of d d m structure versions
	* @param end the upper bound of the range of d d m structure versions (not inclusive)
	* @return the range of d d m structure versions
	*/
	@Override
	public java.util.List<com.liferay.portlet.dynamicdatamapping.model.DDMStructureVersion> getDDMStructureVersions(
		int start, int end) {
		return _ddmStructureVersionLocalService.getDDMStructureVersions(start,
			end);
	}

	/**
	* Returns the number of d d m structure versions.
	*
	* @return the number of d d m structure versions
	*/
	@Override
	public int getDDMStructureVersionsCount() {
		return _ddmStructureVersionLocalService.getDDMStructureVersionsCount();
	}

	@Override
	public int getDDMStructureVersionsCount(long ddmStructureId) {
		return _ddmStructureVersionLocalService.getDDMStructureVersionsCount(ddmStructureId);
	}

	@Override
	public com.liferay.portlet.dynamicdatamapping.model.DDMStructureVersion getLatestVersion(
		long ddmStructureId) {
		return _ddmStructureVersionLocalService.getLatestVersion(ddmStructureId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ddmStructureVersionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_ddmStructureVersionLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public com.liferay.portlet.dynamicdatamapping.model.DDMStructureVersion updateDDMStructureVersion(
		com.liferay.portlet.dynamicdatamapping.model.DDMStructure ddmStructure,
		boolean majorVersion,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ddmStructureVersionLocalService.updateDDMStructureVersion(ddmStructure,
			majorVersion, serviceContext);
	}

	/**
	* Updates the d d m structure version in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param ddmStructureVersion the d d m structure version
	* @return the d d m structure version that was updated
	*/
	@Override
	public com.liferay.portlet.dynamicdatamapping.model.DDMStructureVersion updateDDMStructureVersion(
		com.liferay.portlet.dynamicdatamapping.model.DDMStructureVersion ddmStructureVersion) {
		return _ddmStructureVersionLocalService.updateDDMStructureVersion(ddmStructureVersion);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	@Deprecated
	public DDMStructureVersionLocalService getWrappedDDMStructureVersionLocalService() {
		return _ddmStructureVersionLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	@Deprecated
	public void setWrappedDDMStructureVersionLocalService(
		DDMStructureVersionLocalService ddmStructureVersionLocalService) {
		_ddmStructureVersionLocalService = ddmStructureVersionLocalService;
	}

	@Override
	public DDMStructureVersionLocalService getWrappedService() {
		return _ddmStructureVersionLocalService;
	}

	@Override
	public void setWrappedService(
		DDMStructureVersionLocalService ddmStructureVersionLocalService) {
		_ddmStructureVersionLocalService = ddmStructureVersionLocalService;
	}

	private DDMStructureVersionLocalService _ddmStructureVersionLocalService;
}