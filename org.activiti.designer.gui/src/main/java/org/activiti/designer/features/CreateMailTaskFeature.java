package org.activiti.designer.features;

import org.activiti.bpmn.model.ServiceTask;
import org.activiti.designer.PluginImage;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;

public class CreateMailTaskFeature extends AbstractCreateFastBPMNFeature {

  public static final String FEATURE_ID_KEY = "mailtask";

  public CreateMailTaskFeature(IFeatureProvider fp) {
    super(fp, "MailTask", "Add mail task");
  }

  @Override
  public Object[] create(ICreateContext context) {
    ServiceTask newMailTask = new ServiceTask();
    newMailTask.setType(ServiceTask.MAIL_TASK);
    newMailTask.setAsynchronous(true);
    addObjectToContainer(context, newMailTask, "Mail Task");

    return new Object[] { newMailTask };
  }

  @Override
  public String getCreateImageId() {
    return PluginImage.IMG_MAILTASK.getImageKey();
  }

  @Override
  protected String getFeatureIdKey() {
    return FEATURE_ID_KEY;
  }
}
