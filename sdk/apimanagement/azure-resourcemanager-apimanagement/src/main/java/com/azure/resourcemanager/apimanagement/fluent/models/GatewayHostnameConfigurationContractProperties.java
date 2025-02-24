// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Gateway hostname configuration details.
 */
@Fluent
public final class GatewayHostnameConfigurationContractProperties
    implements JsonSerializable<GatewayHostnameConfigurationContractProperties> {
    /*
     * Hostname value. Supports valid domain name, partial or full wildcard
     */
    private String hostname;

    /*
     * Identifier of Certificate entity that will be used for TLS connection establishment
     */
    private String certificateId;

    /*
     * Determines whether gateway requests client certificate
     */
    private Boolean negotiateClientCertificate;

    /*
     * Specifies if TLS 1.0 is supported
     */
    private Boolean tls10Enabled;

    /*
     * Specifies if TLS 1.1 is supported
     */
    private Boolean tls11Enabled;

    /*
     * Specifies if HTTP/2.0 is supported
     */
    private Boolean http2Enabled;

    /**
     * Creates an instance of GatewayHostnameConfigurationContractProperties class.
     */
    public GatewayHostnameConfigurationContractProperties() {
    }

    /**
     * Get the hostname property: Hostname value. Supports valid domain name, partial or full wildcard.
     * 
     * @return the hostname value.
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Set the hostname property: Hostname value. Supports valid domain name, partial or full wildcard.
     * 
     * @param hostname the hostname value to set.
     * @return the GatewayHostnameConfigurationContractProperties object itself.
     */
    public GatewayHostnameConfigurationContractProperties withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * Get the certificateId property: Identifier of Certificate entity that will be used for TLS connection
     * establishment.
     * 
     * @return the certificateId value.
     */
    public String certificateId() {
        return this.certificateId;
    }

    /**
     * Set the certificateId property: Identifier of Certificate entity that will be used for TLS connection
     * establishment.
     * 
     * @param certificateId the certificateId value to set.
     * @return the GatewayHostnameConfigurationContractProperties object itself.
     */
    public GatewayHostnameConfigurationContractProperties withCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }

    /**
     * Get the negotiateClientCertificate property: Determines whether gateway requests client certificate.
     * 
     * @return the negotiateClientCertificate value.
     */
    public Boolean negotiateClientCertificate() {
        return this.negotiateClientCertificate;
    }

    /**
     * Set the negotiateClientCertificate property: Determines whether gateway requests client certificate.
     * 
     * @param negotiateClientCertificate the negotiateClientCertificate value to set.
     * @return the GatewayHostnameConfigurationContractProperties object itself.
     */
    public GatewayHostnameConfigurationContractProperties
        withNegotiateClientCertificate(Boolean negotiateClientCertificate) {
        this.negotiateClientCertificate = negotiateClientCertificate;
        return this;
    }

    /**
     * Get the tls10Enabled property: Specifies if TLS 1.0 is supported.
     * 
     * @return the tls10Enabled value.
     */
    public Boolean tls10Enabled() {
        return this.tls10Enabled;
    }

    /**
     * Set the tls10Enabled property: Specifies if TLS 1.0 is supported.
     * 
     * @param tls10Enabled the tls10Enabled value to set.
     * @return the GatewayHostnameConfigurationContractProperties object itself.
     */
    public GatewayHostnameConfigurationContractProperties withTls10Enabled(Boolean tls10Enabled) {
        this.tls10Enabled = tls10Enabled;
        return this;
    }

    /**
     * Get the tls11Enabled property: Specifies if TLS 1.1 is supported.
     * 
     * @return the tls11Enabled value.
     */
    public Boolean tls11Enabled() {
        return this.tls11Enabled;
    }

    /**
     * Set the tls11Enabled property: Specifies if TLS 1.1 is supported.
     * 
     * @param tls11Enabled the tls11Enabled value to set.
     * @return the GatewayHostnameConfigurationContractProperties object itself.
     */
    public GatewayHostnameConfigurationContractProperties withTls11Enabled(Boolean tls11Enabled) {
        this.tls11Enabled = tls11Enabled;
        return this;
    }

    /**
     * Get the http2Enabled property: Specifies if HTTP/2.0 is supported.
     * 
     * @return the http2Enabled value.
     */
    public Boolean http2Enabled() {
        return this.http2Enabled;
    }

    /**
     * Set the http2Enabled property: Specifies if HTTP/2.0 is supported.
     * 
     * @param http2Enabled the http2Enabled value to set.
     * @return the GatewayHostnameConfigurationContractProperties object itself.
     */
    public GatewayHostnameConfigurationContractProperties withHttp2Enabled(Boolean http2Enabled) {
        this.http2Enabled = http2Enabled;
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
        jsonWriter.writeStringField("hostname", this.hostname);
        jsonWriter.writeStringField("certificateId", this.certificateId);
        jsonWriter.writeBooleanField("negotiateClientCertificate", this.negotiateClientCertificate);
        jsonWriter.writeBooleanField("tls10Enabled", this.tls10Enabled);
        jsonWriter.writeBooleanField("tls11Enabled", this.tls11Enabled);
        jsonWriter.writeBooleanField("http2Enabled", this.http2Enabled);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of GatewayHostnameConfigurationContractProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GatewayHostnameConfigurationContractProperties if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the GatewayHostnameConfigurationContractProperties.
     */
    public static GatewayHostnameConfigurationContractProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GatewayHostnameConfigurationContractProperties deserializedGatewayHostnameConfigurationContractProperties
                = new GatewayHostnameConfigurationContractProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("hostname".equals(fieldName)) {
                    deserializedGatewayHostnameConfigurationContractProperties.hostname = reader.getString();
                } else if ("certificateId".equals(fieldName)) {
                    deserializedGatewayHostnameConfigurationContractProperties.certificateId = reader.getString();
                } else if ("negotiateClientCertificate".equals(fieldName)) {
                    deserializedGatewayHostnameConfigurationContractProperties.negotiateClientCertificate
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("tls10Enabled".equals(fieldName)) {
                    deserializedGatewayHostnameConfigurationContractProperties.tls10Enabled
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("tls11Enabled".equals(fieldName)) {
                    deserializedGatewayHostnameConfigurationContractProperties.tls11Enabled
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("http2Enabled".equals(fieldName)) {
                    deserializedGatewayHostnameConfigurationContractProperties.http2Enabled
                        = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedGatewayHostnameConfigurationContractProperties;
        });
    }
}
