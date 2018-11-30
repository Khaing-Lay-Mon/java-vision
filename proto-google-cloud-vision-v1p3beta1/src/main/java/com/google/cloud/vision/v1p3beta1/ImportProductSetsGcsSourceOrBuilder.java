// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1p3beta1/product_search_service.proto

package com.google.cloud.vision.v1p3beta1;

public interface ImportProductSetsGcsSourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p3beta1.ImportProductSetsGcsSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Google Cloud Storage URI of the input csv file.
   * The URI must start with gs://
   * The format of the input csv file should be one image per line.
   * In each line, there are 6 columns.
   * 1. image_uri
   * 2, image_id
   * 3. product_set_id
   * 4. product_id
   * 5, product_category
   * 6, product_display_name
   * 7, labels
   * 8. bounding_poly
   * Columns 1, 3, 4, and 5 are required, other columns are optional. A new
   * ProductSet/Product with the same id will be created on the fly
   * if the ProductSet/Product specified by product_set_id/product_id does not
   * exist.
   * The image_id field is optional but has to be unique if provided. If it is
   * empty, we will automatically assign an unique id to the image.
   * The product_display_name field is optional. If it is empty, a space (" ")
   * is used as the place holder for the product display_name, which can
   * be updated later through the realtime API.
   * If the Product with product_id already exists, the fields
   * product_display_name, product_category and labels are ignored.
   * If a Product doesn't exist and needs to be created on the fly, the
   * product_display_name field refers to [Product.display_name][google.cloud.vision.v1p3beta1.Product.display_name], the
   * product_category field refers to [Product.product_category][google.cloud.vision.v1p3beta1.Product.product_category], and the
   * labels field refers to [Product.labels][].
   * Labels (optional) should be a line containing a list of comma-separated
   * key-value pairs, with the format
   *     "key_1=value_1,key_2=value_2,...,key_n=value_n".
   * The bounding_poly (optional) field is used to identify one region of
   * interest from the image in the same manner as CreateReferenceImage. If no
   * bounding_poly is specified, the system will try to detect regions of
   * interest automatically.
   * Note that the pipeline will resize the image if the image resolution is too
   * large to process (above 20MP).
   * Also note that at most one bounding_poly is allowed per line. If the image
   * contains multiple regions of interest, the csv should contain one line per
   * region of interest.
   * The bounding_poly column should contain an even number of comma-separated
   * numbers, with the format "p1_x,p1_y,p2_x,p2_y,...,pn_x,pn_y". Nonnegative
   * integers should be used for absolute bounding polygons, and float values
   * in [0, 1] should be used for normalized bounding polygons.
   * </pre>
   *
   * <code>string csv_file_uri = 1;</code>
   */
  java.lang.String getCsvFileUri();
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage URI of the input csv file.
   * The URI must start with gs://
   * The format of the input csv file should be one image per line.
   * In each line, there are 6 columns.
   * 1. image_uri
   * 2, image_id
   * 3. product_set_id
   * 4. product_id
   * 5, product_category
   * 6, product_display_name
   * 7, labels
   * 8. bounding_poly
   * Columns 1, 3, 4, and 5 are required, other columns are optional. A new
   * ProductSet/Product with the same id will be created on the fly
   * if the ProductSet/Product specified by product_set_id/product_id does not
   * exist.
   * The image_id field is optional but has to be unique if provided. If it is
   * empty, we will automatically assign an unique id to the image.
   * The product_display_name field is optional. If it is empty, a space (" ")
   * is used as the place holder for the product display_name, which can
   * be updated later through the realtime API.
   * If the Product with product_id already exists, the fields
   * product_display_name, product_category and labels are ignored.
   * If a Product doesn't exist and needs to be created on the fly, the
   * product_display_name field refers to [Product.display_name][google.cloud.vision.v1p3beta1.Product.display_name], the
   * product_category field refers to [Product.product_category][google.cloud.vision.v1p3beta1.Product.product_category], and the
   * labels field refers to [Product.labels][].
   * Labels (optional) should be a line containing a list of comma-separated
   * key-value pairs, with the format
   *     "key_1=value_1,key_2=value_2,...,key_n=value_n".
   * The bounding_poly (optional) field is used to identify one region of
   * interest from the image in the same manner as CreateReferenceImage. If no
   * bounding_poly is specified, the system will try to detect regions of
   * interest automatically.
   * Note that the pipeline will resize the image if the image resolution is too
   * large to process (above 20MP).
   * Also note that at most one bounding_poly is allowed per line. If the image
   * contains multiple regions of interest, the csv should contain one line per
   * region of interest.
   * The bounding_poly column should contain an even number of comma-separated
   * numbers, with the format "p1_x,p1_y,p2_x,p2_y,...,pn_x,pn_y". Nonnegative
   * integers should be used for absolute bounding polygons, and float values
   * in [0, 1] should be used for normalized bounding polygons.
   * </pre>
   *
   * <code>string csv_file_uri = 1;</code>
   */
  com.google.protobuf.ByteString getCsvFileUriBytes();
}
