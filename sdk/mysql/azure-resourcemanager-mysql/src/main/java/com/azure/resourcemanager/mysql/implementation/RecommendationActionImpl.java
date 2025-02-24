// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.implementation;

import com.azure.resourcemanager.mysql.fluent.models.RecommendationActionInner;
import com.azure.resourcemanager.mysql.models.RecommendationAction;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Map;

public final class RecommendationActionImpl implements RecommendationAction {
    private RecommendationActionInner innerObject;

    private final com.azure.resourcemanager.mysql.MySqlManager serviceManager;

    RecommendationActionImpl(RecommendationActionInner innerObject,
        com.azure.resourcemanager.mysql.MySqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String advisorName() {
        return this.innerModel().advisorName();
    }

    public String sessionId() {
        return this.innerModel().sessionId();
    }

    public Integer actionId() {
        return this.innerModel().actionId();
    }

    public OffsetDateTime createdTime() {
        return this.innerModel().createdTime();
    }

    public OffsetDateTime expirationTime() {
        return this.innerModel().expirationTime();
    }

    public String reason() {
        return this.innerModel().reason();
    }

    public String recommendationType() {
        return this.innerModel().recommendationType();
    }

    public Map<String, String> details() {
        Map<String, String> inner = this.innerModel().details();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public RecommendationActionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.mysql.MySqlManager manager() {
        return this.serviceManager;
    }
}
