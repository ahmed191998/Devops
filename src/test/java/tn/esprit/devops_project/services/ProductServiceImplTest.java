package tn.esprit.devops_project.services;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.devops_project.entities.Product;
import tn.esprit.devops_project.repositories.ProductRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static tn.esprit.devops_project.entities.ProductCategory.ELECTRONICS;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@Transactional
@TestExecutionListeners({DependencyInjectionTestExecutionListener.class,
        DirtiesContextTestExecutionListener.class,
        TransactionalTestExecutionListener.class,
        DbUnitTestExecutionListener.class})
@ActiveProfiles("test")
class ProductServiceImplTest {

    @Autowired
    ProductServiceImpl productService;
    @Autowired
    private ProductRepository productRepository;

//    @DatabaseSetup("/data-set/product-data.xml")
//    @Test
//    @Transactional
//    void addProduct() {
//        final Product product = new Product();
//        product.setTitle("informatique");
//        product.setPrice(5);
//        product.setQuantity(2);
//        product.setCategory(ELECTRONICS);
//        this.productService.addProduct(product, 2L);
//        final List<Product> allProduct = productService.retreiveAllProduct();
//        assertEquals(allProduct.size(), 2);
//    }

//    @DatabaseSetup("/data-set/product-data.xml")
//    @Test
//    void retrieveProduct() {
//        final Product product = this.productService.retrieveProduct(1L);
//        assertEquals("informatique", product.getTitle());
//    }

//    @DatabaseSetup("/data-set/product-data.xml")
//    @Test
//    void retreiveAllProduct() {
//        // Appelez la méthode pour récupérer tous les produits.
//        List<Product> allProducts = productService.retreiveAllProduct();
//
//        // Vérifiez que la liste des produits n'est pas nulle et a une taille attendue.
//        assertEquals(1, allProducts.size()); // Remplacez 2 par le nombre attendu de produits.
//
//    }

//    @DatabaseSetup("/data-set/product-data.xml")
//    @Test
//    void retrieveProductByCategory() {
//        String category = "Electronics"; // Remplacez par la catégorie que vous souhaitez tester.
//
//        // Appelez la méthode pour récupérer les produits par catégorie.
//        List<Product> productsInCategory = productService.retrieveProductByCategory(ProductCategory.valueOf(category));
//
//        // Vérifiez que la liste des produits n'est pas nulle et a une taille attendue.
//        assertEquals(3, productsInCategory.size()); // Remplacez 3 par le nombre attendu de produits dans la catégorie.
//    }

//    @DatabaseSetup("/data-set/product-data.xml")
//    @Test
//    void deleteProduct() {
//
//        productService.deleteProduct(1L);
//        Product deletedProduct = productRepository.findById(1L).orElse(null);
//
//        // Assurez-vous que le produit n'existe plus en vérifiant s'il est nul.
//        assertNull(deletedProduct);
//
//    }

//    @DatabaseSetup("/data-set/product-data.xml")
//    @Test
//    void retreiveProductStock() {
//        Long productId = 1L; // Remplacez par l'identifiant du produit que vous souhaitez tester.
//
//        // Appelez la méthode pour récupérer le stock du produit.
//        List<Product> products = productService.retreiveProductStock(productId);
//
//        // Vérifiez que le stock du produit correspond à la valeur attendue.
//        assertEquals(1, products.size()); // Remplacez 10 par la valeur de stock attendue.
//    }
}