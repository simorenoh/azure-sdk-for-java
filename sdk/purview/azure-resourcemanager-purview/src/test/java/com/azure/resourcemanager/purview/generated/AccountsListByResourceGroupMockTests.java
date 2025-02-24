// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.purview.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.purview.PurviewManager;
import com.azure.resourcemanager.purview.models.Account;
import com.azure.resourcemanager.purview.models.PublicNetworkAccess;
import com.azure.resourcemanager.purview.models.Type;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class AccountsListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"cloudConnectors\":{\"awsExternalId\":\"mbmpaxmodfvuefy\"},\"createdAt\":\"2021-06-26T00:17:44Z\",\"createdBy\":\"fvmwy\",\"createdByObjectId\":\"fouyf\",\"endpoints\":{\"catalog\":\"kcpwiy\",\"guardian\":\"qtmnubexkpzk\",\"scan\":\"ondjmq\"},\"friendlyName\":\"vypomgkopkwho\",\"managedResourceGroupName\":\"pajqgxysm\",\"managedResources\":{\"eventHubNamespace\":\"bq\",\"resourceGroup\":\"vmkcx\",\"storageAccount\":\"apvhelxprgly\"},\"privateEndpointConnections\":[{\"properties\":{\"privateEndpoint\":{},\"privateLinkServiceConnectionState\":{},\"provisioningState\":\"bcuejrjxgci\"},\"id\":\"ibrhosxsdqr\",\"name\":\"zoymibmrqyibahw\",\"type\":\"luszdtmhrkwof\"}],\"provisioningState\":\"Deleting\",\"publicNetworkAccess\":\"Enabled\"},\"sku\":{\"capacity\":354911524,\"name\":\"Standard\"},\"identity\":{\"principalId\":\"btgiwbwoenwas\",\"tenantId\":\"tdtkcn\",\"type\":\"SystemAssigned\",\"userAssignedIdentities\":{\"obyu\":{\"clientId\":\"kulpiujwaasi\",\"principalId\":\"i\"}}},\"location\":\"rpqlp\",\"tags\":{\"t\":\"ciuqgbdb\",\"mhykojoxafnndl\":\"uvfbtkuwh\",\"kkpwdreqnovvq\":\"ichkoymkcdyhb\",\"syrsndsytgadgvra\":\"ovljxywsu\"},\"id\":\"aeneqnzarrwl\",\"name\":\"uu\",\"type\":\"jfqka\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        PurviewManager manager = PurviewManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Account> response
            = manager.accounts().listByResourceGroup("uicpd", "gk", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("rpqlp", response.iterator().next().location());
        Assertions.assertEquals("ciuqgbdb", response.iterator().next().tags().get("t"));
        Assertions.assertEquals(Type.SYSTEM_ASSIGNED, response.iterator().next().identity().type());
        Assertions.assertEquals("pajqgxysm", response.iterator().next().managedResourceGroupName());
        Assertions.assertEquals(PublicNetworkAccess.ENABLED, response.iterator().next().publicNetworkAccess());
    }
}
