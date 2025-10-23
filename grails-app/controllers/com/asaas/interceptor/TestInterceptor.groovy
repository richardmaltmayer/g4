package com.asaas.interceptor

class TestInterceptor implements BaseInterceptor {

    TestInterceptor() {
        match(controller: '*', action: '*')
    }

    @Override
    Integer getInterceptorOrder() {
        return DEFAULT_PRECEDENCE_ORDER
    }

    @Override
    boolean before() {
        return true
    }

}

