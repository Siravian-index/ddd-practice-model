package com.zen.dddpracticemodel.store;

import co.com.sofka.domain.generic.EventChange;
import com.zen.dddpracticemodel.client.Client;
import com.zen.dddpracticemodel.order.Order;
import com.zen.dddpracticemodel.store.entities.Holiday;
import com.zen.dddpracticemodel.store.entities.Kitchen;
import com.zen.dddpracticemodel.store.entities.Product;
import com.zen.dddpracticemodel.store.entities.Table;
import com.zen.dddpracticemodel.store.events.*;
import com.zen.dddpracticemodel.store.values.IsAvailable;

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

        apply((SupplyRestocked event) -> {
            Product product = store.findProductById(event.getProductID()).orElseThrow();
            product.reStockProduct(event.getAmount());
        });

        apply((ProductRenamed event) -> {
            Product product = store.findProductById(event.getProductID()).orElseThrow();
            product.renameProduct(event.getName());
        });

        apply((ProductSold event) -> {
            Product product = store.findProductById(event.getProductID()).orElseThrow();
            product.sellProduct(event.getAmount());
        });

        apply((ProductDisposed event) -> {
            Product product = store.findProductById(event.getProductID()).orElseThrow();
            store.productSet.remove(product);
        });

        apply((KitchenCleaned event) -> {
            store.kitchen.cleanKitchen();
        });

        apply((OrderPrepared event) -> {
            Order order = store.findOrderById(event.getOrderID()).orElseThrow();
            store.kitchen.prepareOrder(order);
        });

        apply((MusicToggled event) -> {
            store.holiday.changeMusic(event.getMusic());
        });

        apply((HolidayDescriptionUpdated event) -> {
            store.holiday.updateDescription(event.getDescription());
        });

        apply((KitchenCreated event) -> {
            store.kitchen = new Kitchen(event.getEntityId(), event.getEquipmentSet(), event.getIngredientSet(), event.getEmployeeSet(), event.getIsClean());
        });
        apply((HolidayCreated event) -> {
            store.holiday = new Holiday(event.getEntityId(), event.getDescription(), event.getMusic(), event.getDecoration());
        });

        apply((OrderPaid event) -> {
            Client client = store.findClientById(event.getClientID()).orElseThrow();
            Order order = store.findOrderById(client.getOrderID()).orElseThrow();
            order.payOrderStatus();
        });

        apply((ProductOrdered event) -> {
            Client client = store.findClientById(event.getClientID()).orElseThrow();
            Order order = store.findOrderById(client.getOrderID()).orElseThrow();
            order.addProducts(event.getProducts());
        });


    }
}
