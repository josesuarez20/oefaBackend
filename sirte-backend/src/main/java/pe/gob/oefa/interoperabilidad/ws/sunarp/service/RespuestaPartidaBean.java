/**
 * RespuestaPartidaBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pe.gob.oefa.interoperabilidad.ws.sunarp.service;

public class RespuestaPartidaBean  implements java.io.Serializable {
    private pe.gob.oefa.interoperabilidad.ws.sunarp.service.AsientosBean[] listAsientos;

    private pe.gob.oefa.interoperabilidad.ws.sunarp.service.FichaBean[] listFichas;

    private pe.gob.oefa.interoperabilidad.ws.sunarp.service.TomoFolioBean[] listFolios;

    private java.lang.String nroTotalPag;

    private long transaccion;

    public RespuestaPartidaBean() {
    }

    public RespuestaPartidaBean(
           pe.gob.oefa.interoperabilidad.ws.sunarp.service.AsientosBean[] listAsientos,
           pe.gob.oefa.interoperabilidad.ws.sunarp.service.FichaBean[] listFichas,
           pe.gob.oefa.interoperabilidad.ws.sunarp.service.TomoFolioBean[] listFolios,
           java.lang.String nroTotalPag,
           long transaccion) {
           this.listAsientos = listAsientos;
           this.listFichas = listFichas;
           this.listFolios = listFolios;
           this.nroTotalPag = nroTotalPag;
           this.transaccion = transaccion;
    }


    /**
     * Gets the listAsientos value for this RespuestaPartidaBean.
     * 
     * @return listAsientos
     */
    public pe.gob.oefa.interoperabilidad.ws.sunarp.service.AsientosBean[] getListAsientos() {
        return listAsientos;
    }


    /**
     * Sets the listAsientos value for this RespuestaPartidaBean.
     * 
     * @param listAsientos
     */
    public void setListAsientos(pe.gob.oefa.interoperabilidad.ws.sunarp.service.AsientosBean[] listAsientos) {
        this.listAsientos = listAsientos;
    }

    public pe.gob.oefa.interoperabilidad.ws.sunarp.service.AsientosBean getListAsientos(int i) {
        return this.listAsientos[i];
    }

    public void setListAsientos(int i, pe.gob.oefa.interoperabilidad.ws.sunarp.service.AsientosBean _value) {
        this.listAsientos[i] = _value;
    }


    /**
     * Gets the listFichas value for this RespuestaPartidaBean.
     * 
     * @return listFichas
     */
    public pe.gob.oefa.interoperabilidad.ws.sunarp.service.FichaBean[] getListFichas() {
        return listFichas;
    }


    /**
     * Sets the listFichas value for this RespuestaPartidaBean.
     * 
     * @param listFichas
     */
    public void setListFichas(pe.gob.oefa.interoperabilidad.ws.sunarp.service.FichaBean[] listFichas) {
        this.listFichas = listFichas;
    }

    public pe.gob.oefa.interoperabilidad.ws.sunarp.service.FichaBean getListFichas(int i) {
        return this.listFichas[i];
    }

    public void setListFichas(int i, pe.gob.oefa.interoperabilidad.ws.sunarp.service.FichaBean _value) {
        this.listFichas[i] = _value;
    }


    /**
     * Gets the listFolios value for this RespuestaPartidaBean.
     * 
     * @return listFolios
     */
    public pe.gob.oefa.interoperabilidad.ws.sunarp.service.TomoFolioBean[] getListFolios() {
        return listFolios;
    }


    /**
     * Sets the listFolios value for this RespuestaPartidaBean.
     * 
     * @param listFolios
     */
    public void setListFolios(pe.gob.oefa.interoperabilidad.ws.sunarp.service.TomoFolioBean[] listFolios) {
        this.listFolios = listFolios;
    }

    public pe.gob.oefa.interoperabilidad.ws.sunarp.service.TomoFolioBean getListFolios(int i) {
        return this.listFolios[i];
    }

    public void setListFolios(int i, pe.gob.oefa.interoperabilidad.ws.sunarp.service.TomoFolioBean _value) {
        this.listFolios[i] = _value;
    }


    /**
     * Gets the nroTotalPag value for this RespuestaPartidaBean.
     * 
     * @return nroTotalPag
     */
    public java.lang.String getNroTotalPag() {
        return nroTotalPag;
    }


    /**
     * Sets the nroTotalPag value for this RespuestaPartidaBean.
     * 
     * @param nroTotalPag
     */
    public void setNroTotalPag(java.lang.String nroTotalPag) {
        this.nroTotalPag = nroTotalPag;
    }


    /**
     * Gets the transaccion value for this RespuestaPartidaBean.
     * 
     * @return transaccion
     */
    public long getTransaccion() {
        return transaccion;
    }


    /**
     * Sets the transaccion value for this RespuestaPartidaBean.
     * 
     * @param transaccion
     */
    public void setTransaccion(long transaccion) {
        this.transaccion = transaccion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RespuestaPartidaBean)) return false;
        RespuestaPartidaBean other = (RespuestaPartidaBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.listAsientos==null && other.getListAsientos()==null) || 
             (this.listAsientos!=null &&
              java.util.Arrays.equals(this.listAsientos, other.getListAsientos()))) &&
            ((this.listFichas==null && other.getListFichas()==null) || 
             (this.listFichas!=null &&
              java.util.Arrays.equals(this.listFichas, other.getListFichas()))) &&
            ((this.listFolios==null && other.getListFolios()==null) || 
             (this.listFolios!=null &&
              java.util.Arrays.equals(this.listFolios, other.getListFolios()))) &&
            ((this.nroTotalPag==null && other.getNroTotalPag()==null) || 
             (this.nroTotalPag!=null &&
              this.nroTotalPag.equals(other.getNroTotalPag()))) &&
            this.transaccion == other.getTransaccion();
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
        if (getListAsientos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListAsientos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListAsientos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListFichas() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListFichas());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListFichas(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListFolios() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListFolios());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListFolios(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNroTotalPag() != null) {
            _hashCode += getNroTotalPag().hashCode();
        }
        _hashCode += new Long(getTransaccion()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RespuestaPartidaBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.sunarp.ws.interoperabilidad.oefa.gob.pe/", "respuestaPartidaBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listAsientos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listAsientos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.sunarp.ws.interoperabilidad.oefa.gob.pe/", "asientosBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listFichas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listFichas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.sunarp.ws.interoperabilidad.oefa.gob.pe/", "fichaBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listFolios");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listFolios"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.sunarp.ws.interoperabilidad.oefa.gob.pe/", "tomoFolioBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroTotalPag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nroTotalPag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transaccion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transaccion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
