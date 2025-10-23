package com.asaas.interceptor




    @Override
    Integer getInterceptorOrder() {
        return DEFAULT_PRECEDENCE_ORDER
    }

    TestInterceptor() {
        match(controller: '*', action: '*')
    }

    Integer getInterceptorOrder() {
        return DEFAULT_PRECEDENCE_ORDER
    }

    boolean before() {
        return true
    }

}

