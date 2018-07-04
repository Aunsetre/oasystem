package com.aunsetre.Lambda;

/**
 * @Author: Aunsetre
 * @DATE: 2018-06-15 11:28:56
 */
@FunctionalInterface
public interface Conver<F,T> {
    T Conver(F from);
}
