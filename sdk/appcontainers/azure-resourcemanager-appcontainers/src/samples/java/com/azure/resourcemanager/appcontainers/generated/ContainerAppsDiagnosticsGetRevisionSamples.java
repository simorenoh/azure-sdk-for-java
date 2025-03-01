// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

/**
 * Samples for ContainerAppsDiagnostics GetRevision.
 */
public final class ContainerAppsDiagnosticsGetRevisionSamples {
    /*
     * x-ms-original-file:
     * specification/app/resource-manager/Microsoft.App/preview/2024-08-02-preview/examples/Revisions_Get.json
     */
    /**
     * Sample code: Get Container App's revision.
     * 
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void
        getContainerAppSRevision(com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.containerAppsDiagnostics()
            .getRevisionWithResponse("rg", "testcontainerApp0", "testcontainerApp0-pjxhsye",
                com.azure.core.util.Context.NONE);
    }
}
