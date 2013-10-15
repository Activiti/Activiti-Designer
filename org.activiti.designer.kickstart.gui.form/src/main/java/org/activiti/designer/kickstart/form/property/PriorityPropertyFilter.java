package org.activiti.designer.kickstart.form.property;

import org.activiti.workflow.simple.alfresco.conversion.AlfrescoConversionConstants;

/**
 * @author Frederik Heremans
 */
public class PriorityPropertyFilter extends ReferencePropertyDefinitionFilter {

  @Override
  protected String getAcceptedType() {
    return AlfrescoConversionConstants.FORM_REFERENCE_PRIORITY;
  }

}
