package com.ebmwebsourcing.petals.services.ftp.generated;

import com.ebmwebsourcing.petals.services.su.wizards.generation.EclipseSuBean;

/****************************************************************************
 * 
 * Copyright (c) 2008-2011, EBM WebSourcing
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
public class FtpService31 {

  protected static String nl;
  public static synchronized FtpService31 create(String lineSeparator)
  {
    nl = lineSeparator;
    FtpService31 result = new FtpService31();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + NL + "<wsdl:definitions " + NL + "\txmlns:tns=\"http://petals.ow2.org/components/ftp/version-3\"" + NL + "\txmlns:wsdl=\"http://schemas.xmlsoap.org/wsdl/\" " + NL + "\txmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"" + NL + "\tname=\"FtpService\" " + NL + "\ttargetNamespace=\"http://petals.ow2.org/components/ftp/version-3\"" + NL + "\txmlns:soap=\"http://schemas.xmlsoap.org/wsdl/soap/\">" + NL + "" + NL + "\t<wsdl:types>" + NL + "\t\t<xsd:schema " + NL + "\t\t\txmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"" + NL + "\t\t\telementFormDefault=\"qualified\" " + NL + "\t\t\ttargetNamespace=\"http://petals.ow2.org/components/ftp/version-3\">" + NL + "" + NL + "\t\t\t<xsd:element name=\"get\" type=\"tns:getType\"></xsd:element>" + NL + "\t\t\t<xsd:complexType name=\"getType\">" + NL + "\t\t\t\t<xsd:sequence>" + NL + "\t\t\t\t\t<xsd:element name=\"filename\" type=\"xsd:string\" maxOccurs=\"1\" minOccurs=\"1\" />" + NL + "\t\t\t\t\t<xsd:element name=\"connection\" type=\"tns:ConnectionType\" maxOccurs=\"1\" minOccurs=\"0\" />" + NL + "\t\t\t\t</xsd:sequence>" + NL + "\t\t\t</xsd:complexType>" + NL + "" + NL + "\t\t\t<xsd:element name=\"ioFault\" type=\"tns:ioFaultType\"></xsd:element>" + NL + "\t\t\t<xsd:complexType name=\"ioFaultType\">" + NL + "\t\t\t\t<xsd:sequence>" + NL + "\t\t\t\t\t<xsd:element name=\"message\" type=\"xsd:string\" />" + NL + "\t\t\t\t</xsd:sequence>" + NL + "\t\t\t</xsd:complexType>" + NL + "" + NL + "\t\t\t<xsd:element name=\"mget\" type=\"tns:mgetType\" />" + NL + "\t\t\t<xsd:complexType name=\"mgetType\">" + NL + "\t\t\t\t<xsd:sequence>" + NL + "\t\t\t\t\t<xsd:element name=\"filename\" type=\"xsd:string\" maxOccurs=\"unbounded\" minOccurs=\"1\" />" + NL + "\t\t\t\t\t<xsd:element name=\"connection\" type=\"tns:ConnectionType\" maxOccurs=\"1\" minOccurs=\"0\" />" + NL + "\t\t\t\t</xsd:sequence>" + NL + "\t\t\t</xsd:complexType>" + NL + "" + NL + "\t\t\t<xsd:element name=\"mgetResponse\" type=\"tns:mgetResponse\" />" + NL + "\t\t\t<xsd:complexType name=\"mgetResponse\">" + NL + "\t\t\t\t<xsd:sequence>" + NL + "\t\t\t\t\t<xsd:element name=\"attachments\" type=\"tns:attachmentType\" />" + NL + "\t\t\t\t</xsd:sequence>" + NL + "\t\t\t</xsd:complexType>" + NL + "" + NL + "\t\t\t<xsd:element name=\"getFiles_fault\">" + NL + "\t\t\t\t<xsd:complexType>" + NL + "\t\t\t\t\t<xsd:sequence>" + NL + "\t\t\t\t\t\t<xsd:element name=\"getFiles_fault\" type=\"xsd:string\" />" + NL + "\t\t\t\t\t</xsd:sequence>" + NL + "\t\t\t\t</xsd:complexType>" + NL + "\t\t\t</xsd:element>" + NL + "" + NL + "\t\t\t<xsd:complexType name=\"anyType\"></xsd:complexType>" + NL + "\t\t\t<xsd:element name=\"put\">" + NL + "\t\t\t\t<xsd:complexType>" + NL + "\t\t\t\t\t<xsd:sequence>" + NL + "\t\t\t\t\t\t<xsd:element name=\"body\" type=\"xsd:string\" maxOccurs=\"1\"" + NL + "\t\t\t\t\t\t\tminOccurs=\"1\" />" + NL + "\t\t\t\t\t\t<xsd:element name=\"filename\" type=\"xsd:string\" maxOccurs=\"1\" minOccurs=\"1\" />" + NL + "\t\t\t\t\t\t<xsd:element name=\"connection\" type=\"tns:ConnectionType\" maxOccurs=\"1\" minOccurs=\"0\" />" + NL + "\t\t\t\t\t</xsd:sequence>" + NL + "\t\t\t\t</xsd:complexType>" + NL + "\t\t\t</xsd:element>" + NL + "" + NL + "\t\t\t<xsd:element name=\"mput\">" + NL + "\t\t\t\t<xsd:complexType>" + NL + "\t\t\t\t\t<xsd:sequence>" + NL + "\t\t\t\t\t\t<xsd:element name=\"connection\" type=\"tns:ConnectionType\" maxOccurs=\"1\" minOccurs=\"0\" />" + NL + "\t\t\t\t\t\t<xsd:element name=\"attachments\" type=\"tns:attachmentType\" minOccurs=\"1\" maxOccurs=\"1\" />" + NL + "\t\t\t\t\t</xsd:sequence>" + NL + "\t\t\t\t</xsd:complexType>" + NL + "\t\t\t</xsd:element>" + NL + "" + NL + "\t\t\t<xsd:element name=\"dir\">" + NL + "\t\t\t\t<xsd:complexType>" + NL + "\t\t\t\t\t<xsd:sequence>" + NL + "\t\t\t\t\t\t<xsd:element name=\"connection\" type=\"tns:ConnectionType\" maxOccurs=\"1\" minOccurs=\"0\" />" + NL + "\t\t\t\t\t</xsd:sequence>" + NL + "\t\t\t\t</xsd:complexType>" + NL + "\t\t\t</xsd:element>" + NL + "" + NL + "\t\t\t<xsd:element name=\"dirResponse\">" + NL + "\t\t\t\t<xsd:complexType>" + NL + "\t\t\t\t\t<xsd:sequence>" + NL + "\t\t\t\t\t\t<xsd:element name=\"filename\" type=\"xsd:string\" maxOccurs=\"unbounded\" minOccurs=\"0\" />" + NL + "\t\t\t\t\t</xsd:sequence>" + NL + "\t\t\t\t</xsd:complexType>" + NL + "\t\t\t</xsd:element>" + NL + "" + NL + "\t\t\t<xsd:complexType name=\"ConnectionType\">" + NL + "\t\t\t\t<xsd:sequence>" + NL + "\t\t\t\t\t<xsd:element name=\"server\" type=\"xsd:string\" />" + NL + "\t\t\t\t\t<xsd:element name=\"port\" type=\"xsd:string\" />" + NL + "\t\t\t\t\t<xsd:element name=\"user\" type=\"xsd:string\" />" + NL + "\t\t\t\t\t<xsd:element name=\"password\" type=\"xsd:string\" />" + NL + "" + NL + "\t\t\t\t\t<xsd:element name=\"folder\" type=\"xsd:string\" minOccurs=\"0\"" + NL + "\t\t\t\t\t\tmaxOccurs=\"1\">" + NL + "\t\t\t\t\t\t<xsd:annotation>" + NL + "\t\t\t\t\t\t\t<xsd:documentation>Folder on the FTP server to read/write" + NL + "\t\t\t\t\t\t\t\t(optional : The default value is the default directory of the" + NL + "\t\t\t\t\t\t\t\tftp user)</xsd:documentation>" + NL + "\t\t\t\t\t\t</xsd:annotation>" + NL + "\t\t\t\t\t</xsd:element>" + NL + "\t\t\t\t\t" + NL + "\t\t\t\t\t<xsd:element name=\"transfer-type\" type=\"tns:transfer-typeType\" />" + NL + "\t\t\t\t\t<xsd:element name=\"connection-mode\" type=\"tns:connection-modeType\" />" + NL + "\t\t\t\t\t<xsd:element name=\"delete-processed-files\" type=\"xsd:boolean\" minOccurs=\"0\" maxOccurs=\"1\" />" + NL + "\t\t\t\t\t<xsd:element name=\"encoding\" type=\"xsd:string\" minOccurs=\"0\" maxOccurs=\"1\">" + NL + "\t\t\t\t\t\t<xsd:annotation>" + NL + "\t\t\t\t\t\t\t<xsd:documentation>Character encoding used by the FTP control" + NL + "\t\t\t\t\t\t\t\tconnection.</xsd:documentation>" + NL + "\t\t\t\t\t\t</xsd:annotation>" + NL + "\t\t\t\t\t</xsd:element>" + NL + "\t\t\t\t</xsd:sequence>" + NL + "\t\t\t</xsd:complexType>" + NL + "" + NL + "\t\t\t<xsd:simpleType name=\"transfer-typeType\">" + NL + "\t\t\t\t<xsd:restriction base=\"xsd:string\">" + NL + "\t\t\t\t\t<xsd:enumeration value=\"ascii\" />" + NL + "\t\t\t\t\t<xsd:enumeration value=\"binary\" />" + NL + "\t\t\t\t</xsd:restriction>" + NL + "\t\t\t</xsd:simpleType>" + NL + "" + NL + "\t\t\t<xsd:simpleType name=\"connection-modeType\">" + NL + "\t\t\t\t<xsd:restriction base=\"xsd:string\">" + NL + "\t\t\t\t\t<xsd:enumeration value=\"active\" />" + NL + "\t\t\t\t\t<xsd:enumeration value=\"passive\" />" + NL + "\t\t\t\t</xsd:restriction>" + NL + "\t\t\t</xsd:simpleType>" + NL + "" + NL + "\t\t\t<xsd:element name=\"getFault1\">" + NL + "\t\t\t\t<xsd:complexType>" + NL + "\t\t\t\t\t<xsd:sequence>" + NL + "\t\t\t\t\t\t<xsd:element name=\"getFault1\" type=\"xsd:string\" />" + NL + "\t\t\t\t\t</xsd:sequence>" + NL + "\t\t\t\t</xsd:complexType>" + NL + "\t\t\t</xsd:element>" + NL + "" + NL + "\t\t\t<xsd:element name=\"missingElementFault\" type=\"tns:missingElementFaultType\" />" + NL + "\t\t\t<xsd:complexType name=\"missingElementFaultType\">" + NL + "\t\t\t\t<xsd:sequence>" + NL + "\t\t\t\t\t<xsd:element name=\"message\" type=\"xsd:string\" />" + NL + "\t\t\t\t</xsd:sequence>" + NL + "\t\t\t</xsd:complexType>" + NL + "" + NL + "\t\t\t<xsd:element name=\"dirFault1\">" + NL + "\t\t\t\t<xsd:complexType>" + NL + "\t\t\t\t\t<xsd:sequence>" + NL + "\t\t\t\t\t\t<xsd:element name=\"dirFault1\" type=\"xsd:string\" />" + NL + "\t\t\t\t\t</xsd:sequence>" + NL + "\t\t\t\t</xsd:complexType>" + NL + "\t\t\t</xsd:element>" + NL + "" + NL + "\t\t\t<xsd:element name=\"mgetFault1\">" + NL + "\t\t\t\t<xsd:complexType>" + NL + "\t\t\t\t\t<xsd:sequence>" + NL + "\t\t\t\t\t\t<xsd:element name=\"mgetFault1\" type=\"xsd:string\" />" + NL + "\t\t\t\t\t</xsd:sequence>" + NL + "\t\t\t\t</xsd:complexType>" + NL + "\t\t\t</xsd:element>" + NL + "\t\t\t<xsd:element name=\"del\" type=\"tns:attachmentType\">" + NL + "\t\t\t</xsd:element>" + NL + "" + NL + "\t\t\t<xsd:complexType name=\"delType\">" + NL + "\t\t\t\t<xsd:sequence>" + NL + "\t\t\t\t\t<xsd:element name=\"filename\" type=\"xsd:string\" minOccurs=\"1\" maxOccurs=\"1\" />" + NL + "\t\t\t\t\t<xsd:element name=\"connection\" type=\"tns:ConnectionType\" minOccurs=\"0\" maxOccurs=\"1\" />" + NL + "\t\t\t\t</xsd:sequence>" + NL + "\t\t\t</xsd:complexType>" + NL + "" + NL + "\t\t\t<xsd:complexType name=\"attachmentType\">" + NL + "\t\t\t\t<xsd:sequence>" + NL + "\t\t\t\t\t<xsd:element name=\"filename\" type=\"xsd:base64Binary\" maxOccurs=\"unbounded\" minOccurs=\"1\" />" + NL + "\t\t\t\t</xsd:sequence>" + NL + "\t\t\t</xsd:complexType>" + NL + "" + NL + "\t\t\t<xsd:element name=\"attachments\" type=\"tns:attachmentType\" />" + NL + "\t\t\t<xsd:element name=\"getResponse\" type=\"tns:getResponseType\" />" + NL + "\t\t\t<xsd:complexType name=\"getResponseType\">" + NL + "\t\t\t\t<xsd:sequence>" + NL + "\t\t\t\t\t<xsd:any></xsd:any>" + NL + "\t\t\t\t</xsd:sequence>" + NL + "\t\t\t</xsd:complexType>" + NL + "\t\t</xsd:schema>" + NL + "\t</wsdl:types>" + NL + "" + NL + "\t<!-- Message Part -->" + NL + "\t<wsdl:message name=\"getRequest\">" + NL + "\t\t<wsdl:part name=\"getRequest\" element=\"tns:get\" />" + NL + "\t</wsdl:message>" + NL + "" + NL + "\t<wsdl:message name=\"getResponse\">" + NL + "\t\t<wsdl:part name=\"getResponse\" element=\"tns:getResponse\"></wsdl:part>" + NL + "\t</wsdl:message>" + NL + "" + NL + "\t<wsdl:message name=\"mgetRequest\">" + NL + "\t\t<wsdl:part name=\"mgetRequest\" element=\"tns:mget\"></wsdl:part>" + NL + "\t</wsdl:message>" + NL + "" + NL + "\t<wsdl:message name=\"mgetResponse\">" + NL + "\t\t<wsdl:part name=\"mgetResponse\" element=\"tns:mgetResponse\"></wsdl:part>" + NL + "\t</wsdl:message>" + NL + "" + NL + "\t<wsdl:message name=\"getFile_faultMsg\">" + NL + "\t\t<wsdl:part name=\"ioFault\" element=\"tns:ioFault\"></wsdl:part>" + NL + "\t</wsdl:message>" + NL + "" + NL + "\t<wsdl:message name=\"getFiles_faultMsg\">" + NL + "\t\t<wsdl:part name=\"ioFault\" element=\"tns:ioFault\"></wsdl:part>" + NL + "\t</wsdl:message>" + NL + "" + NL + "\t<wsdl:message name=\"putRequest\">" + NL + "\t\t<wsdl:part name=\"putRequest\" element=\"tns:put\"></wsdl:part>" + NL + "\t</wsdl:message>" + NL + "" + NL + "\t<wsdl:message name=\"mputRequest\">" + NL + "\t\t<wsdl:part name=\"mputRequest\" element=\"tns:mput\"></wsdl:part>" + NL + "\t</wsdl:message>" + NL + "" + NL + "\t<wsdl:message name=\"dirRequest\">" + NL + "\t\t<wsdl:part name=\"dirRequest\" element=\"tns:dir\"></wsdl:part>" + NL + "\t</wsdl:message>" + NL + "" + NL + "\t<wsdl:message name=\"dirResponse\">" + NL + "\t\t<wsdl:part name=\"dirResponse\" element=\"tns:dirResponse\"></wsdl:part>" + NL + "\t</wsdl:message>" + NL + "" + NL + "\t<wsdl:message name=\"dir_faultMsg\">" + NL + "\t\t<wsdl:part name=\"ioFault\" element=\"tns:ioFault\"></wsdl:part>" + NL + "\t</wsdl:message>" + NL + "" + NL + "\t<wsdl:message name=\"getFault1\">" + NL + "\t\t<wsdl:part name=\"missingElementFault\" element=\"tns:missingElementFault\">" + NL + "\t\t</wsdl:part>" + NL + "\t</wsdl:message>" + NL + "" + NL + "\t<wsdl:message name=\"dirFault1\">" + NL + "\t\t<wsdl:part name=\"missingElementFault\" element=\"tns:missingElementFault\">" + NL + "\t\t</wsdl:part>" + NL + "\t</wsdl:message>" + NL + "" + NL + "\t<wsdl:message name=\"mgetFault1\">" + NL + "\t\t<wsdl:part name=\"missingElementFault\" element=\"tns:missingElementFault\">" + NL + "\t\t</wsdl:part>" + NL + "\t</wsdl:message>" + NL + "" + NL + "\t<wsdl:message name=\"delRequest\">" + NL + "\t\t<wsdl:part name=\"delRequest\" element=\"tns:del\"></wsdl:part>" + NL + "\t</wsdl:message>" + NL + "" + NL + "\t<!-- Interface Part -->" + NL + "\t<wsdl:portType name=\"";
  protected final String TEXT_2 = "\">" + NL + "\t\t<wsdl:operation name=\"get\">" + NL + "\t\t\t<wsdl:input message=\"tns:getRequest\" />" + NL + "\t\t\t<wsdl:output message=\"tns:getResponse\" />" + NL + "\t\t\t<wsdl:fault name=\"fault\" message=\"tns:getFile_faultMsg\" />" + NL + "\t\t\t<wsdl:fault name=\"fault1\" message=\"tns:getFault1\" />" + NL + "\t\t</wsdl:operation>" + NL + "\t\t" + NL + "\t\t<wsdl:operation name=\"mget\">" + NL + "\t\t\t<wsdl:input message=\"tns:mgetRequest\" />" + NL + "\t\t\t<wsdl:output message=\"tns:mgetResponse\" />" + NL + "\t\t\t<wsdl:fault name=\"fault\" message=\"tns:getFiles_faultMsg\" />" + NL + "\t\t\t<wsdl:fault name=\"fault1\" message=\"tns:mgetFault1\" />" + NL + "" + NL + "\t\t</wsdl:operation>" + NL + "\t\t<wsdl:operation name=\"put\">" + NL + "\t\t\t<wsdl:input message=\"tns:putRequest\" />" + NL + "\t\t</wsdl:operation>" + NL + "\t\t" + NL + "\t\t<wsdl:operation name=\"mput\">" + NL + "\t\t\t<wsdl:input message=\"tns:mputRequest\" />" + NL + "\t\t</wsdl:operation>" + NL + "\t\t" + NL + "\t\t<wsdl:operation name=\"dir\">" + NL + "\t\t\t<wsdl:input message=\"tns:dirRequest\" />" + NL + "\t\t\t<wsdl:output message=\"tns:dirResponse\" />" + NL + "\t\t\t<wsdl:fault name=\"fault\" message=\"tns:dir_faultMsg\" />" + NL + "\t\t\t<wsdl:fault name=\"fault1\" message=\"tns:dirFault1\" />" + NL + "\t\t</wsdl:operation>" + NL + "" + NL + "\t\t<wsdl:operation name=\"del\">" + NL + "\t\t\t<wsdl:input message=\"tns:delRequest\" />" + NL + "\t\t</wsdl:operation>" + NL + "\t</wsdl:portType>" + NL + "" + NL + "\t<!--" + NL + "\t\tThis binding section is defined only to expose this WSDL via SOAP" + NL + "\t\tcomponent to external service consumers" + NL + "\t-->" + NL + "\t<wsdl:binding name=\"FtpServiceSoapBinding\" type=\"tns:";
  protected final String TEXT_3 = "\">" + NL + "\t\t<soap:binding style=\"document\"" + NL + "\t\t\ttransport=\"http://schemas.xmlsoap.org/soap/http\" />" + NL + "" + NL + "\t\t<wsdl:operation name=\"get\">" + NL + "\t\t\t<soap:operation soapAction=\"http://petals.ow2.org/components/ftp/version-3/get\" />" + NL + "\t\t\t<wsdl:input>" + NL + "\t\t\t\t<soap:body use=\"literal\" />" + NL + "\t\t\t</wsdl:input>" + NL + "\t\t\t<wsdl:output>" + NL + "\t\t\t\t<soap:body use=\"literal\" />" + NL + "\t\t\t</wsdl:output>" + NL + "\t\t\t<wsdl:fault name=\"fault\">" + NL + "\t\t\t\t<soap:fault use=\"literal\" name=\"fault\" />" + NL + "\t\t\t</wsdl:fault>" + NL + "\t\t\t<wsdl:fault name=\"fault1\">" + NL + "\t\t\t\t<soap:fault use=\"literal\" name=\"fault1\" />" + NL + "\t\t\t</wsdl:fault>" + NL + "\t\t</wsdl:operation>" + NL + "" + NL + "\t\t<wsdl:operation name=\"mget\">" + NL + "\t\t\t<soap:operation soapAction=\"http://petals.ow2.org/components/ftp/version-3/mget\" />" + NL + "\t\t\t<wsdl:input>" + NL + "\t\t\t\t<soap:body use=\"literal\" />" + NL + "\t\t\t</wsdl:input>" + NL + "\t\t\t<wsdl:output>" + NL + "\t\t\t\t<soap:body use=\"literal\" />" + NL + "\t\t\t</wsdl:output>" + NL + "\t\t\t<wsdl:fault name=\"fault\">" + NL + "\t\t\t\t<soap:fault use=\"literal\" name=\"fault\" />" + NL + "\t\t\t</wsdl:fault>" + NL + "\t\t\t<wsdl:fault name=\"fault1\">" + NL + "\t\t\t\t<soap:fault use=\"literal\" name=\"fault1\" />" + NL + "\t\t\t</wsdl:fault>" + NL + "\t\t</wsdl:operation>" + NL + "" + NL + "\t\t<wsdl:operation name=\"put\">" + NL + "\t\t\t<soap:operation soapAction=\"http://petals.ow2.org/components/ftp/version-3/put\" />" + NL + "\t\t\t<wsdl:input>" + NL + "\t\t\t\t<soap:body use=\"literal\" />" + NL + "\t\t\t</wsdl:input>" + NL + "\t\t</wsdl:operation>" + NL + "" + NL + "\t\t<wsdl:operation name=\"mput\">" + NL + "\t\t\t<soap:operation soapAction=\"http://petals.ow2.org/components/ftp/version-3/mput\" />" + NL + "\t\t\t<wsdl:input>" + NL + "\t\t\t\t<soap:body use=\"literal\" />" + NL + "\t\t\t</wsdl:input>" + NL + "\t\t</wsdl:operation>" + NL + "" + NL + "\t\t<wsdl:operation name=\"dir\">" + NL + "\t\t\t<soap:operation soapAction=\"http://petals.ow2.org/components/ftp/version-3/dir\" />" + NL + "\t\t\t<wsdl:input>" + NL + "\t\t\t\t<soap:body use=\"literal\" />" + NL + "\t\t\t</wsdl:input>" + NL + "\t\t\t<wsdl:output>" + NL + "\t\t\t\t<soap:body use=\"literal\" />" + NL + "\t\t\t</wsdl:output>" + NL + "\t\t\t<wsdl:fault name=\"fault\">" + NL + "\t\t\t\t<soap:fault use=\"literal\" name=\"fault\" />" + NL + "\t\t\t</wsdl:fault>" + NL + "\t\t\t<wsdl:fault name=\"fault1\">" + NL + "\t\t\t\t<soap:fault use=\"literal\" name=\"fault1\" />" + NL + "\t\t\t</wsdl:fault>" + NL + "\t\t</wsdl:operation>" + NL + "" + NL + "\t\t<wsdl:operation name=\"del\">" + NL + "\t\t\t<soap:operation soapAction=\"http://petals.ow2.org/components/ftp/version-3/del\" />" + NL + "\t\t\t<wsdl:input>" + NL + "\t\t\t\t<soap:body use=\"literal\" />" + NL + "\t\t\t</wsdl:input>" + NL + "\t\t</wsdl:operation>" + NL + "\t</wsdl:binding>" + NL + "" + NL + "\t<!--" + NL + "\t\tThis section must be overridden at the SU definition and the matching Service." + NL + "\t-->" + NL + "\t<wsdl:service name=\"";
  protected final String TEXT_4 = "\">" + NL + "\t\t<wsdl:port name=\"";
  protected final String TEXT_5 = "\" binding=\"tns:FtpServiceSoapBinding\">" + NL + "\t\t\t<soap:address location=\"jbi://myFTPSUEndpointName\" />" + NL + "\t\t</wsdl:port>" + NL + "\t</wsdl:service>" + NL + "</wsdl:definitions>";
  protected final String TEXT_6 = NL;

	 public String generate( Object argument )
  {
    final StringBuffer stringBuffer = new StringBuffer();
     EclipseSuBean data = (EclipseSuBean) argument; 
    stringBuffer.append(TEXT_1);
    stringBuffer.append( data.getInterfaceName() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( data.getInterfaceName() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( data.getServiceName() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( data.getEndpointName() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append(TEXT_6);
    return stringBuffer.toString();
  }
}