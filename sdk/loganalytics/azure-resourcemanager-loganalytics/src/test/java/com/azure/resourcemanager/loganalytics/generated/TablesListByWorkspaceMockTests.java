// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.loganalytics.LogAnalyticsManager;
import com.azure.resourcemanager.loganalytics.models.ColumnDataTypeHintEnum;
import com.azure.resourcemanager.loganalytics.models.ColumnTypeEnum;
import com.azure.resourcemanager.loganalytics.models.Table;
import com.azure.resourcemanager.loganalytics.models.TablePlanEnum;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class TablesListByWorkspaceMockTests {
    @Test
    public void testListByWorkspace() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"retentionInDays\":143517524,\"totalRetentionInDays\":1172309322,\"archiveRetentionInDays\":1559182660,\"searchResults\":{\"query\":\"mmfz\",\"description\":\"fwxrzxmdew\",\"limit\":1373177035,\"startSearchTime\":\"2021-04-20T22:50:05Z\",\"endSearchTime\":\"2021-01-08T17:25:29Z\",\"sourceTable\":\"bjazejwwviy\",\"azureAsyncOperationId\":\"ps\"},\"restoredLogs\":{\"startRestoreTime\":\"2021-11-20T14:34:31Z\",\"endRestoreTime\":\"2021-01-22T13:49:23Z\",\"sourceTable\":\"jxsqwjhqkbiwetp\",\"azureAsyncOperationId\":\"ycyqiqyhgfsetzl\"},\"resultStatistics\":{\"progress\":37.550117,\"ingestedRecords\":207278850,\"scannedGb\":68.76575},\"plan\":\"Basic\",\"lastPlanModifiedDate\":\"jpziu\",\"schema\":{\"name\":\"zkkdtnhqs\",\"displayName\":\"ljselp\",\"description\":\"bafvafhlbylcc\",\"columns\":[{\"name\":\"rhyzdf\",\"type\":\"real\",\"dataTypeHint\":\"uri\",\"displayName\":\"ltdb\",\"description\":\"irrhv\",\"isDefaultDisplay\":false,\"isHidden\":false}],\"standardColumns\":[{\"name\":\"pqigtuujwouhd\",\"type\":\"string\",\"dataTypeHint\":\"ip\",\"displayName\":\"bjb\",\"description\":\"jybvit\",\"isDefaultDisplay\":true,\"isHidden\":false},{\"name\":\"znumtggmuwdchoz\",\"type\":\"long\",\"dataTypeHint\":\"armPath\",\"displayName\":\"lv\",\"description\":\"oakizvoai\",\"isDefaultDisplay\":false,\"isHidden\":false},{\"name\":\"uwiguyxlyk\",\"type\":\"boolean\",\"dataTypeHint\":\"armPath\",\"displayName\":\"cwxhmpej\",\"description\":\"ke\",\"isDefaultDisplay\":true,\"isHidden\":false},{\"name\":\"vkcqhr\",\"type\":\"string\",\"dataTypeHint\":\"guid\",\"displayName\":\"ccrmmk\",\"description\":\"pijubyq\",\"isDefaultDisplay\":false,\"isHidden\":false}],\"categories\":[\"frkemyildudxja\",\"cowvfdjkp\",\"xphlkksnmg\",\"vyfijdkzuqnw\"],\"labels\":[\"huqol\",\"ah\",\"uqwqulsutrjbhxyk\"],\"source\":\"microsoft\",\"tableType\":\"CustomLog\",\"tableSubType\":\"Any\",\"solutions\":[\"ugdrftbc\",\"exreu\",\"uowtljvfwhrea\",\"khyxvrqtvbcz\"]},\"provisioningState\":\"Succeeded\",\"retentionInDaysAsDefault\":true,\"totalRetentionInDaysAsDefault\":false},\"systemData\":{\"createdBy\":\"epjpfs\",\"createdByType\":\"ManagedIdentity\",\"createdAt\":\"2021-11-01T10:59:42Z\",\"lastModifiedBy\":\"ngpszngafpg\",\"lastModifiedByType\":\"User\",\"lastModifiedAt\":\"2021-07-27T16:28:59Z\"},\"id\":\"cj\",\"name\":\"jcngoadyed\",\"type\":\"zrgjfok\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        LogAnalyticsManager manager = LogAnalyticsManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Table> response
            = manager.tables().listByWorkspace("upnqrmgjfb", "kuwxeoiojfizfavk", com.azure.core.util.Context.NONE);

        Assertions.assertEquals(143517524, response.iterator().next().retentionInDays());
        Assertions.assertEquals(1172309322, response.iterator().next().totalRetentionInDays());
        Assertions.assertEquals("mmfz", response.iterator().next().searchResults().query());
        Assertions.assertEquals("fwxrzxmdew", response.iterator().next().searchResults().description());
        Assertions.assertEquals(1373177035, response.iterator().next().searchResults().limit());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-20T22:50:05Z"),
            response.iterator().next().searchResults().startSearchTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-08T17:25:29Z"),
            response.iterator().next().searchResults().endSearchTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-20T14:34:31Z"),
            response.iterator().next().restoredLogs().startRestoreTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-22T13:49:23Z"),
            response.iterator().next().restoredLogs().endRestoreTime());
        Assertions.assertEquals("jxsqwjhqkbiwetp", response.iterator().next().restoredLogs().sourceTable());
        Assertions.assertEquals(TablePlanEnum.BASIC, response.iterator().next().plan());
        Assertions.assertEquals("zkkdtnhqs", response.iterator().next().schema().name());
        Assertions.assertEquals("ljselp", response.iterator().next().schema().displayName());
        Assertions.assertEquals("bafvafhlbylcc", response.iterator().next().schema().description());
        Assertions.assertEquals("rhyzdf", response.iterator().next().schema().columns().get(0).name());
        Assertions.assertEquals(ColumnTypeEnum.REAL, response.iterator().next().schema().columns().get(0).type());
        Assertions.assertEquals(ColumnDataTypeHintEnum.URI,
            response.iterator().next().schema().columns().get(0).dataTypeHint());
        Assertions.assertEquals("ltdb", response.iterator().next().schema().columns().get(0).displayName());
        Assertions.assertEquals("irrhv", response.iterator().next().schema().columns().get(0).description());
    }
}
