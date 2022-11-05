/**
 * Lenguaje.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pe.gob.oefa.ws.seguridad.service;

public class LenguajePerfil  implements java.io.Serializable {
    private java.lang.Integer idLenguaje;

    private java.lang.String nombre;

    private java.lang.String diminutivo;

    private java.lang.Boolean activo;

    public LenguajePerfil() {
    }

    public LenguajePerfil(
           java.lang.Integer idLenguaje,
           java.lang.String nombre,
           java.lang.String diminutivo,
           java.lang.Boolean activo) {
           this.idLenguaje = idLenguaje;
           this.nombre = nombre;
           this.diminutivo = diminutivo;
           this.activo = activo;
    }


    /**
     * Gets the idLenguaje value for this Lenguaje.
     * 
     * @return idLenguaje
     */
    public java.lang.Integer getIdLenguaje() {
        return idLenguaje;
    }


    /**
     * Sets the idLenguaje value for this Lenguaje.
     * 
     * @param idLenguaje
     */
    public void setIdLenguaje(java.lang.Integer idLenguaje) {
        this.idLenguaje = idLenguaje;
    }


    /**
     * Gets the nombre value for this Lenguaje.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this Lenguaje.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the diminutivo value for this Lenguaje.
     * 
     * @return diminutivo
     */
    public java.lang.String getDiminutivo() {
        return diminutivo;
    }


    /**
     * Sets the diminutivo value for this Lenguaje.
     * 
     * @param diminutivo
     */
    public void setDiminutivo(java.lang.String diminutivo) {
        this.diminutivo = diminutivo;
    }


    /**
     * Gets the activo value for this Lenguaje.
     * 
     * @return activo
     */
    public java.lang.Boolean getActivo() {
        return activo;
    }


    /**
     * Sets the activo value for this Lenguaje.
     * 
     * @param activo
     */
    public void setActivo(java.lang.Boolean activo) {
        this.activo = activo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LenguajePerfil)) return false;
        LenguajePerfil other = (LenguajePerfil) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idLenguaje==null && other.getIdLenguaje()==null) || 
             (this.idLenguaje!=null &&
              this.idLenguaje.equals(other.getIdLenguaje()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.diminutivo==null && other.getDiminutivo()==null) || 
             (this.diminutivo!=null &&
              this.diminutivo.equals(other.getDiminutivo()))) &&
            ((this.activo==null && other.getActivo()==null) || 
             (this.activo!=null &&
              this.activo.equals(other.getActivo())));
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
        if (getIdLenguaje() != null) {
            _hashCode += getIdLenguaje().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getDiminutivo() != null) {
            _hashCode += getDiminutivo().hashCode();
        }
        if (getActivo() != null) {
            _hashCode += getActivo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LenguajePerfil.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://Komatsu.SSCA.Seguridad.Model/2013/DCKomatsuSeguridad", "Lenguaje"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idLenguaje");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Komatsu.SSCA.Seguridad.Model/2013/DCKomatsuSeguridad", "IdLenguaje"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Komatsu.SSCA.Seguridad.Model/2013/DCKomatsuSeguridad", "Nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diminutivo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Komatsu.SSCA.Seguridad.Model/2013/DCKomatsuSeguridad", "Diminutivo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Komatsu.SSCA.Seguridad.Model/2013/DCKomatsuSeguridad", "Activo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
