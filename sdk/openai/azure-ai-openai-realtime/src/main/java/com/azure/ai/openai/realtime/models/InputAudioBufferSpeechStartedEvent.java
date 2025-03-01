// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.realtime.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Returned in server turn detection mode when speech is detected.
 */
@Immutable
public final class InputAudioBufferSpeechStartedEvent extends RealtimeServerEvent {

    /*
     * The type property.
     */
    @Generated
    private RealtimeServerEventType type = RealtimeServerEventType.INPUT_AUDIO_BUFFER_SPEECH_STARTED;

    /*
     * Milliseconds since the session started when speech was detected.
     */
    @Generated
    private final int audioStartMs;

    /*
     * The ID of the user message item that will be created when speech stops.
     */
    @Generated
    private final String itemId;

    /**
     * Creates an instance of InputAudioBufferSpeechStartedEvent class.
     *
     * @param eventId the eventId value to set.
     * @param audioStartMs the audioStartMs value to set.
     * @param itemId the itemId value to set.
     */
    @Generated
    private InputAudioBufferSpeechStartedEvent(String eventId, int audioStartMs, String itemId) {
        super(eventId);
        this.audioStartMs = audioStartMs;
        this.itemId = itemId;
    }

    /**
     * Get the type property: The type property.
     *
     * @return the type value.
     */
    @Generated
    @Override
    public RealtimeServerEventType getType() {
        return this.type;
    }

    /**
     * Get the audioStartMs property: Milliseconds since the session started when speech was detected.
     *
     * @return the audioStartMs value.
     */
    @Generated
    public int getAudioStartMs() {
        return this.audioStartMs;
    }

    /**
     * Get the itemId property: The ID of the user message item that will be created when speech stops.
     *
     * @return the itemId value.
     */
    @Generated
    public String getItemId() {
        return this.itemId;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("event_id", getEventId());
        jsonWriter.writeIntField("audio_start_ms", this.audioStartMs);
        jsonWriter.writeStringField("item_id", this.itemId);
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of InputAudioBufferSpeechStartedEvent from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of InputAudioBufferSpeechStartedEvent if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the InputAudioBufferSpeechStartedEvent.
     */
    @Generated
    public static InputAudioBufferSpeechStartedEvent fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String eventId = null;
            int audioStartMs = 0;
            String itemId = null;
            RealtimeServerEventType type = RealtimeServerEventType.INPUT_AUDIO_BUFFER_SPEECH_STARTED;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("event_id".equals(fieldName)) {
                    eventId = reader.getString();
                } else if ("audio_start_ms".equals(fieldName)) {
                    audioStartMs = reader.getInt();
                } else if ("item_id".equals(fieldName)) {
                    itemId = reader.getString();
                } else if ("type".equals(fieldName)) {
                    type = RealtimeServerEventType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }
            InputAudioBufferSpeechStartedEvent deserializedInputAudioBufferSpeechStartedEvent
                = new InputAudioBufferSpeechStartedEvent(eventId, audioStartMs, itemId);
            deserializedInputAudioBufferSpeechStartedEvent.type = type;
            return deserializedInputAudioBufferSpeechStartedEvent;
        });
    }
}
