/**
 * RpatBeanPJ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pe.gob.oefa.interoperabilidad.ws.pj.service;

public class RpatBeanPJ  implements java.io.Serializable {
    private java.lang.String xCodigoRespuesta;

    private java.lang.String xMensajeRespuestaM;

    public RpatBeanPJ() {
    }

    public RpatBeanPJ(
           java.lang.String xCodigoRespuesta,
           java.lang.String xMensajeRespuestaM) {
           this.xCodigoRespuesta = xCodigoRespuesta;
           this.xMensajeRespuestaM = xMensajeRespuestaM;
    }


    /**
     * Gets the xCodigoRespuesta value for this RpatBeanPJ.
     * 
     * @return xCodigoRespuesta
     */
    public java.lang.String getXCodigoRespuesta() {
        return xCodigoRespuesta;
    }


    /**
     * Sets the xCodigoRespuesta value for this RpatBeanPJ.
     * 
     * @param xCodigoRespuesta
     */
    public void setXCodigoRespuesta(java.lang.String xCodigoRespuesta) {
        this.xCodigoRespuesta = xCodigoRespuesta;
    }


    /**
     * Gets the xMensajeRespuestaM value for this RpatBeanPJ.
     * 
     * @return xMensajeRespuestaM
     */
    public java.lang.String getXMensajeRespuestaM() {
        return xMensajeRespuestaM;
    }


    /**
     * Sets the xMensajeRespuestaM value for this RpatBeanPJ.
     * 
     * @param xMensajeRespuestaM
     */
    public void setXMensajeRespuestaM(java.lang.String xMensajeRespuestaM) {
        this.xMensajeRespuestaM = xMensajeRespuestaM;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RpatBeanPJ)) return false;
        RpatBeanPJ other = (RpatBeanPJ) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.xCodigoRespuesta==null && other.getXCodigoRespuesta()==null) || 
             (this.xCodigoRespuesta!=null &&
              this.xCodigoRespuesta.equals(other.getXCodigoRespuesta()))) &&
            ((this.xMensajeRespuestaM==null && other.getXMensajeRespuestaM()==null) || 
             (this.xMensajeRespuestaM!=null &&
              this.xMensajeRespuestaM.equals(other.getXMensajeRespuestaM())));
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
        if (getXCodigoRespuesta() != null) {
            _hashCode += getXCodigoRespuesta().hashCode();
        }
        if (getXMensajeRespuestaM() != null) {
            _hashCode += getXMensajeRespuestaM().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RpatBeanPJ.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.pj.ws.interoperabilidad.oefa.gob.pe/", "rpatBeanPJ"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("XCodigoRespuesta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xCodigoRespuesta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("XMensajeRespuestaM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xMensajeRespuestaM"));
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
