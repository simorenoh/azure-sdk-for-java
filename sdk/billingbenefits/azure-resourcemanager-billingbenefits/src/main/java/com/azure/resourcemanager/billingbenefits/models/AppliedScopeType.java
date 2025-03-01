// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billingbenefits.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Type of the Applied Scope.
 */
public final class AppliedScopeType extends ExpandableStringEnum<AppliedScopeType> {
    /**
     * Static value Single for AppliedScopeType.
     */
    public static final AppliedScopeType SINGLE = fromString("Single");

    /**
     * Static value Shared for AppliedScopeType.
     */
    public static final AppliedScopeType SHARED = fromString("Shared");

    /**
     * Static value ManagementGroup for AppliedScopeType.
     */
    public static final AppliedScopeType MANAGEMENT_GROUP = fromString("ManagementGroup");

    /**
     * Creates a new instance of AppliedScopeType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AppliedScopeType() {
    }

    /**
     * Creates or finds a AppliedScopeType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AppliedScopeType.
     */
    public static AppliedScopeType fromString(String name) {
        return fromString(name, AppliedScopeType.class);
    }

    /**
     * Gets known AppliedScopeType values.
     * 
     * @return known AppliedScopeType values.
     */
    public static Collection<AppliedScopeType> values() {
        return values(AppliedScopeType.class);
    }
}
