/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class UnknownAction extends BaseActionElement {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected UnknownAction(long cPtr, boolean cMemoryOwn) {
    super(AdaptiveCardObjectModelJNI.UnknownAction_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(UnknownAction obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void swigSetCMemOwn(boolean own) {
    swigCMemOwnDerived = own;
    super.swigSetCMemOwn(own);
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        AdaptiveCardObjectModelJNI.delete_UnknownAction(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public UnknownAction() {
    this(AdaptiveCardObjectModelJNI.new_UnknownAction(), true);
  }

  public JsonValue SerializeToJsonValue() {
    return new JsonValue(AdaptiveCardObjectModelJNI.UnknownAction_SerializeToJsonValue(swigCPtr, this), true);
  }

}
