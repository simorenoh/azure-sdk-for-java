// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Model class for event details of a HyperVReplica E2A event.
 */
@Fluent
public final class HyperVReplicaAzureEventDetails extends EventProviderSpecificDetails {
    /*
     * Gets the class type. Overridden in derived classes.
     */
    private String instanceType = "HyperVReplicaAzure";

    /*
     * The container friendly name.
     */
    private String containerName;

    /*
     * The fabric friendly name.
     */
    private String fabricName;

    /*
     * The remote container name.
     */
    private String remoteContainerName;

    /**
     * Creates an instance of HyperVReplicaAzureEventDetails class.
     */
    public HyperVReplicaAzureEventDetails() {
    }

    /**
     * Get the instanceType property: Gets the class type. Overridden in derived classes.
     * 
     * @return the instanceType value.
     */
    @Override
    public String instanceType() {
        return this.instanceType;
    }

    /**
     * Get the containerName property: The container friendly name.
     * 
     * @return the containerName value.
     */
    public String containerName() {
        return this.containerName;
    }

    /**
     * Set the containerName property: The container friendly name.
     * 
     * @param containerName the containerName value to set.
     * @return the HyperVReplicaAzureEventDetails object itself.
     */
    public HyperVReplicaAzureEventDetails withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * Get the fabricName property: The fabric friendly name.
     * 
     * @return the fabricName value.
     */
    public String fabricName() {
        return this.fabricName;
    }

    /**
     * Set the fabricName property: The fabric friendly name.
     * 
     * @param fabricName the fabricName value to set.
     * @return the HyperVReplicaAzureEventDetails object itself.
     */
    public HyperVReplicaAzureEventDetails withFabricName(String fabricName) {
        this.fabricName = fabricName;
        return this;
    }

    /**
     * Get the remoteContainerName property: The remote container name.
     * 
     * @return the remoteContainerName value.
     */
    public String remoteContainerName() {
        return this.remoteContainerName;
    }

    /**
     * Set the remoteContainerName property: The remote container name.
     * 
     * @param remoteContainerName the remoteContainerName value to set.
     * @return the HyperVReplicaAzureEventDetails object itself.
     */
    public HyperVReplicaAzureEventDetails withRemoteContainerName(String remoteContainerName) {
        this.remoteContainerName = remoteContainerName;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("instanceType", this.instanceType);
        jsonWriter.writeStringField("containerName", this.containerName);
        jsonWriter.writeStringField("fabricName", this.fabricName);
        jsonWriter.writeStringField("remoteContainerName", this.remoteContainerName);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of HyperVReplicaAzureEventDetails from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of HyperVReplicaAzureEventDetails if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the HyperVReplicaAzureEventDetails.
     */
    public static HyperVReplicaAzureEventDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            HyperVReplicaAzureEventDetails deserializedHyperVReplicaAzureEventDetails
                = new HyperVReplicaAzureEventDetails();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("instanceType".equals(fieldName)) {
                    deserializedHyperVReplicaAzureEventDetails.instanceType = reader.getString();
                } else if ("containerName".equals(fieldName)) {
                    deserializedHyperVReplicaAzureEventDetails.containerName = reader.getString();
                } else if ("fabricName".equals(fieldName)) {
                    deserializedHyperVReplicaAzureEventDetails.fabricName = reader.getString();
                } else if ("remoteContainerName".equals(fieldName)) {
                    deserializedHyperVReplicaAzureEventDetails.remoteContainerName = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedHyperVReplicaAzureEventDetails;
        });
    }
}
