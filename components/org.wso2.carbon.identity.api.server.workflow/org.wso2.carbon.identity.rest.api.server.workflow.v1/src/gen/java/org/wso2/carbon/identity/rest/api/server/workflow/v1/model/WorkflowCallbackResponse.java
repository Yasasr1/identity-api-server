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
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;
import javax.validation.Valid;
import javax.xml.bind.annotation.*;

public class WorkflowCallbackResponse  {

    private String correlationId;
    private String instanceId;
    private String status;

    /**
    **/
    public WorkflowCallbackResponse correlationId(String correlationId) {

        this.correlationId = correlationId;
        return this;
    }

    @ApiModelProperty(example = "8c1d4a0e-55f7-4b6a-9d2e-1f0a3b6c7d8e", value = "")
    @JsonProperty("correlationId")
    @Valid
    public String getCorrelationId() {
        return correlationId;
    }
    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

    /**
    * ID of the workflow instance the callback was applied to.
    **/
    public WorkflowCallbackResponse instanceId(String instanceId) {

        this.instanceId = instanceId;
        return this;
    }

    @ApiModelProperty(example = "3f0e1c2a-7b9d-4e5f-8a6b-2c1d0e9f8a7b", value = "ID of the workflow instance the callback was applied to.")
    @JsonProperty("instanceId")
    @Valid
    public String getInstanceId() {
        return instanceId;
    }
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
    * Status of the workflow instance after the callback.
    **/
    public WorkflowCallbackResponse status(String status) {

        this.status = status;
        return this;
    }

    @ApiModelProperty(example = "APPROVED", value = "Status of the workflow instance after the callback.")
    @JsonProperty("status")
    @Valid
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }



    @Override
    public boolean equals(java.lang.Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WorkflowCallbackResponse workflowCallbackResponse = (WorkflowCallbackResponse) o;
        return Objects.equals(this.correlationId, workflowCallbackResponse.correlationId) &&
            Objects.equals(this.instanceId, workflowCallbackResponse.instanceId) &&
            Objects.equals(this.status, workflowCallbackResponse.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(correlationId, instanceId, status);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowCallbackResponse {\n");

        sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
