package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1alpha1VolumeAttachmentSpecFluent<A extends io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSpecFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.String getAttacher();
  public A withAttacher(java.lang.String attacher);
  public java.lang.Boolean hasAttacher();
  
  /**
   * Method is deprecated. use withAttacher instead.
   */
  @java.lang.Deprecated
  public A withNewAttacher(java.lang.String arg0);
  public java.lang.String getNodeName();
  public A withNodeName(java.lang.String nodeName);
  public java.lang.Boolean hasNodeName();
  
  /**
   * Method is deprecated. use withNodeName instead.
   */
  @java.lang.Deprecated
  public A withNewNodeName(java.lang.String arg0);
  
  /**
   * This method has been deprecated, please use method buildSource instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSource getSource();
  public io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSource buildSource();
  public A withSource(io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSource source);
  public java.lang.Boolean hasSource();
  public io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSpecFluent.SourceNested<A> withNewSource();
  public io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSpecFluent.SourceNested<A> withNewSourceLike(io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSource item);
  public io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSpecFluent.SourceNested<A> editSource();
  public io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSpecFluent.SourceNested<A> editOrNewSource();
  public io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSpecFluent.SourceNested<A> editOrNewSourceLike(io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSource item);
  public interface SourceNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSourceFluent<io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSpecFluent.SourceNested<N>>{
    public N and();
    public N endSource();
    
  }
  
}