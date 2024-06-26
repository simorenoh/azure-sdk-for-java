// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.informaticadatamanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.informaticadatamanagement.models.UserDetails;
import org.junit.jupiter.api.Assertions;

public final class UserDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UserDetails model = BinaryData.fromString(
            "{\"firstName\":\"wyiftyhxhur\",\"lastName\":\"ftyxolniw\",\"emailAddress\":\"cukjf\",\"upn\":\"iawxklry\",\"phoneNumber\":\"wckbasyypnd\"}")
            .toObject(UserDetails.class);
        Assertions.assertEquals("wyiftyhxhur", model.firstName());
        Assertions.assertEquals("ftyxolniw", model.lastName());
        Assertions.assertEquals("cukjf", model.emailAddress());
        Assertions.assertEquals("iawxklry", model.upn());
        Assertions.assertEquals("wckbasyypnd", model.phoneNumber());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UserDetails model = new UserDetails().withFirstName("wyiftyhxhur")
            .withLastName("ftyxolniw")
            .withEmailAddress("cukjf")
            .withUpn("iawxklry")
            .withPhoneNumber("wckbasyypnd");
        model = BinaryData.fromObject(model).toObject(UserDetails.class);
        Assertions.assertEquals("wyiftyhxhur", model.firstName());
        Assertions.assertEquals("ftyxolniw", model.lastName());
        Assertions.assertEquals("cukjf", model.emailAddress());
        Assertions.assertEquals("iawxklry", model.upn());
        Assertions.assertEquals("wckbasyypnd", model.phoneNumber());
    }
}
