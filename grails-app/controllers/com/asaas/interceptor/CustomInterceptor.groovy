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
        println controllerName + " / " + actionName
        println "teste de sobrescrita 17"
        Long customerId = 10L
        Long customerAccountId = 900L
                
        return true
    }

}

