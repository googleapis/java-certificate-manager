// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/certificatemanager/v1/certificate_issuance_config.proto

package com.google.cloud.certificatemanager.v1;

/**
 * <pre>
 * Request for the `CreateCertificateIssuanceConfig` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.certificatemanager.v1.CreateCertificateIssuanceConfigRequest}
 */
public final class CreateCertificateIssuanceConfigRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.certificatemanager.v1.CreateCertificateIssuanceConfigRequest)
    CreateCertificateIssuanceConfigRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateCertificateIssuanceConfigRequest.newBuilder() to construct.
  private CreateCertificateIssuanceConfigRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateCertificateIssuanceConfigRequest() {
    parent_ = "";
    certificateIssuanceConfigId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateCertificateIssuanceConfigRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.certificatemanager.v1.CertificateIssuanceConfigProto.internal_static_google_cloud_certificatemanager_v1_CreateCertificateIssuanceConfigRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.certificatemanager.v1.CertificateIssuanceConfigProto.internal_static_google_cloud_certificatemanager_v1_CreateCertificateIssuanceConfigRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.certificatemanager.v1.CreateCertificateIssuanceConfigRequest.class, com.google.cloud.certificatemanager.v1.CreateCertificateIssuanceConfigRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Required. The parent resource of the certificate issuance config. Must be
   * in the format `projects/&#42;&#47;locations/&#42;`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The parent resource of the certificate issuance config. Must be
   * in the format `projects/&#42;&#47;locations/&#42;`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CERTIFICATE_ISSUANCE_CONFIG_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object certificateIssuanceConfigId_ = "";
  /**
   * <pre>
   * Required. A user-provided name of the certificate config.
   * </pre>
   *
   * <code>string certificate_issuance_config_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The certificateIssuanceConfigId.
   */
  @java.lang.Override
  public java.lang.String getCertificateIssuanceConfigId() {
    java.lang.Object ref = certificateIssuanceConfigId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      certificateIssuanceConfigId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. A user-provided name of the certificate config.
   * </pre>
   *
   * <code>string certificate_issuance_config_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for certificateIssuanceConfigId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCertificateIssuanceConfigIdBytes() {
    java.lang.Object ref = certificateIssuanceConfigId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      certificateIssuanceConfigId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CERTIFICATE_ISSUANCE_CONFIG_FIELD_NUMBER = 3;
  private com.google.cloud.certificatemanager.v1.CertificateIssuanceConfig certificateIssuanceConfig_;
  /**
   * <pre>
   * Required. A definition of the certificate issuance config to create.
   * </pre>
   *
   * <code>.google.cloud.certificatemanager.v1.CertificateIssuanceConfig certificate_issuance_config = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the certificateIssuanceConfig field is set.
   */
  @java.lang.Override
  public boolean hasCertificateIssuanceConfig() {
    return certificateIssuanceConfig_ != null;
  }
  /**
   * <pre>
   * Required. A definition of the certificate issuance config to create.
   * </pre>
   *
   * <code>.google.cloud.certificatemanager.v1.CertificateIssuanceConfig certificate_issuance_config = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The certificateIssuanceConfig.
   */
  @java.lang.Override
  public com.google.cloud.certificatemanager.v1.CertificateIssuanceConfig getCertificateIssuanceConfig() {
    return certificateIssuanceConfig_ == null ? com.google.cloud.certificatemanager.v1.CertificateIssuanceConfig.getDefaultInstance() : certificateIssuanceConfig_;
  }
  /**
   * <pre>
   * Required. A definition of the certificate issuance config to create.
   * </pre>
   *
   * <code>.google.cloud.certificatemanager.v1.CertificateIssuanceConfig certificate_issuance_config = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.certificatemanager.v1.CertificateIssuanceConfigOrBuilder getCertificateIssuanceConfigOrBuilder() {
    return certificateIssuanceConfig_ == null ? com.google.cloud.certificatemanager.v1.CertificateIssuanceConfig.getDefaultInstance() : certificateIssuanceConfig_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(certificateIssuanceConfigId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, certificateIssuanceConfigId_);
    }
    if (certificateIssuanceConfig_ != null) {
      output.writeMessage(3, getCertificateIssuanceConfig());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(certificateIssuanceConfigId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, certificateIssuanceConfigId_);
    }
    if (certificateIssuanceConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getCertificateIssuanceConfig());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.certificatemanager.v1.CreateCertificateIssuanceConfigRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.certificatemanager.v1.CreateCertificateIssuanceConfigRequest other = (com.google.cloud.certificatemanager.v1.CreateCertificateIssuanceConfigRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (!getCertificateIssuanceConfigId()
        .equals(other.getCertificateIssuanceConfigId())) return false;
    if (hasCertificateIssuanceConfig() != other.hasCertificateIssuanceConfig()) return false;
    if (hasCertificateIssuanceConfig()) {
      if (!getCertificateIssuanceConfig()
          .equals(other.getCertificateIssuanceConfig())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (37 * hash) + CERTIFICATE_ISSUANCE_CONFIG_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCertificateIssuanceConfigId().hashCode();
    if (hasCertificateIssuanceConfig()) {
      hash = (37 * hash) + CERTIFICATE_ISSUANCE_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getCertificateIssuanceConfig().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.certificatemanager.v1.CreateCertificateIssuanceConfigRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.certificatemanager.v1.CreateCertificateIssuanceConfigRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.certificatemanager.v1.CreateCertificateIssuanceConfigRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.certificatemanager.v1.CreateCertificateIssuanceConfigRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.certificatemanager.v1.CreateCertificateIssuanceConfigRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.certificatemanager.v1.CreateCertificateIssuanceConfigRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.certificatemanager.v1.CreateCertificateIssuanceConfigRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.certificatemanager.v1.CreateCertificateIssuanceConfigRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.certificatemanager.v1.CreateCertificateIssuanceConfigRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.certificatemanager.v1.CreateCertificateIssuanceConfigRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.certificatemanager.v1.CreateCertificateIssuanceConfigRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.certificatemanager.v1.CreateCertificateIssuanceConfigRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.certificatemanager.v1.CreateCertificateIssuanceConfigRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Request for the `CreateCertificateIssuanceConfig` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.certificatemanager.v1.CreateCertificateIssuanceConfigRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.certificatemanager.v1.CreateCertificateIssuanceConfigRequest)
      com.google.cloud.certificatemanager.v1.CreateCertificateIssuanceConfigRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.certificatemanager.v1.CertificateIssuanceConfigProto.internal_static_google_cloud_certificatemanager_v1_CreateCertificateIssuanceConfigRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.certificatemanager.v1.CertificateIssuanceConfigProto.internal_static_google_cloud_certificatemanager_v1_CreateCertificateIssuanceConfigRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.certificatemanager.v1.CreateCertificateIssuanceConfigRequest.class, com.google.cloud.certificatemanager.v1.CreateCertificateIssuanceConfigRequest.Builder.class);
    }

    // Construct using com.google.cloud.certificatemanager.v1.CreateCertificateIssuanceConfigRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      certificateIssuanceConfigId_ = "";
      certificateIssuanceConfig_ = null;
      if (certificateIssuanceConfigBuilder_ != null) {
        certificateIssuanceConfigBuilder_.dispose();
        certificateIssuanceConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.certificatemanager.v1.CertificateIssuanceConfigProto.internal_static_google_cloud_certificatemanager_v1_CreateCertificateIssuanceConfigRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.certificatemanager.v1.CreateCertificateIssuanceConfigRequest getDefaultInstanceForType() {
      return com.google.cloud.certificatemanager.v1.CreateCertificateIssuanceConfigRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.certificatemanager.v1.CreateCertificateIssuanceConfigRequest build() {
      com.google.cloud.certificatemanager.v1.CreateCertificateIssuanceConfigRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.certificatemanager.v1.CreateCertificateIssuanceConfigRequest buildPartial() {
      com.google.cloud.certificatemanager.v1.CreateCertificateIssuanceConfigRequest result = new com.google.cloud.certificatemanager.v1.CreateCertificateIssuanceConfigRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.certificatemanager.v1.CreateCertificateIssuanceConfigRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.certificateIssuanceConfigId_ = certificateIssuanceConfigId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.certificateIssuanceConfig_ = certificateIssuanceConfigBuilder_ == null
            ? certificateIssuanceConfig_
            : certificateIssuanceConfigBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.certificatemanager.v1.CreateCertificateIssuanceConfigRequest) {
        return mergeFrom((com.google.cloud.certificatemanager.v1.CreateCertificateIssuanceConfigRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.certificatemanager.v1.CreateCertificateIssuanceConfigRequest other) {
      if (other == com.google.cloud.certificatemanager.v1.CreateCertificateIssuanceConfigRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getCertificateIssuanceConfigId().isEmpty()) {
        certificateIssuanceConfigId_ = other.certificateIssuanceConfigId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasCertificateIssuanceConfig()) {
        mergeCertificateIssuanceConfig(other.getCertificateIssuanceConfig());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              parent_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              certificateIssuanceConfigId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getCertificateIssuanceConfigFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. The parent resource of the certificate issuance config. Must be
     * in the format `projects/&#42;&#47;locations/&#42;`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The parent resource of the certificate issuance config. Must be
     * in the format `projects/&#42;&#47;locations/&#42;`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The parent resource of the certificate issuance config. Must be
     * in the format `projects/&#42;&#47;locations/&#42;`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The parent resource of the certificate issuance config. Must be
     * in the format `projects/&#42;&#47;locations/&#42;`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The parent resource of the certificate issuance config. Must be
     * in the format `projects/&#42;&#47;locations/&#42;`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object certificateIssuanceConfigId_ = "";
    /**
     * <pre>
     * Required. A user-provided name of the certificate config.
     * </pre>
     *
     * <code>string certificate_issuance_config_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The certificateIssuanceConfigId.
     */
    public java.lang.String getCertificateIssuanceConfigId() {
      java.lang.Object ref = certificateIssuanceConfigId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        certificateIssuanceConfigId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. A user-provided name of the certificate config.
     * </pre>
     *
     * <code>string certificate_issuance_config_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for certificateIssuanceConfigId.
     */
    public com.google.protobuf.ByteString
        getCertificateIssuanceConfigIdBytes() {
      java.lang.Object ref = certificateIssuanceConfigId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        certificateIssuanceConfigId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. A user-provided name of the certificate config.
     * </pre>
     *
     * <code>string certificate_issuance_config_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The certificateIssuanceConfigId to set.
     * @return This builder for chaining.
     */
    public Builder setCertificateIssuanceConfigId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      certificateIssuanceConfigId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A user-provided name of the certificate config.
     * </pre>
     *
     * <code>string certificate_issuance_config_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearCertificateIssuanceConfigId() {
      certificateIssuanceConfigId_ = getDefaultInstance().getCertificateIssuanceConfigId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A user-provided name of the certificate config.
     * </pre>
     *
     * <code>string certificate_issuance_config_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for certificateIssuanceConfigId to set.
     * @return This builder for chaining.
     */
    public Builder setCertificateIssuanceConfigIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      certificateIssuanceConfigId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.cloud.certificatemanager.v1.CertificateIssuanceConfig certificateIssuanceConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.certificatemanager.v1.CertificateIssuanceConfig, com.google.cloud.certificatemanager.v1.CertificateIssuanceConfig.Builder, com.google.cloud.certificatemanager.v1.CertificateIssuanceConfigOrBuilder> certificateIssuanceConfigBuilder_;
    /**
     * <pre>
     * Required. A definition of the certificate issuance config to create.
     * </pre>
     *
     * <code>.google.cloud.certificatemanager.v1.CertificateIssuanceConfig certificate_issuance_config = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the certificateIssuanceConfig field is set.
     */
    public boolean hasCertificateIssuanceConfig() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Required. A definition of the certificate issuance config to create.
     * </pre>
     *
     * <code>.google.cloud.certificatemanager.v1.CertificateIssuanceConfig certificate_issuance_config = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The certificateIssuanceConfig.
     */
    public com.google.cloud.certificatemanager.v1.CertificateIssuanceConfig getCertificateIssuanceConfig() {
      if (certificateIssuanceConfigBuilder_ == null) {
        return certificateIssuanceConfig_ == null ? com.google.cloud.certificatemanager.v1.CertificateIssuanceConfig.getDefaultInstance() : certificateIssuanceConfig_;
      } else {
        return certificateIssuanceConfigBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. A definition of the certificate issuance config to create.
     * </pre>
     *
     * <code>.google.cloud.certificatemanager.v1.CertificateIssuanceConfig certificate_issuance_config = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setCertificateIssuanceConfig(com.google.cloud.certificatemanager.v1.CertificateIssuanceConfig value) {
      if (certificateIssuanceConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        certificateIssuanceConfig_ = value;
      } else {
        certificateIssuanceConfigBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A definition of the certificate issuance config to create.
     * </pre>
     *
     * <code>.google.cloud.certificatemanager.v1.CertificateIssuanceConfig certificate_issuance_config = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setCertificateIssuanceConfig(
        com.google.cloud.certificatemanager.v1.CertificateIssuanceConfig.Builder builderForValue) {
      if (certificateIssuanceConfigBuilder_ == null) {
        certificateIssuanceConfig_ = builderForValue.build();
      } else {
        certificateIssuanceConfigBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A definition of the certificate issuance config to create.
     * </pre>
     *
     * <code>.google.cloud.certificatemanager.v1.CertificateIssuanceConfig certificate_issuance_config = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeCertificateIssuanceConfig(com.google.cloud.certificatemanager.v1.CertificateIssuanceConfig value) {
      if (certificateIssuanceConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          certificateIssuanceConfig_ != null &&
          certificateIssuanceConfig_ != com.google.cloud.certificatemanager.v1.CertificateIssuanceConfig.getDefaultInstance()) {
          getCertificateIssuanceConfigBuilder().mergeFrom(value);
        } else {
          certificateIssuanceConfig_ = value;
        }
      } else {
        certificateIssuanceConfigBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A definition of the certificate issuance config to create.
     * </pre>
     *
     * <code>.google.cloud.certificatemanager.v1.CertificateIssuanceConfig certificate_issuance_config = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearCertificateIssuanceConfig() {
      bitField0_ = (bitField0_ & ~0x00000004);
      certificateIssuanceConfig_ = null;
      if (certificateIssuanceConfigBuilder_ != null) {
        certificateIssuanceConfigBuilder_.dispose();
        certificateIssuanceConfigBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A definition of the certificate issuance config to create.
     * </pre>
     *
     * <code>.google.cloud.certificatemanager.v1.CertificateIssuanceConfig certificate_issuance_config = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.certificatemanager.v1.CertificateIssuanceConfig.Builder getCertificateIssuanceConfigBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getCertificateIssuanceConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. A definition of the certificate issuance config to create.
     * </pre>
     *
     * <code>.google.cloud.certificatemanager.v1.CertificateIssuanceConfig certificate_issuance_config = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.certificatemanager.v1.CertificateIssuanceConfigOrBuilder getCertificateIssuanceConfigOrBuilder() {
      if (certificateIssuanceConfigBuilder_ != null) {
        return certificateIssuanceConfigBuilder_.getMessageOrBuilder();
      } else {
        return certificateIssuanceConfig_ == null ?
            com.google.cloud.certificatemanager.v1.CertificateIssuanceConfig.getDefaultInstance() : certificateIssuanceConfig_;
      }
    }
    /**
     * <pre>
     * Required. A definition of the certificate issuance config to create.
     * </pre>
     *
     * <code>.google.cloud.certificatemanager.v1.CertificateIssuanceConfig certificate_issuance_config = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.certificatemanager.v1.CertificateIssuanceConfig, com.google.cloud.certificatemanager.v1.CertificateIssuanceConfig.Builder, com.google.cloud.certificatemanager.v1.CertificateIssuanceConfigOrBuilder> 
        getCertificateIssuanceConfigFieldBuilder() {
      if (certificateIssuanceConfigBuilder_ == null) {
        certificateIssuanceConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.certificatemanager.v1.CertificateIssuanceConfig, com.google.cloud.certificatemanager.v1.CertificateIssuanceConfig.Builder, com.google.cloud.certificatemanager.v1.CertificateIssuanceConfigOrBuilder>(
                getCertificateIssuanceConfig(),
                getParentForChildren(),
                isClean());
        certificateIssuanceConfig_ = null;
      }
      return certificateIssuanceConfigBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.certificatemanager.v1.CreateCertificateIssuanceConfigRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.certificatemanager.v1.CreateCertificateIssuanceConfigRequest)
  private static final com.google.cloud.certificatemanager.v1.CreateCertificateIssuanceConfigRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.certificatemanager.v1.CreateCertificateIssuanceConfigRequest();
  }

  public static com.google.cloud.certificatemanager.v1.CreateCertificateIssuanceConfigRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateCertificateIssuanceConfigRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateCertificateIssuanceConfigRequest>() {
    @java.lang.Override
    public CreateCertificateIssuanceConfigRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<CreateCertificateIssuanceConfigRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateCertificateIssuanceConfigRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.certificatemanager.v1.CreateCertificateIssuanceConfigRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
