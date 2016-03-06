package com.xyt.example;

import java.util.Map;

import org.springframework.stereotype.Controller;

import com.xyt.modules.engine.view.action.AbsAction;
import com.xyt.modules.engine.view.action.ActionContext;
import com.xyt.modules.exception.HillException;

@Controller
public class ExampleAction extends AbsAction {

  public Object create(ActionContext context) {
    try {
      Map<String, Object> object = context.getData();
      return context.getModel().createEntity(object);
    } catch (HillException e) {
      return context.getMessageBuilder().serverError(e);
    } catch (Exception e) {
      return context.getMessageBuilder().serverError(e);
    }
  }

  public Object update(ActionContext context) {
    try {
      Map<String, Object> object = context.getData();
      return context.getModel().updateEntity(object);
    } catch (HillException e) {
      return context.getMessageBuilder().serverError(e);
    } catch (Exception e) {
      return context.getMessageBuilder().serverError(e);
    }
  }
}
