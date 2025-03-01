// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceupdate.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Private link service proxy details.
 */
@Fluent
public final class PrivateLinkServiceProxy implements JsonSerializable<PrivateLinkServiceProxy> {
    /*
     * NRP resource ID.
     */
    private String id;

    /*
     * Remote private link service connection state
     */
    private PrivateLinkServiceConnectionState remotePrivateLinkServiceConnectionState;

    /*
     * Remote private endpoint connection details.
     */
    private PrivateLinkServiceProxyRemotePrivateEndpointConnection remotePrivateEndpointConnection;

    /*
     * Group connectivity information.
     */
    private List<GroupConnectivityInformation> groupConnectivityInformation;

    /**
     * Creates an instance of PrivateLinkServiceProxy class.
     */
    public PrivateLinkServiceProxy() {
    }

    /**
     * Get the id property: NRP resource ID.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: NRP resource ID.
     * 
     * @param id the id value to set.
     * @return the PrivateLinkServiceProxy object itself.
     */
    public PrivateLinkServiceProxy withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the remotePrivateLinkServiceConnectionState property: Remote private link service connection state.
     * 
     * @return the remotePrivateLinkServiceConnectionState value.
     */
    public PrivateLinkServiceConnectionState remotePrivateLinkServiceConnectionState() {
        return this.remotePrivateLinkServiceConnectionState;
    }

    /**
     * Set the remotePrivateLinkServiceConnectionState property: Remote private link service connection state.
     * 
     * @param remotePrivateLinkServiceConnectionState the remotePrivateLinkServiceConnectionState value to set.
     * @return the PrivateLinkServiceProxy object itself.
     */
    public PrivateLinkServiceProxy withRemotePrivateLinkServiceConnectionState(
        PrivateLinkServiceConnectionState remotePrivateLinkServiceConnectionState) {
        this.remotePrivateLinkServiceConnectionState = remotePrivateLinkServiceConnectionState;
        return this;
    }

    /**
     * Get the remotePrivateEndpointConnection property: Remote private endpoint connection details.
     * 
     * @return the remotePrivateEndpointConnection value.
     */
    public PrivateLinkServiceProxyRemotePrivateEndpointConnection remotePrivateEndpointConnection() {
        return this.remotePrivateEndpointConnection;
    }

    /**
     * Set the remotePrivateEndpointConnection property: Remote private endpoint connection details.
     * 
     * @param remotePrivateEndpointConnection the remotePrivateEndpointConnection value to set.
     * @return the PrivateLinkServiceProxy object itself.
     */
    public PrivateLinkServiceProxy withRemotePrivateEndpointConnection(
        PrivateLinkServiceProxyRemotePrivateEndpointConnection remotePrivateEndpointConnection) {
        this.remotePrivateEndpointConnection = remotePrivateEndpointConnection;
        return this;
    }

    /**
     * Get the groupConnectivityInformation property: Group connectivity information.
     * 
     * @return the groupConnectivityInformation value.
     */
    public List<GroupConnectivityInformation> groupConnectivityInformation() {
        return this.groupConnectivityInformation;
    }

    /**
     * Set the groupConnectivityInformation property: Group connectivity information.
     * 
     * @param groupConnectivityInformation the groupConnectivityInformation value to set.
     * @return the PrivateLinkServiceProxy object itself.
     */
    public PrivateLinkServiceProxy
        withGroupConnectivityInformation(List<GroupConnectivityInformation> groupConnectivityInformation) {
        this.groupConnectivityInformation = groupConnectivityInformation;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (remotePrivateLinkServiceConnectionState() != null) {
            remotePrivateLinkServiceConnectionState().validate();
        }
        if (remotePrivateEndpointConnection() != null) {
            remotePrivateEndpointConnection().validate();
        }
        if (groupConnectivityInformation() != null) {
            groupConnectivityInformation().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeJsonField("remotePrivateLinkServiceConnectionState",
            this.remotePrivateLinkServiceConnectionState);
        jsonWriter.writeJsonField("remotePrivateEndpointConnection", this.remotePrivateEndpointConnection);
        jsonWriter.writeArrayField("groupConnectivityInformation", this.groupConnectivityInformation,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PrivateLinkServiceProxy from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PrivateLinkServiceProxy if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PrivateLinkServiceProxy.
     */
    public static PrivateLinkServiceProxy fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PrivateLinkServiceProxy deserializedPrivateLinkServiceProxy = new PrivateLinkServiceProxy();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedPrivateLinkServiceProxy.id = reader.getString();
                } else if ("remotePrivateLinkServiceConnectionState".equals(fieldName)) {
                    deserializedPrivateLinkServiceProxy.remotePrivateLinkServiceConnectionState
                        = PrivateLinkServiceConnectionState.fromJson(reader);
                } else if ("remotePrivateEndpointConnection".equals(fieldName)) {
                    deserializedPrivateLinkServiceProxy.remotePrivateEndpointConnection
                        = PrivateLinkServiceProxyRemotePrivateEndpointConnection.fromJson(reader);
                } else if ("groupConnectivityInformation".equals(fieldName)) {
                    List<GroupConnectivityInformation> groupConnectivityInformation
                        = reader.readArray(reader1 -> GroupConnectivityInformation.fromJson(reader1));
                    deserializedPrivateLinkServiceProxy.groupConnectivityInformation = groupConnectivityInformation;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPrivateLinkServiceProxy;
        });
    }
}
