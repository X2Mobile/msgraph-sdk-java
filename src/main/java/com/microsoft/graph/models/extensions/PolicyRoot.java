// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.ActivityBasedTimeoutPolicy;
import com.microsoft.graph.models.extensions.ClaimsMappingPolicy;
import com.microsoft.graph.models.extensions.HomeRealmDiscoveryPolicy;
import com.microsoft.graph.models.extensions.TokenIssuancePolicy;
import com.microsoft.graph.models.extensions.TokenLifetimePolicy;
import com.microsoft.graph.models.extensions.ConditionalAccessPolicy;
import com.microsoft.graph.models.extensions.IdentitySecurityDefaultsEnforcementPolicy;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.ActivityBasedTimeoutPolicyCollectionResponse;
import com.microsoft.graph.requests.extensions.ActivityBasedTimeoutPolicyCollectionPage;
import com.microsoft.graph.requests.extensions.ClaimsMappingPolicyCollectionResponse;
import com.microsoft.graph.requests.extensions.ClaimsMappingPolicyCollectionPage;
import com.microsoft.graph.requests.extensions.HomeRealmDiscoveryPolicyCollectionResponse;
import com.microsoft.graph.requests.extensions.HomeRealmDiscoveryPolicyCollectionPage;
import com.microsoft.graph.requests.extensions.TokenIssuancePolicyCollectionResponse;
import com.microsoft.graph.requests.extensions.TokenIssuancePolicyCollectionPage;
import com.microsoft.graph.requests.extensions.TokenLifetimePolicyCollectionResponse;
import com.microsoft.graph.requests.extensions.TokenLifetimePolicyCollectionPage;
import com.microsoft.graph.requests.extensions.ConditionalAccessPolicyCollectionResponse;
import com.microsoft.graph.requests.extensions.ConditionalAccessPolicyCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Policy Root.
 */
public class PolicyRoot extends Entity implements IJsonBackedObject {


    /**
     * The Activity Based Timeout Policies.
     * 
     */
    public ActivityBasedTimeoutPolicyCollectionPage activityBasedTimeoutPolicies;

    /**
     * The Claims Mapping Policies.
     * 
     */
    public ClaimsMappingPolicyCollectionPage claimsMappingPolicies;

    /**
     * The Home Realm Discovery Policies.
     * 
     */
    public HomeRealmDiscoveryPolicyCollectionPage homeRealmDiscoveryPolicies;

    /**
     * The Token Issuance Policies.
     * 
     */
    public TokenIssuancePolicyCollectionPage tokenIssuancePolicies;

    /**
     * The Token Lifetime Policies.
     * 
     */
    public TokenLifetimePolicyCollectionPage tokenLifetimePolicies;

    /**
     * The Conditional Access Policies.
     * 
     */
    public ConditionalAccessPolicyCollectionPage conditionalAccessPolicies;

    /**
     * The Identity Security Defaults Enforcement Policy.
     * 
     */
    @SerializedName("identitySecurityDefaultsEnforcementPolicy")
    @Expose
    public IdentitySecurityDefaultsEnforcementPolicy identitySecurityDefaultsEnforcementPolicy;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("activityBasedTimeoutPolicies")) {
            final ActivityBasedTimeoutPolicyCollectionResponse response = new ActivityBasedTimeoutPolicyCollectionResponse();
            if (json.has("activityBasedTimeoutPolicies@odata.nextLink")) {
                response.nextLink = json.get("activityBasedTimeoutPolicies@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("activityBasedTimeoutPolicies").toString(), JsonObject[].class);
            final ActivityBasedTimeoutPolicy[] array = new ActivityBasedTimeoutPolicy[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ActivityBasedTimeoutPolicy.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            activityBasedTimeoutPolicies = new ActivityBasedTimeoutPolicyCollectionPage(response, null);
        }

        if (json.has("claimsMappingPolicies")) {
            final ClaimsMappingPolicyCollectionResponse response = new ClaimsMappingPolicyCollectionResponse();
            if (json.has("claimsMappingPolicies@odata.nextLink")) {
                response.nextLink = json.get("claimsMappingPolicies@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("claimsMappingPolicies").toString(), JsonObject[].class);
            final ClaimsMappingPolicy[] array = new ClaimsMappingPolicy[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ClaimsMappingPolicy.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            claimsMappingPolicies = new ClaimsMappingPolicyCollectionPage(response, null);
        }

        if (json.has("homeRealmDiscoveryPolicies")) {
            final HomeRealmDiscoveryPolicyCollectionResponse response = new HomeRealmDiscoveryPolicyCollectionResponse();
            if (json.has("homeRealmDiscoveryPolicies@odata.nextLink")) {
                response.nextLink = json.get("homeRealmDiscoveryPolicies@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("homeRealmDiscoveryPolicies").toString(), JsonObject[].class);
            final HomeRealmDiscoveryPolicy[] array = new HomeRealmDiscoveryPolicy[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), HomeRealmDiscoveryPolicy.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            homeRealmDiscoveryPolicies = new HomeRealmDiscoveryPolicyCollectionPage(response, null);
        }

        if (json.has("tokenIssuancePolicies")) {
            final TokenIssuancePolicyCollectionResponse response = new TokenIssuancePolicyCollectionResponse();
            if (json.has("tokenIssuancePolicies@odata.nextLink")) {
                response.nextLink = json.get("tokenIssuancePolicies@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("tokenIssuancePolicies").toString(), JsonObject[].class);
            final TokenIssuancePolicy[] array = new TokenIssuancePolicy[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), TokenIssuancePolicy.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            tokenIssuancePolicies = new TokenIssuancePolicyCollectionPage(response, null);
        }

        if (json.has("tokenLifetimePolicies")) {
            final TokenLifetimePolicyCollectionResponse response = new TokenLifetimePolicyCollectionResponse();
            if (json.has("tokenLifetimePolicies@odata.nextLink")) {
                response.nextLink = json.get("tokenLifetimePolicies@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("tokenLifetimePolicies").toString(), JsonObject[].class);
            final TokenLifetimePolicy[] array = new TokenLifetimePolicy[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), TokenLifetimePolicy.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            tokenLifetimePolicies = new TokenLifetimePolicyCollectionPage(response, null);
        }

        if (json.has("conditionalAccessPolicies")) {
            final ConditionalAccessPolicyCollectionResponse response = new ConditionalAccessPolicyCollectionResponse();
            if (json.has("conditionalAccessPolicies@odata.nextLink")) {
                response.nextLink = json.get("conditionalAccessPolicies@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("conditionalAccessPolicies").toString(), JsonObject[].class);
            final ConditionalAccessPolicy[] array = new ConditionalAccessPolicy[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ConditionalAccessPolicy.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            conditionalAccessPolicies = new ConditionalAccessPolicyCollectionPage(response, null);
        }
    }
}
