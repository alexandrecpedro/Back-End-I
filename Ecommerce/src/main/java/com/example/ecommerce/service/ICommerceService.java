package com.example.ecommerce.service;

public interface ICommerceService<T> {
    T create(T t);
    T getById(int id);
}
