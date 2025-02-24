// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.hybridnetwork.models.VersionState;
import java.io.IOException;

/**
 * Publisher network service design version update request definition.
 */
@Fluent
public final class NetworkServiceDesignVersionUpdateStateInner
    implements JsonSerializable<NetworkServiceDesignVersionUpdateStateInner> {
    /*
     * The network service design version state.
     */
    private VersionState versionState;

    /**
     * Creates an instance of NetworkServiceDesignVersionUpdateStateInner class.
     */
    public NetworkServiceDesignVersionUpdateStateInner() {
    }

    /**
     * Get the versionState property: The network service design version state.
     * 
     * @return the versionState value.
     */
    public VersionState versionState() {
        return this.versionState;
    }

    /**
     * Set the versionState property: The network service design version state.
     * 
     * @param versionState the versionState value to set.
     * @return the NetworkServiceDesignVersionUpdateStateInner object itself.
     */
    public NetworkServiceDesignVersionUpdateStateInner withVersionState(VersionState versionState) {
        this.versionState = versionState;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("versionState", this.versionState == null ? null : this.versionState.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NetworkServiceDesignVersionUpdateStateInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NetworkServiceDesignVersionUpdateStateInner if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the NetworkServiceDesignVersionUpdateStateInner.
     */
    public static NetworkServiceDesignVersionUpdateStateInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NetworkServiceDesignVersionUpdateStateInner deserializedNetworkServiceDesignVersionUpdateStateInner
                = new NetworkServiceDesignVersionUpdateStateInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("versionState".equals(fieldName)) {
                    deserializedNetworkServiceDesignVersionUpdateStateInner.versionState
                        = VersionState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNetworkServiceDesignVersionUpdateStateInner;
        });
    }
}
