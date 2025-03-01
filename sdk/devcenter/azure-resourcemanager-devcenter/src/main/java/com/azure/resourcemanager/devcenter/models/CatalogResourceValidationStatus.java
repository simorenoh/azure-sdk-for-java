// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Catalog resource validation status.
 */
public final class CatalogResourceValidationStatus extends ExpandableStringEnum<CatalogResourceValidationStatus> {
    /**
     * Static value Unknown for CatalogResourceValidationStatus.
     */
    public static final CatalogResourceValidationStatus UNKNOWN = fromString("Unknown");

    /**
     * Static value Pending for CatalogResourceValidationStatus.
     */
    public static final CatalogResourceValidationStatus PENDING = fromString("Pending");

    /**
     * Static value Succeeded for CatalogResourceValidationStatus.
     */
    public static final CatalogResourceValidationStatus SUCCEEDED = fromString("Succeeded");

    /**
     * Static value Failed for CatalogResourceValidationStatus.
     */
    public static final CatalogResourceValidationStatus FAILED = fromString("Failed");

    /**
     * Creates a new instance of CatalogResourceValidationStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public CatalogResourceValidationStatus() {
    }

    /**
     * Creates or finds a CatalogResourceValidationStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding CatalogResourceValidationStatus.
     */
    public static CatalogResourceValidationStatus fromString(String name) {
        return fromString(name, CatalogResourceValidationStatus.class);
    }

    /**
     * Gets known CatalogResourceValidationStatus values.
     * 
     * @return known CatalogResourceValidationStatus values.
     */
    public static Collection<CatalogResourceValidationStatus> values() {
        return values(CatalogResourceValidationStatus.class);
    }
}
