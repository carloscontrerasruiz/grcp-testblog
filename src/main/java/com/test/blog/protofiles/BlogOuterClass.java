// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blog/blog.proto

package com.test.blog.protofiles;

public final class BlogOuterClass {
  private BlogOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_blog_Blog_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_blog_Blog_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_blog_CreateBlogRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_blog_CreateBlogRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_blog_CreateBlogResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_blog_CreateBlogResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017blog/blog.proto\022\004blog\"D\n\004Blog\022\n\n\002id\030\001 " +
      "\001(\t\022\020\n\010authorId\030\002 \001(\t\022\r\n\005title\030\003 \001(\t\022\017\n\007" +
      "content\030\004 \001(\t\"-\n\021CreateBlogRequest\022\030\n\004bl" +
      "og\030\001 \001(\0132\n.blog.Blog\".\n\022CreateBlogRespon" +
      "se\022\030\n\004blog\030\001 \001(\0132\n.blog.Blog2P\n\013BlogServ" +
      "ice\022A\n\nCreateBlog\022\027.blog.CreateBlogReque" +
      "st\032\030.blog.CreateBlogResponse\"\000B\034\n\030com.te" +
      "st.blog.protofilesP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_blog_Blog_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_blog_Blog_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_blog_Blog_descriptor,
        new java.lang.String[] { "Id", "AuthorId", "Title", "Content", });
    internal_static_blog_CreateBlogRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_blog_CreateBlogRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_blog_CreateBlogRequest_descriptor,
        new java.lang.String[] { "Blog", });
    internal_static_blog_CreateBlogResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_blog_CreateBlogResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_blog_CreateBlogResponse_descriptor,
        new java.lang.String[] { "Blog", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
