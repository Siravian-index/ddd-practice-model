package com.zen.dddpracticemodel.store;

import co.com.sofka.domain.generic.EventChange;
import com.zen.dddpracticemodel.store.entities.Product;
import com.zen.dddpracticemodel.store.entities.Table;
import com.zen.dddpracticemodel.store.events.*;
import com.zen.dddpracticemodel.store.values.IsAvailable;
import com.zen.dddpracticemodel.store.values.Stock;

import java.util.ArrayList;
import java.util.HashSet;

public class StoreChange extends EventChange {
    protected StoreChange(Store store) {
//        Modify the class in this space. This is like a constructor based on events
        apply((StoreCreated event) -> {
            store.name = event.Name();
            store.productSet = new HashSet<>();
            store.clientSet = new HashSet<>();
            store.orderList = new ArrayList<>();
            store.employeeSet = new HashSet<>();
            store.tableSet = new HashSet<>();
//            how should I handle the kitchen and holiday entities?
//            store.kitchen = new Kitchen();
//            store.holiday = new Holiday();
        });

        apply((TablePrepared event) -> {
//            find table and prepared it by switching a boolean
            Table table = store.findTableById(event.getTableID()).orElseThrow();
            table.clean();
        });

        apply((TableAttended event) -> {
            Table table = store.findTableById(event.getTableID()).orElseThrow();
            table.setIsAvailable(new IsAvailable(false));
        });

        apply((TableVisited event) -> {
            Table table = store.findTableById(event.getTableID()).orElseThrow();
            table.tableVisited();
        });

        apply((SupplyRestocked event ) -> {
            Product product = store.findProductById(event.getProductID()).orElseThrow();
            product.reStockProduct(event.getAmount());
        });


    }
}
