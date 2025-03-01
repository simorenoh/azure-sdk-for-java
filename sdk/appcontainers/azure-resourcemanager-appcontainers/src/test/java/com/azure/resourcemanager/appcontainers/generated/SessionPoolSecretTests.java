// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.SessionPoolSecret;
import org.junit.jupiter.api.Assertions;

public final class SessionPoolSecretTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SessionPoolSecret model
            = BinaryData.fromString("{\"name\":\"pemtuoqu\",\"value\":\"yegq\"}").toObject(SessionPoolSecret.class);
        Assertions.assertEquals("pemtuoqu", model.name());
        Assertions.assertEquals("yegq", model.value());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SessionPoolSecret model = new SessionPoolSecret().withName("pemtuoqu").withValue("yegq");
        model = BinaryData.fromObject(model).toObject(SessionPoolSecret.class);
        Assertions.assertEquals("pemtuoqu", model.name());
        Assertions.assertEquals("yegq", model.value());
    }
}
