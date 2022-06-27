/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.certificatemanager.v1.stub;

import static com.google.cloud.certificatemanager.v1.CertificateManagerClient.ListCertificateMapEntriesPagedResponse;
import static com.google.cloud.certificatemanager.v1.CertificateManagerClient.ListCertificateMapsPagedResponse;
import static com.google.cloud.certificatemanager.v1.CertificateManagerClient.ListCertificatesPagedResponse;
import static com.google.cloud.certificatemanager.v1.CertificateManagerClient.ListDnsAuthorizationsPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.core.InternalApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.httpjson.ApiMethodDescriptor;
import com.google.api.gax.httpjson.HttpJsonCallSettings;
import com.google.api.gax.httpjson.HttpJsonOperationSnapshot;
import com.google.api.gax.httpjson.HttpJsonStubCallableFactory;
import com.google.api.gax.httpjson.ProtoMessageRequestFormatter;
import com.google.api.gax.httpjson.ProtoMessageResponseParser;
import com.google.api.gax.httpjson.ProtoRestSerializer;
import com.google.api.gax.httpjson.longrunning.stub.HttpJsonOperationsStub;
import com.google.api.gax.longrunning.OperationSnapshot;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.certificatemanager.v1.Certificate;
import com.google.cloud.certificatemanager.v1.CertificateMap;
import com.google.cloud.certificatemanager.v1.CertificateMapEntry;
import com.google.cloud.certificatemanager.v1.CreateCertificateMapEntryRequest;
import com.google.cloud.certificatemanager.v1.CreateCertificateMapRequest;
import com.google.cloud.certificatemanager.v1.CreateCertificateRequest;
import com.google.cloud.certificatemanager.v1.CreateDnsAuthorizationRequest;
import com.google.cloud.certificatemanager.v1.DeleteCertificateMapEntryRequest;
import com.google.cloud.certificatemanager.v1.DeleteCertificateMapRequest;
import com.google.cloud.certificatemanager.v1.DeleteCertificateRequest;
import com.google.cloud.certificatemanager.v1.DeleteDnsAuthorizationRequest;
import com.google.cloud.certificatemanager.v1.DnsAuthorization;
import com.google.cloud.certificatemanager.v1.GetCertificateMapEntryRequest;
import com.google.cloud.certificatemanager.v1.GetCertificateMapRequest;
import com.google.cloud.certificatemanager.v1.GetCertificateRequest;
import com.google.cloud.certificatemanager.v1.GetDnsAuthorizationRequest;
import com.google.cloud.certificatemanager.v1.ListCertificateMapEntriesRequest;
import com.google.cloud.certificatemanager.v1.ListCertificateMapEntriesResponse;
import com.google.cloud.certificatemanager.v1.ListCertificateMapsRequest;
import com.google.cloud.certificatemanager.v1.ListCertificateMapsResponse;
import com.google.cloud.certificatemanager.v1.ListCertificatesRequest;
import com.google.cloud.certificatemanager.v1.ListCertificatesResponse;
import com.google.cloud.certificatemanager.v1.ListDnsAuthorizationsRequest;
import com.google.cloud.certificatemanager.v1.ListDnsAuthorizationsResponse;
import com.google.cloud.certificatemanager.v1.OperationMetadata;
import com.google.cloud.certificatemanager.v1.UpdateCertificateMapEntryRequest;
import com.google.cloud.certificatemanager.v1.UpdateCertificateMapRequest;
import com.google.cloud.certificatemanager.v1.UpdateCertificateRequest;
import com.google.cloud.certificatemanager.v1.UpdateDnsAuthorizationRequest;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import com.google.protobuf.TypeRegistry;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * REST stub implementation for the CertificateManager service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
@BetaApi
public class HttpJsonCertificateManagerStub extends CertificateManagerStub {
  private static final TypeRegistry typeRegistry =
      TypeRegistry.newBuilder()
          .add(Empty.getDescriptor())
          .add(CertificateMap.getDescriptor())
          .add(Certificate.getDescriptor())
          .add(CertificateMapEntry.getDescriptor())
          .add(OperationMetadata.getDescriptor())
          .add(DnsAuthorization.getDescriptor())
          .build();

  private static final ApiMethodDescriptor<ListCertificatesRequest, ListCertificatesResponse>
      listCertificatesMethodDescriptor =
          ApiMethodDescriptor.<ListCertificatesRequest, ListCertificatesResponse>newBuilder()
              .setFullMethodName(
                  "google.cloud.certificatemanager.v1.CertificateManager/ListCertificates")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ListCertificatesRequest>newBuilder()
                      .setPath(
                          "/v1/{parent=projects/*/locations/*}/certificates",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ListCertificatesRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ListCertificatesRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "filter", request.getFilter());
                            serializer.putQueryParam(fields, "orderBy", request.getOrderBy());
                            serializer.putQueryParam(fields, "pageSize", request.getPageSize());
                            serializer.putQueryParam(fields, "pageToken", request.getPageToken());
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<ListCertificatesResponse>newBuilder()
                      .setDefaultInstance(ListCertificatesResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<GetCertificateRequest, Certificate>
      getCertificateMethodDescriptor =
          ApiMethodDescriptor.<GetCertificateRequest, Certificate>newBuilder()
              .setFullMethodName(
                  "google.cloud.certificatemanager.v1.CertificateManager/GetCertificate")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<GetCertificateRequest>newBuilder()
                      .setPath(
                          "/v1/{name=projects/*/locations/*/certificates/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<GetCertificateRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<GetCertificateRequest> serializer =
                                ProtoRestSerializer.create();
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Certificate>newBuilder()
                      .setDefaultInstance(Certificate.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<CreateCertificateRequest, Operation>
      createCertificateMethodDescriptor =
          ApiMethodDescriptor.<CreateCertificateRequest, Operation>newBuilder()
              .setFullMethodName(
                  "google.cloud.certificatemanager.v1.CertificateManager/CreateCertificate")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<CreateCertificateRequest>newBuilder()
                      .setPath(
                          "/v1/{parent=projects/*/locations/*}/certificates",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<CreateCertificateRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<CreateCertificateRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(
                                fields, "certificateId", request.getCertificateId());
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("certificate", request.getCertificate()))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (CreateCertificateRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private static final ApiMethodDescriptor<UpdateCertificateRequest, Operation>
      updateCertificateMethodDescriptor =
          ApiMethodDescriptor.<UpdateCertificateRequest, Operation>newBuilder()
              .setFullMethodName(
                  "google.cloud.certificatemanager.v1.CertificateManager/UpdateCertificate")
              .setHttpMethod("PATCH")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<UpdateCertificateRequest>newBuilder()
                      .setPath(
                          "/v1/{certificate.name=projects/*/locations/*/certificates/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<UpdateCertificateRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(
                                fields, "certificate.name", request.getCertificate().getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<UpdateCertificateRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "updateMask", request.getUpdateMask());
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("certificate", request.getCertificate()))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (UpdateCertificateRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private static final ApiMethodDescriptor<DeleteCertificateRequest, Operation>
      deleteCertificateMethodDescriptor =
          ApiMethodDescriptor.<DeleteCertificateRequest, Operation>newBuilder()
              .setFullMethodName(
                  "google.cloud.certificatemanager.v1.CertificateManager/DeleteCertificate")
              .setHttpMethod("DELETE")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<DeleteCertificateRequest>newBuilder()
                      .setPath(
                          "/v1/{name=projects/*/locations/*/certificates/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<DeleteCertificateRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<DeleteCertificateRequest> serializer =
                                ProtoRestSerializer.create();
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (DeleteCertificateRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private static final ApiMethodDescriptor<ListCertificateMapsRequest, ListCertificateMapsResponse>
      listCertificateMapsMethodDescriptor =
          ApiMethodDescriptor.<ListCertificateMapsRequest, ListCertificateMapsResponse>newBuilder()
              .setFullMethodName(
                  "google.cloud.certificatemanager.v1.CertificateManager/ListCertificateMaps")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ListCertificateMapsRequest>newBuilder()
                      .setPath(
                          "/v1/{parent=projects/*/locations/*}/certificateMaps",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ListCertificateMapsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ListCertificateMapsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "filter", request.getFilter());
                            serializer.putQueryParam(fields, "orderBy", request.getOrderBy());
                            serializer.putQueryParam(fields, "pageSize", request.getPageSize());
                            serializer.putQueryParam(fields, "pageToken", request.getPageToken());
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<ListCertificateMapsResponse>newBuilder()
                      .setDefaultInstance(ListCertificateMapsResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<GetCertificateMapRequest, CertificateMap>
      getCertificateMapMethodDescriptor =
          ApiMethodDescriptor.<GetCertificateMapRequest, CertificateMap>newBuilder()
              .setFullMethodName(
                  "google.cloud.certificatemanager.v1.CertificateManager/GetCertificateMap")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<GetCertificateMapRequest>newBuilder()
                      .setPath(
                          "/v1/{name=projects/*/locations/*/certificateMaps/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<GetCertificateMapRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<GetCertificateMapRequest> serializer =
                                ProtoRestSerializer.create();
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<CertificateMap>newBuilder()
                      .setDefaultInstance(CertificateMap.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<CreateCertificateMapRequest, Operation>
      createCertificateMapMethodDescriptor =
          ApiMethodDescriptor.<CreateCertificateMapRequest, Operation>newBuilder()
              .setFullMethodName(
                  "google.cloud.certificatemanager.v1.CertificateManager/CreateCertificateMap")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<CreateCertificateMapRequest>newBuilder()
                      .setPath(
                          "/v1/{parent=projects/*/locations/*}/certificateMaps",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<CreateCertificateMapRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<CreateCertificateMapRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(
                                fields, "certificateMapId", request.getCertificateMapId());
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("certificateMap", request.getCertificateMap()))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (CreateCertificateMapRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private static final ApiMethodDescriptor<UpdateCertificateMapRequest, Operation>
      updateCertificateMapMethodDescriptor =
          ApiMethodDescriptor.<UpdateCertificateMapRequest, Operation>newBuilder()
              .setFullMethodName(
                  "google.cloud.certificatemanager.v1.CertificateManager/UpdateCertificateMap")
              .setHttpMethod("PATCH")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<UpdateCertificateMapRequest>newBuilder()
                      .setPath(
                          "/v1/{certificateMap.name=projects/*/locations/*/certificateMaps/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<UpdateCertificateMapRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(
                                fields,
                                "certificateMap.name",
                                request.getCertificateMap().getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<UpdateCertificateMapRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "updateMask", request.getUpdateMask());
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("certificateMap", request.getCertificateMap()))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (UpdateCertificateMapRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private static final ApiMethodDescriptor<DeleteCertificateMapRequest, Operation>
      deleteCertificateMapMethodDescriptor =
          ApiMethodDescriptor.<DeleteCertificateMapRequest, Operation>newBuilder()
              .setFullMethodName(
                  "google.cloud.certificatemanager.v1.CertificateManager/DeleteCertificateMap")
              .setHttpMethod("DELETE")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<DeleteCertificateMapRequest>newBuilder()
                      .setPath(
                          "/v1/{name=projects/*/locations/*/certificateMaps/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<DeleteCertificateMapRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<DeleteCertificateMapRequest> serializer =
                                ProtoRestSerializer.create();
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (DeleteCertificateMapRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private static final ApiMethodDescriptor<
          ListCertificateMapEntriesRequest, ListCertificateMapEntriesResponse>
      listCertificateMapEntriesMethodDescriptor =
          ApiMethodDescriptor
              .<ListCertificateMapEntriesRequest, ListCertificateMapEntriesResponse>newBuilder()
              .setFullMethodName(
                  "google.cloud.certificatemanager.v1.CertificateManager/ListCertificateMapEntries")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ListCertificateMapEntriesRequest>newBuilder()
                      .setPath(
                          "/v1/{parent=projects/*/locations/*/certificateMaps/*}/certificateMapEntries",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ListCertificateMapEntriesRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ListCertificateMapEntriesRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "filter", request.getFilter());
                            serializer.putQueryParam(fields, "orderBy", request.getOrderBy());
                            serializer.putQueryParam(fields, "pageSize", request.getPageSize());
                            serializer.putQueryParam(fields, "pageToken", request.getPageToken());
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<ListCertificateMapEntriesResponse>newBuilder()
                      .setDefaultInstance(ListCertificateMapEntriesResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<GetCertificateMapEntryRequest, CertificateMapEntry>
      getCertificateMapEntryMethodDescriptor =
          ApiMethodDescriptor.<GetCertificateMapEntryRequest, CertificateMapEntry>newBuilder()
              .setFullMethodName(
                  "google.cloud.certificatemanager.v1.CertificateManager/GetCertificateMapEntry")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<GetCertificateMapEntryRequest>newBuilder()
                      .setPath(
                          "/v1/{name=projects/*/locations/*/certificateMaps/*/certificateMapEntries/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<GetCertificateMapEntryRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<GetCertificateMapEntryRequest> serializer =
                                ProtoRestSerializer.create();
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<CertificateMapEntry>newBuilder()
                      .setDefaultInstance(CertificateMapEntry.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<CreateCertificateMapEntryRequest, Operation>
      createCertificateMapEntryMethodDescriptor =
          ApiMethodDescriptor.<CreateCertificateMapEntryRequest, Operation>newBuilder()
              .setFullMethodName(
                  "google.cloud.certificatemanager.v1.CertificateManager/CreateCertificateMapEntry")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<CreateCertificateMapEntryRequest>newBuilder()
                      .setPath(
                          "/v1/{parent=projects/*/locations/*/certificateMaps/*}/certificateMapEntries",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<CreateCertificateMapEntryRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<CreateCertificateMapEntryRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(
                                fields,
                                "certificateMapEntryId",
                                request.getCertificateMapEntryId());
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("certificateMapEntry", request.getCertificateMapEntry()))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (CreateCertificateMapEntryRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private static final ApiMethodDescriptor<UpdateCertificateMapEntryRequest, Operation>
      updateCertificateMapEntryMethodDescriptor =
          ApiMethodDescriptor.<UpdateCertificateMapEntryRequest, Operation>newBuilder()
              .setFullMethodName(
                  "google.cloud.certificatemanager.v1.CertificateManager/UpdateCertificateMapEntry")
              .setHttpMethod("PATCH")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<UpdateCertificateMapEntryRequest>newBuilder()
                      .setPath(
                          "/v1/{certificateMapEntry.name=projects/*/locations/*/certificateMaps/*/certificateMapEntries/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<UpdateCertificateMapEntryRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(
                                fields,
                                "certificateMapEntry.name",
                                request.getCertificateMapEntry().getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<UpdateCertificateMapEntryRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "updateMask", request.getUpdateMask());
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("certificateMapEntry", request.getCertificateMapEntry()))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (UpdateCertificateMapEntryRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private static final ApiMethodDescriptor<DeleteCertificateMapEntryRequest, Operation>
      deleteCertificateMapEntryMethodDescriptor =
          ApiMethodDescriptor.<DeleteCertificateMapEntryRequest, Operation>newBuilder()
              .setFullMethodName(
                  "google.cloud.certificatemanager.v1.CertificateManager/DeleteCertificateMapEntry")
              .setHttpMethod("DELETE")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<DeleteCertificateMapEntryRequest>newBuilder()
                      .setPath(
                          "/v1/{name=projects/*/locations/*/certificateMaps/*/certificateMapEntries/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<DeleteCertificateMapEntryRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<DeleteCertificateMapEntryRequest> serializer =
                                ProtoRestSerializer.create();
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (DeleteCertificateMapEntryRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private static final ApiMethodDescriptor<
          ListDnsAuthorizationsRequest, ListDnsAuthorizationsResponse>
      listDnsAuthorizationsMethodDescriptor =
          ApiMethodDescriptor
              .<ListDnsAuthorizationsRequest, ListDnsAuthorizationsResponse>newBuilder()
              .setFullMethodName(
                  "google.cloud.certificatemanager.v1.CertificateManager/ListDnsAuthorizations")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ListDnsAuthorizationsRequest>newBuilder()
                      .setPath(
                          "/v1/{parent=projects/*/locations/*}/dnsAuthorizations",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ListDnsAuthorizationsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ListDnsAuthorizationsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "filter", request.getFilter());
                            serializer.putQueryParam(fields, "orderBy", request.getOrderBy());
                            serializer.putQueryParam(fields, "pageSize", request.getPageSize());
                            serializer.putQueryParam(fields, "pageToken", request.getPageToken());
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<ListDnsAuthorizationsResponse>newBuilder()
                      .setDefaultInstance(ListDnsAuthorizationsResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<GetDnsAuthorizationRequest, DnsAuthorization>
      getDnsAuthorizationMethodDescriptor =
          ApiMethodDescriptor.<GetDnsAuthorizationRequest, DnsAuthorization>newBuilder()
              .setFullMethodName(
                  "google.cloud.certificatemanager.v1.CertificateManager/GetDnsAuthorization")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<GetDnsAuthorizationRequest>newBuilder()
                      .setPath(
                          "/v1/{name=projects/*/locations/*/dnsAuthorizations/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<GetDnsAuthorizationRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<GetDnsAuthorizationRequest> serializer =
                                ProtoRestSerializer.create();
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<DnsAuthorization>newBuilder()
                      .setDefaultInstance(DnsAuthorization.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<CreateDnsAuthorizationRequest, Operation>
      createDnsAuthorizationMethodDescriptor =
          ApiMethodDescriptor.<CreateDnsAuthorizationRequest, Operation>newBuilder()
              .setFullMethodName(
                  "google.cloud.certificatemanager.v1.CertificateManager/CreateDnsAuthorization")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<CreateDnsAuthorizationRequest>newBuilder()
                      .setPath(
                          "/v1/{parent=projects/*/locations/*}/dnsAuthorizations",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<CreateDnsAuthorizationRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<CreateDnsAuthorizationRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(
                                fields, "dnsAuthorizationId", request.getDnsAuthorizationId());
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("dnsAuthorization", request.getDnsAuthorization()))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (CreateDnsAuthorizationRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private static final ApiMethodDescriptor<UpdateDnsAuthorizationRequest, Operation>
      updateDnsAuthorizationMethodDescriptor =
          ApiMethodDescriptor.<UpdateDnsAuthorizationRequest, Operation>newBuilder()
              .setFullMethodName(
                  "google.cloud.certificatemanager.v1.CertificateManager/UpdateDnsAuthorization")
              .setHttpMethod("PATCH")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<UpdateDnsAuthorizationRequest>newBuilder()
                      .setPath(
                          "/v1/{dnsAuthorization.name=projects/*/locations/*/dnsAuthorizations/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<UpdateDnsAuthorizationRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(
                                fields,
                                "dnsAuthorization.name",
                                request.getDnsAuthorization().getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<UpdateDnsAuthorizationRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "updateMask", request.getUpdateMask());
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("dnsAuthorization", request.getDnsAuthorization()))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (UpdateDnsAuthorizationRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private static final ApiMethodDescriptor<DeleteDnsAuthorizationRequest, Operation>
      deleteDnsAuthorizationMethodDescriptor =
          ApiMethodDescriptor.<DeleteDnsAuthorizationRequest, Operation>newBuilder()
              .setFullMethodName(
                  "google.cloud.certificatemanager.v1.CertificateManager/DeleteDnsAuthorization")
              .setHttpMethod("DELETE")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<DeleteDnsAuthorizationRequest>newBuilder()
                      .setPath(
                          "/v1/{name=projects/*/locations/*/dnsAuthorizations/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<DeleteDnsAuthorizationRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<DeleteDnsAuthorizationRequest> serializer =
                                ProtoRestSerializer.create();
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (DeleteDnsAuthorizationRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private final UnaryCallable<ListCertificatesRequest, ListCertificatesResponse>
      listCertificatesCallable;
  private final UnaryCallable<ListCertificatesRequest, ListCertificatesPagedResponse>
      listCertificatesPagedCallable;
  private final UnaryCallable<GetCertificateRequest, Certificate> getCertificateCallable;
  private final UnaryCallable<CreateCertificateRequest, Operation> createCertificateCallable;
  private final OperationCallable<CreateCertificateRequest, Certificate, OperationMetadata>
      createCertificateOperationCallable;
  private final UnaryCallable<UpdateCertificateRequest, Operation> updateCertificateCallable;
  private final OperationCallable<UpdateCertificateRequest, Certificate, OperationMetadata>
      updateCertificateOperationCallable;
  private final UnaryCallable<DeleteCertificateRequest, Operation> deleteCertificateCallable;
  private final OperationCallable<DeleteCertificateRequest, Empty, OperationMetadata>
      deleteCertificateOperationCallable;
  private final UnaryCallable<ListCertificateMapsRequest, ListCertificateMapsResponse>
      listCertificateMapsCallable;
  private final UnaryCallable<ListCertificateMapsRequest, ListCertificateMapsPagedResponse>
      listCertificateMapsPagedCallable;
  private final UnaryCallable<GetCertificateMapRequest, CertificateMap> getCertificateMapCallable;
  private final UnaryCallable<CreateCertificateMapRequest, Operation> createCertificateMapCallable;
  private final OperationCallable<CreateCertificateMapRequest, CertificateMap, OperationMetadata>
      createCertificateMapOperationCallable;
  private final UnaryCallable<UpdateCertificateMapRequest, Operation> updateCertificateMapCallable;
  private final OperationCallable<UpdateCertificateMapRequest, CertificateMap, OperationMetadata>
      updateCertificateMapOperationCallable;
  private final UnaryCallable<DeleteCertificateMapRequest, Operation> deleteCertificateMapCallable;
  private final OperationCallable<DeleteCertificateMapRequest, Empty, OperationMetadata>
      deleteCertificateMapOperationCallable;
  private final UnaryCallable<ListCertificateMapEntriesRequest, ListCertificateMapEntriesResponse>
      listCertificateMapEntriesCallable;
  private final UnaryCallable<
          ListCertificateMapEntriesRequest, ListCertificateMapEntriesPagedResponse>
      listCertificateMapEntriesPagedCallable;
  private final UnaryCallable<GetCertificateMapEntryRequest, CertificateMapEntry>
      getCertificateMapEntryCallable;
  private final UnaryCallable<CreateCertificateMapEntryRequest, Operation>
      createCertificateMapEntryCallable;
  private final OperationCallable<
          CreateCertificateMapEntryRequest, CertificateMapEntry, OperationMetadata>
      createCertificateMapEntryOperationCallable;
  private final UnaryCallable<UpdateCertificateMapEntryRequest, Operation>
      updateCertificateMapEntryCallable;
  private final OperationCallable<
          UpdateCertificateMapEntryRequest, CertificateMapEntry, OperationMetadata>
      updateCertificateMapEntryOperationCallable;
  private final UnaryCallable<DeleteCertificateMapEntryRequest, Operation>
      deleteCertificateMapEntryCallable;
  private final OperationCallable<DeleteCertificateMapEntryRequest, Empty, OperationMetadata>
      deleteCertificateMapEntryOperationCallable;
  private final UnaryCallable<ListDnsAuthorizationsRequest, ListDnsAuthorizationsResponse>
      listDnsAuthorizationsCallable;
  private final UnaryCallable<ListDnsAuthorizationsRequest, ListDnsAuthorizationsPagedResponse>
      listDnsAuthorizationsPagedCallable;
  private final UnaryCallable<GetDnsAuthorizationRequest, DnsAuthorization>
      getDnsAuthorizationCallable;
  private final UnaryCallable<CreateDnsAuthorizationRequest, Operation>
      createDnsAuthorizationCallable;
  private final OperationCallable<
          CreateDnsAuthorizationRequest, DnsAuthorization, OperationMetadata>
      createDnsAuthorizationOperationCallable;
  private final UnaryCallable<UpdateDnsAuthorizationRequest, Operation>
      updateDnsAuthorizationCallable;
  private final OperationCallable<
          UpdateDnsAuthorizationRequest, DnsAuthorization, OperationMetadata>
      updateDnsAuthorizationOperationCallable;
  private final UnaryCallable<DeleteDnsAuthorizationRequest, Operation>
      deleteDnsAuthorizationCallable;
  private final OperationCallable<DeleteDnsAuthorizationRequest, Empty, OperationMetadata>
      deleteDnsAuthorizationOperationCallable;

  private final BackgroundResource backgroundResources;
  private final HttpJsonOperationsStub httpJsonOperationsStub;
  private final HttpJsonStubCallableFactory callableFactory;

  public static final HttpJsonCertificateManagerStub create(CertificateManagerStubSettings settings)
      throws IOException {
    return new HttpJsonCertificateManagerStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonCertificateManagerStub create(ClientContext clientContext)
      throws IOException {
    return new HttpJsonCertificateManagerStub(
        CertificateManagerStubSettings.newHttpJsonBuilder().build(), clientContext);
  }

  public static final HttpJsonCertificateManagerStub create(
      ClientContext clientContext, HttpJsonStubCallableFactory callableFactory) throws IOException {
    return new HttpJsonCertificateManagerStub(
        CertificateManagerStubSettings.newHttpJsonBuilder().build(),
        clientContext,
        callableFactory);
  }

  /**
   * Constructs an instance of HttpJsonCertificateManagerStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected HttpJsonCertificateManagerStub(
      CertificateManagerStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new HttpJsonCertificateManagerCallableFactory());
  }

  /**
   * Constructs an instance of HttpJsonCertificateManagerStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected HttpJsonCertificateManagerStub(
      CertificateManagerStubSettings settings,
      ClientContext clientContext,
      HttpJsonStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.httpJsonOperationsStub =
        HttpJsonOperationsStub.create(clientContext, callableFactory, typeRegistry);

    HttpJsonCallSettings<ListCertificatesRequest, ListCertificatesResponse>
        listCertificatesTransportSettings =
            HttpJsonCallSettings.<ListCertificatesRequest, ListCertificatesResponse>newBuilder()
                .setMethodDescriptor(listCertificatesMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .build();
    HttpJsonCallSettings<GetCertificateRequest, Certificate> getCertificateTransportSettings =
        HttpJsonCallSettings.<GetCertificateRequest, Certificate>newBuilder()
            .setMethodDescriptor(getCertificateMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .build();
    HttpJsonCallSettings<CreateCertificateRequest, Operation> createCertificateTransportSettings =
        HttpJsonCallSettings.<CreateCertificateRequest, Operation>newBuilder()
            .setMethodDescriptor(createCertificateMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .build();
    HttpJsonCallSettings<UpdateCertificateRequest, Operation> updateCertificateTransportSettings =
        HttpJsonCallSettings.<UpdateCertificateRequest, Operation>newBuilder()
            .setMethodDescriptor(updateCertificateMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .build();
    HttpJsonCallSettings<DeleteCertificateRequest, Operation> deleteCertificateTransportSettings =
        HttpJsonCallSettings.<DeleteCertificateRequest, Operation>newBuilder()
            .setMethodDescriptor(deleteCertificateMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .build();
    HttpJsonCallSettings<ListCertificateMapsRequest, ListCertificateMapsResponse>
        listCertificateMapsTransportSettings =
            HttpJsonCallSettings
                .<ListCertificateMapsRequest, ListCertificateMapsResponse>newBuilder()
                .setMethodDescriptor(listCertificateMapsMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .build();
    HttpJsonCallSettings<GetCertificateMapRequest, CertificateMap>
        getCertificateMapTransportSettings =
            HttpJsonCallSettings.<GetCertificateMapRequest, CertificateMap>newBuilder()
                .setMethodDescriptor(getCertificateMapMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .build();
    HttpJsonCallSettings<CreateCertificateMapRequest, Operation>
        createCertificateMapTransportSettings =
            HttpJsonCallSettings.<CreateCertificateMapRequest, Operation>newBuilder()
                .setMethodDescriptor(createCertificateMapMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .build();
    HttpJsonCallSettings<UpdateCertificateMapRequest, Operation>
        updateCertificateMapTransportSettings =
            HttpJsonCallSettings.<UpdateCertificateMapRequest, Operation>newBuilder()
                .setMethodDescriptor(updateCertificateMapMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .build();
    HttpJsonCallSettings<DeleteCertificateMapRequest, Operation>
        deleteCertificateMapTransportSettings =
            HttpJsonCallSettings.<DeleteCertificateMapRequest, Operation>newBuilder()
                .setMethodDescriptor(deleteCertificateMapMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .build();
    HttpJsonCallSettings<ListCertificateMapEntriesRequest, ListCertificateMapEntriesResponse>
        listCertificateMapEntriesTransportSettings =
            HttpJsonCallSettings
                .<ListCertificateMapEntriesRequest, ListCertificateMapEntriesResponse>newBuilder()
                .setMethodDescriptor(listCertificateMapEntriesMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .build();
    HttpJsonCallSettings<GetCertificateMapEntryRequest, CertificateMapEntry>
        getCertificateMapEntryTransportSettings =
            HttpJsonCallSettings.<GetCertificateMapEntryRequest, CertificateMapEntry>newBuilder()
                .setMethodDescriptor(getCertificateMapEntryMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .build();
    HttpJsonCallSettings<CreateCertificateMapEntryRequest, Operation>
        createCertificateMapEntryTransportSettings =
            HttpJsonCallSettings.<CreateCertificateMapEntryRequest, Operation>newBuilder()
                .setMethodDescriptor(createCertificateMapEntryMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .build();
    HttpJsonCallSettings<UpdateCertificateMapEntryRequest, Operation>
        updateCertificateMapEntryTransportSettings =
            HttpJsonCallSettings.<UpdateCertificateMapEntryRequest, Operation>newBuilder()
                .setMethodDescriptor(updateCertificateMapEntryMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .build();
    HttpJsonCallSettings<DeleteCertificateMapEntryRequest, Operation>
        deleteCertificateMapEntryTransportSettings =
            HttpJsonCallSettings.<DeleteCertificateMapEntryRequest, Operation>newBuilder()
                .setMethodDescriptor(deleteCertificateMapEntryMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .build();
    HttpJsonCallSettings<ListDnsAuthorizationsRequest, ListDnsAuthorizationsResponse>
        listDnsAuthorizationsTransportSettings =
            HttpJsonCallSettings
                .<ListDnsAuthorizationsRequest, ListDnsAuthorizationsResponse>newBuilder()
                .setMethodDescriptor(listDnsAuthorizationsMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .build();
    HttpJsonCallSettings<GetDnsAuthorizationRequest, DnsAuthorization>
        getDnsAuthorizationTransportSettings =
            HttpJsonCallSettings.<GetDnsAuthorizationRequest, DnsAuthorization>newBuilder()
                .setMethodDescriptor(getDnsAuthorizationMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .build();
    HttpJsonCallSettings<CreateDnsAuthorizationRequest, Operation>
        createDnsAuthorizationTransportSettings =
            HttpJsonCallSettings.<CreateDnsAuthorizationRequest, Operation>newBuilder()
                .setMethodDescriptor(createDnsAuthorizationMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .build();
    HttpJsonCallSettings<UpdateDnsAuthorizationRequest, Operation>
        updateDnsAuthorizationTransportSettings =
            HttpJsonCallSettings.<UpdateDnsAuthorizationRequest, Operation>newBuilder()
                .setMethodDescriptor(updateDnsAuthorizationMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .build();
    HttpJsonCallSettings<DeleteDnsAuthorizationRequest, Operation>
        deleteDnsAuthorizationTransportSettings =
            HttpJsonCallSettings.<DeleteDnsAuthorizationRequest, Operation>newBuilder()
                .setMethodDescriptor(deleteDnsAuthorizationMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .build();

    this.listCertificatesCallable =
        callableFactory.createUnaryCallable(
            listCertificatesTransportSettings, settings.listCertificatesSettings(), clientContext);
    this.listCertificatesPagedCallable =
        callableFactory.createPagedCallable(
            listCertificatesTransportSettings, settings.listCertificatesSettings(), clientContext);
    this.getCertificateCallable =
        callableFactory.createUnaryCallable(
            getCertificateTransportSettings, settings.getCertificateSettings(), clientContext);
    this.createCertificateCallable =
        callableFactory.createUnaryCallable(
            createCertificateTransportSettings,
            settings.createCertificateSettings(),
            clientContext);
    this.createCertificateOperationCallable =
        callableFactory.createOperationCallable(
            createCertificateTransportSettings,
            settings.createCertificateOperationSettings(),
            clientContext,
            httpJsonOperationsStub);
    this.updateCertificateCallable =
        callableFactory.createUnaryCallable(
            updateCertificateTransportSettings,
            settings.updateCertificateSettings(),
            clientContext);
    this.updateCertificateOperationCallable =
        callableFactory.createOperationCallable(
            updateCertificateTransportSettings,
            settings.updateCertificateOperationSettings(),
            clientContext,
            httpJsonOperationsStub);
    this.deleteCertificateCallable =
        callableFactory.createUnaryCallable(
            deleteCertificateTransportSettings,
            settings.deleteCertificateSettings(),
            clientContext);
    this.deleteCertificateOperationCallable =
        callableFactory.createOperationCallable(
            deleteCertificateTransportSettings,
            settings.deleteCertificateOperationSettings(),
            clientContext,
            httpJsonOperationsStub);
    this.listCertificateMapsCallable =
        callableFactory.createUnaryCallable(
            listCertificateMapsTransportSettings,
            settings.listCertificateMapsSettings(),
            clientContext);
    this.listCertificateMapsPagedCallable =
        callableFactory.createPagedCallable(
            listCertificateMapsTransportSettings,
            settings.listCertificateMapsSettings(),
            clientContext);
    this.getCertificateMapCallable =
        callableFactory.createUnaryCallable(
            getCertificateMapTransportSettings,
            settings.getCertificateMapSettings(),
            clientContext);
    this.createCertificateMapCallable =
        callableFactory.createUnaryCallable(
            createCertificateMapTransportSettings,
            settings.createCertificateMapSettings(),
            clientContext);
    this.createCertificateMapOperationCallable =
        callableFactory.createOperationCallable(
            createCertificateMapTransportSettings,
            settings.createCertificateMapOperationSettings(),
            clientContext,
            httpJsonOperationsStub);
    this.updateCertificateMapCallable =
        callableFactory.createUnaryCallable(
            updateCertificateMapTransportSettings,
            settings.updateCertificateMapSettings(),
            clientContext);
    this.updateCertificateMapOperationCallable =
        callableFactory.createOperationCallable(
            updateCertificateMapTransportSettings,
            settings.updateCertificateMapOperationSettings(),
            clientContext,
            httpJsonOperationsStub);
    this.deleteCertificateMapCallable =
        callableFactory.createUnaryCallable(
            deleteCertificateMapTransportSettings,
            settings.deleteCertificateMapSettings(),
            clientContext);
    this.deleteCertificateMapOperationCallable =
        callableFactory.createOperationCallable(
            deleteCertificateMapTransportSettings,
            settings.deleteCertificateMapOperationSettings(),
            clientContext,
            httpJsonOperationsStub);
    this.listCertificateMapEntriesCallable =
        callableFactory.createUnaryCallable(
            listCertificateMapEntriesTransportSettings,
            settings.listCertificateMapEntriesSettings(),
            clientContext);
    this.listCertificateMapEntriesPagedCallable =
        callableFactory.createPagedCallable(
            listCertificateMapEntriesTransportSettings,
            settings.listCertificateMapEntriesSettings(),
            clientContext);
    this.getCertificateMapEntryCallable =
        callableFactory.createUnaryCallable(
            getCertificateMapEntryTransportSettings,
            settings.getCertificateMapEntrySettings(),
            clientContext);
    this.createCertificateMapEntryCallable =
        callableFactory.createUnaryCallable(
            createCertificateMapEntryTransportSettings,
            settings.createCertificateMapEntrySettings(),
            clientContext);
    this.createCertificateMapEntryOperationCallable =
        callableFactory.createOperationCallable(
            createCertificateMapEntryTransportSettings,
            settings.createCertificateMapEntryOperationSettings(),
            clientContext,
            httpJsonOperationsStub);
    this.updateCertificateMapEntryCallable =
        callableFactory.createUnaryCallable(
            updateCertificateMapEntryTransportSettings,
            settings.updateCertificateMapEntrySettings(),
            clientContext);
    this.updateCertificateMapEntryOperationCallable =
        callableFactory.createOperationCallable(
            updateCertificateMapEntryTransportSettings,
            settings.updateCertificateMapEntryOperationSettings(),
            clientContext,
            httpJsonOperationsStub);
    this.deleteCertificateMapEntryCallable =
        callableFactory.createUnaryCallable(
            deleteCertificateMapEntryTransportSettings,
            settings.deleteCertificateMapEntrySettings(),
            clientContext);
    this.deleteCertificateMapEntryOperationCallable =
        callableFactory.createOperationCallable(
            deleteCertificateMapEntryTransportSettings,
            settings.deleteCertificateMapEntryOperationSettings(),
            clientContext,
            httpJsonOperationsStub);
    this.listDnsAuthorizationsCallable =
        callableFactory.createUnaryCallable(
            listDnsAuthorizationsTransportSettings,
            settings.listDnsAuthorizationsSettings(),
            clientContext);
    this.listDnsAuthorizationsPagedCallable =
        callableFactory.createPagedCallable(
            listDnsAuthorizationsTransportSettings,
            settings.listDnsAuthorizationsSettings(),
            clientContext);
    this.getDnsAuthorizationCallable =
        callableFactory.createUnaryCallable(
            getDnsAuthorizationTransportSettings,
            settings.getDnsAuthorizationSettings(),
            clientContext);
    this.createDnsAuthorizationCallable =
        callableFactory.createUnaryCallable(
            createDnsAuthorizationTransportSettings,
            settings.createDnsAuthorizationSettings(),
            clientContext);
    this.createDnsAuthorizationOperationCallable =
        callableFactory.createOperationCallable(
            createDnsAuthorizationTransportSettings,
            settings.createDnsAuthorizationOperationSettings(),
            clientContext,
            httpJsonOperationsStub);
    this.updateDnsAuthorizationCallable =
        callableFactory.createUnaryCallable(
            updateDnsAuthorizationTransportSettings,
            settings.updateDnsAuthorizationSettings(),
            clientContext);
    this.updateDnsAuthorizationOperationCallable =
        callableFactory.createOperationCallable(
            updateDnsAuthorizationTransportSettings,
            settings.updateDnsAuthorizationOperationSettings(),
            clientContext,
            httpJsonOperationsStub);
    this.deleteDnsAuthorizationCallable =
        callableFactory.createUnaryCallable(
            deleteDnsAuthorizationTransportSettings,
            settings.deleteDnsAuthorizationSettings(),
            clientContext);
    this.deleteDnsAuthorizationOperationCallable =
        callableFactory.createOperationCallable(
            deleteDnsAuthorizationTransportSettings,
            settings.deleteDnsAuthorizationOperationSettings(),
            clientContext,
            httpJsonOperationsStub);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @InternalApi
  public static List<ApiMethodDescriptor> getMethodDescriptors() {
    List<ApiMethodDescriptor> methodDescriptors = new ArrayList<>();
    methodDescriptors.add(listCertificatesMethodDescriptor);
    methodDescriptors.add(getCertificateMethodDescriptor);
    methodDescriptors.add(createCertificateMethodDescriptor);
    methodDescriptors.add(updateCertificateMethodDescriptor);
    methodDescriptors.add(deleteCertificateMethodDescriptor);
    methodDescriptors.add(listCertificateMapsMethodDescriptor);
    methodDescriptors.add(getCertificateMapMethodDescriptor);
    methodDescriptors.add(createCertificateMapMethodDescriptor);
    methodDescriptors.add(updateCertificateMapMethodDescriptor);
    methodDescriptors.add(deleteCertificateMapMethodDescriptor);
    methodDescriptors.add(listCertificateMapEntriesMethodDescriptor);
    methodDescriptors.add(getCertificateMapEntryMethodDescriptor);
    methodDescriptors.add(createCertificateMapEntryMethodDescriptor);
    methodDescriptors.add(updateCertificateMapEntryMethodDescriptor);
    methodDescriptors.add(deleteCertificateMapEntryMethodDescriptor);
    methodDescriptors.add(listDnsAuthorizationsMethodDescriptor);
    methodDescriptors.add(getDnsAuthorizationMethodDescriptor);
    methodDescriptors.add(createDnsAuthorizationMethodDescriptor);
    methodDescriptors.add(updateDnsAuthorizationMethodDescriptor);
    methodDescriptors.add(deleteDnsAuthorizationMethodDescriptor);
    return methodDescriptors;
  }

  public HttpJsonOperationsStub getHttpJsonOperationsStub() {
    return httpJsonOperationsStub;
  }

  @Override
  public UnaryCallable<ListCertificatesRequest, ListCertificatesResponse>
      listCertificatesCallable() {
    return listCertificatesCallable;
  }

  @Override
  public UnaryCallable<ListCertificatesRequest, ListCertificatesPagedResponse>
      listCertificatesPagedCallable() {
    return listCertificatesPagedCallable;
  }

  @Override
  public UnaryCallable<GetCertificateRequest, Certificate> getCertificateCallable() {
    return getCertificateCallable;
  }

  @Override
  public UnaryCallable<CreateCertificateRequest, Operation> createCertificateCallable() {
    return createCertificateCallable;
  }

  @Override
  public OperationCallable<CreateCertificateRequest, Certificate, OperationMetadata>
      createCertificateOperationCallable() {
    return createCertificateOperationCallable;
  }

  @Override
  public UnaryCallable<UpdateCertificateRequest, Operation> updateCertificateCallable() {
    return updateCertificateCallable;
  }

  @Override
  public OperationCallable<UpdateCertificateRequest, Certificate, OperationMetadata>
      updateCertificateOperationCallable() {
    return updateCertificateOperationCallable;
  }

  @Override
  public UnaryCallable<DeleteCertificateRequest, Operation> deleteCertificateCallable() {
    return deleteCertificateCallable;
  }

  @Override
  public OperationCallable<DeleteCertificateRequest, Empty, OperationMetadata>
      deleteCertificateOperationCallable() {
    return deleteCertificateOperationCallable;
  }

  @Override
  public UnaryCallable<ListCertificateMapsRequest, ListCertificateMapsResponse>
      listCertificateMapsCallable() {
    return listCertificateMapsCallable;
  }

  @Override
  public UnaryCallable<ListCertificateMapsRequest, ListCertificateMapsPagedResponse>
      listCertificateMapsPagedCallable() {
    return listCertificateMapsPagedCallable;
  }

  @Override
  public UnaryCallable<GetCertificateMapRequest, CertificateMap> getCertificateMapCallable() {
    return getCertificateMapCallable;
  }

  @Override
  public UnaryCallable<CreateCertificateMapRequest, Operation> createCertificateMapCallable() {
    return createCertificateMapCallable;
  }

  @Override
  public OperationCallable<CreateCertificateMapRequest, CertificateMap, OperationMetadata>
      createCertificateMapOperationCallable() {
    return createCertificateMapOperationCallable;
  }

  @Override
  public UnaryCallable<UpdateCertificateMapRequest, Operation> updateCertificateMapCallable() {
    return updateCertificateMapCallable;
  }

  @Override
  public OperationCallable<UpdateCertificateMapRequest, CertificateMap, OperationMetadata>
      updateCertificateMapOperationCallable() {
    return updateCertificateMapOperationCallable;
  }

  @Override
  public UnaryCallable<DeleteCertificateMapRequest, Operation> deleteCertificateMapCallable() {
    return deleteCertificateMapCallable;
  }

  @Override
  public OperationCallable<DeleteCertificateMapRequest, Empty, OperationMetadata>
      deleteCertificateMapOperationCallable() {
    return deleteCertificateMapOperationCallable;
  }

  @Override
  public UnaryCallable<ListCertificateMapEntriesRequest, ListCertificateMapEntriesResponse>
      listCertificateMapEntriesCallable() {
    return listCertificateMapEntriesCallable;
  }

  @Override
  public UnaryCallable<ListCertificateMapEntriesRequest, ListCertificateMapEntriesPagedResponse>
      listCertificateMapEntriesPagedCallable() {
    return listCertificateMapEntriesPagedCallable;
  }

  @Override
  public UnaryCallable<GetCertificateMapEntryRequest, CertificateMapEntry>
      getCertificateMapEntryCallable() {
    return getCertificateMapEntryCallable;
  }

  @Override
  public UnaryCallable<CreateCertificateMapEntryRequest, Operation>
      createCertificateMapEntryCallable() {
    return createCertificateMapEntryCallable;
  }

  @Override
  public OperationCallable<CreateCertificateMapEntryRequest, CertificateMapEntry, OperationMetadata>
      createCertificateMapEntryOperationCallable() {
    return createCertificateMapEntryOperationCallable;
  }

  @Override
  public UnaryCallable<UpdateCertificateMapEntryRequest, Operation>
      updateCertificateMapEntryCallable() {
    return updateCertificateMapEntryCallable;
  }

  @Override
  public OperationCallable<UpdateCertificateMapEntryRequest, CertificateMapEntry, OperationMetadata>
      updateCertificateMapEntryOperationCallable() {
    return updateCertificateMapEntryOperationCallable;
  }

  @Override
  public UnaryCallable<DeleteCertificateMapEntryRequest, Operation>
      deleteCertificateMapEntryCallable() {
    return deleteCertificateMapEntryCallable;
  }

  @Override
  public OperationCallable<DeleteCertificateMapEntryRequest, Empty, OperationMetadata>
      deleteCertificateMapEntryOperationCallable() {
    return deleteCertificateMapEntryOperationCallable;
  }

  @Override
  public UnaryCallable<ListDnsAuthorizationsRequest, ListDnsAuthorizationsResponse>
      listDnsAuthorizationsCallable() {
    return listDnsAuthorizationsCallable;
  }

  @Override
  public UnaryCallable<ListDnsAuthorizationsRequest, ListDnsAuthorizationsPagedResponse>
      listDnsAuthorizationsPagedCallable() {
    return listDnsAuthorizationsPagedCallable;
  }

  @Override
  public UnaryCallable<GetDnsAuthorizationRequest, DnsAuthorization> getDnsAuthorizationCallable() {
    return getDnsAuthorizationCallable;
  }

  @Override
  public UnaryCallable<CreateDnsAuthorizationRequest, Operation> createDnsAuthorizationCallable() {
    return createDnsAuthorizationCallable;
  }

  @Override
  public OperationCallable<CreateDnsAuthorizationRequest, DnsAuthorization, OperationMetadata>
      createDnsAuthorizationOperationCallable() {
    return createDnsAuthorizationOperationCallable;
  }

  @Override
  public UnaryCallable<UpdateDnsAuthorizationRequest, Operation> updateDnsAuthorizationCallable() {
    return updateDnsAuthorizationCallable;
  }

  @Override
  public OperationCallable<UpdateDnsAuthorizationRequest, DnsAuthorization, OperationMetadata>
      updateDnsAuthorizationOperationCallable() {
    return updateDnsAuthorizationOperationCallable;
  }

  @Override
  public UnaryCallable<DeleteDnsAuthorizationRequest, Operation> deleteDnsAuthorizationCallable() {
    return deleteDnsAuthorizationCallable;
  }

  @Override
  public OperationCallable<DeleteDnsAuthorizationRequest, Empty, OperationMetadata>
      deleteDnsAuthorizationOperationCallable() {
    return deleteDnsAuthorizationOperationCallable;
  }

  @Override
  public final void close() {
    try {
      backgroundResources.close();
    } catch (RuntimeException e) {
      throw e;
    } catch (Exception e) {
      throw new IllegalStateException("Failed to close resource", e);
    }
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}
