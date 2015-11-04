package io.swagger.client.auth;

import io.swagger.client.Pair;

import java.util.Map;
import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-03T22:24:11.560Z")
public interface Authentication {
  /** Apply authentication settings to header and query params. */
  void applyToParams(List<Pair> queryParams, Map<String, String> headerParams);
}
