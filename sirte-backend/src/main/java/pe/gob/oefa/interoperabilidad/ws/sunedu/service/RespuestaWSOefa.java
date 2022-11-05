/**
 * RespuestaWSOefa.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pe.gob.oefa.interoperabilidad.ws.sunedu.service;

public class RespuestaWSOefa  implements java.io.Serializable {
    private pe.gob.oefa.interoperabilidad.ws.sunedu.service.GtPersonaType[] respuestPersona;

    private pe.gob.oefa.interoperabilidad.ws.sunedu.service.RespuestaTypeHolder respuestaType;

    public RespuestaWSOefa() {
    }

    public RespuestaWSOefa(
           pe.gob.oefa.interoperabilidad.ws.sunedu.service.GtPersonaType[] respuestPersona,
           pe.gob.oefa.interoperabilidad.ws.sunedu.service.RespuestaTypeHolder respuestaType) {
           this.respuestPersona = respuestPersona;
           this.respuestaType = respuestaType;
    }


    /**
     * Gets the respuestPersona value for this RespuestaWSOefa.
     * 
     * @return respuestPersona
     */
    public pe.gob.oefa.interoperabilidad.ws.sunedu.service.GtPersonaType[] getRespuestPersona() {
        return respuestPersona;
    }


    /**
     * Sets the respuestPersona value for this RespuestaWSOefa.
     * 
     * @param respuestPersona
     */
    public void setRespuestPersona(pe.gob.oefa.interoperabilidad.ws.sunedu.service.GtPersonaType[] respuestPersona) {
        this.respuestPersona = respuestPersona;
    }


    /**
     * Gets the respuestaType value for this RespuestaWSOefa.
     * 
     * @return respuestaType
     */
    public pe.gob.oefa.interoperabilidad.ws.sunedu.service.RespuestaTypeHolder getRespuestaType() {
        return respuestaType;
    }


    /**
     * Sets the respuestaType value for this RespuestaWSOefa.
     * 
     * @param respuestaType
     */
    public void setRespuestaType(pe.gob.oefa.interoperabilidad.ws.sunedu.service.RespuestaTypeHolder respuestaType) {
        this.respuestaType = respuestaType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RespuestaWSOefa)) return false;
        RespuestaWSOefa other = (RespuestaWSOefa) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.respuestPersona==null && other.getRespuestPersona()==null) || 
             (this.respuestPersona!=null &&
              java.util.Arrays.equals(this.respuestPersona, other.getRespuestPersona()))) &&
            ((this.respuestaType==null && other.getRespuestaType()==null) || 
             (this.respuestaType!=null &&
              this.respuestaType.equals(other.getRespuestaType())));
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
        if (getRespuestPersona() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRespuestPersona());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRespuestPersona(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRespuestaType() != null) {
            _hashCode += getRespuestaType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RespuestaWSOefa.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.sunedu.ws.interoperabilidad.oefa.gob.pe/", "respuestaWSOefa"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("respuestPersona");
        elemField.setXmlName(new javax.xml.namespace.QName("", "respuestPersona"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.sunedu.ws.interoperabilidad.oefa.gob.pe/", "gtPersonaType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "value"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("respuestaType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "respuestaType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.sunedu.ws.interoperabilidad.oefa.gob.pe/", "respuestaTypeHolder"));
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
