// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.applicationinsights.models.ComponentLinkedStorageAccountsPatch;
import org.junit.jupiter.api.Assertions;

public final class ComponentLinkedStorageAccountsPatchTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ComponentLinkedStorageAccountsPatch model
            = BinaryData.fromString("{\"properties\":{\"linkedStorageAccount\":\"bgofeljag\"}}")
                .toObject(ComponentLinkedStorageAccountsPatch.class);
        Assertions.assertEquals("bgofeljag", model.linkedStorageAccount());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ComponentLinkedStorageAccountsPatch model
            = new ComponentLinkedStorageAccountsPatch().withLinkedStorageAccount("bgofeljag");
        model = BinaryData.fromObject(model).toObject(ComponentLinkedStorageAccountsPatch.class);
        Assertions.assertEquals("bgofeljag", model.linkedStorageAccount());
    }
}
