// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.FqdnListLocalRulestacksClient;
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models.FqdnListLocalRulestackResourceInner;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.FqdnListLocalRulestackResource;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.FqdnListLocalRulestacks;

public final class FqdnListLocalRulestacksImpl implements FqdnListLocalRulestacks {
    private static final ClientLogger LOGGER = new ClientLogger(FqdnListLocalRulestacksImpl.class);

    private final FqdnListLocalRulestacksClient innerClient;

    private final com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager serviceManager;

    public FqdnListLocalRulestacksImpl(FqdnListLocalRulestacksClient innerClient,
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<FqdnListLocalRulestackResource> listByLocalRulestacks(String resourceGroupName,
        String localRulestackName) {
        PagedIterable<FqdnListLocalRulestackResourceInner> inner
            = this.serviceClient().listByLocalRulestacks(resourceGroupName, localRulestackName);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new FqdnListLocalRulestackResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<FqdnListLocalRulestackResource> listByLocalRulestacks(String resourceGroupName,
        String localRulestackName, Context context) {
        PagedIterable<FqdnListLocalRulestackResourceInner> inner
            = this.serviceClient().listByLocalRulestacks(resourceGroupName, localRulestackName, context);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new FqdnListLocalRulestackResourceImpl(inner1, this.manager()));
    }

    public Response<FqdnListLocalRulestackResource> getWithResponse(String resourceGroupName, String localRulestackName,
        String name, Context context) {
        Response<FqdnListLocalRulestackResourceInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, localRulestackName, name, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new FqdnListLocalRulestackResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public FqdnListLocalRulestackResource get(String resourceGroupName, String localRulestackName, String name) {
        FqdnListLocalRulestackResourceInner inner
            = this.serviceClient().get(resourceGroupName, localRulestackName, name);
        if (inner != null) {
            return new FqdnListLocalRulestackResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String localRulestackName, String name) {
        this.serviceClient().delete(resourceGroupName, localRulestackName, name);
    }

    public void delete(String resourceGroupName, String localRulestackName, String name, Context context) {
        this.serviceClient().delete(resourceGroupName, localRulestackName, name, context);
    }

    public FqdnListLocalRulestackResource getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String localRulestackName = ResourceManagerUtils.getValueFromIdByName(id, "localRulestacks");
        if (localRulestackName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'localRulestacks'.", id)));
        }
        String name = ResourceManagerUtils.getValueFromIdByName(id, "fqdnlists");
        if (name == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'fqdnlists'.", id)));
        }
        return this.getWithResponse(resourceGroupName, localRulestackName, name, Context.NONE).getValue();
    }

    public Response<FqdnListLocalRulestackResource> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String localRulestackName = ResourceManagerUtils.getValueFromIdByName(id, "localRulestacks");
        if (localRulestackName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'localRulestacks'.", id)));
        }
        String name = ResourceManagerUtils.getValueFromIdByName(id, "fqdnlists");
        if (name == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'fqdnlists'.", id)));
        }
        return this.getWithResponse(resourceGroupName, localRulestackName, name, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String localRulestackName = ResourceManagerUtils.getValueFromIdByName(id, "localRulestacks");
        if (localRulestackName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'localRulestacks'.", id)));
        }
        String name = ResourceManagerUtils.getValueFromIdByName(id, "fqdnlists");
        if (name == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'fqdnlists'.", id)));
        }
        this.delete(resourceGroupName, localRulestackName, name, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String localRulestackName = ResourceManagerUtils.getValueFromIdByName(id, "localRulestacks");
        if (localRulestackName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'localRulestacks'.", id)));
        }
        String name = ResourceManagerUtils.getValueFromIdByName(id, "fqdnlists");
        if (name == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'fqdnlists'.", id)));
        }
        this.delete(resourceGroupName, localRulestackName, name, context);
    }

    private FqdnListLocalRulestacksClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager() {
        return this.serviceManager;
    }

    public FqdnListLocalRulestackResourceImpl define(String name) {
        return new FqdnListLocalRulestackResourceImpl(name, this.manager());
    }
}
