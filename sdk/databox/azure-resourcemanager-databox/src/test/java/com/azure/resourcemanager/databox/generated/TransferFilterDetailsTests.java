// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.databox.models.AzureFileFilterDetails;
import com.azure.resourcemanager.databox.models.BlobFilterDetails;
import com.azure.resourcemanager.databox.models.DataAccountType;
import com.azure.resourcemanager.databox.models.FilterFileDetails;
import com.azure.resourcemanager.databox.models.FilterFileType;
import com.azure.resourcemanager.databox.models.TransferFilterDetails;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class TransferFilterDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TransferFilterDetails model = BinaryData.fromString(
            "{\"dataAccountType\":\"ManagedDisk\",\"blobFilterDetails\":{\"blobPrefixList\":[\"zao\",\"vuhrhcffcyddgl\",\"jthjqkwpyei\"],\"blobPathList\":[\"qciwqvhkhixuigdt\"],\"containerList\":[\"objoghmewu\"]},\"azureFileFilterDetails\":{\"filePrefixList\":[\"hrzayvvtpgvdf\",\"iotkftutqxl\",\"gxlefgugnxkrxd\"],\"filePathList\":[\"dt\"],\"fileShareList\":[\"rvqdra\",\"hjybigehoqfbo\"]},\"filterFileDetails\":[{\"filterFileType\":\"AzureFile\",\"filterFilePath\":\"nyktzlcuiy\"},{\"filterFileType\":\"AzureFile\",\"filterFilePath\":\"qyw\"},{\"filterFileType\":\"AzureFile\",\"filterFilePath\":\"drvyn\"},{\"filterFileType\":\"AzureFile\",\"filterFilePath\":\"gpphrcgyn\"}]}")
            .toObject(TransferFilterDetails.class);
        Assertions.assertEquals(DataAccountType.MANAGED_DISK, model.dataAccountType());
        Assertions.assertEquals("zao", model.blobFilterDetails().blobPrefixList().get(0));
        Assertions.assertEquals("qciwqvhkhixuigdt", model.blobFilterDetails().blobPathList().get(0));
        Assertions.assertEquals("objoghmewu", model.blobFilterDetails().containerList().get(0));
        Assertions.assertEquals("hrzayvvtpgvdf", model.azureFileFilterDetails().filePrefixList().get(0));
        Assertions.assertEquals("dt", model.azureFileFilterDetails().filePathList().get(0));
        Assertions.assertEquals("rvqdra", model.azureFileFilterDetails().fileShareList().get(0));
        Assertions.assertEquals(FilterFileType.AZURE_FILE, model.filterFileDetails().get(0).filterFileType());
        Assertions.assertEquals("nyktzlcuiy", model.filterFileDetails().get(0).filterFilePath());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TransferFilterDetails model = new TransferFilterDetails().withDataAccountType(DataAccountType.MANAGED_DISK)
            .withBlobFilterDetails(
                new BlobFilterDetails().withBlobPrefixList(Arrays.asList("zao", "vuhrhcffcyddgl", "jthjqkwpyei"))
                    .withBlobPathList(Arrays.asList("qciwqvhkhixuigdt"))
                    .withContainerList(Arrays.asList("objoghmewu")))
            .withAzureFileFilterDetails(new AzureFileFilterDetails()
                .withFilePrefixList(Arrays.asList("hrzayvvtpgvdf", "iotkftutqxl", "gxlefgugnxkrxd"))
                .withFilePathList(Arrays.asList("dt"))
                .withFileShareList(Arrays.asList("rvqdra", "hjybigehoqfbo")))
            .withFilterFileDetails(Arrays.asList(
                new FilterFileDetails().withFilterFileType(FilterFileType.AZURE_FILE).withFilterFilePath("nyktzlcuiy"),
                new FilterFileDetails().withFilterFileType(FilterFileType.AZURE_FILE).withFilterFilePath("qyw"),
                new FilterFileDetails().withFilterFileType(FilterFileType.AZURE_FILE).withFilterFilePath("drvyn"),
                new FilterFileDetails().withFilterFileType(FilterFileType.AZURE_FILE).withFilterFilePath("gpphrcgyn")));
        model = BinaryData.fromObject(model).toObject(TransferFilterDetails.class);
        Assertions.assertEquals(DataAccountType.MANAGED_DISK, model.dataAccountType());
        Assertions.assertEquals("zao", model.blobFilterDetails().blobPrefixList().get(0));
        Assertions.assertEquals("qciwqvhkhixuigdt", model.blobFilterDetails().blobPathList().get(0));
        Assertions.assertEquals("objoghmewu", model.blobFilterDetails().containerList().get(0));
        Assertions.assertEquals("hrzayvvtpgvdf", model.azureFileFilterDetails().filePrefixList().get(0));
        Assertions.assertEquals("dt", model.azureFileFilterDetails().filePathList().get(0));
        Assertions.assertEquals("rvqdra", model.azureFileFilterDetails().fileShareList().get(0));
        Assertions.assertEquals(FilterFileType.AZURE_FILE, model.filterFileDetails().get(0).filterFileType());
        Assertions.assertEquals("nyktzlcuiy", model.filterFileDetails().get(0).filterFilePath());
    }
}
