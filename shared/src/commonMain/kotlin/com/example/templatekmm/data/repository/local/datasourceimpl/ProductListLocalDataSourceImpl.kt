import com.example.templatekmm.data.mapper.asDomainProductEntity
import com.example.templatekmm.database.StoreDatabase
import com.example.templatekmm.data.repository.local.datasource.ProductListLocalDataSource
import com.example.templatekmm.entity.Product


class ProductListLocalDataSourceImpl(StoreDatabase: StoreDatabase) : ProductListLocalDataSource {

    private val queries = StoreDatabase.storeDatabaseQueries

    override fun getProductListFromLocal(): List<Product> {
        return queries.getMovielist(::asDomainProductEntity).executeAsList()
    }
}