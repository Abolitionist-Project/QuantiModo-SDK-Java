package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.Source;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-05T03:15:54.261Z")
public class InlineResponse20014   {
  
  private Source data = null;
  private Boolean success = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("data")
  public Source getData() {
    return data;
  }
  public void setData(Source data) {
    this.data = data;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("success")
  public Boolean getSuccess() {
    return success;
  }
  public void setSuccess(Boolean success) {
    this.success = success;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20014 {\n");
    
    sb.append("    data: ").append(StringUtil.toIndentedString(data)).append("\n");
    sb.append("    success: ").append(StringUtil.toIndentedString(success)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
