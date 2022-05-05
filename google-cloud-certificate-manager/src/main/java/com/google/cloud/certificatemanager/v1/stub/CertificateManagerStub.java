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

import com.google.api.gax.core.BackgroundResource;
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
import com.google.longrunning.stub.OperationsStub;
import com.google.protobuf.Empty;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the CertificateManager service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public abstract class CertificateManagerStub implements BackgroundResource {

  public OperationsStub getOperationsStub() {
    throw new UnsupportedOperationException("Not implemented: getOperationsStub()");
  }

  public UnaryCallable<ListCertificatesRequest, ListCertificatesPagedResponse>
      listCertificatesPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listCertificatesPagedCallable()");
  }

  public UnaryCallable<ListCertificatesRequest, ListCertificatesResponse>
      listCertificatesCallable() {
    throw new UnsupportedOperationException("Not implemented: listCertificatesCallable()");
  }

  public UnaryCallable<GetCertificateRequest, Certificate> getCertificateCallable() {
    throw new UnsupportedOperationException("Not implemented: getCertificateCallable()");
  }

  public OperationCallable<CreateCertificateRequest, Certificate, OperationMetadata>
      createCertificateOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: createCertificateOperationCallable()");
  }

  public UnaryCallable<CreateCertificateRequest, Operation> createCertificateCallable() {
    throw new UnsupportedOperationException("Not implemented: createCertificateCallable()");
  }

  public OperationCallable<UpdateCertificateRequest, Certificate, OperationMetadata>
      updateCertificateOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: updateCertificateOperationCallable()");
  }

  public UnaryCallable<UpdateCertificateRequest, Operation> updateCertificateCallable() {
    throw new UnsupportedOperationException("Not implemented: updateCertificateCallable()");
  }

  public OperationCallable<DeleteCertificateRequest, Empty, OperationMetadata>
      deleteCertificateOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: deleteCertificateOperationCallable()");
  }

  public UnaryCallable<DeleteCertificateRequest, Operation> deleteCertificateCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteCertificateCallable()");
  }

  public UnaryCallable<ListCertificateMapsRequest, ListCertificateMapsPagedResponse>
      listCertificateMapsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listCertificateMapsPagedCallable()");
  }

  public UnaryCallable<ListCertificateMapsRequest, ListCertificateMapsResponse>
      listCertificateMapsCallable() {
    throw new UnsupportedOperationException("Not implemented: listCertificateMapsCallable()");
  }

  public UnaryCallable<GetCertificateMapRequest, CertificateMap> getCertificateMapCallable() {
    throw new UnsupportedOperationException("Not implemented: getCertificateMapCallable()");
  }

  public OperationCallable<CreateCertificateMapRequest, CertificateMap, OperationMetadata>
      createCertificateMapOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: createCertificateMapOperationCallable()");
  }

  public UnaryCallable<CreateCertificateMapRequest, Operation> createCertificateMapCallable() {
    throw new UnsupportedOperationException("Not implemented: createCertificateMapCallable()");
  }

  public OperationCallable<UpdateCertificateMapRequest, CertificateMap, OperationMetadata>
      updateCertificateMapOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: updateCertificateMapOperationCallable()");
  }

  public UnaryCallable<UpdateCertificateMapRequest, Operation> updateCertificateMapCallable() {
    throw new UnsupportedOperationException("Not implemented: updateCertificateMapCallable()");
  }

  public OperationCallable<DeleteCertificateMapRequest, Empty, OperationMetadata>
      deleteCertificateMapOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: deleteCertificateMapOperationCallable()");
  }

  public UnaryCallable<DeleteCertificateMapRequest, Operation> deleteCertificateMapCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteCertificateMapCallable()");
  }

  public UnaryCallable<ListCertificateMapEntriesRequest, ListCertificateMapEntriesPagedResponse>
      listCertificateMapEntriesPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listCertificateMapEntriesPagedCallable()");
  }

  public UnaryCallable<ListCertificateMapEntriesRequest, ListCertificateMapEntriesResponse>
      listCertificateMapEntriesCallable() {
    throw new UnsupportedOperationException("Not implemented: listCertificateMapEntriesCallable()");
  }

  public UnaryCallable<GetCertificateMapEntryRequest, CertificateMapEntry>
      getCertificateMapEntryCallable() {
    throw new UnsupportedOperationException("Not implemented: getCertificateMapEntryCallable()");
  }

  public OperationCallable<CreateCertificateMapEntryRequest, CertificateMapEntry, OperationMetadata>
      createCertificateMapEntryOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: createCertificateMapEntryOperationCallable()");
  }

  public UnaryCallable<CreateCertificateMapEntryRequest, Operation>
      createCertificateMapEntryCallable() {
    throw new UnsupportedOperationException("Not implemented: createCertificateMapEntryCallable()");
  }

  public OperationCallable<UpdateCertificateMapEntryRequest, CertificateMapEntry, OperationMetadata>
      updateCertificateMapEntryOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: updateCertificateMapEntryOperationCallable()");
  }

  public UnaryCallable<UpdateCertificateMapEntryRequest, Operation>
      updateCertificateMapEntryCallable() {
    throw new UnsupportedOperationException("Not implemented: updateCertificateMapEntryCallable()");
  }

  public OperationCallable<DeleteCertificateMapEntryRequest, Empty, OperationMetadata>
      deleteCertificateMapEntryOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: deleteCertificateMapEntryOperationCallable()");
  }

  public UnaryCallable<DeleteCertificateMapEntryRequest, Operation>
      deleteCertificateMapEntryCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteCertificateMapEntryCallable()");
  }

  public UnaryCallable<ListDnsAuthorizationsRequest, ListDnsAuthorizationsPagedResponse>
      listDnsAuthorizationsPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listDnsAuthorizationsPagedCallable()");
  }

  public UnaryCallable<ListDnsAuthorizationsRequest, ListDnsAuthorizationsResponse>
      listDnsAuthorizationsCallable() {
    throw new UnsupportedOperationException("Not implemented: listDnsAuthorizationsCallable()");
  }

  public UnaryCallable<GetDnsAuthorizationRequest, DnsAuthorization> getDnsAuthorizationCallable() {
    throw new UnsupportedOperationException("Not implemented: getDnsAuthorizationCallable()");
  }

  public OperationCallable<CreateDnsAuthorizationRequest, DnsAuthorization, OperationMetadata>
      createDnsAuthorizationOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: createDnsAuthorizationOperationCallable()");
  }

  public UnaryCallable<CreateDnsAuthorizationRequest, Operation> createDnsAuthorizationCallable() {
    throw new UnsupportedOperationException("Not implemented: createDnsAuthorizationCallable()");
  }

  public OperationCallable<UpdateDnsAuthorizationRequest, DnsAuthorization, OperationMetadata>
      updateDnsAuthorizationOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: updateDnsAuthorizationOperationCallable()");
  }

  public UnaryCallable<UpdateDnsAuthorizationRequest, Operation> updateDnsAuthorizationCallable() {
    throw new UnsupportedOperationException("Not implemented: updateDnsAuthorizationCallable()");
  }

  public OperationCallable<DeleteDnsAuthorizationRequest, Empty, OperationMetadata>
      deleteDnsAuthorizationOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: deleteDnsAuthorizationOperationCallable()");
  }

  public UnaryCallable<DeleteDnsAuthorizationRequest, Operation> deleteDnsAuthorizationCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteDnsAuthorizationCallable()");
  }

  @Override
  public abstract void close();
}
