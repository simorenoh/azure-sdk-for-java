// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.edgezones.generated;

/**
 * Samples for ExtendedZones Unregister.
 */
public final class ExtendedZonesUnregisterSamples {
    /*
     * x-ms-original-file:
     * specification/edgezones/resource-manager/Microsoft.EdgeZones/preview/2024-04-01-preview/examples/
     * ExtendedZones_Unregister.json
     */
    /**
     * Sample code: UnregisterExtendedZone.
     * 
     * @param manager Entry point to EdgeZonesManager.
     */
    public static void unregisterExtendedZone(com.azure.resourcemanager.edgezones.EdgeZonesManager manager) {
        manager.extendedZones().unregisterWithResponse("losangeles", com.azure.core.util.Context.NONE);
    }
}
