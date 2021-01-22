package daos;

import daos.ListProducts;
import daos.Products;

public class DaoFactory {
    private static Products productsDao;
//one dao for each model
    public static Products getProductsDao() {
        if (productsDao == null) {
            productsDao = new ListProducts();
        }
        return productsDao;
    }
    //second table model goes here
}