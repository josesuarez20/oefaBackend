/**
 * UsuarioRol.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pe.gob.oefa.ws.seguridad.bean;

public class UsuarioRol  implements java.io.Serializable {
    private java.lang.Integer idUsuario;

    private java.lang.Integer idRol;

    private pe.gob.oefa.ws.seguridad.bean.Usuario usuario;

    private pe.gob.oefa.ws.seguridad.bean.Rol rol;

    public UsuarioRol() {
    }

    public UsuarioRol(
           java.lang.Integer idUsuario,
           java.lang.Integer idRol,
           pe.gob.oefa.ws.seguridad.bean.Usuario usuario,
           pe.gob.oefa.ws.seguridad.bean.Rol rol) {
           this.idUsuario = idUsuario;
           this.idRol = idRol;
           this.usuario = usuario;
           this.rol = rol;
    }


    /**
     * Gets the idUsuario value for this UsuarioRol.
     * 
     * @return idUsuario
     */
    public java.lang.Integer getIdUsuario() {
        return idUsuario;
    }


    /**
     * Sets the idUsuario value for this UsuarioRol.
     * 
     * @param idUsuario
     */
    public void setIdUsuario(java.lang.Integer idUsuario) {
        this.idUsuario = idUsuario;
    }


    /**
     * Gets the idRol value for this UsuarioRol.
     * 
     * @return idRol
     */
    public java.lang.Integer getIdRol() {
        return idRol;
    }


    /**
     * Sets the idRol value for this UsuarioRol.
     * 
     * @param idRol
     */
    public void setIdRol(java.lang.Integer idRol) {
        this.idRol = idRol;
    }


    /**
     * Gets the usuario value for this UsuarioRol.
     * 
     * @return usuario
     */
    public pe.gob.oefa.ws.seguridad.bean.Usuario getUsuario() {
        return usuario;
    }


    /**
     * Sets the usuario value for this UsuarioRol.
     * 
     * @param usuario
     */
    public void setUsuario(pe.gob.oefa.ws.seguridad.bean.Usuario usuario) {
        this.usuario = usuario;
    }


    /**
     * Gets the rol value for this UsuarioRol.
     * 
     * @return rol
     */
    public pe.gob.oefa.ws.seguridad.bean.Rol getRol() {
        return rol;
    }


    /**
     * Sets the rol value for this UsuarioRol.
     * 
     * @param rol
     */
    public void setRol(pe.gob.oefa.ws.seguridad.bean.Rol rol) {
        this.rol = rol;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UsuarioRol)) return false;
        UsuarioRol other = (UsuarioRol) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idUsuario==null && other.getIdUsuario()==null) || 
             (this.idUsuario!=null &&
              this.idUsuario.equals(other.getIdUsuario()))) &&
            ((this.idRol==null && other.getIdRol()==null) || 
             (this.idRol!=null &&
              this.idRol.equals(other.getIdRol()))) &&
            ((this.usuario==null && other.getUsuario()==null) || 
             (this.usuario!=null &&
              this.usuario.equals(other.getUsuario()))) &&
            ((this.rol==null && other.getRol()==null) || 
             (this.rol!=null &&
              this.rol.equals(other.getRol())));
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
        if (getIdUsuario() != null) {
            _hashCode += getIdUsuario().hashCode();
        }
        if (getIdRol() != null) {
            _hashCode += getIdRol().hashCode();
        }
        if (getUsuario() != null) {
            _hashCode += getUsuario().hashCode();
        }
        if (getRol() != null) {
            _hashCode += getRol().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UsuarioRol.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "UsuarioRol"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idUsuario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "IdUsuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idRol");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "IdRol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Usuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Usuario"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rol");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Rol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Rol"));
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
