package com.asaas.interceptor

class CustomInterceptor implements BaseInterceptor {

    CustomInterceptor() {
        match(controller: 'custom', action: '*')
    }

    @Override
    Integer getInterceptorOrder() {
        return DEFAULT_PRECEDENCE_ORDER
    }

    @Override
    boolean before() {
        println controllerName
        return true
    }

}

