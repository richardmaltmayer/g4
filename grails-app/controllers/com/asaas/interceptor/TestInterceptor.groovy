package web

class TestFilters {

    def filters = {
        all(controller: '*', action: '*') {
            before = {
<<<<<<< HEAD:grails-app/controllers/com/asaas/interceptor/TestInterceptor.groovy
=======
                println controllerName + " / " + actionName
>>>>>>> Atualização Custom Filter:grails-app/controllers/com/asaas/interceptor/CustomInterceptor.groovy
                return true
            }
        }
    }
}