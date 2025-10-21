<<<<<<< HEAD
import grails.core.GrailsApplication
=======
import org.codehaus.groovy.grails.commons.GrailsApplication
>>>>>>> teste

// Place your Spring DSL code here
import org.grails.org.hibernate.query.CustomHibernateCriterionAdapter
import com.asaas.cache.AsaasCustomCacheKeyGenerator

beans = {

    GrailsApplication grailsApplication
<<<<<<< HEAD

    customHibernateCriterionAdapter(CustomHibernateCriterionAdapter)
    customCacheKeyGenerator(AsaasCustomCacheKeyGenerator)
=======
>>>>>>> teste
}
