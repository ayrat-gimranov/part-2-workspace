/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.product;

import java.util.Collection;

public class Order {
  private String id;
  
  public Order(String id) {
    this.id = id;
  }
  
  /**
   * TODO:
   * get the items from the cart and iterate over them, print each item's product code
   * get cart total and print
   */
  public void processCart(ShoppingCart<? extends Product> cart) {
    System.out.printf("Order: %s contains the following: %n", getId());
    for (Product item : cart.allItems()){
      System.out.println(item.getCode());
    }
    System.out.printf("Order Total: %s%n", cart.total());
    System.out.println();
  }
  
  public String getId() {
    return id;
  }
}