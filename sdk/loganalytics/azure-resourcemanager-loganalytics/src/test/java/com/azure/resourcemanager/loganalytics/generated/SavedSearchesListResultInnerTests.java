// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.loganalytics.fluent.models.SavedSearchInner;
import com.azure.resourcemanager.loganalytics.fluent.models.SavedSearchesListResultInner;
import com.azure.resourcemanager.loganalytics.models.Tag;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class SavedSearchesListResultInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SavedSearchesListResultInner model = BinaryData.fromString(
            "{\"value\":[{\"etag\":\"abnetshh\",\"properties\":{\"category\":\"zhedplvwiw\",\"displayName\":\"bmwmbesldnkw\",\"query\":\"tppjflcx\",\"functionAlias\":\"aokonzmnsik\",\"functionParameters\":\"kqze\",\"version\":4891735483783264620,\"tags\":[{\"name\":\"fzxmhhvhgureodkw\",\"value\":\"bdagxt\"}]},\"id\":\"bqdxbx\",\"name\":\"akbogqxndlkzgxh\",\"type\":\"ripl\"},{\"etag\":\"odxun\",\"properties\":{\"category\":\"bebxmubyyntwl\",\"displayName\":\"bqtkoievseotgqr\",\"query\":\"ltmuwlauwzizx\",\"functionAlias\":\"pgcjefuzmuvp\",\"functionParameters\":\"tdum\",\"version\":411911013999749991,\"tags\":[{\"name\":\"bmnzbtbhjpgl\",\"value\":\"fgohdneuelfphs\"},{\"name\":\"yhtozfikdowwqu\",\"value\":\"v\"},{\"name\":\"zx\",\"value\":\"lvithhqzonosgg\"},{\"name\":\"hcohfwdsjnk\",\"value\":\"ljuti\"}]},\"id\":\"swacffgdkzz\",\"name\":\"wkfvhqcrailvp\",\"type\":\"ppfufl\"},{\"etag\":\"dmhdlxyjr\",\"properties\":{\"category\":\"sag\",\"displayName\":\"fcnihgwq\",\"query\":\"pnedgf\",\"functionAlias\":\"vkcvqvpkeqd\",\"functionParameters\":\"drhvoodsotbo\",\"version\":596884672630210595,\"tags\":[{\"name\":\"j\",\"value\":\"vnhdldwmgxcxr\"},{\"name\":\"lpmutwuoegrpkhj\",\"value\":\"niyqslui\"}]},\"id\":\"pdggkzzlvm\",\"name\":\"mpaxmodfvuefywsb\",\"type\":\"fvmwy\"},{\"etag\":\"fouyf\",\"properties\":{\"category\":\"aakc\",\"displayName\":\"wiyzvqtmnubexkp\",\"query\":\"ksmond\",\"functionAlias\":\"quxvypomgkop\",\"functionParameters\":\"hojvpajqgxysmocm\",\"version\":3563158574762399534,\"tags\":[{\"name\":\"kcxozapvhelx\",\"value\":\"rgly\"},{\"name\":\"tddckcb\",\"value\":\"uejrjxgc\"},{\"name\":\"qibrhosxsdqrhzoy\",\"value\":\"i\"}]},\"id\":\"m\",\"name\":\"qyib\",\"type\":\"hwflu\"}]}")
            .toObject(SavedSearchesListResultInner.class);
        Assertions.assertEquals("abnetshh", model.value().get(0).etag());
        Assertions.assertEquals("zhedplvwiw", model.value().get(0).category());
        Assertions.assertEquals("bmwmbesldnkw", model.value().get(0).displayName());
        Assertions.assertEquals("tppjflcx", model.value().get(0).query());
        Assertions.assertEquals("aokonzmnsik", model.value().get(0).functionAlias());
        Assertions.assertEquals("kqze", model.value().get(0).functionParameters());
        Assertions.assertEquals(4891735483783264620L, model.value().get(0).version());
        Assertions.assertEquals("fzxmhhvhgureodkw", model.value().get(0).tags().get(0).name());
        Assertions.assertEquals("bdagxt", model.value().get(0).tags().get(0).value());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SavedSearchesListResultInner model = new SavedSearchesListResultInner().withValue(Arrays.asList(
            new SavedSearchInner().withEtag("abnetshh")
                .withCategory("zhedplvwiw")
                .withDisplayName("bmwmbesldnkw")
                .withQuery("tppjflcx")
                .withFunctionAlias("aokonzmnsik")
                .withFunctionParameters("kqze")
                .withVersion(4891735483783264620L)
                .withTags(Arrays.asList(new Tag().withName("fzxmhhvhgureodkw").withValue("bdagxt"))),
            new SavedSearchInner().withEtag("odxun")
                .withCategory("bebxmubyyntwl")
                .withDisplayName("bqtkoievseotgqr")
                .withQuery("ltmuwlauwzizx")
                .withFunctionAlias("pgcjefuzmuvp")
                .withFunctionParameters("tdum")
                .withVersion(411911013999749991L)
                .withTags(Arrays.asList(new Tag().withName("bmnzbtbhjpgl").withValue("fgohdneuelfphs"),
                    new Tag().withName("yhtozfikdowwqu").withValue("v"),
                    new Tag().withName("zx").withValue("lvithhqzonosgg"),
                    new Tag().withName("hcohfwdsjnk").withValue("ljuti"))),
            new SavedSearchInner().withEtag("dmhdlxyjr")
                .withCategory("sag")
                .withDisplayName("fcnihgwq")
                .withQuery("pnedgf")
                .withFunctionAlias("vkcvqvpkeqd")
                .withFunctionParameters("drhvoodsotbo")
                .withVersion(596884672630210595L)
                .withTags(Arrays.asList(new Tag().withName("j").withValue("vnhdldwmgxcxr"),
                    new Tag().withName("lpmutwuoegrpkhj").withValue("niyqslui"))),
            new SavedSearchInner().withEtag("fouyf")
                .withCategory("aakc")
                .withDisplayName("wiyzvqtmnubexkp")
                .withQuery("ksmond")
                .withFunctionAlias("quxvypomgkop")
                .withFunctionParameters("hojvpajqgxysmocm")
                .withVersion(3563158574762399534L)
                .withTags(Arrays.asList(new Tag().withName("kcxozapvhelx").withValue("rgly"),
                    new Tag().withName("tddckcb").withValue("uejrjxgc"),
                    new Tag().withName("qibrhosxsdqrhzoy").withValue("i")))));
        model = BinaryData.fromObject(model).toObject(SavedSearchesListResultInner.class);
        Assertions.assertEquals("abnetshh", model.value().get(0).etag());
        Assertions.assertEquals("zhedplvwiw", model.value().get(0).category());
        Assertions.assertEquals("bmwmbesldnkw", model.value().get(0).displayName());
        Assertions.assertEquals("tppjflcx", model.value().get(0).query());
        Assertions.assertEquals("aokonzmnsik", model.value().get(0).functionAlias());
        Assertions.assertEquals("kqze", model.value().get(0).functionParameters());
        Assertions.assertEquals(4891735483783264620L, model.value().get(0).version());
        Assertions.assertEquals("fzxmhhvhgureodkw", model.value().get(0).tags().get(0).name());
        Assertions.assertEquals("bdagxt", model.value().get(0).tags().get(0).value());
    }
}
