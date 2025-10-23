package web

class CustomFilters {

    def filters = {
        all(controller: 'custom', action: '*') {
            before = {
                println controllerName + " / " + actionName
                println "teste de sobrescrita 17"
                Long customerId = 10L
                Long customerAccountId = 900L
                
                return true
            }
        }
    }
}