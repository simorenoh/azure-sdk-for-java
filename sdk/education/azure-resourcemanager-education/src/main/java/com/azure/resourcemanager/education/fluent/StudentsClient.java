// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.education.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.education.fluent.models.StudentDetailsInner;

/**
 * An instance of this class provides access to all the operations defined in StudentsClient.
 */
public interface StudentsClient {
    /**
     * Get a list of details about students that are associated with the specified lab.
     * 
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of details about students that are associated with the specified lab as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<StudentDetailsInner> list(String billingAccountName, String billingProfileName,
        String invoiceSectionName);

    /**
     * Get a list of details about students that are associated with the specified lab.
     * 
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @param includeDeleted May be used to show deleted items.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of details about students that are associated with the specified lab as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<StudentDetailsInner> list(String billingAccountName, String billingProfileName,
        String invoiceSectionName, Boolean includeDeleted, Context context);

    /**
     * Get the details for a specific student in the specified lab by student alias.
     * 
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @param studentAlias Student alias.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details for a specific student in the specified lab by student alias along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<StudentDetailsInner> getWithResponse(String billingAccountName, String billingProfileName,
        String invoiceSectionName, String studentAlias, Context context);

    /**
     * Get the details for a specific student in the specified lab by student alias.
     * 
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @param studentAlias Student alias.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details for a specific student in the specified lab by student alias.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    StudentDetailsInner get(String billingAccountName, String billingProfileName, String invoiceSectionName,
        String studentAlias);

    /**
     * Delete the specified student based on the student alias.
     * 
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @param studentAlias Student alias.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String billingAccountName, String billingProfileName, String invoiceSectionName,
        String studentAlias, Context context);

    /**
     * Delete the specified student based on the student alias.
     * 
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @param studentAlias Student alias.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String billingAccountName, String billingProfileName, String invoiceSectionName, String studentAlias);

    /**
     * Create and add a new student to the specified lab or update the details of an existing student in a lab. Note the
     * student must have a valid tenant to accept the lab after they have been added to lab.
     * 
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @param studentAlias Student alias.
     * @param parameters Request parameters that are provided to update student properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return student details along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<StudentDetailsInner> createOrUpdateWithResponse(String billingAccountName, String billingProfileName,
        String invoiceSectionName, String studentAlias, StudentDetailsInner parameters, Context context);

    /**
     * Create and add a new student to the specified lab or update the details of an existing student in a lab. Note the
     * student must have a valid tenant to accept the lab after they have been added to lab.
     * 
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @param studentAlias Student alias.
     * @param parameters Request parameters that are provided to update student properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return student details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    StudentDetailsInner createOrUpdate(String billingAccountName, String billingProfileName, String invoiceSectionName,
        String studentAlias, StudentDetailsInner parameters);
}
