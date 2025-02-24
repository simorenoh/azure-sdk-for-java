// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.loganalytics.fluent.models.DestinationMetadata;
import org.junit.jupiter.api.Assertions;

public final class DestinationMetadataTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DestinationMetadata model
            = BinaryData.fromString("{\"eventHubName\":\"uknvudwti\"}").toObject(DestinationMetadata.class);
        Assertions.assertEquals("uknvudwti", model.eventHubName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DestinationMetadata model = new DestinationMetadata().withEventHubName("uknvudwti");
        model = BinaryData.fromObject(model).toObject(DestinationMetadata.class);
        Assertions.assertEquals("uknvudwti", model.eventHubName());
    }
}
