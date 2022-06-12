package com.sy.smartrm.smartrmmonolith.infracore.aggregate;

import com.sy.smartrm.smartrmmonolith.infracore.api.CommonError;
import com.sy.smartrm.smartrmmonolith.infracore.event.DomainEvent;
import com.sy.smartrm.smartrmmonolith.infracore.event.DomainEventBus;
import com.sy.smartrm.smartrmmonolith.infracore.exception.DomainException;

/**
 * @author: yoda
 * @description:
 */
public abstract class AggregateBase {

  protected long version;

  private boolean versionInc = false;

  protected DomainEventBus eventBus;

  protected void incVersion() {
    version++;
    versionInc = true;
  }

  public long getVersion() {
    return version;
  }

  public boolean isVersionInc() {
    return versionInc;
  }

  protected void setEventBus(DomainEventBus eventBus) {
    this.eventBus = eventBus;
  }

  protected void emitEvent(DomainEvent event) {
    if (eventBus != null) {
      eventBus.post(event);
    } else {
      throw new DomainException(CommonError.NoEventBus);
    }
  }


}
