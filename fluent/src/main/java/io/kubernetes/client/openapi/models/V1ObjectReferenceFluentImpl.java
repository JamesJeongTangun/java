package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public class V1ObjectReferenceFluentImpl<A extends io.kubernetes.client.openapi.models.V1ObjectReferenceFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1ObjectReferenceFluent<A>{
  public V1ObjectReferenceFluentImpl() {
  }
  public V1ObjectReferenceFluentImpl(io.kubernetes.client.openapi.models.V1ObjectReference instance) {
    this.withApiVersion(instance.getApiVersion());

    this.withFieldPath(instance.getFieldPath());

    this.withKind(instance.getKind());

    this.withName(instance.getName());

    this.withNamespace(instance.getNamespace());

    this.withResourceVersion(instance.getResourceVersion());

    this.withUid(instance.getUid());

  }
  private java.lang.String apiVersion;
  private java.lang.String fieldPath;
  private java.lang.String kind;
  private java.lang.String name;
  private java.lang.String namespace;
  private java.lang.String resourceVersion;
  private java.lang.String uid;
  public java.lang.String getApiVersion() {
    return this.apiVersion;
  }
  public A withApiVersion(java.lang.String apiVersion) {
    this.apiVersion=apiVersion; return (A) this;
  }
  public java.lang.Boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  
  /**
   * Method is deprecated. use withApiVersion instead.
   */
  @java.lang.Deprecated
  public A withNewApiVersion(java.lang.String arg0) {
    return (A)withApiVersion(new String(arg0));
  }
  public java.lang.String getFieldPath() {
    return this.fieldPath;
  }
  public A withFieldPath(java.lang.String fieldPath) {
    this.fieldPath=fieldPath; return (A) this;
  }
  public java.lang.Boolean hasFieldPath() {
    return this.fieldPath != null;
  }
  
  /**
   * Method is deprecated. use withFieldPath instead.
   */
  @java.lang.Deprecated
  public A withNewFieldPath(java.lang.String arg0) {
    return (A)withFieldPath(new String(arg0));
  }
  public java.lang.String getKind() {
    return this.kind;
  }
  public A withKind(java.lang.String kind) {
    this.kind=kind; return (A) this;
  }
  public java.lang.Boolean hasKind() {
    return this.kind != null;
  }
  
  /**
   * Method is deprecated. use withKind instead.
   */
  @java.lang.Deprecated
  public A withNewKind(java.lang.String arg0) {
    return (A)withKind(new String(arg0));
  }
  public java.lang.String getName() {
    return this.name;
  }
  public A withName(java.lang.String name) {
    this.name=name; return (A) this;
  }
  public java.lang.Boolean hasName() {
    return this.name != null;
  }
  
  /**
   * Method is deprecated. use withName instead.
   */
  @java.lang.Deprecated
  public A withNewName(java.lang.String arg0) {
    return (A)withName(new String(arg0));
  }
  public java.lang.String getNamespace() {
    return this.namespace;
  }
  public A withNamespace(java.lang.String namespace) {
    this.namespace=namespace; return (A) this;
  }
  public java.lang.Boolean hasNamespace() {
    return this.namespace != null;
  }
  
  /**
   * Method is deprecated. use withNamespace instead.
   */
  @java.lang.Deprecated
  public A withNewNamespace(java.lang.String arg0) {
    return (A)withNamespace(new String(arg0));
  }
  public java.lang.String getResourceVersion() {
    return this.resourceVersion;
  }
  public A withResourceVersion(java.lang.String resourceVersion) {
    this.resourceVersion=resourceVersion; return (A) this;
  }
  public java.lang.Boolean hasResourceVersion() {
    return this.resourceVersion != null;
  }
  
  /**
   * Method is deprecated. use withResourceVersion instead.
   */
  @java.lang.Deprecated
  public A withNewResourceVersion(java.lang.String arg0) {
    return (A)withResourceVersion(new String(arg0));
  }
  public java.lang.String getUid() {
    return this.uid;
  }
  public A withUid(java.lang.String uid) {
    this.uid=uid; return (A) this;
  }
  public java.lang.Boolean hasUid() {
    return this.uid != null;
  }
  
  /**
   * Method is deprecated. use withUid instead.
   */
  @java.lang.Deprecated
  public A withNewUid(java.lang.String arg0) {
    return (A)withUid(new String(arg0));
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ObjectReferenceFluentImpl that = (V1ObjectReferenceFluentImpl) o;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
    if (fieldPath != null ? !fieldPath.equals(that.fieldPath) :that.fieldPath != null) return false;
    if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
    if (name != null ? !name.equals(that.name) :that.name != null) return false;
    if (namespace != null ? !namespace.equals(that.namespace) :that.namespace != null) return false;
    if (resourceVersion != null ? !resourceVersion.equals(that.resourceVersion) :that.resourceVersion != null) return false;
    if (uid != null ? !uid.equals(that.uid) :that.uid != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(apiVersion,  fieldPath,  kind,  name,  namespace,  resourceVersion,  uid,  super.hashCode());
  }
  
}