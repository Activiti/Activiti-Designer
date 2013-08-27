package org.activiti.designer.kickstart.form.features;

import java.util.Random;

import org.activiti.designer.kickstart.form.KickstartFormPluginImage;
import org.activiti.designer.kickstart.form.diagram.KickstartFormFeatureProvider;
import org.activiti.workflow.simple.definition.form.TextPropertyDefinition;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;

public class CreateTextInputPropertyFeature extends AbstractCreateFeature {

  public static final String FEATURE_ID_KEY = "text-input";

  public CreateTextInputPropertyFeature(KickstartFormFeatureProvider fp) {
    super(fp, "Text input", "Add a text input field");
  }

  @Override
  public boolean canCreate(ICreateContext context) {
    return true;
  }
  
  public Object[] create(ICreateContext context) {
    // Create a new text-property
    TextPropertyDefinition definition = new TextPropertyDefinition();
    definition.setName("Property " + new Random().nextInt(100));
    addGraphicalRepresentation(context, definition);
    return new Object[] { definition };
  }

  @Override
  public String getCreateImageId() {
    return KickstartFormPluginImage.NEW_ICON.getImageKey();
  }

}
