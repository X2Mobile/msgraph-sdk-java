// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Contact Folder Delta Collection Page.
 */
public class ContactFolderDeltaCollectionPage extends BaseContactFolderDeltaCollectionPage implements IContactFolderDeltaCollectionPage {

    /**
     * A collection page for ContactFolder.
     *
     * @param response The serialized BaseContactFolderDeltaCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ContactFolderDeltaCollectionPage(final BaseContactFolderDeltaCollectionResponse response, final IContactFolderDeltaCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
