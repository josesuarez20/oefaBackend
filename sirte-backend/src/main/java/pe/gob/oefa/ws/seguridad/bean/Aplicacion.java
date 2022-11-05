/**
 * Aplicacion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pe.gob.oefa.ws.seguridad.bean;

public class Aplicacion  implements java.io.Serializable {
    private java.lang.Integer idAplicacion;

    private java.lang.String nombre;

    private java.lang.String descripcion;

    private java.lang.String url;

    private pe.gob.oefa.ws.seguridad.bean.AplicacionTraductor[] listaAplicacionTraductor;

    private pe.gob.oefa.ws.seguridad.bean.Empresa empresa;

    private pe.gob.oefa.ws.seguridad.bean.Estado estado;

    private java.lang.Boolean check;

    private java.lang.String idsAplicacion;

    public Aplicacion() {
    }

    public Aplicacion(
           java.lang.Integer idAplicacion,
           java.lang.String nombre,
           java.lang.String descripcion,
           java.lang.String url,
           pe.gob.oefa.ws.seguridad.bean.AplicacionTraductor[] listaAplicacionTraductor,
           pe.gob.oefa.ws.seguridad.bean.Empresa empresa,
           pe.gob.oefa.ws.seguridad.bean.Estado estado,
           java.lang.Boolean check,
           java.lang.String idsAplicacion) {
           this.idAplicacion = idAplicacion;
           this.nombre = nombre;
           this.descripcion = descripcion;
           this.url = url;
           this.listaAplicacionTraductor = listaAplicacionTraductor;
           this.empresa = empresa;
           this.estado = estado;
           this.check = check;
           this.idsAplicacion = idsAplicacion;
    }


    /**
     * Gets the idAplicacion value for this Aplicacion.
     * 
     * @return idAplicacion
     */
    public java.lang.Integer getIdAplicacion() {
        return idAplicacion;
    }


    /**
     * Sets the idAplicacion value for this Aplicacion.
     * 
     * @param idAplicacion
     */
    public void setIdAplicacion(java.lang.Integer idAplicacion) {
        this.idAplicacion = idAplicacion;
    }


    /**
     * Gets the nombre value for this Aplicacion.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this Aplicacion.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the descripcion value for this Aplicacion.
     * 
     * @return descripcion
     */
    public java.lang.String getDescripcion() {
        return descripcion;
    }


    /**
     * Sets the descripcion value for this Aplicacion.
     * 
     * @param descripcion
     */
    public void setDescripcion(java.lang.String descripcion) {
        this.descripcion = descripcion;
    }


    /**
     * Gets the url value for this Aplicacion.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this Aplicacion.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the listaAplicacionTraductor value for this Aplicacion.
     * 
     * @return listaAplicacionTraductor
     */
    public pe.gob.oefa.ws.seguridad.bean.AplicacionTraductor[] getListaAplicacionTraductor() {
        return listaAplicacionTraductor;
    }


    /**
     * Sets the listaAplicacionTraductor value for this Aplicacion.
     * 
     * @param listaAplicacionTraductor
     */
    public void setListaAplicacionTraductor(pe.gob.oefa.ws.seguridad.bean.AplicacionTraductor[] listaAplicacionTraductor) {
        this.listaAplicacionTraductor = listaAplicacionTraductor;
    }


    /**
     * Gets the empresa value for this Aplicacion.
     * 
     * @return empresa
     */
    public pe.gob.oefa.ws.seguridad.bean.Empresa getEmpresa() {
        return empresa;
    }


    /**
     * Sets the empresa value for this Aplicacion.
     * 
     * @param empresa
     */
    public void setEmpresa(pe.gob.oefa.ws.seguridad.bean.Empresa empresa) {
        this.empresa = empresa;
    }


    /**
     * Gets the estado value for this Aplicacion.
     * 
     * @return estado
     */
    public pe.gob.oefa.ws.seguridad.bean.Estado getEstado() {
        return estado;
    }


    /**
     * Sets the estado value for this Aplicacion.
     * 
     * @param estado
     */
    public void setEstado(pe.gob.oefa.ws.seguridad.bean.Estado estado) {
        this.estado = estado;
    }


    /**
     * Gets the check value for this Aplicacion.
     * 
     * @return check
     */
    public java.lang.Boolean getCheck() {
        return check;
    }


    /**
     * Sets the check value for this Aplicacion.
     * 
     * @param check
     */
    public void setCheck(java.lang.Boolean check) {
        this.check = check;
    }


    /**
     * Gets the idsAplicacion value for this Aplicacion.
     * 
     * @return idsAplicacion
     */
    public java.lang.String getIdsAplicacion() {
        return idsAplicacion;
    }


    /**
     * Sets the idsAplicacion value for this Aplicacion.
     * 
     * @param idsAplicacion
     */
    public void setIdsAplicacion(java.lang.String idsAplicacion) {
        this.idsAplicacion = idsAplicacion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Aplicacion)) return false;
        Aplicacion other = (Aplicacion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idAplicacion==null && other.getIdAplicacion()==null) || 
             (this.idAplicacion!=null &&
              this.idAplicacion.equals(other.getIdAplicacion()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.descripcion==null && other.getDescripcion()==null) || 
             (this.descripcion!=null &&
              this.descripcion.equals(other.getDescripcion()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            ((this.listaAplicacionTraductor==null && other.getListaAplicacionTraductor()==null) || 
             (this.listaAplicacionTraductor!=null &&
              java.util.Arrays.equals(this.listaAplicacionTraductor, other.getListaAplicacionTraductor()))) &&
            ((this.empresa==null && other.getEmpresa()==null) || 
             (this.empresa!=null &&
              this.empresa.equals(other.getEmpresa()))) &&
            ((this.estado==null && other.getEstado()==null) || 
             (this.estado!=null &&
              this.estado.equals(other.getEstado()))) &&
            ((this.check==null && other.getCheck()==null) || 
             (this.check!=null &&
              this.check.equals(other.getCheck()))) &&
            ((this.idsAplicacion==null && other.getIdsAplicacion()==null) || 
             (this.idsAplicacion!=null &&
              this.idsAplicacion.equals(other.getIdsAplicacion())));
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
        if (getIdAplicacion() != null) {
            _hashCode += getIdAplicacion().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getDescripcion() != null) {
            _hashCode += getDescripcion().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (getListaAplicacionTraductor() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaAplicacionTraductor());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaAplicacionTraductor(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmpresa() != null) {
            _hashCode += getEmpresa().hashCode();
        }
        if (getEstado() != null) {
            _hashCode += getEstado().hashCode();
        }
        if (getCheck() != null) {
            _hashCode += getCheck().hashCode();
        }
        if (getIdsAplicacion() != null) {
            _hashCode += getIdsAplicacion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Aplicacion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Aplicacion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("descripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Descripcion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaAplicacionTraductor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "ListaAplicacionTraductor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "AplicacionTraductor"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "AplicacionTraductor"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empresa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Empresa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Empresa"));
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
        elemField.setFieldName("check");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Check"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idsAplicacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "IdsAplicacion"));
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
