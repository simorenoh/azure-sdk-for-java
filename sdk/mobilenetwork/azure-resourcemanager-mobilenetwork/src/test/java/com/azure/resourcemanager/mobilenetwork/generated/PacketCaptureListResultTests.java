// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mobilenetwork.fluent.models.PacketCaptureInner;
import com.azure.resourcemanager.mobilenetwork.models.PacketCaptureListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PacketCaptureListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PacketCaptureListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"provisioningState\":\"Failed\",\"status\":\"NotStarted\",\"reason\":\"pewr\",\"captureStartTime\":\"2021-08-16T15:51:55Z\",\"networkInterfaces\":[\"vjektcxsenh\",\"lrsf\",\"rzpwvlqdqgbiq\",\"lihkaetcktvfc\"],\"bytesToCapturePerPacket\":2289956898099281831,\"totalBytesPerSession\":6184061974190178172,\"timeLimitInSeconds\":5394429,\"outputFiles\":[\"qhjfbebr\",\"cxerf\",\"wutttxfvjrbi\"]},\"id\":\"hxepcyvahfnlj\",\"name\":\"yq\",\"type\":\"j\"}],\"nextLink\":\"ujqgidok\"}")
            .toObject(PacketCaptureListResult.class);
        Assertions.assertEquals("vjektcxsenh", model.value().get(0).networkInterfaces().get(0));
        Assertions.assertEquals(2289956898099281831L, model.value().get(0).bytesToCapturePerPacket());
        Assertions.assertEquals(6184061974190178172L, model.value().get(0).totalBytesPerSession());
        Assertions.assertEquals(5394429, model.value().get(0).timeLimitInSeconds());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PacketCaptureListResult model = new PacketCaptureListResult().withValue(Arrays.asList(new PacketCaptureInner()
            .withNetworkInterfaces(Arrays.asList("vjektcxsenh", "lrsf", "rzpwvlqdqgbiq", "lihkaetcktvfc"))
            .withBytesToCapturePerPacket(2289956898099281831L)
            .withTotalBytesPerSession(6184061974190178172L)
            .withTimeLimitInSeconds(5394429)));
        model = BinaryData.fromObject(model).toObject(PacketCaptureListResult.class);
        Assertions.assertEquals("vjektcxsenh", model.value().get(0).networkInterfaces().get(0));
        Assertions.assertEquals(2289956898099281831L, model.value().get(0).bytesToCapturePerPacket());
        Assertions.assertEquals(6184061974190178172L, model.value().get(0).totalBytesPerSession());
        Assertions.assertEquals(5394429, model.value().get(0).timeLimitInSeconds());
    }
}
