// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureSearchIndexSink;
import com.azure.resourcemanager.datafactory.models.AzureSearchIndexWriteBehaviorType;
import org.junit.jupiter.api.Assertions;

public final class AzureSearchIndexSinkTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureSearchIndexSink model = BinaryData.fromString(
            "{\"type\":\"AzureSearchIndexSink\",\"writeBehavior\":\"Upload\",\"writeBatchSize\":\"dataerejrdxhlo\",\"writeBatchTimeout\":\"dataxhztdca\",\"sinkRetryCount\":\"datamvqgqmi\",\"sinkRetryWait\":\"datapa\",\"maxConcurrentConnections\":\"datah\",\"disableMetricsCollection\":\"datacyasz\",\"\":{\"ni\":\"datamtcihupoelj\",\"awbsdeqqbdcbnrg\":\"datayoxajit\",\"mtgtnb\":\"datapnor\",\"rwldeinhnsd\":\"datasopuwesmxodyto\"}}")
            .toObject(AzureSearchIndexSink.class);
        Assertions.assertEquals(AzureSearchIndexWriteBehaviorType.UPLOAD, model.writeBehavior());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureSearchIndexSink model = new AzureSearchIndexSink().withWriteBatchSize("dataerejrdxhlo")
            .withWriteBatchTimeout("dataxhztdca")
            .withSinkRetryCount("datamvqgqmi")
            .withSinkRetryWait("datapa")
            .withMaxConcurrentConnections("datah")
            .withDisableMetricsCollection("datacyasz")
            .withWriteBehavior(AzureSearchIndexWriteBehaviorType.UPLOAD);
        model = BinaryData.fromObject(model).toObject(AzureSearchIndexSink.class);
        Assertions.assertEquals(AzureSearchIndexWriteBehaviorType.UPLOAD, model.writeBehavior());
    }
}
