/**
 * AplicacionTraductor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pe.gob.oefa.ws.seguridad.bean;

public class AplicacionTraductor  implements java.io.Serializable {
    private java.lang.Integer idAplicacionTraductor;

    private java.lang.Integer idLenguaje;

    private java.lang.Integer idAplicacion;

    private java.lang.String nombre;

    private pe.gob.oefa.ws.seguridad.service.LenguajePerfil lenguajePerfil;

    public AplicacionTraductor() {
    }

    public AplicacionTraductor(
           java.lang.Integer idAplicacionTraductor,
           java.lang.Integer idLenguaje,
           java.lang.Integer idAplicacion,
           java.lang.String nombre,
           pe.gob.oefa.ws.seguridad.service.LenguajePerfil lenguajePerfil) {
           this.idAplicacionTraductor = idAplicacionTraductor;
           this.idLenguaje = idLenguaje;
           this.idAplicacion = idAplicacion;
           this.nombre = nombre;
           this.lenguajePerfil = lenguajePerfil;
    }


    /**
     * Gets the idAplicacionTraductor value for this AplicacionTraductor.
     * 
     * @return idAplicacionTraductor
     */
    public java.lang.Integer getIdAplicacionTraductor() {
        return idAplicacionTraductor;
    }


    /**
     * Sets the idAplicacionTraductor value for this AplicacionTraductor.
     * 
     * @param idAplicacionTraductor
     */
    public void setIdAplicacionTraductor(java.lang.Integer idAplicacionTraductor) {
        this.idAplicacionTraductor = idAplicacionTraductor;
    }


    /**
     * Gets the idLenguaje value for this AplicacionTraductor.
     * 
     * @return idLenguaje
     */
    public java.lang.Integer getIdLenguaje() {
        return idLenguaje;
    }


    /**
     * Sets the idLenguaje value for this AplicacionTraductor.
     * 
     * @param idLenguaje
     */
    public void setIdLenguaje(java.lang.Integer idLenguaje) {
        this.idLenguaje = idLenguaje;
    }


    /**
     * Gets the idAplicacion value for this AplicacionTraductor.
     * 
     * @return idAplicacion
     */
    public java.lang.Integer getIdAplicacion() {
        return idAplicacion;
    }


    /**
     * Sets the idAplicacion value for this AplicacionTraductor.
     * 
     * @param idAplicacion
     */
    public void setIdAplicacion(java.lang.Integer idAplicacion) {
        this.idAplicacion = idAplicacion;
    }


    /**
     * Gets the nombre value for this AplicacionTraductor.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this AplicacionTraductor.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the lenguaje value for this AplicacionTraductor.
     * 
     * @return lenguaje
     */
    public pe.gob.oefa.ws.seguridad.service.LenguajePerfil getLenguaje() {
        return lenguajePerfil;
    }


    /**
     * Sets the lenguaje value for this AplicacionTraductor.
     * 
     * @param lenguajePerfil
     */
    public void setLenguaje(pe.gob.oefa.ws.seguridad.service.LenguajePerfil lenguajePerfil) {
        this.lenguajePerfil = lenguajePerfil;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AplicacionTraductor)) return false;
        AplicacionTraductor other = (AplicacionTraductor) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idAplicacionTraductor==null && other.getIdAplicacionTraductor()==null) || 
             (this.idAplicacionTraductor!=null &&
              this.idAplicacionTraductor.equals(other.getIdAplicacionTraductor()))) &&
            ((this.idLenguaje==null && other.getIdLenguaje()==null) || 
             (this.idLenguaje!=null &&
              this.idLenguaje.equals(other.getIdLenguaje()))) &&
            ((this.idAplicacion==null && other.getIdAplicacion()==null) || 
             (this.idAplicacion!=null &&
              this.idAplicacion.equals(other.getIdAplicacion()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.lenguajePerfil==null && other.getLenguaje()==null) || 
             (this.lenguajePerfil!=null &&
              this.lenguajePerfil.equals(other.getLenguaje())));
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
        if (getIdAplicacionTraductor() != null) {
            _hashCode += getIdAplicacionTraductor().hashCode();
        }
        if (getIdLenguaje() != null) {
            _hashCode += getIdLenguaje().hashCode();
        }
        if (getIdAplicacion() != null) {
            _hashCode += getIdAplicacion().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getLenguaje() != null) {
            _hashCode += getLenguaje().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AplicacionTraductor.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "AplicacionTraductor"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idAplicacionTraductor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "IdAplicacionTraductor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idLenguaje");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "IdLenguaje"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idAplicacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "IdAplicacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lenguaje");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Lenguaje"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://Komatsu.SSCA.Seguridad.Model/2013/DCKomatsuSeguridad", "Lenguaje"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
