// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.powerbidedicated.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.powerbidedicated.PowerBIDedicatedManager;
import com.azure.resourcemanager.powerbidedicated.models.CapacitySkuTier;
import com.azure.resourcemanager.powerbidedicated.models.DedicatedCapacity;
import com.azure.resourcemanager.powerbidedicated.models.Mode;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class CapacitiesListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"sku\":{\"name\":\"plpho\",\"tier\":\"AutoPremiumHost\",\"capacity\":1106219716},\"properties\":{\"state\":\"Suspended\",\"provisioningState\":\"Suspended\",\"administration\":{\"members\":[\"bjtazqugxywpmu\"]},\"mode\":\"Gen1\",\"tenantId\":\"zwfqkqujidsuyon\",\"friendlyName\":\"glaocq\"},\"location\":\"ccm\",\"tags\":{\"moyrxvwfudwpz\":\"dxyt\",\"rqjbhckfrl\":\"txhdzh\",\"ca\":\"rxsbkyvp\"},\"id\":\"uzbpzkafku\",\"name\":\"b\",\"type\":\"rnwb\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        PowerBIDedicatedManager manager = PowerBIDedicatedManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<DedicatedCapacity> response = manager.capacities().list(com.azure.core.util.Context.NONE);

        Assertions.assertEquals("ccm", response.iterator().next().location());
        Assertions.assertEquals("dxyt", response.iterator().next().tags().get("moyrxvwfudwpz"));
        Assertions.assertEquals("plpho", response.iterator().next().sku().name());
        Assertions.assertEquals(CapacitySkuTier.AUTO_PREMIUM_HOST, response.iterator().next().sku().tier());
        Assertions.assertEquals(1106219716, response.iterator().next().sku().capacity());
        Assertions.assertEquals("bjtazqugxywpmu", response.iterator().next().administration().members().get(0));
        Assertions.assertEquals(Mode.GEN1, response.iterator().next().mode());
    }
}
