/**
 * Modulo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pe.gob.oefa.ws.seguridad.bean;

public class Modulo  implements java.io.Serializable {
    private java.lang.Integer idModulo;

    private pe.gob.oefa.ws.seguridad.bean.Aplicacion aplicacion;

    private java.lang.String nombre;

    private java.lang.String descripcion;

    private pe.gob.oefa.ws.seguridad.bean.ModuloTraductor[] listaModuloTraductor;

    private pe.gob.oefa.ws.seguridad.bean.Estado estado;

    public Modulo() {
    }

    public Modulo(
           java.lang.Integer idModulo,
           pe.gob.oefa.ws.seguridad.bean.Aplicacion aplicacion,
           java.lang.String nombre,
           java.lang.String descripcion,
           pe.gob.oefa.ws.seguridad.bean.ModuloTraductor[] listaModuloTraductor,
           pe.gob.oefa.ws.seguridad.bean.Estado estado) {
           this.idModulo = idModulo;
           this.aplicacion = aplicacion;
           this.nombre = nombre;
           this.descripcion = descripcion;
           this.listaModuloTraductor = listaModuloTraductor;
           this.estado = estado;
    }


    /**
     * Gets the idModulo value for this Modulo.
     * 
     * @return idModulo
     */
    public java.lang.Integer getIdModulo() {
        return idModulo;
    }


    /**
     * Sets the idModulo value for this Modulo.
     * 
     * @param idModulo
     */
    public void setIdModulo(java.lang.Integer idModulo) {
        this.idModulo = idModulo;
    }


    /**
     * Gets the aplicacion value for this Modulo.
     * 
     * @return aplicacion
     */
    public pe.gob.oefa.ws.seguridad.bean.Aplicacion getAplicacion() {
        return aplicacion;
    }


    /**
     * Sets the aplicacion value for this Modulo.
     * 
     * @param aplicacion
     */
    public void setAplicacion(pe.gob.oefa.ws.seguridad.bean.Aplicacion aplicacion) {
        this.aplicacion = aplicacion;
    }


    /**
     * Gets the nombre value for this Modulo.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this Modulo.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the descripcion value for this Modulo.
     * 
     * @return descripcion
     */
    public java.lang.String getDescripcion() {
        return descripcion;
    }


    /**
     * Sets the descripcion value for this Modulo.
     * 
     * @param descripcion
     */
    public void setDescripcion(java.lang.String descripcion) {
        this.descripcion = descripcion;
    }


    /**
     * Gets the listaModuloTraductor value for this Modulo.
     * 
     * @return listaModuloTraductor
     */
    public pe.gob.oefa.ws.seguridad.bean.ModuloTraductor[] getListaModuloTraductor() {
        return listaModuloTraductor;
    }


    /**
     * Sets the listaModuloTraductor value for this Modulo.
     * 
     * @param listaModuloTraductor
     */
    public void setListaModuloTraductor(pe.gob.oefa.ws.seguridad.bean.ModuloTraductor[] listaModuloTraductor) {
        this.listaModuloTraductor = listaModuloTraductor;
    }


    /**
     * Gets the estado value for this Modulo.
     * 
     * @return estado
     */
    public pe.gob.oefa.ws.seguridad.bean.Estado getEstado() {
        return estado;
    }


    /**
     * Sets the estado value for this Modulo.
     * 
     * @param estado
     */
    public void setEstado(pe.gob.oefa.ws.seguridad.bean.Estado estado) {
        this.estado = estado;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Modulo)) return false;
        Modulo other = (Modulo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idModulo==null && other.getIdModulo()==null) || 
             (this.idModulo!=null &&
              this.idModulo.equals(other.getIdModulo()))) &&
            ((this.aplicacion==null && other.getAplicacion()==null) || 
             (this.aplicacion!=null &&
              this.aplicacion.equals(other.getAplicacion()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.descripcion==null && other.getDescripcion()==null) || 
             (this.descripcion!=null &&
              this.descripcion.equals(other.getDescripcion()))) &&
            ((this.listaModuloTraductor==null && other.getListaModuloTraductor()==null) || 
             (this.listaModuloTraductor!=null &&
              java.util.Arrays.equals(this.listaModuloTraductor, other.getListaModuloTraductor()))) &&
            ((this.estado==null && other.getEstado()==null) || 
             (this.estado!=null &&
              this.estado.equals(other.getEstado())));
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
        if (getIdModulo() != null) {
            _hashCode += getIdModulo().hashCode();
        }
        if (getAplicacion() != null) {
            _hashCode += getAplicacion().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getDescripcion() != null) {
            _hashCode += getDescripcion().hashCode();
        }
        if (getListaModuloTraductor() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaModuloTraductor());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaModuloTraductor(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEstado() != null) {
            _hashCode += getEstado().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Modulo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Modulo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idModulo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "IdModulo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Descripcion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaModuloTraductor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "ListaModuloTraductor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "ModuloTraductor"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "ModuloTraductor"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Estado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Estado"));
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
