// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * The resource names object for virtual machine and related resources.
 */
@Fluent
public final class VirtualMachineResourceNames implements JsonSerializable<VirtualMachineResourceNames> {
    /*
     * The full name for virtual machine. The length of this field can be upto 64 characters. If name is not provided,
     * service uses a default name based on the deployment type. For SingleServer, default name is {SID}vm. In case of
     * HA-AvZone systems, default name will be {SID}{app/ascs/db}z{a/b}vm with an incrementor at the end in case of more
     * than 1 vm per layer. For distributed and HA-AvSet systems, default name will be {SID}{app/ascs/db}vm with an
     * incrementor at the end in case of more than 1 vm per layer.
     */
    private String vmName;

    /*
     * The full name for virtual-machine's host (computer name). Currently, ACSS only supports host names which are less
     * than or equal to 13 characters long. If this value is not provided, vmName will be used as host name.
     */
    private String hostname;

    /*
     * The list of network interface name objects for the selected virtual machine. Currently, only one network
     * interface is supported per virtual machine.
     */
    private List<NetworkInterfaceResourceNames> networkInterfaces;

    /*
     * The full name for OS disk attached to the VM. If this value is not provided, it will be named by ARM as per its
     * default naming standards (prefixed with vm name). There is only one OS disk attached per Virtual Machine.
     */
    private String osDiskName;

    /*
     * The full resource names for virtual machine data disks. This is a dictionary containing list of names of data
     * disks per volume. Currently supported volumes for database layer are ['hana/data', 'hana/log', hana/shared',
     * 'usr/sap', 'os', 'backup']. For application and cs layers, only 'default' volume is supported
     */
    private Map<String, List<String>> dataDiskNames;

    /**
     * Creates an instance of VirtualMachineResourceNames class.
     */
    public VirtualMachineResourceNames() {
    }

    /**
     * Get the vmName property: The full name for virtual machine. The length of this field can be upto 64 characters.
     * If name is not provided, service uses a default name based on the deployment type. For SingleServer, default name
     * is {SID}vm. In case of HA-AvZone systems, default name will be {SID}{app/ascs/db}z{a/b}vm with an incrementor at
     * the end in case of more than 1 vm per layer. For distributed and HA-AvSet systems, default name will be
     * {SID}{app/ascs/db}vm with an incrementor at the end in case of more than 1 vm per layer.
     * 
     * @return the vmName value.
     */
    public String vmName() {
        return this.vmName;
    }

    /**
     * Set the vmName property: The full name for virtual machine. The length of this field can be upto 64 characters.
     * If name is not provided, service uses a default name based on the deployment type. For SingleServer, default name
     * is {SID}vm. In case of HA-AvZone systems, default name will be {SID}{app/ascs/db}z{a/b}vm with an incrementor at
     * the end in case of more than 1 vm per layer. For distributed and HA-AvSet systems, default name will be
     * {SID}{app/ascs/db}vm with an incrementor at the end in case of more than 1 vm per layer.
     * 
     * @param vmName the vmName value to set.
     * @return the VirtualMachineResourceNames object itself.
     */
    public VirtualMachineResourceNames withVmName(String vmName) {
        this.vmName = vmName;
        return this;
    }

    /**
     * Get the hostname property: The full name for virtual-machine's host (computer name). Currently, ACSS only
     * supports host names which are less than or equal to 13 characters long. If this value is not provided, vmName
     * will be used as host name.
     * 
     * @return the hostname value.
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Set the hostname property: The full name for virtual-machine's host (computer name). Currently, ACSS only
     * supports host names which are less than or equal to 13 characters long. If this value is not provided, vmName
     * will be used as host name.
     * 
     * @param hostname the hostname value to set.
     * @return the VirtualMachineResourceNames object itself.
     */
    public VirtualMachineResourceNames withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * Get the networkInterfaces property: The list of network interface name objects for the selected virtual machine.
     * Currently, only one network interface is supported per virtual machine.
     * 
     * @return the networkInterfaces value.
     */
    public List<NetworkInterfaceResourceNames> networkInterfaces() {
        return this.networkInterfaces;
    }

    /**
     * Set the networkInterfaces property: The list of network interface name objects for the selected virtual machine.
     * Currently, only one network interface is supported per virtual machine.
     * 
     * @param networkInterfaces the networkInterfaces value to set.
     * @return the VirtualMachineResourceNames object itself.
     */
    public VirtualMachineResourceNames withNetworkInterfaces(List<NetworkInterfaceResourceNames> networkInterfaces) {
        this.networkInterfaces = networkInterfaces;
        return this;
    }

    /**
     * Get the osDiskName property: The full name for OS disk attached to the VM. If this value is not provided, it will
     * be named by ARM as per its default naming standards (prefixed with vm name). There is only one OS disk attached
     * per Virtual Machine.
     * 
     * @return the osDiskName value.
     */
    public String osDiskName() {
        return this.osDiskName;
    }

    /**
     * Set the osDiskName property: The full name for OS disk attached to the VM. If this value is not provided, it will
     * be named by ARM as per its default naming standards (prefixed with vm name). There is only one OS disk attached
     * per Virtual Machine.
     * 
     * @param osDiskName the osDiskName value to set.
     * @return the VirtualMachineResourceNames object itself.
     */
    public VirtualMachineResourceNames withOsDiskName(String osDiskName) {
        this.osDiskName = osDiskName;
        return this;
    }

    /**
     * Get the dataDiskNames property: The full resource names for virtual machine data disks. This is a dictionary
     * containing list of names of data disks per volume. Currently supported volumes for database layer are
     * ['hana/data', 'hana/log', hana/shared', 'usr/sap', 'os', 'backup']. For application and cs layers, only 'default'
     * volume is supported.
     * 
     * @return the dataDiskNames value.
     */
    public Map<String, List<String>> dataDiskNames() {
        return this.dataDiskNames;
    }

    /**
     * Set the dataDiskNames property: The full resource names for virtual machine data disks. This is a dictionary
     * containing list of names of data disks per volume. Currently supported volumes for database layer are
     * ['hana/data', 'hana/log', hana/shared', 'usr/sap', 'os', 'backup']. For application and cs layers, only 'default'
     * volume is supported.
     * 
     * @param dataDiskNames the dataDiskNames value to set.
     * @return the VirtualMachineResourceNames object itself.
     */
    public VirtualMachineResourceNames withDataDiskNames(Map<String, List<String>> dataDiskNames) {
        this.dataDiskNames = dataDiskNames;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (networkInterfaces() != null) {
            networkInterfaces().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("vmName", this.vmName);
        jsonWriter.writeStringField("hostName", this.hostname);
        jsonWriter.writeArrayField("networkInterfaces", this.networkInterfaces,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("osDiskName", this.osDiskName);
        jsonWriter.writeMapField("dataDiskNames", this.dataDiskNames,
            (writer, element) -> writer.writeArray(element, (writer1, element1) -> writer1.writeString(element1)));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VirtualMachineResourceNames from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VirtualMachineResourceNames if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VirtualMachineResourceNames.
     */
    public static VirtualMachineResourceNames fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VirtualMachineResourceNames deserializedVirtualMachineResourceNames = new VirtualMachineResourceNames();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("vmName".equals(fieldName)) {
                    deserializedVirtualMachineResourceNames.vmName = reader.getString();
                } else if ("hostName".equals(fieldName)) {
                    deserializedVirtualMachineResourceNames.hostname = reader.getString();
                } else if ("networkInterfaces".equals(fieldName)) {
                    List<NetworkInterfaceResourceNames> networkInterfaces
                        = reader.readArray(reader1 -> NetworkInterfaceResourceNames.fromJson(reader1));
                    deserializedVirtualMachineResourceNames.networkInterfaces = networkInterfaces;
                } else if ("osDiskName".equals(fieldName)) {
                    deserializedVirtualMachineResourceNames.osDiskName = reader.getString();
                } else if ("dataDiskNames".equals(fieldName)) {
                    Map<String, List<String>> dataDiskNames
                        = reader.readMap(reader1 -> reader1.readArray(reader2 -> reader2.getString()));
                    deserializedVirtualMachineResourceNames.dataDiskNames = dataDiskNames;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVirtualMachineResourceNames;
        });
    }
}
