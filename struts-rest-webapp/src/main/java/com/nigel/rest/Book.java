package com.nigel.rest;

public class Book
{
  private Integer id;
  private String name;
  private double price;

  // 无参数的构�?�?
  public Book(int i, String string, int j)
  {
    this.id = i;
    this.setName(string);
    this.setPrice(j);
  }

  public Book()
  {
    // TODO Auto-generated constructor stub
  }

  // id 属�?�?setter �?getter 方法
  public void setId(Integer id)
  {
    this.id = id;
  }

  public Integer getId()
  {
    return this.id;
  }
  // 省略 name �?price �?setter �?getter 方法

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public double getPrice()
  {
    return price;
  }

  public void setPrice(double price)
  {
    this.price = price;
  }
}
