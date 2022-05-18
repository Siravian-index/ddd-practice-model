package com.zen.dddpracticemodel.order.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.zen.dddpracticemodel.order.values.CreationDate;
import com.zen.dddpracticemodel.order.values.DetailID;

public class DetailsPlaced extends DomainEvent {

    private final CreationDate creationDate;
    private final DetailID detailID;

    public DetailsPlaced(DetailID detailID, CreationDate createdAt) {
        super("com.zen.dddpracticemodel.OrderPlaced");
        this.detailID = detailID;
        this.creationDate = createdAt;

    }

    public CreationDate creationDate() {
        return creationDate;
    }

    public DetailID detailID() {
        return detailID;
    }
}
