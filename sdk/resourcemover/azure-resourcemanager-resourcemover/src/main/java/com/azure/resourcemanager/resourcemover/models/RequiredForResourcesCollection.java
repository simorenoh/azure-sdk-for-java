// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.models;

import com.azure.resourcemanager.resourcemover.fluent.models.RequiredForResourcesCollectionInner;
import java.util.List;

/**
 * An immutable client-side representation of RequiredForResourcesCollection.
 */
public interface RequiredForResourcesCollection {
    /**
     * Gets the sourceIds property: Gets or sets the list of source Ids for which the input resource is required.
     * 
     * @return the sourceIds value.
     */
    List<String> sourceIds();

    /**
     * Gets the inner com.azure.resourcemanager.resourcemover.fluent.models.RequiredForResourcesCollectionInner object.
     * 
     * @return the inner object.
     */
    RequiredForResourcesCollectionInner innerModel();
}
