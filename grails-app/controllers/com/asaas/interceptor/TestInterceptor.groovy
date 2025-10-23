package web

class TestFilters {

    def filters = {
        all(controller: '*', action: '*') {
            before = {
                return true
            }
        }
    }
}