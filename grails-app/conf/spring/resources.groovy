import grails.core.GrailsApplication

// Place your Spring DSL code here
import org.grails.org.hibernate.query.CustomHibernateCriterionAdapter
import com.asaas.cache.AsaasCustomCacheKeyGenerator

beans = {

    GrailsApplication grailsApplication

    customHibernateCriterionAdapter(CustomHibernateCriterionAdapter)
    customCacheKeyGenerator(AsaasCustomCacheKeyGenerator)
}
