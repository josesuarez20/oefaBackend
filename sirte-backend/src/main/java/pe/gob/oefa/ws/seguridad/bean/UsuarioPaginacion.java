/**
 * UsuarioPaginacion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pe.gob.oefa.ws.seguridad.bean;

public class UsuarioPaginacion  implements java.io.Serializable {
    private pe.gob.oefa.ws.seguridad.bean.Paginacion paginacion;

    private pe.gob.oefa.ws.seguridad.bean.Usuario[] listaUsuario;

    public UsuarioPaginacion() {
    }

    public UsuarioPaginacion(
           pe.gob.oefa.ws.seguridad.bean.Paginacion paginacion,
           pe.gob.oefa.ws.seguridad.bean.Usuario[] listaUsuario) {
           this.paginacion = paginacion;
           this.listaUsuario = listaUsuario;
    }


    /**
     * Gets the paginacion value for this UsuarioPaginacion.
     * 
     * @return paginacion
     */
    public pe.gob.oefa.ws.seguridad.bean.Paginacion getPaginacion() {
        return paginacion;
    }


    /**
     * Sets the paginacion value for this UsuarioPaginacion.
     * 
     * @param paginacion
     */
    public void setPaginacion(pe.gob.oefa.ws.seguridad.bean.Paginacion paginacion) {
        this.paginacion = paginacion;
    }


    /**
     * Gets the listaUsuario value for this UsuarioPaginacion.
     * 
     * @return listaUsuario
     */
    public pe.gob.oefa.ws.seguridad.bean.Usuario[] getListaUsuario() {
        return listaUsuario;
    }


    /**
     * Sets the listaUsuario value for this UsuarioPaginacion.
     * 
     * @param listaUsuario
     */
    public void setListaUsuario(pe.gob.oefa.ws.seguridad.bean.Usuario[] listaUsuario) {
        this.listaUsuario = listaUsuario;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UsuarioPaginacion)) return false;
        UsuarioPaginacion other = (UsuarioPaginacion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.paginacion==null && other.getPaginacion()==null) || 
             (this.paginacion!=null &&
              this.paginacion.equals(other.getPaginacion()))) &&
            ((this.listaUsuario==null && other.getListaUsuario()==null) || 
             (this.listaUsuario!=null &&
              java.util.Arrays.equals(this.listaUsuario, other.getListaUsuario())));
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
        if (getPaginacion() != null) {
            _hashCode += getPaginacion().hashCode();
        }
        if (getListaUsuario() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaUsuario());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaUsuario(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UsuarioPaginacion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "UsuarioPaginacion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paginacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Paginacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Paginacion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaUsuario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "ListaUsuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Usuario"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Usuario"));
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
