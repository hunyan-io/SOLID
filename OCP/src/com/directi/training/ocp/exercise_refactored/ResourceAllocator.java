package com.directi.training.ocp.exercise_refactored;

public abstract class ResourceAllocator {
  abstract public int allocate();

  abstract public void free(int resourceId);
}
