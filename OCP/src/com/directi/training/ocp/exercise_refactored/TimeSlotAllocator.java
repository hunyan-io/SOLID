package com.directi.training.ocp.exercise_refactored;

public class TimeSlotAllocator extends ResourceAllocator {
  public int allocate() {
    int resourceId = findFreeTimeSlot();
    markTimeSlotBusy(resourceId);
    return resourceId;
  }

  public void free(int resourceId) {
    markTimeSlotFree(resourceId);
  }

  private void markTimeSlotFree(int resourceId) {
  }

  private void markTimeSlotBusy(int resourceId) {
  }

  private int findFreeTimeSlot() {
    return 0;
  }
}
