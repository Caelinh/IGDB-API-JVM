// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/api/igdb/igdbproto.proto

package proto;

/**
 * Protobuf type {@code proto.CollectionTypeResult}
 */
public final class CollectionTypeResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.CollectionTypeResult)
    CollectionTypeResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CollectionTypeResult.newBuilder() to construct.
  private CollectionTypeResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CollectionTypeResult() {
    collectiontypes_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CollectionTypeResult();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.Igdbproto.internal_static_proto_CollectionTypeResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.Igdbproto.internal_static_proto_CollectionTypeResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.CollectionTypeResult.class, proto.CollectionTypeResult.Builder.class);
  }

  public static final int COLLECTIONTYPES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<proto.CollectionType> collectiontypes_;
  /**
   * <code>repeated .proto.CollectionType collectiontypes = 1;</code>
   */
  @java.lang.Override
  public java.util.List<proto.CollectionType> getCollectiontypesList() {
    return collectiontypes_;
  }
  /**
   * <code>repeated .proto.CollectionType collectiontypes = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends proto.CollectionTypeOrBuilder> 
      getCollectiontypesOrBuilderList() {
    return collectiontypes_;
  }
  /**
   * <code>repeated .proto.CollectionType collectiontypes = 1;</code>
   */
  @java.lang.Override
  public int getCollectiontypesCount() {
    return collectiontypes_.size();
  }
  /**
   * <code>repeated .proto.CollectionType collectiontypes = 1;</code>
   */
  @java.lang.Override
  public proto.CollectionType getCollectiontypes(int index) {
    return collectiontypes_.get(index);
  }
  /**
   * <code>repeated .proto.CollectionType collectiontypes = 1;</code>
   */
  @java.lang.Override
  public proto.CollectionTypeOrBuilder getCollectiontypesOrBuilder(
      int index) {
    return collectiontypes_.get(index);
  }

  public static proto.CollectionTypeResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.CollectionTypeResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.CollectionTypeResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.CollectionTypeResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.CollectionTypeResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.CollectionTypeResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.CollectionTypeResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.CollectionTypeResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static proto.CollectionTypeResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static proto.CollectionTypeResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.CollectionTypeResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.CollectionTypeResult parseFrom(
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
  public static Builder newBuilder(proto.CollectionTypeResult prototype) {
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
   * Protobuf type {@code proto.CollectionTypeResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.CollectionTypeResult)
      proto.CollectionTypeResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.Igdbproto.internal_static_proto_CollectionTypeResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.Igdbproto.internal_static_proto_CollectionTypeResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.CollectionTypeResult.class, proto.CollectionTypeResult.Builder.class);
    }

    // Construct using proto.CollectionTypeResult.newBuilder()
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
      if (collectiontypesBuilder_ == null) {
        collectiontypes_ = java.util.Collections.emptyList();
      } else {
        collectiontypes_ = null;
        collectiontypesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.Igdbproto.internal_static_proto_CollectionTypeResult_descriptor;
    }

    @java.lang.Override
    public proto.CollectionTypeResult getDefaultInstanceForType() {
      return proto.CollectionTypeResult.getDefaultInstance();
    }

    @java.lang.Override
    public proto.CollectionTypeResult build() {
      proto.CollectionTypeResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto.CollectionTypeResult buildPartial() {
      proto.CollectionTypeResult result = new proto.CollectionTypeResult(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(proto.CollectionTypeResult result) {
      if (collectiontypesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          collectiontypes_ = java.util.Collections.unmodifiableList(collectiontypes_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.collectiontypes_ = collectiontypes_;
      } else {
        result.collectiontypes_ = collectiontypesBuilder_.build();
      }
    }

    private void buildPartial0(proto.CollectionTypeResult result) {
      int from_bitField0_ = bitField0_;
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

    private java.util.List<proto.CollectionType> collectiontypes_ =
      java.util.Collections.emptyList();
    private void ensureCollectiontypesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        collectiontypes_ = new java.util.ArrayList<proto.CollectionType>(collectiontypes_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.CollectionType, proto.CollectionType.Builder, proto.CollectionTypeOrBuilder> collectiontypesBuilder_;

    /**
     * <code>repeated .proto.CollectionType collectiontypes = 1;</code>
     */
    public java.util.List<proto.CollectionType> getCollectiontypesList() {
      if (collectiontypesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(collectiontypes_);
      } else {
        return collectiontypesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .proto.CollectionType collectiontypes = 1;</code>
     */
    public int getCollectiontypesCount() {
      if (collectiontypesBuilder_ == null) {
        return collectiontypes_.size();
      } else {
        return collectiontypesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .proto.CollectionType collectiontypes = 1;</code>
     */
    public proto.CollectionType getCollectiontypes(int index) {
      if (collectiontypesBuilder_ == null) {
        return collectiontypes_.get(index);
      } else {
        return collectiontypesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .proto.CollectionType collectiontypes = 1;</code>
     */
    public Builder setCollectiontypes(
        int index, proto.CollectionType value) {
      if (collectiontypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCollectiontypesIsMutable();
        collectiontypes_.set(index, value);
        onChanged();
      } else {
        collectiontypesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.CollectionType collectiontypes = 1;</code>
     */
    public Builder setCollectiontypes(
        int index, proto.CollectionType.Builder builderForValue) {
      if (collectiontypesBuilder_ == null) {
        ensureCollectiontypesIsMutable();
        collectiontypes_.set(index, builderForValue.build());
        onChanged();
      } else {
        collectiontypesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.CollectionType collectiontypes = 1;</code>
     */
    public Builder addCollectiontypes(proto.CollectionType value) {
      if (collectiontypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCollectiontypesIsMutable();
        collectiontypes_.add(value);
        onChanged();
      } else {
        collectiontypesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.CollectionType collectiontypes = 1;</code>
     */
    public Builder addCollectiontypes(
        int index, proto.CollectionType value) {
      if (collectiontypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCollectiontypesIsMutable();
        collectiontypes_.add(index, value);
        onChanged();
      } else {
        collectiontypesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.CollectionType collectiontypes = 1;</code>
     */
    public Builder addCollectiontypes(
        proto.CollectionType.Builder builderForValue) {
      if (collectiontypesBuilder_ == null) {
        ensureCollectiontypesIsMutable();
        collectiontypes_.add(builderForValue.build());
        onChanged();
      } else {
        collectiontypesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.CollectionType collectiontypes = 1;</code>
     */
    public Builder addCollectiontypes(
        int index, proto.CollectionType.Builder builderForValue) {
      if (collectiontypesBuilder_ == null) {
        ensureCollectiontypesIsMutable();
        collectiontypes_.add(index, builderForValue.build());
        onChanged();
      } else {
        collectiontypesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.CollectionType collectiontypes = 1;</code>
     */
    public Builder addAllCollectiontypes(
        java.lang.Iterable<? extends proto.CollectionType> values) {
      if (collectiontypesBuilder_ == null) {
        ensureCollectiontypesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, collectiontypes_);
        onChanged();
      } else {
        collectiontypesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .proto.CollectionType collectiontypes = 1;</code>
     */
    public Builder clearCollectiontypes() {
      if (collectiontypesBuilder_ == null) {
        collectiontypes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        collectiontypesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .proto.CollectionType collectiontypes = 1;</code>
     */
    public Builder removeCollectiontypes(int index) {
      if (collectiontypesBuilder_ == null) {
        ensureCollectiontypesIsMutable();
        collectiontypes_.remove(index);
        onChanged();
      } else {
        collectiontypesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .proto.CollectionType collectiontypes = 1;</code>
     */
    public proto.CollectionType.Builder getCollectiontypesBuilder(
        int index) {
      return getCollectiontypesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .proto.CollectionType collectiontypes = 1;</code>
     */
    public proto.CollectionTypeOrBuilder getCollectiontypesOrBuilder(
        int index) {
      if (collectiontypesBuilder_ == null) {
        return collectiontypes_.get(index);  } else {
        return collectiontypesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .proto.CollectionType collectiontypes = 1;</code>
     */
    public java.util.List<? extends proto.CollectionTypeOrBuilder> 
         getCollectiontypesOrBuilderList() {
      if (collectiontypesBuilder_ != null) {
        return collectiontypesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(collectiontypes_);
      }
    }
    /**
     * <code>repeated .proto.CollectionType collectiontypes = 1;</code>
     */
    public proto.CollectionType.Builder addCollectiontypesBuilder() {
      return getCollectiontypesFieldBuilder().addBuilder(
          proto.CollectionType.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.CollectionType collectiontypes = 1;</code>
     */
    public proto.CollectionType.Builder addCollectiontypesBuilder(
        int index) {
      return getCollectiontypesFieldBuilder().addBuilder(
          index, proto.CollectionType.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.CollectionType collectiontypes = 1;</code>
     */
    public java.util.List<proto.CollectionType.Builder> 
         getCollectiontypesBuilderList() {
      return getCollectiontypesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.CollectionType, proto.CollectionType.Builder, proto.CollectionTypeOrBuilder> 
        getCollectiontypesFieldBuilder() {
      if (collectiontypesBuilder_ == null) {
        collectiontypesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            proto.CollectionType, proto.CollectionType.Builder, proto.CollectionTypeOrBuilder>(
                collectiontypes_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        collectiontypes_ = null;
      }
      return collectiontypesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:proto.CollectionTypeResult)
  }

  // @@protoc_insertion_point(class_scope:proto.CollectionTypeResult)
  private static final proto.CollectionTypeResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.CollectionTypeResult();
  }

  public static proto.CollectionTypeResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CollectionTypeResult>
      PARSER = new com.google.protobuf.AbstractParser<CollectionTypeResult>() {
    @java.lang.Override
    public CollectionTypeResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<CollectionTypeResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CollectionTypeResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto.CollectionTypeResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

