package io.kubernetes.client.openapi.models;

import io.kubernetes.client.custom.IntOrString;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

 /**
  * Generated
  */
public class V1PodDisruptionBudgetSpecFluentImpl<A extends io.kubernetes.client.openapi.models.V1PodDisruptionBudgetSpecFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1PodDisruptionBudgetSpecFluent<A>{
  public V1PodDisruptionBudgetSpecFluentImpl() {
  }
  public V1PodDisruptionBudgetSpecFluentImpl(io.kubernetes.client.openapi.models.V1PodDisruptionBudgetSpec instance) {
    this.withMaxUnavailable(instance.getMaxUnavailable());

    this.withMinAvailable(instance.getMinAvailable());

    this.withSelector(instance.getSelector());

  }
  private io.kubernetes.client.custom.IntOrString maxUnavailable;
  private io.kubernetes.client.custom.IntOrString minAvailable;
  private io.kubernetes.client.openapi.models.V1LabelSelectorBuilder selector;
  public io.kubernetes.client.custom.IntOrString getMaxUnavailable() {
    return this.maxUnavailable;
  }
  public A withMaxUnavailable(io.kubernetes.client.custom.IntOrString maxUnavailable) {
    this.maxUnavailable=maxUnavailable; return (A) this;
  }
  public java.lang.Boolean hasMaxUnavailable() {
    return this.maxUnavailable != null;
  }
  public A withNewMaxUnavailable(int value) {
    return (A)withMaxUnavailable(new IntOrString(value));
  }
  public A withNewMaxUnavailable(java.lang.String value) {
    return (A)withMaxUnavailable(new IntOrString(value));
  }
  public io.kubernetes.client.custom.IntOrString getMinAvailable() {
    return this.minAvailable;
  }
  public A withMinAvailable(io.kubernetes.client.custom.IntOrString minAvailable) {
    this.minAvailable=minAvailable; return (A) this;
  }
  public java.lang.Boolean hasMinAvailable() {
    return this.minAvailable != null;
  }
  public A withNewMinAvailable(int value) {
    return (A)withMinAvailable(new IntOrString(value));
  }
  public A withNewMinAvailable(java.lang.String value) {
    return (A)withMinAvailable(new IntOrString(value));
  }
  
  /**
   * This method has been deprecated, please use method buildSelector instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1LabelSelector getSelector() {
    return this.selector!=null ?this.selector.build():null;
  }
  public io.kubernetes.client.openapi.models.V1LabelSelector buildSelector() {
    return this.selector!=null ?this.selector.build():null;
  }
  public A withSelector(io.kubernetes.client.openapi.models.V1LabelSelector selector) {
    _visitables.get("selector").remove(this.selector);
    if (selector!=null){ this.selector= new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(selector); _visitables.get("selector").add(this.selector);} return (A) this;
  }
  public java.lang.Boolean hasSelector() {
    return this.selector != null;
  }
  public io.kubernetes.client.openapi.models.V1PodDisruptionBudgetSpecFluent.SelectorNested<A> withNewSelector() {
    return new io.kubernetes.client.openapi.models.V1PodDisruptionBudgetSpecFluentImpl.SelectorNestedImpl();
  }
  public io.kubernetes.client.openapi.models.V1PodDisruptionBudgetSpecFluent.SelectorNested<A> withNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
    return new io.kubernetes.client.openapi.models.V1PodDisruptionBudgetSpecFluentImpl.SelectorNestedImpl(item);
  }
  public io.kubernetes.client.openapi.models.V1PodDisruptionBudgetSpecFluent.SelectorNested<A> editSelector() {
    return withNewSelectorLike(getSelector());
  }
  public io.kubernetes.client.openapi.models.V1PodDisruptionBudgetSpecFluent.SelectorNested<A> editOrNewSelector() {
    return withNewSelectorLike(getSelector() != null ? getSelector(): new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder().build());
  }
  public io.kubernetes.client.openapi.models.V1PodDisruptionBudgetSpecFluent.SelectorNested<A> editOrNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
    return withNewSelectorLike(getSelector() != null ? getSelector(): item);
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1PodDisruptionBudgetSpecFluentImpl that = (V1PodDisruptionBudgetSpecFluentImpl) o;
    if (maxUnavailable != null ? !maxUnavailable.equals(that.maxUnavailable) :that.maxUnavailable != null) return false;
    if (minAvailable != null ? !minAvailable.equals(that.minAvailable) :that.minAvailable != null) return false;
    if (selector != null ? !selector.equals(that.selector) :that.selector != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(maxUnavailable,  minAvailable,  selector,  super.hashCode());
  }
  public class SelectorNestedImpl<N> extends io.kubernetes.client.openapi.models.V1LabelSelectorFluentImpl<io.kubernetes.client.openapi.models.V1PodDisruptionBudgetSpecFluent.SelectorNested<N>> implements io.kubernetes.client.openapi.models.V1PodDisruptionBudgetSpecFluent.SelectorNested<N>,io.kubernetes.client.fluent.Nested<N>{
    SelectorNestedImpl(io.kubernetes.client.openapi.models.V1LabelSelector item) {
      this.builder = new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(this, item);
    }
    SelectorNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(this);
    }
    io.kubernetes.client.openapi.models.V1LabelSelectorBuilder builder;
    public N and() {
      return (N) V1PodDisruptionBudgetSpecFluentImpl.this.withSelector(builder.build());
    }
    public N endSelector() {
      return and();
    }
    
  }
  
}