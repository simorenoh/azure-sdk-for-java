// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.iotoperations.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.iotoperations.models.BatchingConfiguration;
import org.junit.jupiter.api.Assertions;

public final class BatchingConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BatchingConfiguration model = BinaryData.fromString("{\"latencySeconds\":1769146485,\"maxMessages\":544110475}")
            .toObject(BatchingConfiguration.class);
        Assertions.assertEquals(1769146485, model.latencySeconds());
        Assertions.assertEquals(544110475, model.maxMessages());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BatchingConfiguration model
            = new BatchingConfiguration().withLatencySeconds(1769146485).withMaxMessages(544110475);
        model = BinaryData.fromObject(model).toObject(BatchingConfiguration.class);
        Assertions.assertEquals(1769146485, model.latencySeconds());
        Assertions.assertEquals(544110475, model.maxMessages());
    }
}
