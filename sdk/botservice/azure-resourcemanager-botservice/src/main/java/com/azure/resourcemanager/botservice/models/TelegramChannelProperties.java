// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The parameters to provide for the Telegram channel.
 */
@Fluent
public final class TelegramChannelProperties implements JsonSerializable<TelegramChannelProperties> {
    /*
     * The Telegram access token. Value only returned through POST to the action Channel List API, otherwise empty.
     */
    private String accessToken;

    /*
     * Whether this channel is validated for the bot
     */
    private Boolean isValidated;

    /*
     * Whether this channel is enabled for the bot
     */
    private boolean isEnabled;

    /**
     * Creates an instance of TelegramChannelProperties class.
     */
    public TelegramChannelProperties() {
    }

    /**
     * Get the accessToken property: The Telegram access token. Value only returned through POST to the action Channel
     * List API, otherwise empty.
     * 
     * @return the accessToken value.
     */
    public String accessToken() {
        return this.accessToken;
    }

    /**
     * Set the accessToken property: The Telegram access token. Value only returned through POST to the action Channel
     * List API, otherwise empty.
     * 
     * @param accessToken the accessToken value to set.
     * @return the TelegramChannelProperties object itself.
     */
    public TelegramChannelProperties withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * Get the isValidated property: Whether this channel is validated for the bot.
     * 
     * @return the isValidated value.
     */
    public Boolean isValidated() {
        return this.isValidated;
    }

    /**
     * Set the isValidated property: Whether this channel is validated for the bot.
     * 
     * @param isValidated the isValidated value to set.
     * @return the TelegramChannelProperties object itself.
     */
    public TelegramChannelProperties withIsValidated(Boolean isValidated) {
        this.isValidated = isValidated;
        return this;
    }

    /**
     * Get the isEnabled property: Whether this channel is enabled for the bot.
     * 
     * @return the isEnabled value.
     */
    public boolean isEnabled() {
        return this.isEnabled;
    }

    /**
     * Set the isEnabled property: Whether this channel is enabled for the bot.
     * 
     * @param isEnabled the isEnabled value to set.
     * @return the TelegramChannelProperties object itself.
     */
    public TelegramChannelProperties withIsEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
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
        jsonWriter.writeBooleanField("isEnabled", this.isEnabled);
        jsonWriter.writeStringField("accessToken", this.accessToken);
        jsonWriter.writeBooleanField("isValidated", this.isValidated);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TelegramChannelProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TelegramChannelProperties if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the TelegramChannelProperties.
     */
    public static TelegramChannelProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TelegramChannelProperties deserializedTelegramChannelProperties = new TelegramChannelProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("isEnabled".equals(fieldName)) {
                    deserializedTelegramChannelProperties.isEnabled = reader.getBoolean();
                } else if ("accessToken".equals(fieldName)) {
                    deserializedTelegramChannelProperties.accessToken = reader.getString();
                } else if ("isValidated".equals(fieldName)) {
                    deserializedTelegramChannelProperties.isValidated = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTelegramChannelProperties;
        });
    }
}
