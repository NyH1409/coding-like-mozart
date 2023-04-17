package com.coding.like.mozart.concreteclasse;

import com.coding.like.mozart.abstractclasse.AbstractClass1;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ConcreteClass1 {
  private final AbstractClass1 abstractClass1;
}
