/**
 * OficinaRegistralBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pe.gob.oefa.interoperabilidad.ws.sunarp.service;

public class OficinaRegistralBean  implements java.io.Serializable {
    private java.lang.String codOficina;

    private java.lang.String codZona;

    private java.lang.String descripcion;

    public OficinaRegistralBean() {
    }

    public OficinaRegistralBean(
           java.lang.String codOficina,
           java.lang.String codZona,
           java.lang.String descripcion) {
           this.codOficina = codOficina;
           this.codZona = codZona;
           this.descripcion = descripcion;
    }


    /**
     * Gets the codOficina value for this OficinaRegistralBean.
     * 
     * @return codOficina
     */
    public java.lang.String getCodOficina() {
        return codOficina;
    }


    /**
     * Sets the codOficina value for this OficinaRegistralBean.
     * 
     * @param codOficina
     */
    public void setCodOficina(java.lang.String codOficina) {
        this.codOficina = codOficina;
    }


    /**
     * Gets the codZona value for this OficinaRegistralBean.
     * 
     * @return codZona
     */
    public java.lang.String getCodZona() {
        return codZona;
    }


    /**
     * Sets the codZona value for this OficinaRegistralBean.
     * 
     * @param codZona
     */
    public void setCodZona(java.lang.String codZona) {
        this.codZona = codZona;
    }


    /**
     * Gets the descripcion value for this OficinaRegistralBean.
     * 
     * @return descripcion
     */
    public java.lang.String getDescripcion() {
        return descripcion;
    }


    /**
     * Sets the descripcion value for this OficinaRegistralBean.
     * 
     * @param descripcion
     */
    public void setDescripcion(java.lang.String descripcion) {
        this.descripcion = descripcion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OficinaRegistralBean)) return false;
        OficinaRegistralBean other = (OficinaRegistralBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codOficina==null && other.getCodOficina()==null) || 
             (this.codOficina!=null &&
              this.codOficina.equals(other.getCodOficina()))) &&
            ((this.codZona==null && other.getCodZona()==null) || 
             (this.codZona!=null &&
              this.codZona.equals(other.getCodZona()))) &&
            ((this.descripcion==null && other.getDescripcion()==null) || 
             (this.descripcion!=null &&
              this.descripcion.equals(other.getDescripcion())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCodOficina() != null) {
            _hashCode += getCodOficina().hashCode();
        }
        if (getCodZona() != null) {
            _hashCode += getCodZona().hashCode();
        }
        if (getDescripcion() != null) {
            _hashCode += getDescripcion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OficinaRegistralBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.sunarp.ws.interoperabilidad.oefa.gob.pe/", "oficinaRegistralBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codOficina");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codOficina"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codZona");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codZona"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descripcion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
