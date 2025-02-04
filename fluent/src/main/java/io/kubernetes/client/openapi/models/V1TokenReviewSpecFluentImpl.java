package io.kubernetes.client.openapi.models;

import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public class V1TokenReviewSpecFluentImpl<A extends io.kubernetes.client.openapi.models.V1TokenReviewSpecFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1TokenReviewSpecFluent<A>{
  public V1TokenReviewSpecFluentImpl() {
  }
  public V1TokenReviewSpecFluentImpl(io.kubernetes.client.openapi.models.V1TokenReviewSpec instance) {
    this.withAudiences(instance.getAudiences());

    this.withToken(instance.getToken());

  }
  private java.util.List<java.lang.String> audiences;
  private java.lang.String token;
  public A addToAudiences(java.lang.Integer index,java.lang.String item) {
    if (this.audiences == null) {this.audiences = new java.util.ArrayList<java.lang.String>();}
    this.audiences.add(index, item);
    return (A)this;
  }
  public A setToAudiences(java.lang.Integer index,java.lang.String item) {
    if (this.audiences == null) {this.audiences = new java.util.ArrayList<java.lang.String>();}
    this.audiences.set(index, item); return (A)this;
  }
  public A addToAudiences(java.lang.String... items) {
    if (this.audiences == null) {this.audiences = new java.util.ArrayList<java.lang.String>();}
    for (java.lang.String item : items) {this.audiences.add(item);} return (A)this;
  }
  public A addAllToAudiences(java.util.Collection<java.lang.String> items) {
    if (this.audiences == null) {this.audiences = new java.util.ArrayList<java.lang.String>();}
    for (java.lang.String item : items) {this.audiences.add(item);} return (A)this;
  }
  public A removeFromAudiences(java.lang.String... items) {
    for (java.lang.String item : items) {if (this.audiences!= null){ this.audiences.remove(item);}} return (A)this;
  }
  public A removeAllFromAudiences(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {if (this.audiences!= null){ this.audiences.remove(item);}} return (A)this;
  }
  public java.util.List<java.lang.String> getAudiences() {
    return this.audiences;
  }
  public java.lang.String getAudience(java.lang.Integer index) {
    return this.audiences.get(index);
  }
  public java.lang.String getFirstAudience() {
    return this.audiences.get(0);
  }
  public java.lang.String getLastAudience() {
    return this.audiences.get(audiences.size() - 1);
  }
  public java.lang.String getMatchingAudience(java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item: audiences) { if(predicate.test(item)){ return item;} } return null;
  }
  public java.lang.Boolean hasMatchingAudience(java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item: audiences) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withAudiences(java.util.List<java.lang.String> audiences) {
    if (audiences != null) {this.audiences = new java.util.ArrayList(); for (java.lang.String item : audiences){this.addToAudiences(item);}} else { this.audiences = null;} return (A) this;
  }
  public A withAudiences(java.lang.String... audiences) {
    if (this.audiences != null) {this.audiences.clear();}
    if (audiences != null) {for (java.lang.String item :audiences){ this.addToAudiences(item);}} return (A) this;
  }
  public java.lang.Boolean hasAudiences() {
    return audiences != null && !audiences.isEmpty();
  }
  public A addNewAudience(java.lang.String arg0) {
    return (A)addToAudiences(new String(arg0));
  }
  public java.lang.String getToken() {
    return this.token;
  }
  public A withToken(java.lang.String token) {
    this.token=token; return (A) this;
  }
  public java.lang.Boolean hasToken() {
    return this.token != null;
  }
  
  /**
   * Method is deprecated. use withToken instead.
   */
  @java.lang.Deprecated
  public A withNewToken(java.lang.String arg0) {
    return (A)withToken(new String(arg0));
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1TokenReviewSpecFluentImpl that = (V1TokenReviewSpecFluentImpl) o;
    if (audiences != null ? !audiences.equals(that.audiences) :that.audiences != null) return false;
    if (token != null ? !token.equals(that.token) :that.token != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(audiences,  token,  super.hashCode());
  }
  
}