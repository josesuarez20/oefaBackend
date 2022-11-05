/**
 * RespuestaBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pe.gob.oefa.interoperabilidad.ws.migraciones.service;

public class RespuestaBean  implements java.io.Serializable {
    private java.lang.String strCalidadMigratoria;

    private java.lang.String strNombres;

    private java.lang.String strNumRespuesta;

    private java.lang.String strPrimerApellido;

    private java.lang.String strSegundoApellido;

    public RespuestaBean() {
    }

    public RespuestaBean(
           java.lang.String strCalidadMigratoria,
           java.lang.String strNombres,
           java.lang.String strNumRespuesta,
           java.lang.String strPrimerApellido,
           java.lang.String strSegundoApellido) {
           this.strCalidadMigratoria = strCalidadMigratoria;
           this.strNombres = strNombres;
           this.strNumRespuesta = strNumRespuesta;
           this.strPrimerApellido = strPrimerApellido;
           this.strSegundoApellido = strSegundoApellido;
    }


    /**
     * Gets the strCalidadMigratoria value for this RespuestaBean.
     * 
     * @return strCalidadMigratoria
     */
    public java.lang.String getStrCalidadMigratoria() {
        return strCalidadMigratoria;
    }


    /**
     * Sets the strCalidadMigratoria value for this RespuestaBean.
     * 
     * @param strCalidadMigratoria
     */
    public void setStrCalidadMigratoria(java.lang.String strCalidadMigratoria) {
        this.strCalidadMigratoria = strCalidadMigratoria;
    }


    /**
     * Gets the strNombres value for this RespuestaBean.
     * 
     * @return strNombres
     */
    public java.lang.String getStrNombres() {
        return strNombres;
    }


    /**
     * Sets the strNombres value for this RespuestaBean.
     * 
     * @param strNombres
     */
    public void setStrNombres(java.lang.String strNombres) {
        this.strNombres = strNombres;
    }


    /**
     * Gets the strNumRespuesta value for this RespuestaBean.
     * 
     * @return strNumRespuesta
     */
    public java.lang.String getStrNumRespuesta() {
        return strNumRespuesta;
    }


    /**
     * Sets the strNumRespuesta value for this RespuestaBean.
     * 
     * @param strNumRespuesta
     */
    public void setStrNumRespuesta(java.lang.String strNumRespuesta) {
        this.strNumRespuesta = strNumRespuesta;
    }


    /**
     * Gets the strPrimerApellido value for this RespuestaBean.
     * 
     * @return strPrimerApellido
     */
    public java.lang.String getStrPrimerApellido() {
        return strPrimerApellido;
    }


    /**
     * Sets the strPrimerApellido value for this RespuestaBean.
     * 
     * @param strPrimerApellido
     */
    public void setStrPrimerApellido(java.lang.String strPrimerApellido) {
        this.strPrimerApellido = strPrimerApellido;
    }


    /**
     * Gets the strSegundoApellido value for this RespuestaBean.
     * 
     * @return strSegundoApellido
     */
    public java.lang.String getStrSegundoApellido() {
        return strSegundoApellido;
    }


    /**
     * Sets the strSegundoApellido value for this RespuestaBean.
     * 
     * @param strSegundoApellido
     */
    public void setStrSegundoApellido(java.lang.String strSegundoApellido) {
        this.strSegundoApellido = strSegundoApellido;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RespuestaBean)) return false;
        RespuestaBean other = (RespuestaBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.strCalidadMigratoria==null && other.getStrCalidadMigratoria()==null) || 
             (this.strCalidadMigratoria!=null &&
              this.strCalidadMigratoria.equals(other.getStrCalidadMigratoria()))) &&
            ((this.strNombres==null && other.getStrNombres()==null) || 
             (this.strNombres!=null &&
              this.strNombres.equals(other.getStrNombres()))) &&
            ((this.strNumRespuesta==null && other.getStrNumRespuesta()==null) || 
             (this.strNumRespuesta!=null &&
              this.strNumRespuesta.equals(other.getStrNumRespuesta()))) &&
            ((this.strPrimerApellido==null && other.getStrPrimerApellido()==null) || 
             (this.strPrimerApellido!=null &&
              this.strPrimerApellido.equals(other.getStrPrimerApellido()))) &&
            ((this.strSegundoApellido==null && other.getStrSegundoApellido()==null) || 
             (this.strSegundoApellido!=null &&
              this.strSegundoApellido.equals(other.getStrSegundoApellido())));
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
        if (getStrCalidadMigratoria() != null) {
            _hashCode += getStrCalidadMigratoria().hashCode();
        }
        if (getStrNombres() != null) {
            _hashCode += getStrNombres().hashCode();
        }
        if (getStrNumRespuesta() != null) {
            _hashCode += getStrNumRespuesta().hashCode();
        }
        if (getStrPrimerApellido() != null) {
            _hashCode += getStrPrimerApellido().hashCode();
        }
        if (getStrSegundoApellido() != null) {
            _hashCode += getStrSegundoApellido().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RespuestaBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.migraciones.ws.interoperabilidad.oefa.gob.pe/", "respuestaBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strCalidadMigratoria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "strCalidadMigratoria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strNombres");
        elemField.setXmlName(new javax.xml.namespace.QName("", "strNombres"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strNumRespuesta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "strNumRespuesta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strPrimerApellido");
        elemField.setXmlName(new javax.xml.namespace.QName("", "strPrimerApellido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strSegundoApellido");
        elemField.setXmlName(new javax.xml.namespace.QName("", "strSegundoApellido"));
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
