// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakestore.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Data Lake Store virtual network rule information.
 */
@Fluent
public final class VirtualNetworkRuleInner extends SubResource {
    /*
     * The virtual network rule properties.
     */
    private VirtualNetworkRuleProperties innerProperties;

    /*
     * The resource name.
     */
    private String name;

    /*
     * The resource type.
     */
    private String type;

    /**
     * Creates an instance of VirtualNetworkRuleInner class.
     */
    public VirtualNetworkRuleInner() {
    }

    /**
     * Get the innerProperties property: The virtual network rule properties.
     * 
     * @return the innerProperties value.
     */
    private VirtualNetworkRuleProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: The resource name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The resource type.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VirtualNetworkRuleInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the subnetId property: The resource identifier for the subnet.
     * 
     * @return the subnetId value.
     */
    public String subnetId() {
        return this.innerProperties() == null ? null : this.innerProperties().subnetId();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", id());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VirtualNetworkRuleInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VirtualNetworkRuleInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VirtualNetworkRuleInner.
     */
    public static VirtualNetworkRuleInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VirtualNetworkRuleInner deserializedVirtualNetworkRuleInner = new VirtualNetworkRuleInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedVirtualNetworkRuleInner.withId(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedVirtualNetworkRuleInner.innerProperties = VirtualNetworkRuleProperties.fromJson(reader);
                } else if ("name".equals(fieldName)) {
                    deserializedVirtualNetworkRuleInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedVirtualNetworkRuleInner.type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVirtualNetworkRuleInner;
        });
    }
}
