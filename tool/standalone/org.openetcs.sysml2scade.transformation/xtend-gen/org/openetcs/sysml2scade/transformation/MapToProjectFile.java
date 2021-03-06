package org.openetcs.sysml2scade.transformation;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class MapToProjectFile {
  public static CharSequence createProject(final String name) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    _builder.newLine();
    _builder.append("<Project id=\"1\" oid_count=\"30\" defaultConfiguration=\"2\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<props>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<Prop id=\"3\" name=\"@STUDIO:PRODUCT\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<value>SYSTEM</value>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</Prop>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<Prop id=\"4\" name=\"@SYSTEM:VERSION\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<value>3.0.0</value>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</Prop>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<Prop id=\"8\" name=\"@REPORTER:SCRIPT\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<value>Reporter/ScadeSystemReport.tcl</value>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<configuration>7</configuration>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</Prop>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<Prop id=\"9\" name=\"@REPORTER:RotateLandscape\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<value>true</value>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<configuration>7</configuration>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</Prop>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<Prop id=\"10\" name=\"@REPORTER:cstDisplayType\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<value>Flat</value>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<configuration>7</configuration>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</Prop>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<Prop id=\"11\" name=\"@STUDIO:TOOLCONF\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<value>Reporter</value>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<value>7</value>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<value>12</value>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</Prop>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<Prop id=\"13\" name=\"@REPORTER:FORMAT\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<value>rtf</value>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<configuration>12</configuration>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</Prop>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<Prop id=\"14\" name=\"@REPORTER:SCRIPT\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<value>Reporter/ScadeSystemReport.tcl</value>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<configuration>12</configuration>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</Prop>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<Prop id=\"15\" name=\"@REPORTER:RotateLandscape\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<value>true</value>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<configuration>12</configuration>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</Prop>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<Prop id=\"16\" name=\"@REPORTER:cstDisplayType\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<value>Flat</value>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<configuration>12</configuration>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</Prop>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<Prop id=\"18\" name=\"@SYSTEM_CHECKER:CONSTRAINT_ENABLEMENT\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<value>Predefined rules|Connector path rules|Check connector path for a connector connected to a reference|true;Predefined rules|Connector path rules|Verify if the connector paths of nested connectors are correct|true;Predefined rules|Data propagation rules|Data connected to Flow Port has bound Data in all container Blocks|false;Predefined rules|Data propagation rules|Data connects to Flow Port or is bound to another Data|false;Predefined rules|Data propagation rules|Data is propagated across at least one Connector|false;Predefined rules|Data propagation rules|Data is propagated to final Flow Port|false;Predefined rules|Diagram representation rules|Check the representation on graphical diagrams|true;Predefined rules|connector_compatibility_uml.ocl|connector_between_internal_external_ports_with_compatible_flow_direction|true;Predefined rules|connector_compatibility_uml.ocl|connector_between_internal_external_ports_with_identical_flow_direction|true;Predefined rules|connector_compatibility_uml.ocl|connector_between_internal_ports_with_compatible_flow_direction|true;Predefined rules|connector_compatibility_uml.ocl|connector_between_internal_ports_with_exact_flow_direction|true;Predefined rules|connector_compatibility_uml.ocl|connector_between_ports_with_compatible_datatype_dimension|true;Predefined rules|connector_compatibility_uml.ocl|connector_between_ports_with_compatible_type|true;Predefined rules|connector_compatibility_uml.ocl|connector_connects_only_flow_ports|true;Predefined rules|connector_compatibility_uml.ocl|connector_does_not_connect_external_ports|true;Predefined rules|connector_compatibility_uml.ocl|connector_has_two_connector_ends|true;Predefined rules|datatypes_system.tcl|Check DataType Unit and Dimension consistency|true;Predefined rules|flow_ports_uml.ocl|external_output_flow_port_is_produced_only_once|false;Predefined rules|flow_ports_uml.ocl|flow_port_is_connected|true;Predefined rules|flow_ports_uml.ocl|internal_intput_flow_port_is_produced_only_once|true;Predefined rules|grouped_ports_uml.ocl|connector_between_grouped_port_and_flow_port_has_compatible_name_type_and_dimension|false;Predefined rules|grouped_ports_uml.ocl|connector_between_grouped_port_and_flow_port_has_compatible_type_and_dimension|true;Predefined rules|grouped_ports_uml.ocl|connector_between_grouped_port_without_flowspecification_and_port_with_flow_specification|true;Predefined rules|grouped_ports_uml.ocl|connector_between_two_grouped_ports_has_compatible_name_type_and_dimension|false;Predefined rules|grouped_ports_uml.ocl|connector_between_two_grouped_ports_has_compatible_type_and_dimension|true;Predefined rules|grouped_ports_uml.ocl|grouped_port_should_have_type|true</value>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<configuration>17</configuration>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</Prop>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<Prop id=\"19\" name=\"@STUDIO:TOOLCONF\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<value>System Checker</value>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<value>17</value>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<value>20</value>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<value>22</value>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</Prop>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<Prop id=\"21\" name=\"@SYSTEM_CHECKER:CONSTRAINT_ENABLEMENT\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<value>Predefined rules|Connector path rules|Check connector path for a connector connected to a reference|true;Predefined rules|Connector path rules|Verify if the connector paths of nested connectors are correct|true;Predefined rules|Data propagation rules|Data connected to Flow Port has bound Data in all container Blocks|false;Predefined rules|Data propagation rules|Data connects to Flow Port or is bound to another Data|false;Predefined rules|Data propagation rules|Data is propagated across at least one Connector|false;Predefined rules|Data propagation rules|Data is propagated to final Flow Port|false;Predefined rules|Diagram representation rules|Check the representation on graphical diagrams|true;Predefined rules|connector_compatibility_uml.ocl|connector_between_internal_external_ports_with_compatible_flow_direction|true;Predefined rules|connector_compatibility_uml.ocl|connector_between_internal_external_ports_with_identical_flow_direction|true;Predefined rules|connector_compatibility_uml.ocl|connector_between_internal_ports_with_compatible_flow_direction|true;Predefined rules|connector_compatibility_uml.ocl|connector_between_internal_ports_with_exact_flow_direction|true;Predefined rules|connector_compatibility_uml.ocl|connector_between_ports_with_compatible_datatype_dimension|true;Predefined rules|connector_compatibility_uml.ocl|connector_between_ports_with_compatible_type|true;Predefined rules|connector_compatibility_uml.ocl|connector_connects_only_flow_ports|true;Predefined rules|connector_compatibility_uml.ocl|connector_does_not_connect_external_ports|true;Predefined rules|connector_compatibility_uml.ocl|connector_has_two_connector_ends|true;Predefined rules|datatypes_system.tcl|Check DataType Unit and Dimension consistency|true;Predefined rules|flow_ports_uml.ocl|external_output_flow_port_is_produced_only_once|true;Predefined rules|flow_ports_uml.ocl|flow_port_is_connected|true;Predefined rules|flow_ports_uml.ocl|internal_intput_flow_port_is_produced_only_once|true;Predefined rules|grouped_ports_uml.ocl|connector_between_grouped_port_and_flow_port_has_compatible_name_type_and_dimension|true;Predefined rules|grouped_ports_uml.ocl|connector_between_grouped_port_and_flow_port_has_compatible_type_and_dimension|true;Predefined rules|grouped_ports_uml.ocl|connector_between_grouped_port_without_flowspecification_and_port_with_flow_specification|true;Predefined rules|grouped_ports_uml.ocl|connector_between_two_grouped_ports_has_compatible_name_type_and_dimension|true;Predefined rules|grouped_ports_uml.ocl|connector_between_two_grouped_ports_has_compatible_type_and_dimension|true;Predefined rules|grouped_ports_uml.ocl|grouped_port_should_have_type|true</value>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<configuration>20</configuration>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</Prop>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<Prop id=\"23\" name=\"@SYSTEM_CHECKER:CONSTRAINT_ENABLEMENT\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<value>Predefined rules|Connector path rules|Check connector path for a connector connected to a reference|false;Predefined rules|Connector path rules|Verify if the connector paths of nested connectors are correct|false;Predefined rules|Data propagation rules|Data connected to Flow Port has bound Data in all container Blocks|true;Predefined rules|Data propagation rules|Data connects to Flow Port or is bound to another Data|true;Predefined rules|Data propagation rules|Data is propagated across at least one Connector|true;Predefined rules|Data propagation rules|Data is propagated to final Flow Port|true;Predefined rules|Diagram representation rules|Check the representation on graphical diagrams|false;Predefined rules|connector_compatibility_uml.ocl|connector_between_internal_external_ports_with_compatible_flow_direction|false;Predefined rules|connector_compatibility_uml.ocl|connector_between_internal_external_ports_with_identical_flow_direction|false;Predefined rules|connector_compatibility_uml.ocl|connector_between_internal_ports_with_compatible_flow_direction|false;Predefined rules|connector_compatibility_uml.ocl|connector_between_internal_ports_with_exact_flow_direction|false;Predefined rules|connector_compatibility_uml.ocl|connector_between_ports_with_compatible_datatype_dimension|false;Predefined rules|connector_compatibility_uml.ocl|connector_between_ports_with_compatible_type|false;Predefined rules|connector_compatibility_uml.ocl|connector_connects_only_flow_ports|false;Predefined rules|connector_compatibility_uml.ocl|connector_does_not_connect_external_ports|false;Predefined rules|connector_compatibility_uml.ocl|connector_has_two_connector_ends|false;Predefined rules|datatypes_system.tcl|Check DataType Unit and Dimension consistency|false;Predefined rules|flow_ports_uml.ocl|external_output_flow_port_is_produced_only_once|false;Predefined rules|flow_ports_uml.ocl|flow_port_is_connected|false;Predefined rules|flow_ports_uml.ocl|internal_intput_flow_port_is_produced_only_once|false;Predefined rules|grouped_ports_uml.ocl|connector_between_grouped_port_and_flow_port_has_compatible_name_type_and_dimension|false;Predefined rules|grouped_ports_uml.ocl|connector_between_grouped_port_and_flow_port_has_compatible_type_and_dimension|false;Predefined rules|grouped_ports_uml.ocl|connector_between_grouped_port_without_flowspecification_and_port_with_flow_specification|false;Predefined rules|grouped_ports_uml.ocl|connector_between_two_grouped_ports_has_compatible_name_type_and_dimension|false;Predefined rules|grouped_ports_uml.ocl|connector_between_two_grouped_ports_has_compatible_type_and_dimension|false;Predefined rules|grouped_ports_uml.ocl|grouped_port_should_have_type|false</value>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<configuration>22</configuration>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</Prop>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<Prop id=\"25\" name=\"@STUDIO:TOOLCONF\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<value>Synchronization</value>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<value>24</value>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</Prop>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</props>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<roots>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<Folder id=\"5\" extensions=\"di;uml;notation\" name=\"SCADE System Model Files\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<elements>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<Folder id=\"6\" extensions=\"di;uml;notation\" name=\"Separate Files\"/>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<FileRef id=\"26\" persistAs=\"");
    _builder.append(name, "				");
    _builder.append(".di\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t\t");
    _builder.append("<props>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("<Prop id=\"27\" name=\"@SYSTEM:ROOTDIFILE\"/>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("</props>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("</FileRef>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<FileRef id=\"28\" persistAs=\"");
    _builder.append(name, "				");
    _builder.append(".uml\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t");
    _builder.append("<FileRef id=\"29\" persistAs=\"");
    _builder.append(name, "				");
    _builder.append(".notation\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("</elements>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</Folder>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<FileRef id=\"30\" persistAs=\"");
    _builder.append(name, "		");
    _builder.append(".css\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("</roots>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<configurations>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<Configuration id=\"2\" name=\"Default\"/>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<Configuration id=\"7\" name=\"HTML\"/>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<Configuration id=\"12\" name=\"RTF\"/>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<Configuration id=\"17\" name=\"BasicCheck\"/>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<Configuration id=\"20\" name=\"ExtendedCheck\"/>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<Configuration id=\"22\" name=\"DataPropCheck\"/>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<Configuration id=\"24\" name=\"Synchronization\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</configurations>");
    _builder.newLine();
    _builder.append("</Project>");
    _builder.newLine();
    return _builder;
  }
}
