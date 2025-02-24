// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.connectedcache.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Customer resource transit states.
 */
public final class CustomerTransitState extends ExpandableStringEnum<CustomerTransitState> {
    /**
     * do not have transit.
     */
    public static final CustomerTransitState NO_TRANSIT = fromString("NoTransit");

    /**
     * transit provider and have own subscribers.
     */
    public static final CustomerTransitState COMBINED_TRANSIT = fromString("CombinedTransit");

    /**
     * pure transit provider or network service provider.
     */
    public static final CustomerTransitState TRANSIT_ONLY = fromString("TransitOnly");

    /**
     * Creates a new instance of CustomerTransitState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public CustomerTransitState() {
    }

    /**
     * Creates or finds a CustomerTransitState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding CustomerTransitState.
     */
    public static CustomerTransitState fromString(String name) {
        return fromString(name, CustomerTransitState.class);
    }

    /**
     * Gets known CustomerTransitState values.
     * 
     * @return known CustomerTransitState values.
     */
    public static Collection<CustomerTransitState> values() {
        return values(CustomerTransitState.class);
    }
}
