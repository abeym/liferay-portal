/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
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

package com.liferay.portalweb.plugins.kaleo.scope.addwebcontentsingleapproverscopeglobal;

import com.liferay.portalweb.portal.BaseTests;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * @author Brian Wing Shun Chan
 */
public class AddWebContentSingleApproverScopeGlobalTests extends BaseTests {

	public static Test suite() {
		TestSuite testSuite = new TestSuite();

		testSuite.addTestSuite(
			ConfigureWebContentSingleApproverScopeGlobalTest.class);
		testSuite.addTestSuite(
			AddWebContentSingleApproverScopeGlobalTest.class);
		testSuite.addTestSuite(
			ViewWebContentScopeGlobalAssignedToMyRolesTest.class);
		testSuite.addTestSuite(
			AssignToMeWebContentScopeGlobalActionsTest.class);
		testSuite.addTestSuite(ViewWebContentScopeGlobalAssignedToMeTest.class);
		testSuite.addTestSuite(ApproveWebContentScopeGlobalActionsTest.class);
		testSuite.addTestSuite(ViewWebContentScopeGlobalCompletedTest.class);
		testSuite.addTestSuite(TearDownGlobalWebContentTest.class);
		testSuite.addTestSuite(TearDownGlobalWorkflowConfigurationTest.class);

		return testSuite;
	}

}