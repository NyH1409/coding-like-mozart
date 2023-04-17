package com.coding.like.mozart.unit;

import com.coding.like.mozart.abstractclasse.AbstractClass1;
import com.coding.like.mozart.concreteclasse.ConcreteClass2;
import com.coding.like.mozart.dependencies.ConcreteDependance2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ConcreteClass2Test {
  private static final String LABEL = "Label";
  private final AbstractClass1 abstractClass1Mock = mock(AbstractClass1.class);
  private final ConcreteClass2 concreteClass2 = new ConcreteClass2(abstractClass1Mock);

  @Test
  void read_label() {
    when(abstractClass1Mock.getConcreteDependance2()).thenReturn(new ConcreteDependance2());
    String actual = concreteClass2.getLabel();

    assertEquals(LABEL, actual);
  }
}
