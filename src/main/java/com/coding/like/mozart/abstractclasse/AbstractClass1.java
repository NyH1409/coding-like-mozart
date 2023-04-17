package com.coding.like.mozart.abstractclasse;

import com.coding.like.mozart.dependencies.ConcreteDependance1;
import com.coding.like.mozart.dependencies.ConcreteDependance2;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Getter
public abstract class AbstractClass1 {
  private ConcreteDependance1 concreteDependance1;
  private ConcreteDependance2 concreteDependance2;
}
