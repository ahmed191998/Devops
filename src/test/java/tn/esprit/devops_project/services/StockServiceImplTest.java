package tn.esprit.devops_project.services;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.devops_project.entities.Stock;
import tn.esprit.devops_project.repositories.StockRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

//@ExtendWith(SpringExtension.class)
//@SpringBootTest
//@Transactional
//@TestExecutionListeners({DependencyInjectionTestExecutionListener.class,
//        DirtiesContextTestExecutionListener.class,
//        TransactionalTestExecutionListener.class,
//        DbUnitTestExecutionListener.class})
//@ActiveProfiles("test")

@ExtendWith(MockitoExtension.class)
class StockServiceImplTest {

    @Mock
    StockRepository stockRepository;

    @InjectMocks
    StockServiceImpl stockService;

    @Test
    void retrieveActivitySectorTest() {
        Stock stock  = new Stock();
        when(stockRepository.findById(stock.getIdStock())).thenReturn(Optional.of(stock));
        assertEquals(stock.getIdStock(), stockService.retrieveStock(stock.getIdStock()).getIdStock());
    }

    @Test
    void retrieveAllActivitySectorTest() {
        when(stockRepository.findAll()).thenReturn(Stream.of(new Stock(), new Stock(), new Stock()).collect(Collectors.toList()));
        assertEquals(3, stockService.retrieveAllStock().size());
    }

    @Test
    void addActivitySectorTest() {
        Stock stock  = new Stock();
        when(stockRepository.save(stock)).thenReturn(stock);
        assertEquals(stock, stockService.addStock(stock));
    }





//    @Autowired
//    private StockServiceImpl stockService;
//
//
//
//    @DatabaseSetup("/data-set/stock-data.xml")
//    @Test
//    void addStock() {
//        Stock stock = new Stock();
//        stock.setTitle("bon");
//            stockService.addStock(stock);
//        List<Stock> allStocks = stockService.retrieveAllStock();
//        assertEquals(allStocks.size(),2);
//    }
//
//    @DatabaseSetup("/data-set/stock-data.xml")
//    @Test
//    void retrieveStock() {
//        final Stock stock = this.stockService.retrieveStock(1L);
//        assertEquals("stock 1", stock.getTitle());
//    }
//
//    @DatabaseSetup("/data-set/stock-data.xml")
//    @Test
//    void retrieveAllStock() {
//        final List<Stock> stock = this.stockService.retrieveAllStock();
//    }

}