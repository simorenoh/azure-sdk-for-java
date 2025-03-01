// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.agrifood.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.agrifood.fluent.models.ArmAsyncOperationInner;

/**
 * An instance of this class provides access to all the operations defined in OperationResultsClient.
 */
public interface OperationResultsClient {
    /**
     * Get operationResults for a FarmBeats resource.
     * 
     * @param locations Location.
     * @param operationResultsId operation Results Id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operationResults for a FarmBeats resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ArmAsyncOperationInner> getWithResponse(String locations, String operationResultsId, Context context);

    /**
     * Get operationResults for a FarmBeats resource.
     * 
     * @param locations Location.
     * @param operationResultsId operation Results Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operationResults for a FarmBeats resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ArmAsyncOperationInner get(String locations, String operationResultsId);
}
