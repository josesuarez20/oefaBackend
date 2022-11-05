/**
 * Paginacion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pe.gob.oefa.ws.seguridad.bean;

public class Paginacion  implements java.io.Serializable {
    private java.lang.Integer page;

    private java.lang.Integer rowsPerPage;

    private java.lang.Integer rowCount;

    private java.lang.String sortType;

    private java.lang.String sortDir;

    private java.lang.String footerDesc;

    public Paginacion() {
    }

    public Paginacion(
           java.lang.Integer page,
           java.lang.Integer rowsPerPage,
           java.lang.Integer rowCount,
           java.lang.String sortType,
           java.lang.String sortDir,
           java.lang.String footerDesc) {
           this.page = page;
           this.rowsPerPage = rowsPerPage;
           this.rowCount = rowCount;
           this.sortType = sortType;
           this.sortDir = sortDir;
           this.footerDesc = footerDesc;
    }


    /**
     * Gets the page value for this Paginacion.
     * 
     * @return page
     */
    public java.lang.Integer getPage() {
        return page;
    }


    /**
     * Sets the page value for this Paginacion.
     * 
     * @param page
     */
    public void setPage(java.lang.Integer page) {
        this.page = page;
    }


    /**
     * Gets the rowsPerPage value for this Paginacion.
     * 
     * @return rowsPerPage
     */
    public java.lang.Integer getRowsPerPage() {
        return rowsPerPage;
    }


    /**
     * Sets the rowsPerPage value for this Paginacion.
     * 
     * @param rowsPerPage
     */
    public void setRowsPerPage(java.lang.Integer rowsPerPage) {
        this.rowsPerPage = rowsPerPage;
    }


    /**
     * Gets the rowCount value for this Paginacion.
     * 
     * @return rowCount
     */
    public java.lang.Integer getRowCount() {
        return rowCount;
    }


    /**
     * Sets the rowCount value for this Paginacion.
     * 
     * @param rowCount
     */
    public void setRowCount(java.lang.Integer rowCount) {
        this.rowCount = rowCount;
    }


    /**
     * Gets the sortType value for this Paginacion.
     * 
     * @return sortType
     */
    public java.lang.String getSortType() {
        return sortType;
    }


    /**
     * Sets the sortType value for this Paginacion.
     * 
     * @param sortType
     */
    public void setSortType(java.lang.String sortType) {
        this.sortType = sortType;
    }


    /**
     * Gets the sortDir value for this Paginacion.
     * 
     * @return sortDir
     */
    public java.lang.String getSortDir() {
        return sortDir;
    }


    /**
     * Sets the sortDir value for this Paginacion.
     * 
     * @param sortDir
     */
    public void setSortDir(java.lang.String sortDir) {
        this.sortDir = sortDir;
    }


    /**
     * Gets the footerDesc value for this Paginacion.
     * 
     * @return footerDesc
     */
    public java.lang.String getFooterDesc() {
        return footerDesc;
    }


    /**
     * Sets the footerDesc value for this Paginacion.
     * 
     * @param footerDesc
     */
    public void setFooterDesc(java.lang.String footerDesc) {
        this.footerDesc = footerDesc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Paginacion)) return false;
        Paginacion other = (Paginacion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.page==null && other.getPage()==null) || 
             (this.page!=null &&
              this.page.equals(other.getPage()))) &&
            ((this.rowsPerPage==null && other.getRowsPerPage()==null) || 
             (this.rowsPerPage!=null &&
              this.rowsPerPage.equals(other.getRowsPerPage()))) &&
            ((this.rowCount==null && other.getRowCount()==null) || 
             (this.rowCount!=null &&
              this.rowCount.equals(other.getRowCount()))) &&
            ((this.sortType==null && other.getSortType()==null) || 
             (this.sortType!=null &&
              this.sortType.equals(other.getSortType()))) &&
            ((this.sortDir==null && other.getSortDir()==null) || 
             (this.sortDir!=null &&
              this.sortDir.equals(other.getSortDir()))) &&
            ((this.footerDesc==null && other.getFooterDesc()==null) || 
             (this.footerDesc!=null &&
              this.footerDesc.equals(other.getFooterDesc())));
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
        if (getPage() != null) {
            _hashCode += getPage().hashCode();
        }
        if (getRowsPerPage() != null) {
            _hashCode += getRowsPerPage().hashCode();
        }
        if (getRowCount() != null) {
            _hashCode += getRowCount().hashCode();
        }
        if (getSortType() != null) {
            _hashCode += getSortType().hashCode();
        }
        if (getSortDir() != null) {
            _hashCode += getSortDir().hashCode();
        }
        if (getFooterDesc() != null) {
            _hashCode += getFooterDesc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Paginacion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Paginacion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("page");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Page"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowsPerPage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "RowsPerPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "RowCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "SortType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortDir");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "SortDir"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("footerDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "FooterDesc"));
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
