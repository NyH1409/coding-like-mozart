package com.coding.like.mozart.concreteclasse;

import com.coding.like.mozart.abstractclasse.AbstractClass1;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ConcreteClass2 {
  private AbstractClass1 abstractClass1;

  public String getLabel() {
    return abstractClass1.getConcreteDependance2().getLabel();
  }
}
