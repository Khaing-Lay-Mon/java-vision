// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1p4beta1/image_annotator.proto

package com.google.cloud.vision.v1p4beta1;

public interface LocalizedObjectAnnotationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p4beta1.LocalizedObjectAnnotation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Object ID that should align with EntityAnnotation mid.
   * </pre>
   *
   * <code>string mid = 1;</code>
   */
  java.lang.String getMid();
  /**
   *
   *
   * <pre>
   * Object ID that should align with EntityAnnotation mid.
   * </pre>
   *
   * <code>string mid = 1;</code>
   */
  com.google.protobuf.ByteString getMidBytes();

  /**
   *
   *
   * <pre>
   * The BCP-47 language code, such as "en-US" or "sr-Latn". For more
   * information, see
   * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
   * </pre>
   *
   * <code>string language_code = 2;</code>
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * The BCP-47 language code, such as "en-US" or "sr-Latn". For more
   * information, see
   * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
   * </pre>
   *
   * <code>string language_code = 2;</code>
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * Object name, expressed in its `language_code` language.
   * </pre>
   *
   * <code>string name = 3;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Object name, expressed in its `language_code` language.
   * </pre>
   *
   * <code>string name = 3;</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Score of the result. Range [0, 1].
   * </pre>
   *
   * <code>float score = 4;</code>
   */
  float getScore();

  /**
   *
   *
   * <pre>
   * Image region to which this object belongs. This must be populated.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p4beta1.BoundingPoly bounding_poly = 5;</code>
   */
  boolean hasBoundingPoly();
  /**
   *
   *
   * <pre>
   * Image region to which this object belongs. This must be populated.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p4beta1.BoundingPoly bounding_poly = 5;</code>
   */
  com.google.cloud.vision.v1p4beta1.BoundingPoly getBoundingPoly();
  /**
   *
   *
   * <pre>
   * Image region to which this object belongs. This must be populated.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p4beta1.BoundingPoly bounding_poly = 5;</code>
   */
  com.google.cloud.vision.v1p4beta1.BoundingPolyOrBuilder getBoundingPolyOrBuilder();
}