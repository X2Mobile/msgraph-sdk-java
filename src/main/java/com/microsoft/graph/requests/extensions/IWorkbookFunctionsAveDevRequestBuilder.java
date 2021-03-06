// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsAveDevRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Ave Dev Request Builder.
 */
public interface IWorkbookFunctionsAveDevRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsAveDevRequest
     *
     * @return the IWorkbookFunctionsAveDevRequest instance
     */
    IWorkbookFunctionsAveDevRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsAveDevRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsAveDevRequest instance
     */
    IWorkbookFunctionsAveDevRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
