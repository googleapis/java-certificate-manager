// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/certificatemanager/v1/certificate_issuance_config.proto

package com.google.cloud.certificatemanager.v1;

public final class CertificateIssuanceConfigProto {
  private CertificateIssuanceConfigProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_certificatemanager_v1_ListCertificateIssuanceConfigsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_certificatemanager_v1_ListCertificateIssuanceConfigsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_certificatemanager_v1_ListCertificateIssuanceConfigsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_certificatemanager_v1_ListCertificateIssuanceConfigsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_certificatemanager_v1_GetCertificateIssuanceConfigRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_certificatemanager_v1_GetCertificateIssuanceConfigRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_certificatemanager_v1_CreateCertificateIssuanceConfigRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_certificatemanager_v1_CreateCertificateIssuanceConfigRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_certificatemanager_v1_DeleteCertificateIssuanceConfigRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_certificatemanager_v1_DeleteCertificateIssuanceConfigRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_certificatemanager_v1_CertificateIssuanceConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_certificatemanager_v1_CertificateIssuanceConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_certificatemanager_v1_CertificateIssuanceConfig_CertificateAuthorityConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_certificatemanager_v1_CertificateIssuanceConfig_CertificateAuthorityConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_certificatemanager_v1_CertificateIssuanceConfig_CertificateAuthorityConfig_CertificateAuthorityServiceConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_certificatemanager_v1_CertificateIssuanceConfig_CertificateAuthorityConfig_CertificateAuthorityServiceConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_certificatemanager_v1_CertificateIssuanceConfig_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_certificatemanager_v1_CertificateIssuanceConfig_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nDgoogle/cloud/certificatemanager/v1/cer" +
      "tificate_issuance_config.proto\022\"google.c" +
      "loud.certificatemanager.v1\032\037google/api/f" +
      "ield_behavior.proto\032\031google/api/resource" +
      ".proto\032\036google/protobuf/duration.proto\032\037" +
      "google/protobuf/timestamp.proto\"\253\001\n%List" +
      "CertificateIssuanceConfigsRequest\0229\n\006par" +
      "ent\030\001 \001(\tB)\340A\002\372A#\n!locations.googleapis." +
      "com/Location\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_" +
      "token\030\003 \001(\t\022\016\n\006filter\030\004 \001(\t\022\020\n\010order_by\030" +
      "\005 \001(\t\"\273\001\n&ListCertificateIssuanceConfigs" +
      "Response\022c\n\034certificate_issuance_configs" +
      "\030\001 \003(\0132=.google.cloud.certificatemanager" +
      ".v1.CertificateIssuanceConfig\022\027\n\017next_pa" +
      "ge_token\030\002 \001(\t\022\023\n\013unreachable\030\003 \003(\t\"x\n#G" +
      "etCertificateIssuanceConfigRequest\022Q\n\004na" +
      "me\030\001 \001(\tBC\340A\002\372A=\n;certificatemanager.goo" +
      "gleapis.com/CertificateIssuanceConfig\"\371\001" +
      "\n&CreateCertificateIssuanceConfigRequest" +
      "\0229\n\006parent\030\001 \001(\tB)\340A\002\372A#\n!locations.goog" +
      "leapis.com/Location\022+\n\036certificate_issua" +
      "nce_config_id\030\002 \001(\tB\003\340A\002\022g\n\033certificate_" +
      "issuance_config\030\003 \001(\0132=.google.cloud.cer" +
      "tificatemanager.v1.CertificateIssuanceCo" +
      "nfigB\003\340A\002\"{\n&DeleteCertificateIssuanceCo" +
      "nfigRequest\022Q\n\004name\030\001 \001(\tBC\340A\002\372A=\n;certi" +
      "ficatemanager.googleapis.com/Certificate" +
      "IssuanceConfig\"\243\t\n\031CertificateIssuanceCo" +
      "nfig\022\014\n\004name\030\001 \001(\t\0224\n\013create_time\030\002 \001(\0132" +
      "\032.google.protobuf.TimestampB\003\340A\003\0224\n\013upda" +
      "te_time\030\003 \001(\0132\032.google.protobuf.Timestam" +
      "pB\003\340A\003\022Y\n\006labels\030\004 \003(\0132I.google.cloud.ce" +
      "rtificatemanager.v1.CertificateIssuanceC" +
      "onfig.LabelsEntry\022\023\n\013description\030\005 \001(\t\022\203" +
      "\001\n\034certificate_authority_config\030\006 \001(\0132X." +
      "google.cloud.certificatemanager.v1.Certi" +
      "ficateIssuanceConfig.CertificateAuthorit" +
      "yConfigB\003\340A\002\0220\n\010lifetime\030\007 \001(\0132\031.google." +
      "protobuf.DurationB\003\340A\002\022\'\n\032rotation_windo" +
      "w_percentage\030\010 \001(\005B\003\340A\002\022f\n\rkey_algorithm" +
      "\030\t \001(\0162J.google.cloud.certificatemanager" +
      ".v1.CertificateIssuanceConfig.KeyAlgorit" +
      "hmB\003\340A\002\032\260\002\n\032CertificateAuthorityConfig\022\252" +
      "\001\n$certificate_authority_service_config\030" +
      "\001 \001(\0132z.google.cloud.certificatemanager." +
      "v1.CertificateIssuanceConfig.Certificate" +
      "AuthorityConfig.CertificateAuthorityServ" +
      "iceConfigH\000\032]\n!CertificateAuthorityServi" +
      "ceConfig\0228\n\007ca_pool\030\001 \001(\tB\'\340A\002\372A!\n\037priva" +
      "teca.googleapis.com/CaPoolB\006\n\004kind\032-\n\013La" +
      "belsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028" +
      "\001\"K\n\014KeyAlgorithm\022\035\n\031KEY_ALGORITHM_UNSPE" +
      "CIFIED\020\000\022\014\n\010RSA_2048\020\001\022\016\n\nECDSA_P256\020\004:\243" +
      "\001\352A\237\001\n;certificatemanager.googleapis.com" +
      "/CertificateIssuanceConfig\022`projects/{pr" +
      "oject}/locations/{location}/certificateI" +
      "ssuanceConfigs/{certificate_issuance_con" +
      "fig}B\363\002\n&com.google.cloud.certificateman" +
      "ager.v1B\036CertificateIssuanceConfigProtoP" +
      "\001ZVcloud.google.com/go/certificatemanage" +
      "r/apiv1/certificatemanagerpb;certificate" +
      "managerpb\252\002\"Google.Cloud.CertificateMana" +
      "ger.V1\312\002\"Google\\Cloud\\CertificateManager" +
      "\\V1\352\002%Google::Cloud::CertificateManager:" +
      ":V1\352A\\\n\037privateca.googleapis.com/CaPool\022" +
      "9projects/{project}/locations/{location}" +
      "/caPools/{ca_pool}b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_certificatemanager_v1_ListCertificateIssuanceConfigsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_certificatemanager_v1_ListCertificateIssuanceConfigsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_certificatemanager_v1_ListCertificateIssuanceConfigsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", "Filter", "OrderBy", });
    internal_static_google_cloud_certificatemanager_v1_ListCertificateIssuanceConfigsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_certificatemanager_v1_ListCertificateIssuanceConfigsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_certificatemanager_v1_ListCertificateIssuanceConfigsResponse_descriptor,
        new java.lang.String[] { "CertificateIssuanceConfigs", "NextPageToken", "Unreachable", });
    internal_static_google_cloud_certificatemanager_v1_GetCertificateIssuanceConfigRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_certificatemanager_v1_GetCertificateIssuanceConfigRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_certificatemanager_v1_GetCertificateIssuanceConfigRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_certificatemanager_v1_CreateCertificateIssuanceConfigRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_certificatemanager_v1_CreateCertificateIssuanceConfigRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_certificatemanager_v1_CreateCertificateIssuanceConfigRequest_descriptor,
        new java.lang.String[] { "Parent", "CertificateIssuanceConfigId", "CertificateIssuanceConfig", });
    internal_static_google_cloud_certificatemanager_v1_DeleteCertificateIssuanceConfigRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_certificatemanager_v1_DeleteCertificateIssuanceConfigRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_certificatemanager_v1_DeleteCertificateIssuanceConfigRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_certificatemanager_v1_CertificateIssuanceConfig_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_certificatemanager_v1_CertificateIssuanceConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_certificatemanager_v1_CertificateIssuanceConfig_descriptor,
        new java.lang.String[] { "Name", "CreateTime", "UpdateTime", "Labels", "Description", "CertificateAuthorityConfig", "Lifetime", "RotationWindowPercentage", "KeyAlgorithm", });
    internal_static_google_cloud_certificatemanager_v1_CertificateIssuanceConfig_CertificateAuthorityConfig_descriptor =
      internal_static_google_cloud_certificatemanager_v1_CertificateIssuanceConfig_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_certificatemanager_v1_CertificateIssuanceConfig_CertificateAuthorityConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_certificatemanager_v1_CertificateIssuanceConfig_CertificateAuthorityConfig_descriptor,
        new java.lang.String[] { "CertificateAuthorityServiceConfig", "Kind", });
    internal_static_google_cloud_certificatemanager_v1_CertificateIssuanceConfig_CertificateAuthorityConfig_CertificateAuthorityServiceConfig_descriptor =
      internal_static_google_cloud_certificatemanager_v1_CertificateIssuanceConfig_CertificateAuthorityConfig_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_certificatemanager_v1_CertificateIssuanceConfig_CertificateAuthorityConfig_CertificateAuthorityServiceConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_certificatemanager_v1_CertificateIssuanceConfig_CertificateAuthorityConfig_CertificateAuthorityServiceConfig_descriptor,
        new java.lang.String[] { "CaPool", });
    internal_static_google_cloud_certificatemanager_v1_CertificateIssuanceConfig_LabelsEntry_descriptor =
      internal_static_google_cloud_certificatemanager_v1_CertificateIssuanceConfig_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_certificatemanager_v1_CertificateIssuanceConfig_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_certificatemanager_v1_CertificateIssuanceConfig_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
