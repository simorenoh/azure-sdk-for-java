// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.logic.LogicManager;
import com.azure.resourcemanager.logic.models.BatchConfiguration;
import com.azure.resourcemanager.logic.models.DaysOfWeek;
import com.azure.resourcemanager.logic.models.RecurrenceFrequency;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class IntegrationAccountBatchConfigurationsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"batchGroupName\":\"mibiyl\",\"releaseCriteria\":{\"messageCount\":486809374,\"batchSize\":944801789,\"recurrence\":{\"frequency\":\"Week\",\"interval\":553204445,\"startTime\":\"rblwq\",\"endTime\":\"yr\",\"timeZone\":\"stbzpozqluu\",\"schedule\":{\"minutes\":[992765952,1121183998,1645416694],\"hours\":[757827348,1976951127,532577841,1277148051],\"weekDays\":[\"Sunday\",\"Saturday\"],\"monthDays\":[1722848767],\"monthlyOccurrences\":[{},{},{},{}]}}},\"createdTime\":\"2021-09-15T18:48:16Z\",\"changedTime\":\"2021-01-05T04:20:04Z\",\"metadata\":\"datauenteucao\"},\"location\":\"jbbwftcnz\",\"tags\":{\"emqptxekmdkbt\":\"a\",\"lppnevujkzb\":\"upmlayejocsqtibu\"},\"id\":\"kgvwkdgsrtm\",\"name\":\"fajygnhmoeoxs\",\"type\":\"bl\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        LogicManager manager = LogicManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        BatchConfiguration response = manager.integrationAccountBatchConfigurations()
            .getWithResponse("nrpqsj", "gncyksb", "reqbwa", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("jbbwftcnz", response.location());
        Assertions.assertEquals("a", response.tags().get("emqptxekmdkbt"));
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-15T18:48:16Z"), response.properties().createdTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-05T04:20:04Z"), response.properties().changedTime());
        Assertions.assertEquals("mibiyl", response.properties().batchGroupName());
        Assertions.assertEquals(486809374, response.properties().releaseCriteria().messageCount());
        Assertions.assertEquals(944801789, response.properties().releaseCriteria().batchSize());
        Assertions.assertEquals(RecurrenceFrequency.WEEK,
            response.properties().releaseCriteria().recurrence().frequency());
        Assertions.assertEquals(553204445, response.properties().releaseCriteria().recurrence().interval());
        Assertions.assertEquals("rblwq", response.properties().releaseCriteria().recurrence().startTime());
        Assertions.assertEquals("yr", response.properties().releaseCriteria().recurrence().endTime());
        Assertions.assertEquals("stbzpozqluu", response.properties().releaseCriteria().recurrence().timeZone());
        Assertions.assertEquals(992765952,
            response.properties().releaseCriteria().recurrence().schedule().minutes().get(0));
        Assertions.assertEquals(757827348,
            response.properties().releaseCriteria().recurrence().schedule().hours().get(0));
        Assertions.assertEquals(DaysOfWeek.SUNDAY,
            response.properties().releaseCriteria().recurrence().schedule().weekDays().get(0));
        Assertions.assertEquals(1722848767,
            response.properties().releaseCriteria().recurrence().schedule().monthDays().get(0));
    }
}
