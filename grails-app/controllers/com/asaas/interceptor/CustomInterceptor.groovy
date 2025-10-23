package web

class CustomFilters {

    def filters = {
        all(controller: 'custom', action: '*') {
            before = {
                println controllerName + " / " + actionName
                return true
            }
        }
    }
}