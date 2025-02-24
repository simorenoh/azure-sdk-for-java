// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mixedreality.implementation;

import com.azure.resourcemanager.mixedreality.fluent.models.CheckNameAvailabilityResponseInner;
import com.azure.resourcemanager.mixedreality.models.CheckNameAvailabilityResponse;
import com.azure.resourcemanager.mixedreality.models.NameUnavailableReason;

public final class CheckNameAvailabilityResponseImpl implements CheckNameAvailabilityResponse {
    private CheckNameAvailabilityResponseInner innerObject;

    private final com.azure.resourcemanager.mixedreality.MixedRealityManager serviceManager;

    CheckNameAvailabilityResponseImpl(CheckNameAvailabilityResponseInner innerObject,
        com.azure.resourcemanager.mixedreality.MixedRealityManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public boolean nameAvailable() {
        return this.innerModel().nameAvailable();
    }

    public NameUnavailableReason reason() {
        return this.innerModel().reason();
    }

    public String message() {
        return this.innerModel().message();
    }

    public CheckNameAvailabilityResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.mixedreality.MixedRealityManager manager() {
        return this.serviceManager;
    }
}
