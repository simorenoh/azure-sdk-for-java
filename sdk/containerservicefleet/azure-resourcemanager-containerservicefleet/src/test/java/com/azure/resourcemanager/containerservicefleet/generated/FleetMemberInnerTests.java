// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.containerservicefleet.fluent.models.FleetMemberInner;
import org.junit.jupiter.api.Assertions;

public final class FleetMemberInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FleetMemberInner model = BinaryData.fromString(
            "{\"properties\":{\"clusterResourceId\":\"kyfi\",\"group\":\"fidfvzw\",\"provisioningState\":\"Joining\"},\"eTag\":\"tymw\",\"id\":\"dkfthwxmnt\",\"name\":\"i\",\"type\":\"aop\"}")
            .toObject(FleetMemberInner.class);
        Assertions.assertEquals("kyfi", model.clusterResourceId());
        Assertions.assertEquals("fidfvzw", model.group());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FleetMemberInner model = new FleetMemberInner().withClusterResourceId("kyfi").withGroup("fidfvzw");
        model = BinaryData.fromObject(model).toObject(FleetMemberInner.class);
        Assertions.assertEquals("kyfi", model.clusterResourceId());
        Assertions.assertEquals("fidfvzw", model.group());
    }
}
