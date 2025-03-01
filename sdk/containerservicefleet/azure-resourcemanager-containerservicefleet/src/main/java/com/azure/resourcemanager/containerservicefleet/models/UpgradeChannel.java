// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Configuration of how auto upgrade will be run.
 */
public final class UpgradeChannel extends ExpandableStringEnum<UpgradeChannel> {
    /**
     * Static value Stable for UpgradeChannel.
     */
    public static final UpgradeChannel STABLE = fromString("Stable");

    /**
     * Static value Rapid for UpgradeChannel.
     */
    public static final UpgradeChannel RAPID = fromString("Rapid");

    /**
     * Static value NodeImage for UpgradeChannel.
     */
    public static final UpgradeChannel NODE_IMAGE = fromString("NodeImage");

    /**
     * Creates a new instance of UpgradeChannel value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public UpgradeChannel() {
    }

    /**
     * Creates or finds a UpgradeChannel from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding UpgradeChannel.
     */
    public static UpgradeChannel fromString(String name) {
        return fromString(name, UpgradeChannel.class);
    }

    /**
     * Gets known UpgradeChannel values.
     * 
     * @return known UpgradeChannel values.
     */
    public static Collection<UpgradeChannel> values() {
        return values(UpgradeChannel.class);
    }
}
