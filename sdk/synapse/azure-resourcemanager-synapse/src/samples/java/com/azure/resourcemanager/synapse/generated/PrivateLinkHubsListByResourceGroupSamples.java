// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

/**
 * Samples for PrivateLinkHubs ListByResourceGroup.
 */
public final class PrivateLinkHubsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/synapse/resource-manager/Microsoft.Synapse/stable/2021-03-01/examples/
     * ListPrivateLinkHubsInResourceGroup.json
     */
    /**
     * Sample code: List privateLinkHubs in resource group.
     * 
     * @param manager Entry point to SynapseManager.
     */
    public static void listPrivateLinkHubsInResourceGroup(com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager.privateLinkHubs().listByResourceGroup("resourceGroup1", com.azure.core.util.Context.NONE);
    }
}
