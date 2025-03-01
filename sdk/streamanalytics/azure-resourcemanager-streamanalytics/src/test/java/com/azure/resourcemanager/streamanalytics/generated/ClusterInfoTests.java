// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.streamanalytics.models.ClusterInfo;
import org.junit.jupiter.api.Assertions;

public final class ClusterInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterInfo model = BinaryData.fromString("{\"id\":\"tyxolniwpwc\"}").toObject(ClusterInfo.class);
        Assertions.assertEquals("tyxolniwpwc", model.id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterInfo model = new ClusterInfo().withId("tyxolniwpwc");
        model = BinaryData.fromObject(model).toObject(ClusterInfo.class);
        Assertions.assertEquals("tyxolniwpwc", model.id());
    }
}
