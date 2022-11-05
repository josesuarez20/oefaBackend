/**
 * ModuloTraductor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pe.gob.oefa.ws.seguridad.bean;

public class ModuloTraductor  implements java.io.Serializable {
    private java.lang.Integer idModuloTraductor;

    private java.lang.Integer idLenguaje;

    private java.lang.Integer idModulo;

    private java.lang.String nombre;

    private java.lang.Boolean activo;

    private pe.gob.oefa.ws.seguridad.service.LenguajePerfil lenguajePerfil;

    public ModuloTraductor() {
    }

    public ModuloTraductor(
           java.lang.Integer idModuloTraductor,
           java.lang.Integer idLenguaje,
           java.lang.Integer idModulo,
           java.lang.String nombre,
           java.lang.Boolean activo,
           pe.gob.oefa.ws.seguridad.service.LenguajePerfil lenguajePerfil) {
           this.idModuloTraductor = idModuloTraductor;
           this.idLenguaje = idLenguaje;
           this.idModulo = idModulo;
           this.nombre = nombre;
           this.activo = activo;
           this.lenguajePerfil = lenguajePerfil;
    }


    /**
     * Gets the idModuloTraductor value for this ModuloTraductor.
     * 
     * @return idModuloTraductor
     */
    public java.lang.Integer getIdModuloTraductor() {
        return idModuloTraductor;
    }


    /**
     * Sets the idModuloTraductor value for this ModuloTraductor.
     * 
     * @param idModuloTraductor
     */
    public void setIdModuloTraductor(java.lang.Integer idModuloTraductor) {
        this.idModuloTraductor = idModuloTraductor;
    }


    /**
     * Gets the idLenguaje value for this ModuloTraductor.
     * 
     * @return idLenguaje
     */
    public java.lang.Integer getIdLenguaje() {
        return idLenguaje;
    }


    /**
     * Sets the idLenguaje value for this ModuloTraductor.
     * 
     * @param idLenguaje
     */
    public void setIdLenguaje(java.lang.Integer idLenguaje) {
        this.idLenguaje = idLenguaje;
    }


    /**
     * Gets the idModulo value for this ModuloTraductor.
     * 
     * @return idModulo
     */
    public java.lang.Integer getIdModulo() {
        return idModulo;
    }


    /**
     * Sets the idModulo value for this ModuloTraductor.
     * 
     * @param idModulo
     */
    public void setIdModulo(java.lang.Integer idModulo) {
        this.idModulo = idModulo;
    }


    /**
     * Gets the nombre value for this ModuloTraductor.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this ModuloTraductor.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the activo value for this ModuloTraductor.
     * 
     * @return activo
     */
    public java.lang.Boolean getActivo() {
        return activo;
    }


    /**
     * Sets the activo value for this ModuloTraductor.
     * 
     * @param activo
     */
    public void setActivo(java.lang.Boolean activo) {
        this.activo = activo;
    }


    /**
     * Gets the lenguaje value for this ModuloTraductor.
     * 
     * @return lenguaje
     */
    public pe.gob.oefa.ws.seguridad.service.LenguajePerfil getLenguaje() {
        return lenguajePerfil;
    }


    /**
     * Sets the lenguaje value for this ModuloTraductor.
     * 
     * @param lenguajePerfil
     */
    public void setLenguaje(pe.gob.oefa.ws.seguridad.service.LenguajePerfil lenguajePerfil) {
        this.lenguajePerfil = lenguajePerfil;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModuloTraductor)) return false;
        ModuloTraductor other = (ModuloTraductor) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idModuloTraductor==null && other.getIdModuloTraductor()==null) || 
             (this.idModuloTraductor!=null &&
              this.idModuloTraductor.equals(other.getIdModuloTraductor()))) &&
            ((this.idLenguaje==null && other.getIdLenguaje()==null) || 
             (this.idLenguaje!=null &&
              this.idLenguaje.equals(other.getIdLenguaje()))) &&
            ((this.idModulo==null && other.getIdModulo()==null) || 
             (this.idModulo!=null &&
              this.idModulo.equals(other.getIdModulo()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.activo==null && other.getActivo()==null) || 
             (this.activo!=null &&
              this.activo.equals(other.getActivo()))) &&
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
        if (getIdModuloTraductor() != null) {
            _hashCode += getIdModuloTraductor().hashCode();
        }
        if (getIdLenguaje() != null) {
            _hashCode += getIdLenguaje().hashCode();
        }
        if (getIdModulo() != null) {
            _hashCode += getIdModulo().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getActivo() != null) {
            _hashCode += getActivo().hashCode();
        }
        if (getLenguaje() != null) {
            _hashCode += getLenguaje().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ModuloTraductor.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "ModuloTraductor"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idModuloTraductor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "IdModuloTraductor"));
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
        elemField.setFieldName("idModulo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "IdModulo"));
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
        elemField.setFieldName("activo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Activo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
