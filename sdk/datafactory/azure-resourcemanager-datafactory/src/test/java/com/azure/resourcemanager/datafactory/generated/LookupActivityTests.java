// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.ActivityOnInactiveMarkAs;
import com.azure.resourcemanager.datafactory.models.ActivityPolicy;
import com.azure.resourcemanager.datafactory.models.ActivityState;
import com.azure.resourcemanager.datafactory.models.CopySource;
import com.azure.resourcemanager.datafactory.models.DatasetReference;
import com.azure.resourcemanager.datafactory.models.DependencyCondition;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.LookupActivity;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class LookupActivityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LookupActivity model = BinaryData.fromString(
            "{\"type\":\"xgczwxyghsppmvxc\",\"typeProperties\":{\"source\":{\"type\":\"udranmdcfwaw\",\"sourceRetryCount\":\"datahfauubcv\",\"sourceRetryWait\":\"datafxwhicacmviclhom\",\"maxConcurrentConnections\":\"dataaxteg\",\"disableMetricsCollection\":\"dataf\",\"\":{\"jfzbavqmmk\":\"datan\"}},\"dataset\":{\"referenceName\":\"qdfjeuwwq\",\"parameters\":{\"qvywolccxdctkhe\":\"datazpskzplbzyj\",\"gemspn\":\"databosa\"}},\"firstRowOnly\":\"dataohhhexgxn\"},\"linkedServiceName\":{\"referenceName\":\"stzdxbspglcbhahx\",\"parameters\":{\"rhpihtxgjzifyh\":\"datau\",\"e\":\"datajgrbjmzagxjoimoz\",\"jgfihl\":\"datapscrfbdttcfwjzqu\",\"zb\":\"datalauo\"}},\"policy\":{\"timeout\":\"datafxvggk\",\"retry\":\"datahsny\",\"retryIntervalInSeconds\":2037856397,\"secureInput\":true,\"secureOutput\":true,\"\":{\"lzjki\":\"datatlfngonhmblkk\",\"h\":\"datamne\",\"qvcfzr\":\"dataynencaf\"}},\"name\":\"zpdq\",\"description\":\"chygbeofiwbtfkiu\",\"state\":\"Active\",\"onInactiveMarkAs\":\"Skipped\",\"dependsOn\":[{\"activity\":\"xjrafhdf\",\"dependencyConditions\":[\"Completed\",\"Skipped\"],\"\":{\"gqhefeasm\":\"datawnqijphhuvflg\",\"pcxxpyrtajlyde\":\"datadguodoujpwqbotlv\"}},{\"activity\":\"qfvrqru\",\"dependencyConditions\":[\"Failed\"],\"\":{\"jzvceyxvfoyuyk\":\"datauxbqdwbjh\"}}],\"userProperties\":[{\"name\":\"gyhpuhccl\",\"value\":\"datahndbutptyabd\"},{\"name\":\"bkblopemorfzuhvy\",\"value\":\"datadnd\"}],\"\":{\"kplnd\":\"datazsfvri\"}}")
            .toObject(LookupActivity.class);
        Assertions.assertEquals("zpdq", model.name());
        Assertions.assertEquals("chygbeofiwbtfkiu", model.description());
        Assertions.assertEquals(ActivityState.ACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.SKIPPED, model.onInactiveMarkAs());
        Assertions.assertEquals("xjrafhdf", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.COMPLETED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("gyhpuhccl", model.userProperties().get(0).name());
        Assertions.assertEquals("stzdxbspglcbhahx", model.linkedServiceName().referenceName());
        Assertions.assertEquals(2037856397, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(true, model.policy().secureInput());
        Assertions.assertEquals(true, model.policy().secureOutput());
        Assertions.assertEquals("qdfjeuwwq", model.dataset().referenceName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LookupActivity model
            = new LookupActivity().withName("zpdq")
                .withDescription("chygbeofiwbtfkiu")
                .withState(ActivityState.ACTIVE)
                .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.SKIPPED)
                .withDependsOn(Arrays.asList(
                    new ActivityDependency().withActivity("xjrafhdf")
                        .withDependencyConditions(
                            Arrays.asList(DependencyCondition.COMPLETED, DependencyCondition.SKIPPED))
                        .withAdditionalProperties(mapOf()),
                    new ActivityDependency().withActivity("qfvrqru")
                        .withDependencyConditions(Arrays.asList(DependencyCondition.FAILED))
                        .withAdditionalProperties(mapOf())))
                .withUserProperties(
                    Arrays.asList(new UserProperty().withName("gyhpuhccl").withValue("datahndbutptyabd"),
                        new UserProperty().withName("bkblopemorfzuhvy").withValue("datadnd")))
                .withLinkedServiceName(new LinkedServiceReference().withReferenceName("stzdxbspglcbhahx")
                    .withParameters(mapOf("rhpihtxgjzifyh", "datau", "e", "datajgrbjmzagxjoimoz", "jgfihl",
                        "datapscrfbdttcfwjzqu", "zb", "datalauo")))
                .withPolicy(new ActivityPolicy().withTimeout("datafxvggk")
                    .withRetry("datahsny")
                    .withRetryIntervalInSeconds(2037856397)
                    .withSecureInput(true)
                    .withSecureOutput(true)
                    .withAdditionalProperties(mapOf()))
                .withSource(new CopySource().withSourceRetryCount("datahfauubcv")
                    .withSourceRetryWait("datafxwhicacmviclhom")
                    .withMaxConcurrentConnections("dataaxteg")
                    .withDisableMetricsCollection("dataf")
                    .withAdditionalProperties(mapOf("type", "udranmdcfwaw")))
                .withDataset(new DatasetReference().withReferenceName("qdfjeuwwq")
                    .withParameters(mapOf("qvywolccxdctkhe", "datazpskzplbzyj", "gemspn", "databosa")))
                .withFirstRowOnly("dataohhhexgxn");
        model = BinaryData.fromObject(model).toObject(LookupActivity.class);
        Assertions.assertEquals("zpdq", model.name());
        Assertions.assertEquals("chygbeofiwbtfkiu", model.description());
        Assertions.assertEquals(ActivityState.ACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.SKIPPED, model.onInactiveMarkAs());
        Assertions.assertEquals("xjrafhdf", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.COMPLETED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("gyhpuhccl", model.userProperties().get(0).name());
        Assertions.assertEquals("stzdxbspglcbhahx", model.linkedServiceName().referenceName());
        Assertions.assertEquals(2037856397, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(true, model.policy().secureInput());
        Assertions.assertEquals(true, model.policy().secureOutput());
        Assertions.assertEquals("qdfjeuwwq", model.dataset().referenceName());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
