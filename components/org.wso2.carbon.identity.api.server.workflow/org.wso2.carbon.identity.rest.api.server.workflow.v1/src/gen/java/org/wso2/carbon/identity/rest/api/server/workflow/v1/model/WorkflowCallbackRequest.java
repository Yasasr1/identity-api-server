/*
 * Copyright (c) 2026, WSO2 LLC. (http://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.rest.api.server.workflow.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;
import javax.validation.Valid;
import javax.xml.bind.annotation.*;

public class WorkflowCallbackRequest  {

    private String correlationId;

@XmlType(name="StatusEnum")
@XmlEnum(String.class)
public enum StatusEnum {

    @XmlEnumValue("APPROVED") APPROVED(String.valueOf("APPROVED")), @XmlEnumValue("REJECTED") REJECTED(String.valueOf("REJECTED"));


    private String value;

    StatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
        for (StatusEnum b : StatusEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

    private StatusEnum status;
    private String reason;
    private String decidedBy;
    private Map<String, Object> properties = null;


    /**
    * Correlation ID sent to the external workflow engine with the workflow request.
    **/
    public WorkflowCallbackRequest correlationId(String correlationId) {

        this.correlationId = correlationId;
        return this;
    }

    @ApiModelProperty(example = "8c1d4a0e-55f7-4b6a-9d2e-1f0a3b6c7d8e", required = true, value = "Correlation ID sent to the external workflow engine with the workflow request.")
    @JsonProperty("correlationId")
    @Valid
    @NotNull(message = "Property correlationId cannot be null.")

    public String getCorrelationId() {
        return correlationId;
    }
    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

    /**
    * Decision taken for the workflow request.
    **/
    public WorkflowCallbackRequest status(StatusEnum status) {

        this.status = status;
        return this;
    }

    @ApiModelProperty(required = true, value = "Decision taken for the workflow request.")
    @JsonProperty("status")
    @Valid
    @NotNull(message = "Property status cannot be null.")

    public StatusEnum getStatus() {
        return status;
    }
    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    /**
    * Reason for the decision.
    **/
    public WorkflowCallbackRequest reason(String reason) {

        this.reason = reason;
        return this;
    }

    @ApiModelProperty(example = "Customer number does not match the clinic.", value = "Reason for the decision.")
    @JsonProperty("reason")
    @Valid
    public String getReason() {
        return reason;
    }
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
    * Identifier of the approver who took the decision.
    **/
    public WorkflowCallbackRequest decidedBy(String decidedBy) {

        this.decidedBy = decidedBy;
        return this;
    }

    @ApiModelProperty(example = "cs-agent@straumann.com", value = "Identifier of the approver who took the decision.")
    @JsonProperty("decidedBy")
    @Valid
    public String getDecidedBy() {
        return decidedBy;
    }
    public void setDecidedBy(String decidedBy) {
        this.decidedBy = decidedBy;
    }

    /**
    * Operation specific values that override the original request on approval (e.g. roles, name, attributes).
    **/
    public WorkflowCallbackRequest properties(Map<String, Object> properties) {

        this.properties = properties;
        return this;
    }

    @ApiModelProperty(value = "Operation specific values that override the original request on approval (e.g. roles, name, attributes).")
    @JsonProperty("properties")
    @Valid
    public Map<String, Object> getProperties() {
        return properties;
    }
    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }


    public WorkflowCallbackRequest putPropertiesItem(String key, Object propertiesItem) {
        if (this.properties == null) {
            this.properties = new HashMap<>();
        }
        this.properties.put(key, propertiesItem);
        return this;
    }

    @Override
    public boolean equals(java.lang.Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WorkflowCallbackRequest workflowCallbackRequest = (WorkflowCallbackRequest) o;
        return Objects.equals(this.correlationId, workflowCallbackRequest.correlationId) &&
            Objects.equals(this.status, workflowCallbackRequest.status) &&
            Objects.equals(this.reason, workflowCallbackRequest.reason) &&
            Objects.equals(this.decidedBy, workflowCallbackRequest.decidedBy) &&
            Objects.equals(this.properties, workflowCallbackRequest.properties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(correlationId, status, reason, decidedBy, properties);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowCallbackRequest {\n");

        sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    decidedBy: ").append(toIndentedString(decidedBy)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
    * Convert the given object to string with each line indented by 4 spaces
    * (except the first line).
    */
    private String toIndentedString(java.lang.Object o) {

        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n");
    }
}
