// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.ClientScriptForConnect;
import com.azure.resourcemanager.recoveryservicesbackup.models.InstantItemRecoveryTarget;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class InstantItemRecoveryTargetTests {
    @Test
    public void testDeserialize() {
        InstantItemRecoveryTarget model =
            BinaryData
                .fromString(
                    "{\"clientScripts\":[{\"scriptContent\":\"eksgbuxantuygd\",\"scriptExtension\":\"aq\",\"osType\":\"irpiwrqofulopmj\",\"url\":\"exwhcb\",\"scriptNameSuffix\":\"ibkeph\"},{\"scriptContent\":\"uerct\",\"scriptExtension\":\"oyin\",\"osType\":\"pbrlcyrduczkgofx\",\"url\":\"srucvcrrpcjtt\",\"scriptNameSuffix\":\"t\"},{\"scriptContent\":\"eaqnrmvvfkoxm\",\"scriptExtension\":\"hktuidvrma\",\"osType\":\"pdwwexymzvlazi\",\"url\":\"hpwvqsgnyyuu\",\"scriptNameSuffix\":\"vensrpm\"},{\"scriptContent\":\"yvpkpatlbijpzgsk\",\"scriptExtension\":\"fhfv\",\"osType\":\"mknbnxwcdommpv\",\"url\":\"awz\",\"scriptNameSuffix\":\"brttuiacl\"}]}")
                .toObject(InstantItemRecoveryTarget.class);
        Assertions.assertEquals("eksgbuxantuygd", model.clientScripts().get(0).scriptContent());
        Assertions.assertEquals("aq", model.clientScripts().get(0).scriptExtension());
        Assertions.assertEquals("irpiwrqofulopmj", model.clientScripts().get(0).osType());
        Assertions.assertEquals("exwhcb", model.clientScripts().get(0).url());
        Assertions.assertEquals("ibkeph", model.clientScripts().get(0).scriptNameSuffix());
    }

    @Test
    public void testSerialize() {
        InstantItemRecoveryTarget model =
            new InstantItemRecoveryTarget()
                .withClientScripts(
                    Arrays
                        .asList(
                            new ClientScriptForConnect()
                                .withScriptContent("eksgbuxantuygd")
                                .withScriptExtension("aq")
                                .withOsType("irpiwrqofulopmj")
                                .withUrl("exwhcb")
                                .withScriptNameSuffix("ibkeph"),
                            new ClientScriptForConnect()
                                .withScriptContent("uerct")
                                .withScriptExtension("oyin")
                                .withOsType("pbrlcyrduczkgofx")
                                .withUrl("srucvcrrpcjtt")
                                .withScriptNameSuffix("t"),
                            new ClientScriptForConnect()
                                .withScriptContent("eaqnrmvvfkoxm")
                                .withScriptExtension("hktuidvrma")
                                .withOsType("pdwwexymzvlazi")
                                .withUrl("hpwvqsgnyyuu")
                                .withScriptNameSuffix("vensrpm"),
                            new ClientScriptForConnect()
                                .withScriptContent("yvpkpatlbijpzgsk")
                                .withScriptExtension("fhfv")
                                .withOsType("mknbnxwcdommpv")
                                .withUrl("awz")
                                .withScriptNameSuffix("brttuiacl")));
        model = BinaryData.fromObject(model).toObject(InstantItemRecoveryTarget.class);
        Assertions.assertEquals("eksgbuxantuygd", model.clientScripts().get(0).scriptContent());
        Assertions.assertEquals("aq", model.clientScripts().get(0).scriptExtension());
        Assertions.assertEquals("irpiwrqofulopmj", model.clientScripts().get(0).osType());
        Assertions.assertEquals("exwhcb", model.clientScripts().get(0).url());
        Assertions.assertEquals("ibkeph", model.clientScripts().get(0).scriptNameSuffix());
    }
}