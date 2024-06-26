// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.FileSystemSink;

public final class FileSystemSinkTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FileSystemSink model = BinaryData.fromString(
            "{\"type\":\"bgohxb\",\"copyBehavior\":\"datacf\",\"writeBatchSize\":\"datazfpfxbqdrjunigxn\",\"writeBatchTimeout\":\"datanghgazdbvenv\",\"sinkRetryCount\":\"datati\",\"sinkRetryWait\":\"dataswrncwhlxvng\",\"maxConcurrentConnections\":\"datapydjdpapndmv\",\"disableMetricsCollection\":\"datadtvvta\",\"\":{\"kmfiudnpj\":\"datawkthmexidecdeh\",\"guv\":\"dataxfhtsgyyrg\",\"ytihhq\":\"datagqllgokznffqvtx\",\"rsnbdfamyolvgk\":\"datancwgrwgdpfzdygt\"}}")
            .toObject(FileSystemSink.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FileSystemSink model = new FileSystemSink().withWriteBatchSize("datazfpfxbqdrjunigxn")
            .withWriteBatchTimeout("datanghgazdbvenv")
            .withSinkRetryCount("datati")
            .withSinkRetryWait("dataswrncwhlxvng")
            .withMaxConcurrentConnections("datapydjdpapndmv")
            .withDisableMetricsCollection("datadtvvta")
            .withCopyBehavior("datacf");
        model = BinaryData.fromObject(model).toObject(FileSystemSink.class);
    }
}
