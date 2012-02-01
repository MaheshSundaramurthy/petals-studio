package com.ebmwebsourcing.petals.services.sql.generated;

import com.sun.java.xml.ns.jbi.AbstractEndpoint;

/****************************************************************************
 * 
 * Copyright (c) 2009-2012, EBM WebSourcing
 * 
 * This source code is available under agreement available at
 * http://www.petalslink.com/legal/licenses/petals-studio
 * 
 * You should have received a copy of the agreement along with this program.
 * If not, write to EBM WebSourcing (4, rue Amelie - 31200 Toulouse, France).
 * 
 *****************************************************************************/

/**
  * This class was generated by EMF JET. 
  * <b>DO NOT MODIFY IT!</b>
  * @author Adrien LOUIS - EBM WebSourcing 
  */
public class SqlService12 {

  protected static String nl;
  public static synchronized SqlService12 create(String lineSeparator)
  {
    nl = lineSeparator;
    SqlService12 result = new SqlService12();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>" + NL + "<wsdl:definitions " + NL + "\txmlns:tns=\"http://petals.ow2.org/components/sql/version-1\"" + NL + "\txmlns:wsdl=\"http://schemas.xmlsoap.org/wsdl/\" " + NL + "\txmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"" + NL + "\tname=\"SQLInterface\" " + NL + "\txmlns:soap=\"http://schemas.xmlsoap.org/wsdl/soap/\"" + NL + "\ttargetNamespace=\"http://petals.ow2.org/components/sql/version-1\">" + NL + "" + NL + "\t<wsdl:types>" + NL + "\t\t<xsd:schema targetNamespace=\"http://petals.ow2.org/components/sql/version-1\">" + NL + "\t\t" + NL + "\t\t\t<xsd:element name=\"sql\" type =\"xsd:string\" />" + NL + "\t\t" + NL + "\t\t\t<xsd:element name=\"result\">" + NL + "\t\t\t\t<xsd:complexType>" + NL + "\t\t\t\t\t<xsd:sequence>" + NL + "\t\t\t\t\t\t<xsd:element name=\"row\" type=\"tns:rowType\" maxOccurs=\"unbounded\"" + NL + "\t\t\t\t\t\t\tminOccurs=\"0\" />" + NL + "\t\t\t\t\t</xsd:sequence>" + NL + "\t\t\t\t</xsd:complexType>" + NL + "\t\t\t</xsd:element>" + NL + "\t\t\t<xsd:complexType name=\"rowType\">" + NL + "\t\t\t\t<xsd:sequence>" + NL + "\t\t\t\t\t<xsd:element name=\"column\" type=\"tns:columnType\"" + NL + "\t\t\t\t\t\tmaxOccurs=\"unbounded\" minOccurs=\"0\">" + NL + "\t\t\t\t\t</xsd:element>" + NL + "\t\t\t\t</xsd:sequence>" + NL + "\t\t\t\t<xsd:attribute name=\"index\" type=\"xsd:int\" use=\"optional\"></xsd:attribute>" + NL + "\t\t\t</xsd:complexType>" + NL + "\t\t\t<xsd:complexType name=\"columnType\">" + NL + "\t\t\t\t<xsd:attribute name=\"name\" type=\"xsd:string\" use=\"optional\"></xsd:attribute>" + NL + "\t\t\t\t<xsd:attribute name=\"type\" type=\"xsd:string\" use=\"optional\"></xsd:attribute>" + NL + "\t\t\t</xsd:complexType>" + NL + "\t\t\t" + NL + "\t\t\t<xsd:element name=\"updated\" type =\"xsd:string\" />" + NL + "\t\t\t" + NL + "\t\t\t<xsd:element name=\"storedProcedure\">" + NL + "\t\t\t\t<xsd:complexType>" + NL + "\t\t\t\t\t<xsd:sequence>" + NL + "\t\t\t\t\t\t<xsd:element name=\"parameter\" type=\"tns:parameter\" maxOccurs=\"unbounded\"" + NL + "\t\t\t\t\t\t\tminOccurs=\"0\" />" + NL + "\t\t\t\t\t</xsd:sequence>" + NL + "\t\t\t\t</xsd:complexType>" + NL + "\t\t\t</xsd:element>" + NL + "\t\t\t<xsd:complexType name=\"parameter\">" + NL + "\t\t\t\t<xsd:simpleContent>" + NL + "\t\t\t\t\t<xsd:extension base=\"xsd:string\">" + NL + "\t\t\t\t\t\t<xsd:attribute name=\"rank\" type=\"xsd:int\" use=\"required\" />" + NL + "\t\t\t\t\t</xsd:extension>" + NL + "\t\t\t\t</xsd:simpleContent>" + NL + "\t\t\t</xsd:complexType>" + NL + "\t\t\t" + NL + "\t\t\t<xsd:element name=\"storedProcedureResult\" type =\"xsd:string\" />" + NL + "\t\t</xsd:schema>" + NL + "\t\t" + NL + "\t</wsdl:types>" + NL + "" + NL + "\t<wsdl:message name=\"statementRequest\">" + NL + "\t\t<wsdl:part name=\"sql\" element=\"tns:sql\" />" + NL + "\t</wsdl:message>\t" + NL + "\t<wsdl:message name=\"selectResponse\">" + NL + "\t\t<wsdl:part name=\"result\" element=\"tns:result\" />" + NL + "\t</wsdl:message>" + NL + "\t<wsdl:message name=\"statementResponse\">" + NL + "\t\t<wsdl:part name=\"updated\" element=\"tns:updated\" />" + NL + "\t</wsdl:message>" + NL + "\t<wsdl:message name=\"storedProcedureRequest\">" + NL + "\t\t<wsdl:part name=\"storedProcedure\" element=\"tns:storedProcedure\" />" + NL + "\t</wsdl:message>" + NL + "\t<wsdl:message name=\"storedProcedureResponse\">" + NL + "\t\t<wsdl:part name=\"storedProcedureResult\" element=\"tns:storedProcedureResult\" />" + NL + "\t</wsdl:message>" + NL + "\t<wsdl:message name=\"xmlStoredProcedureResponse\">" + NL + "\t\t<wsdl:part name=\"xmlStoredProcedureResult\" element=\"tns:storedProcedure\" />" + NL + "\t</wsdl:message>" + NL + "" + NL + "\t<wsdl:portType name=\"";
  protected final String TEXT_2 = "\">" + NL + "\t\t<wsdl:operation name=\"select\">" + NL + "\t\t\t<wsdl:input message=\"tns:statementRequest\" />" + NL + "\t\t\t<wsdl:output message=\"tns:selectResponse\" />" + NL + "\t\t</wsdl:operation>" + NL + "\t\t<wsdl:operation name=\"insert\">" + NL + "\t\t\t<wsdl:input message=\"tns:statementRequest\" />" + NL + "\t\t</wsdl:operation>" + NL + "\t\t<wsdl:operation name=\"delete\">" + NL + "\t\t\t<wsdl:input message=\"tns:statementRequest\" />" + NL + "\t\t</wsdl:operation>" + NL + "\t\t<wsdl:operation name=\"update\">" + NL + "\t\t\t<wsdl:input message=\"tns:statementRequest\" />" + NL + "\t\t</wsdl:operation>" + NL + "\t\t<wsdl:operation name=\"insertWithResponse\">" + NL + "\t\t\t<wsdl:input message=\"tns:statementRequest\" />" + NL + "\t\t\t<wsdl:output message=\"tns:statementResponse\" />" + NL + "\t\t</wsdl:operation>" + NL + "\t\t<wsdl:operation name=\"deleteWithResponse\">" + NL + "\t\t\t<wsdl:input message=\"tns:statementRequest\" />" + NL + "\t\t\t<wsdl:output message=\"tns:statementResponse\" />" + NL + "\t\t</wsdl:operation>" + NL + "\t\t<wsdl:operation name=\"updateWithResponse\">" + NL + "\t\t\t<wsdl:input message=\"tns:statementRequest\" />" + NL + "\t\t\t<wsdl:output message=\"tns:statementResponse\" />" + NL + "\t\t</wsdl:operation>" + NL + "\t\t<wsdl:operation name=\"storedProcedure\">" + NL + "\t\t\t<wsdl:input message=\"tns:storedProcedureRequest\" />" + NL + "\t\t\t<wsdl:output message=\"tns:storedProcedureResponse\" />" + NL + "\t\t</wsdl:operation>" + NL + "\t\t<wsdl:operation name=\"XMLStoredProcedure\">" + NL + "\t\t\t<wsdl:input message=\"tns:storedProcedureRequest\" />" + NL + "\t\t\t<wsdl:output message=\"tns:xmlStoredProcedureResponse\" />" + NL + "\t\t</wsdl:operation>" + NL + "\t</wsdl:portType>" + NL + "\t" + NL + "\t<!-- This binding section is defined only to expose this WSDL via SOAP component to external service consumers" + NL + "-->" + NL + "\t<!-- " + NL + "\t<wsdl:binding name=\"SQLBinding\" type=\"tns:";
  protected final String TEXT_3 = "\">" + NL + "\t\t<soap:binding style=\"document\"" + NL + "\t\t\ttransport=\"http://schemas.xmlsoap.org/soap/http\" />" + NL + "\t\t<wsdl:operation name=\"select\">" + NL + "\t\t\t<soap:operation" + NL + "\t\t\t\tsoapAction=\"http://petals.ow2.org/components/sql/version-1/select\" />" + NL + "\t\t\t<wsdl:input>" + NL + "\t\t\t\t<soap:body use=\"literal\" />" + NL + "\t\t\t</wsdl:input>" + NL + "\t\t\t<wsdl:output>" + NL + "\t\t\t\t<soap:body use=\"literal\" />" + NL + "\t\t\t</wsdl:output>" + NL + "\t\t</wsdl:operation>" + NL + "\t\t<wsdl:operation name=\"insert\">" + NL + "\t\t\t<soap:operation" + NL + "\t\t\t\tsoapAction=\"http://petals.ow2.org/components/sql/version-1/insert\" />" + NL + "\t\t\t<wsdl:input>" + NL + "\t\t\t\t<soap:body use=\"literal\" />" + NL + "\t\t\t</wsdl:input>" + NL + "\t\t</wsdl:operation>" + NL + "\t\t<wsdl:operation name=\"delete\">" + NL + "\t\t\t<soap:operation" + NL + "\t\t\t\tsoapAction=\"http://petals.ow2.org/components/sql/version-1/delete\" />" + NL + "\t\t\t<wsdl:input>" + NL + "\t\t\t\t<soap:body use=\"literal\" />" + NL + "\t\t\t</wsdl:input>" + NL + "\t\t</wsdl:operation>" + NL + "\t\t<wsdl:operation name=\"update\">" + NL + "\t\t\t<soap:operation" + NL + "\t\t\t\tsoapAction=\"http://petals.ow2.org/components/sql/version-1/update\" />" + NL + "\t\t\t<wsdl:input>" + NL + "\t\t\t\t<soap:body use=\"literal\" />" + NL + "\t\t\t</wsdl:input>" + NL + "\t\t</wsdl:operation>" + NL + "\t\t<wsdl:operation name=\"insertWithResponse\">" + NL + "\t\t\t<soap:operation" + NL + "\t\t\t\tsoapAction=\"http://petals.ow2.org/components/sql/version-1/insertWithResponse\" />" + NL + "\t\t\t<wsdl:input>" + NL + "\t\t\t\t<soap:body use=\"literal\" />" + NL + "\t\t\t</wsdl:input>" + NL + "\t\t\t<wsdl:output>" + NL + "\t\t\t\t<soap:body use=\"literal\" />" + NL + "\t\t\t</wsdl:output>" + NL + "\t\t</wsdl:operation>" + NL + "\t\t<wsdl:operation name=\"deleteWithResponse\">" + NL + "\t\t\t<soap:operation" + NL + "\t\t\t\tsoapAction=\"http://petals.ow2.org/components/sql/version-1/deleteWithResponse\" />" + NL + "\t\t\t<wsdl:input>" + NL + "\t\t\t\t<soap:body use=\"literal\" />" + NL + "\t\t\t</wsdl:input>" + NL + "\t\t\t<wsdl:output>" + NL + "\t\t\t\t<soap:body use=\"literal\" />" + NL + "\t\t\t</wsdl:output>" + NL + "\t\t</wsdl:operation>" + NL + "\t\t<wsdl:operation name=\"updateWithResponse\">" + NL + "\t\t\t<soap:operation" + NL + "\t\t\t\tsoapAction=\"http://petals.ow2.org/components/sql/version-1/updateWithResponse\" />" + NL + "\t\t\t<wsdl:input>" + NL + "\t\t\t\t<soap:body use=\"literal\" />" + NL + "\t\t\t</wsdl:input>" + NL + "\t\t\t<wsdl:output>" + NL + "\t\t\t\t<soap:body use=\"literal\" />" + NL + "\t\t\t</wsdl:output>" + NL + "\t\t</wsdl:operation>" + NL + "\t\t<wsdl:operation name=\"storedProcedure\">" + NL + "\t\t\t<soap:operation" + NL + "\t\t\t\tsoapAction=\"http://petals.ow2.org/components/sql/version-1/storedProcedure\" />" + NL + "\t\t\t<wsdl:input>" + NL + "\t\t\t\t<soap:body use=\"literal\" />" + NL + "\t\t\t</wsdl:input>" + NL + "\t\t\t<wsdl:output>" + NL + "\t\t\t\t<soap:body use=\"literal\" />" + NL + "\t\t\t</wsdl:output>" + NL + "\t\t</wsdl:operation>" + NL + "\t\t<wsdl:operation name=\"XMLStoredProcedure\">" + NL + "\t\t\t<soap:operation" + NL + "\t\t\t\tsoapAction=\"http://petals.ow2.org/components/sql/version-1/XMLStoredProcedure\" />" + NL + "\t\t\t<wsdl:input>" + NL + "\t\t\t\t<soap:body use=\"literal\" />" + NL + "\t\t\t</wsdl:input>" + NL + "\t\t\t<wsdl:output>" + NL + "\t\t\t\t<soap:body use=\"literal\" />" + NL + "\t\t\t</wsdl:output>" + NL + "\t\t</wsdl:operation>" + NL + "\t</wsdl:binding>" + NL + "\t-->" + NL + "" + NL + "</wsdl:definitions>";

	 public String generate( Object argument )
  {
    final StringBuffer stringBuffer = new StringBuffer();
     AbstractEndpoint data = (AbstractEndpoint) argument; 
    stringBuffer.append(TEXT_1);
    stringBuffer.append( data.getInterfaceName() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( data.getInterfaceName() );
    stringBuffer.append(TEXT_3);
    return stringBuffer.toString();
  }
}