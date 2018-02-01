package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    ProductDao productDao;

    @Test
    public void testInvoiceDaoSave(){
    //Given
        Invoice invoice = new Invoice("1/2/2019");
        Product product = new Product("Majonez Kielecki");
        Item i1 = new Item(new BigDecimal(4.99),10,new BigDecimal(4.99*10));
        Item i2 = new Item(new BigDecimal(3.50),20,new BigDecimal(3.50*20));
        Item i3 = new Item(new BigDecimal(2.70),30,new BigDecimal(2.70*30));
        invoice.getItems().add(i1);
        invoice.getItems().add(i2);
        invoice.getItems().add(i3);
        product.getItems().add(i1);
        product.getItems().add(i2);
        product.getItems().add(i3);
        i1.setInvoice(invoice);
        i2.setInvoice(invoice);
        i3.setInvoice(invoice);
        i1.setProduct(product);
        i2.setProduct(product);
        i3.setProduct(product);

        //When
        invoiceDao.save(invoice);
        productDao.save(product);
        itemDao.save(i1);
        itemDao.save(i2);
        itemDao.save(i3);
        int id = invoice.getId();
        int productId = product.getId();

        //Then
        Assert.assertEquals(1,invoiceDao.count());
        Assert.assertEquals(3,itemDao.count());
        Assert.assertEquals(1,productDao.count());

        //CleanUp
        itemDao.delete(i1);
        itemDao.delete(i2);
        itemDao.delete(i3);
        productDao.delete(productId);
        invoiceDao.delete(id);



    }
}
