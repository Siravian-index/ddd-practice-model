package com.zen.dddpracticemodel.order.entities;

import co.com.sofka.domain.generic.Entity;
import com.zen.dddpracticemodel.order.values.CreationDate;
import com.zen.dddpracticemodel.order.values.DetailID;
import com.zen.dddpracticemodel.order.values.TotalCost;
import com.zen.dddpracticemodel.store.entities.Product;

import java.util.List;

public class Detail extends Entity<DetailID> {
    protected TotalCost totalCost;
    protected List<Product> productList;
    protected CreationDate createdAt;
    public Detail(DetailID entityId, List<Product> productsBoughtList) {
        super(entityId);
//        an entity cannot launch events, so how do I manage this?
    }
}
