/**
 * Rol.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pe.gob.oefa.ws.seguridad.bean;

public class Rol  implements java.io.Serializable {
    private java.lang.Integer idRol;

    private java.lang.Boolean siSuperAdmi;

    private java.lang.String nombre;

    private pe.gob.oefa.ws.seguridad.bean.Estado estado;

    private java.lang.Boolean siRango;

    private java.util.Calendar fechaInicio;

    private java.util.Calendar fechaFin;

    private pe.gob.oefa.ws.seguridad.bean.Aplicacion aplicacion;

    private pe.gob.oefa.ws.seguridad.bean.Usuario usuario;

    private java.lang.String sigla;

    public Rol() {
    }

    public Rol(
           java.lang.Integer idRol,
           java.lang.Boolean siSuperAdmi,
           java.lang.String nombre,
           pe.gob.oefa.ws.seguridad.bean.Estado estado,
           java.lang.Boolean siRango,
           java.util.Calendar fechaInicio,
           java.util.Calendar fechaFin,
           pe.gob.oefa.ws.seguridad.bean.Aplicacion aplicacion,
           pe.gob.oefa.ws.seguridad.bean.Usuario usuario,
           java.lang.String sigla) {
           this.idRol = idRol;
           this.siSuperAdmi = siSuperAdmi;
           this.nombre = nombre;
           this.estado = estado;
           this.siRango = siRango;
           this.fechaInicio = fechaInicio;
           this.fechaFin = fechaFin;
           this.aplicacion = aplicacion;
           this.usuario = usuario;
           this.sigla = sigla;
    }


    /**
     * Gets the idRol value for this Rol.
     * 
     * @return idRol
     */
    public java.lang.Integer getIdRol() {
        return idRol;
    }


    /**
     * Sets the idRol value for this Rol.
     * 
     * @param idRol
     */
    public void setIdRol(java.lang.Integer idRol) {
        this.idRol = idRol;
    }


    /**
     * Gets the siSuperAdmi value for this Rol.
     * 
     * @return siSuperAdmi
     */
    public java.lang.Boolean getSiSuperAdmi() {
        return siSuperAdmi;
    }


    /**
     * Sets the siSuperAdmi value for this Rol.
     * 
     * @param siSuperAdmi
     */
    public void setSiSuperAdmi(java.lang.Boolean siSuperAdmi) {
        this.siSuperAdmi = siSuperAdmi;
    }


    /**
     * Gets the nombre value for this Rol.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this Rol.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the estado value for this Rol.
     * 
     * @return estado
     */
    public pe.gob.oefa.ws.seguridad.bean.Estado getEstado() {
        return estado;
    }


    /**
     * Sets the estado value for this Rol.
     * 
     * @param estado
     */
    public void setEstado(pe.gob.oefa.ws.seguridad.bean.Estado estado) {
        this.estado = estado;
    }


    /**
     * Gets the siRango value for this Rol.
     * 
     * @return siRango
     */
    public java.lang.Boolean getSiRango() {
        return siRango;
    }


    /**
     * Sets the siRango value for this Rol.
     * 
     * @param siRango
     */
    public void setSiRango(java.lang.Boolean siRango) {
        this.siRango = siRango;
    }


    /**
     * Gets the fechaInicio value for this Rol.
     * 
     * @return fechaInicio
     */
    public java.util.Calendar getFechaInicio() {
        return fechaInicio;
    }


    /**
     * Sets the fechaInicio value for this Rol.
     * 
     * @param fechaInicio
     */
    public void setFechaInicio(java.util.Calendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }


    /**
     * Gets the fechaFin value for this Rol.
     * 
     * @return fechaFin
     */
    public java.util.Calendar getFechaFin() {
        return fechaFin;
    }


    /**
     * Sets the fechaFin value for this Rol.
     * 
     * @param fechaFin
     */
    public void setFechaFin(java.util.Calendar fechaFin) {
        this.fechaFin = fechaFin;
    }


    /**
     * Gets the aplicacion value for this Rol.
     * 
     * @return aplicacion
     */
    public pe.gob.oefa.ws.seguridad.bean.Aplicacion getAplicacion() {
        return aplicacion;
    }


    /**
     * Sets the aplicacion value for this Rol.
     * 
     * @param aplicacion
     */
    public void setAplicacion(pe.gob.oefa.ws.seguridad.bean.Aplicacion aplicacion) {
        this.aplicacion = aplicacion;
    }


    /**
     * Gets the usuario value for this Rol.
     * 
     * @return usuario
     */
    public pe.gob.oefa.ws.seguridad.bean.Usuario getUsuario() {
        return usuario;
    }


    /**
     * Sets the usuario value for this Rol.
     * 
     * @param usuario
     */
    public void setUsuario(pe.gob.oefa.ws.seguridad.bean.Usuario usuario) {
        this.usuario = usuario;
    }


    /**
     * Gets the sigla value for this Rol.
     * 
     * @return sigla
     */
    public java.lang.String getSigla() {
        return sigla;
    }


    /**
     * Sets the sigla value for this Rol.
     * 
     * @param sigla
     */
    public void setSigla(java.lang.String sigla) {
        this.sigla = sigla;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Rol)) return false;
        Rol other = (Rol) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idRol==null && other.getIdRol()==null) || 
             (this.idRol!=null &&
              this.idRol.equals(other.getIdRol()))) &&
            ((this.siSuperAdmi==null && other.getSiSuperAdmi()==null) || 
             (this.siSuperAdmi!=null &&
              this.siSuperAdmi.equals(other.getSiSuperAdmi()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.estado==null && other.getEstado()==null) || 
             (this.estado!=null &&
              this.estado.equals(other.getEstado()))) &&
            ((this.siRango==null && other.getSiRango()==null) || 
             (this.siRango!=null &&
              this.siRango.equals(other.getSiRango()))) &&
            ((this.fechaInicio==null && other.getFechaInicio()==null) || 
             (this.fechaInicio!=null &&
              this.fechaInicio.equals(other.getFechaInicio()))) &&
            ((this.fechaFin==null && other.getFechaFin()==null) || 
             (this.fechaFin!=null &&
              this.fechaFin.equals(other.getFechaFin()))) &&
            ((this.aplicacion==null && other.getAplicacion()==null) || 
             (this.aplicacion!=null &&
              this.aplicacion.equals(other.getAplicacion()))) &&
            ((this.usuario==null && other.getUsuario()==null) || 
             (this.usuario!=null &&
              this.usuario.equals(other.getUsuario()))) &&
            ((this.sigla==null && other.getSigla()==null) || 
             (this.sigla!=null &&
              this.sigla.equals(other.getSigla())));
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
        if (getIdRol() != null) {
            _hashCode += getIdRol().hashCode();
        }
        if (getSiSuperAdmi() != null) {
            _hashCode += getSiSuperAdmi().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getEstado() != null) {
            _hashCode += getEstado().hashCode();
        }
        if (getSiRango() != null) {
            _hashCode += getSiRango().hashCode();
        }
        if (getFechaInicio() != null) {
            _hashCode += getFechaInicio().hashCode();
        }
        if (getFechaFin() != null) {
            _hashCode += getFechaFin().hashCode();
        }
        if (getAplicacion() != null) {
            _hashCode += getAplicacion().hashCode();
        }
        if (getUsuario() != null) {
            _hashCode += getUsuario().hashCode();
        }
        if (getSigla() != null) {
            _hashCode += getSigla().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Rol.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Rol"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idRol");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "IdRol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siSuperAdmi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "SiSuperAdmi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("estado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Estado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Estado"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siRango");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "SiRango"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaInicio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "FechaInicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaFin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "FechaFin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aplicacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Aplicacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Aplicacion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Usuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Usuario"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sigla");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Sigla"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
