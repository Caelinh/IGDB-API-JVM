// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/api/igdb/igdbproto.proto

package proto;

/**
 * Protobuf type {@code proto.InvolvedCompanyResult}
 */
public final class InvolvedCompanyResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.InvolvedCompanyResult)
    InvolvedCompanyResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InvolvedCompanyResult.newBuilder() to construct.
  private InvolvedCompanyResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InvolvedCompanyResult() {
    involvedcompanies_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InvolvedCompanyResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.Igdbproto.internal_static_proto_InvolvedCompanyResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.Igdbproto.internal_static_proto_InvolvedCompanyResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.InvolvedCompanyResult.class, proto.InvolvedCompanyResult.Builder.class);
  }

  public static final int INVOLVEDCOMPANIES_FIELD_NUMBER = 1;
  private java.util.List<proto.InvolvedCompany> involvedcompanies_;
  /**
   * <code>repeated .proto.InvolvedCompany involvedcompanies = 1;</code>
   */
  @java.lang.Override
  public java.util.List<proto.InvolvedCompany> getInvolvedcompaniesList() {
    return involvedcompanies_;
  }
  /**
   * <code>repeated .proto.InvolvedCompany involvedcompanies = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends proto.InvolvedCompanyOrBuilder> 
      getInvolvedcompaniesOrBuilderList() {
    return involvedcompanies_;
  }
  /**
   * <code>repeated .proto.InvolvedCompany involvedcompanies = 1;</code>
   */
  @java.lang.Override
  public int getInvolvedcompaniesCount() {
    return involvedcompanies_.size();
  }
  /**
   * <code>repeated .proto.InvolvedCompany involvedcompanies = 1;</code>
   */
  @java.lang.Override
  public proto.InvolvedCompany getInvolvedcompanies(int index) {
    return involvedcompanies_.get(index);
  }
  /**
   * <code>repeated .proto.InvolvedCompany involvedcompanies = 1;</code>
   */
  @java.lang.Override
  public proto.InvolvedCompanyOrBuilder getInvolvedcompaniesOrBuilder(
      int index) {
    return involvedcompanies_.get(index);
  }

  public static proto.InvolvedCompanyResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.InvolvedCompanyResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.InvolvedCompanyResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.InvolvedCompanyResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.InvolvedCompanyResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.InvolvedCompanyResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.InvolvedCompanyResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.InvolvedCompanyResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.InvolvedCompanyResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto.InvolvedCompanyResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.InvolvedCompanyResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.InvolvedCompanyResult parseFrom(
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
  public static Builder newBuilder(proto.InvolvedCompanyResult prototype) {
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
   * Protobuf type {@code proto.InvolvedCompanyResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.InvolvedCompanyResult)
      proto.InvolvedCompanyResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.Igdbproto.internal_static_proto_InvolvedCompanyResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.Igdbproto.internal_static_proto_InvolvedCompanyResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.InvolvedCompanyResult.class, proto.InvolvedCompanyResult.Builder.class);
    }

    // Construct using proto.InvolvedCompanyResult.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (involvedcompaniesBuilder_ == null) {
        involvedcompanies_ = java.util.Collections.emptyList();
      } else {
        involvedcompanies_ = null;
        involvedcompaniesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.Igdbproto.internal_static_proto_InvolvedCompanyResult_descriptor;
    }

    @java.lang.Override
    public proto.InvolvedCompanyResult getDefaultInstanceForType() {
      return proto.InvolvedCompanyResult.getDefaultInstance();
    }

    @java.lang.Override
    public proto.InvolvedCompanyResult build() {
      proto.InvolvedCompanyResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto.InvolvedCompanyResult buildPartial() {
      proto.InvolvedCompanyResult result = new proto.InvolvedCompanyResult(this);
      int from_bitField0_ = bitField0_;
      if (involvedcompaniesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          involvedcompanies_ = java.util.Collections.unmodifiableList(involvedcompanies_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.involvedcompanies_ = involvedcompanies_;
      } else {
        result.involvedcompanies_ = involvedcompaniesBuilder_.build();
      }
      onBuilt();
      return result;
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
    private int bitField0_;

    private java.util.List<proto.InvolvedCompany> involvedcompanies_ =
      java.util.Collections.emptyList();
    private void ensureInvolvedcompaniesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        involvedcompanies_ = new java.util.ArrayList<proto.InvolvedCompany>(involvedcompanies_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.InvolvedCompany, proto.InvolvedCompany.Builder, proto.InvolvedCompanyOrBuilder> involvedcompaniesBuilder_;

    /**
     * <code>repeated .proto.InvolvedCompany involvedcompanies = 1;</code>
     */
    public java.util.List<proto.InvolvedCompany> getInvolvedcompaniesList() {
      if (involvedcompaniesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(involvedcompanies_);
      } else {
        return involvedcompaniesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .proto.InvolvedCompany involvedcompanies = 1;</code>
     */
    public int getInvolvedcompaniesCount() {
      if (involvedcompaniesBuilder_ == null) {
        return involvedcompanies_.size();
      } else {
        return involvedcompaniesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .proto.InvolvedCompany involvedcompanies = 1;</code>
     */
    public proto.InvolvedCompany getInvolvedcompanies(int index) {
      if (involvedcompaniesBuilder_ == null) {
        return involvedcompanies_.get(index);
      } else {
        return involvedcompaniesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .proto.InvolvedCompany involvedcompanies = 1;</code>
     */
    public Builder setInvolvedcompanies(
        int index, proto.InvolvedCompany value) {
      if (involvedcompaniesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInvolvedcompaniesIsMutable();
        involvedcompanies_.set(index, value);
        onChanged();
      } else {
        involvedcompaniesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.InvolvedCompany involvedcompanies = 1;</code>
     */
    public Builder setInvolvedcompanies(
        int index, proto.InvolvedCompany.Builder builderForValue) {
      if (involvedcompaniesBuilder_ == null) {
        ensureInvolvedcompaniesIsMutable();
        involvedcompanies_.set(index, builderForValue.build());
        onChanged();
      } else {
        involvedcompaniesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.InvolvedCompany involvedcompanies = 1;</code>
     */
    public Builder addInvolvedcompanies(proto.InvolvedCompany value) {
      if (involvedcompaniesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInvolvedcompaniesIsMutable();
        involvedcompanies_.add(value);
        onChanged();
      } else {
        involvedcompaniesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.InvolvedCompany involvedcompanies = 1;</code>
     */
    public Builder addInvolvedcompanies(
        int index, proto.InvolvedCompany value) {
      if (involvedcompaniesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInvolvedcompaniesIsMutable();
        involvedcompanies_.add(index, value);
        onChanged();
      } else {
        involvedcompaniesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.InvolvedCompany involvedcompanies = 1;</code>
     */
    public Builder addInvolvedcompanies(
        proto.InvolvedCompany.Builder builderForValue) {
      if (involvedcompaniesBuilder_ == null) {
        ensureInvolvedcompaniesIsMutable();
        involvedcompanies_.add(builderForValue.build());
        onChanged();
      } else {
        involvedcompaniesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.InvolvedCompany involvedcompanies = 1;</code>
     */
    public Builder addInvolvedcompanies(
        int index, proto.InvolvedCompany.Builder builderForValue) {
      if (involvedcompaniesBuilder_ == null) {
        ensureInvolvedcompaniesIsMutable();
        involvedcompanies_.add(index, builderForValue.build());
        onChanged();
      } else {
        involvedcompaniesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.InvolvedCompany involvedcompanies = 1;</code>
     */
    public Builder addAllInvolvedcompanies(
        java.lang.Iterable<? extends proto.InvolvedCompany> values) {
      if (involvedcompaniesBuilder_ == null) {
        ensureInvolvedcompaniesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, involvedcompanies_);
        onChanged();
      } else {
        involvedcompaniesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .proto.InvolvedCompany involvedcompanies = 1;</code>
     */
    public Builder clearInvolvedcompanies() {
      if (involvedcompaniesBuilder_ == null) {
        involvedcompanies_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        involvedcompaniesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .proto.InvolvedCompany involvedcompanies = 1;</code>
     */
    public Builder removeInvolvedcompanies(int index) {
      if (involvedcompaniesBuilder_ == null) {
        ensureInvolvedcompaniesIsMutable();
        involvedcompanies_.remove(index);
        onChanged();
      } else {
        involvedcompaniesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .proto.InvolvedCompany involvedcompanies = 1;</code>
     */
    public proto.InvolvedCompany.Builder getInvolvedcompaniesBuilder(
        int index) {
      return getInvolvedcompaniesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .proto.InvolvedCompany involvedcompanies = 1;</code>
     */
    public proto.InvolvedCompanyOrBuilder getInvolvedcompaniesOrBuilder(
        int index) {
      if (involvedcompaniesBuilder_ == null) {
        return involvedcompanies_.get(index);  } else {
        return involvedcompaniesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .proto.InvolvedCompany involvedcompanies = 1;</code>
     */
    public java.util.List<? extends proto.InvolvedCompanyOrBuilder> 
         getInvolvedcompaniesOrBuilderList() {
      if (involvedcompaniesBuilder_ != null) {
        return involvedcompaniesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(involvedcompanies_);
      }
    }
    /**
     * <code>repeated .proto.InvolvedCompany involvedcompanies = 1;</code>
     */
    public proto.InvolvedCompany.Builder addInvolvedcompaniesBuilder() {
      return getInvolvedcompaniesFieldBuilder().addBuilder(
          proto.InvolvedCompany.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.InvolvedCompany involvedcompanies = 1;</code>
     */
    public proto.InvolvedCompany.Builder addInvolvedcompaniesBuilder(
        int index) {
      return getInvolvedcompaniesFieldBuilder().addBuilder(
          index, proto.InvolvedCompany.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.InvolvedCompany involvedcompanies = 1;</code>
     */
    public java.util.List<proto.InvolvedCompany.Builder> 
         getInvolvedcompaniesBuilderList() {
      return getInvolvedcompaniesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.InvolvedCompany, proto.InvolvedCompany.Builder, proto.InvolvedCompanyOrBuilder> 
        getInvolvedcompaniesFieldBuilder() {
      if (involvedcompaniesBuilder_ == null) {
        involvedcompaniesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            proto.InvolvedCompany, proto.InvolvedCompany.Builder, proto.InvolvedCompanyOrBuilder>(
                involvedcompanies_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        involvedcompanies_ = null;
      }
      return involvedcompaniesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:proto.InvolvedCompanyResult)
  }

  // @@protoc_insertion_point(class_scope:proto.InvolvedCompanyResult)
  private static final proto.InvolvedCompanyResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.InvolvedCompanyResult();
  }

  public static proto.InvolvedCompanyResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InvolvedCompanyResult>
      PARSER = new com.google.protobuf.AbstractParser<InvolvedCompanyResult>() {
    @java.lang.Override
    public InvolvedCompanyResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<InvolvedCompanyResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InvolvedCompanyResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto.InvolvedCompanyResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

