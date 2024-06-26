// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.communication.jobrouter.models;

import com.azure.communication.jobrouter.implementation.JsonMergePatchHelper;
import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * Abstract base class for defining a distribution mode.
 */
@Fluent
public class DistributionMode implements JsonSerializable<DistributionMode> {

    /*
     * The type discriminator describing a sub-type of DistributionMode.
     */
    @Generated
    private DistributionModeKind kind = DistributionModeKind.fromString("DistributionMode");

    /*
     * Governs the minimum desired number of active concurrent offers a job can have.
     */
    @Generated
    private Integer minConcurrentOffers;

    /*
     * Governs the maximum number of active concurrent offers a job can have.
     */
    @Generated
    private Integer maxConcurrentOffers;

    /*
     * If set to true, then router will match workers to jobs even if they don't match label selectors. Warning: You may
     * get workers that are not qualified for a job they are matched with if you set this variable to true. This flag is
     * intended more for temporary usage. By default, set to false.
     */
    @Generated
    private Boolean bypassSelectors;

    /**
     * Creates an instance of DistributionMode class.
     */
    @Generated
    public DistributionMode() {
    }

    /**
     * Get the kind property: The type discriminator describing a sub-type of DistributionMode.
     *
     * @return the kind value.
     */
    @Generated
    public DistributionModeKind getKind() {
        return this.kind;
    }

    /**
     * Get the minConcurrentOffers property: Governs the minimum desired number of active concurrent offers a job can
     * have.
     *
     * @return the minConcurrentOffers value.
     */
    @Generated
    public Integer getMinConcurrentOffers() {
        return this.minConcurrentOffers;
    }

    /**
     * Set the minConcurrentOffers property: Governs the minimum desired number of active concurrent offers a job can
     * have.
     *
     * @param minConcurrentOffers the minConcurrentOffers value to set.
     * @return the DistributionMode object itself.
     */
    @Generated
    public DistributionMode setMinConcurrentOffers(Integer minConcurrentOffers) {
        this.minConcurrentOffers = minConcurrentOffers;
        this.updatedProperties.add("minConcurrentOffers");
        return this;
    }

    /**
     * Get the maxConcurrentOffers property: Governs the maximum number of active concurrent offers a job can have.
     *
     * @return the maxConcurrentOffers value.
     */
    @Generated
    public Integer getMaxConcurrentOffers() {
        return this.maxConcurrentOffers;
    }

    /**
     * Set the maxConcurrentOffers property: Governs the maximum number of active concurrent offers a job can have.
     *
     * @param maxConcurrentOffers the maxConcurrentOffers value to set.
     * @return the DistributionMode object itself.
     */
    @Generated
    public DistributionMode setMaxConcurrentOffers(Integer maxConcurrentOffers) {
        this.maxConcurrentOffers = maxConcurrentOffers;
        this.updatedProperties.add("maxConcurrentOffers");
        return this;
    }

    /**
     * Get the bypassSelectors property: If set to true, then router will match workers to jobs even if they don't match
     * label selectors. Warning: You may get workers that are not qualified for a job they are matched with if you set
     * this variable to true. This flag is intended more for temporary usage. By default, set to false.
     *
     * @return the bypassSelectors value.
     */
    @Generated
    public Boolean isBypassSelectors() {
        return this.bypassSelectors;
    }

    /**
     * Set the bypassSelectors property: If set to true, then router will match workers to jobs even if they don't match
     * label selectors. Warning: You may get workers that are not qualified for a job they are matched with if you set
     * this variable to true. This flag is intended more for temporary usage. By default, set to false.
     *
     * @param bypassSelectors the bypassSelectors value to set.
     * @return the DistributionMode object itself.
     */
    @Generated
    public DistributionMode setBypassSelectors(Boolean bypassSelectors) {
        this.bypassSelectors = bypassSelectors;
        this.updatedProperties.add("bypassSelectors");
        return this;
    }

    /**
     * Stores updated model property, the value is property name, not serialized name.
     */
    @Generated
    private final Set<String> updatedProperties = new HashSet<>();

    @Generated
    private boolean jsonMergePatch;

    @Generated
    private void serializeAsJsonMergePatch(boolean jsonMergePatch) {
        this.jsonMergePatch = jsonMergePatch;
    }

    static {
        JsonMergePatchHelper.setDistributionModeAccessor(new JsonMergePatchHelper.DistributionModeAccessor() {

            @Override
            public DistributionMode prepareModelForJsonMergePatch(DistributionMode model,
                boolean jsonMergePatchEnabled) {
                model.serializeAsJsonMergePatch(jsonMergePatchEnabled);
                return model;
            }

            @Override
            public boolean isJsonMergePatch(DistributionMode model) {
                return model.jsonMergePatch;
            }

            @Override
            public void setMinConcurrentOffers(DistributionMode model, Integer minConcurrentOffers) {
                model.minConcurrentOffers = minConcurrentOffers;
            }

            @Override
            public void setMaxConcurrentOffers(DistributionMode model, Integer maxConcurrentOffers) {
                model.maxConcurrentOffers = maxConcurrentOffers;
            }

            @Override
            public void setBypassSelectors(DistributionMode model, Boolean bypassSelectors) {
                model.bypassSelectors = bypassSelectors;
            }
        });
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        if (jsonMergePatch) {
            return toJsonMergePatch(jsonWriter);
        } else {
            jsonWriter.writeStartObject();
            jsonWriter.writeStringField("kind", this.kind == null ? null : this.kind.toString());
            jsonWriter.writeNumberField("minConcurrentOffers", this.minConcurrentOffers);
            jsonWriter.writeNumberField("maxConcurrentOffers", this.maxConcurrentOffers);
            jsonWriter.writeBooleanField("bypassSelectors", this.bypassSelectors);
            return jsonWriter.writeEndObject();
        }
    }

    @Generated
    private JsonWriter toJsonMergePatch(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kind", this.kind.toString());
        if (updatedProperties.contains("minConcurrentOffers")) {
            if (this.minConcurrentOffers == null) {
                jsonWriter.writeNullField("minConcurrentOffers");
            } else {
                jsonWriter.writeNumberField("minConcurrentOffers", this.minConcurrentOffers);
            }
        }
        if (updatedProperties.contains("maxConcurrentOffers")) {
            if (this.maxConcurrentOffers == null) {
                jsonWriter.writeNullField("maxConcurrentOffers");
            } else {
                jsonWriter.writeNumberField("maxConcurrentOffers", this.maxConcurrentOffers);
            }
        }
        if (updatedProperties.contains("bypassSelectors")) {
            if (this.bypassSelectors == null) {
                jsonWriter.writeNullField("bypassSelectors");
            } else {
                jsonWriter.writeBooleanField("bypassSelectors", this.bypassSelectors);
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DistributionMode from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of DistributionMode if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the DistributionMode.
     */
    @Generated
    public static DistributionMode fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                // Prepare for reading
                readerToUse.nextToken();
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("kind".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("bestWorker".equals(discriminatorValue)) {
                    return BestWorkerMode.fromJson(readerToUse.reset());
                } else if ("longestIdle".equals(discriminatorValue)) {
                    return LongestIdleMode.fromJson(readerToUse.reset());
                } else if ("roundRobin".equals(discriminatorValue)) {
                    return RoundRobinMode.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    @Generated
    static DistributionMode fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DistributionMode deserializedDistributionMode = new DistributionMode();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("kind".equals(fieldName)) {
                    deserializedDistributionMode.kind = DistributionModeKind.fromString(reader.getString());
                } else if ("minConcurrentOffers".equals(fieldName)) {
                    deserializedDistributionMode.minConcurrentOffers = reader.getNullable(JsonReader::getInt);
                } else if ("maxConcurrentOffers".equals(fieldName)) {
                    deserializedDistributionMode.maxConcurrentOffers = reader.getNullable(JsonReader::getInt);
                } else if ("bypassSelectors".equals(fieldName)) {
                    deserializedDistributionMode.bypassSelectors = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedDistributionMode;
        });
    }
}
