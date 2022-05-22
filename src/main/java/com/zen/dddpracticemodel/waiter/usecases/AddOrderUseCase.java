package com.zen.dddpracticemodel.waiter.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.zen.dddpracticemodel.waiter.Waiter;
import com.zen.dddpracticemodel.waiter.commands.AddOrder;

public class AddOrderUseCase extends UseCase<RequestCommand<AddOrder>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<AddOrder> addOrderRequestCommand) {
        var command = addOrderRequestCommand.getCommand();
        var waiter = Waiter.from(command.getWaiterID(), repository().getEventsBy(command.getWaiterID().value()));
        waiter.addOrder(command.getDescription(), command.getPrice());
        emit().onResponse(new ResponseEvents(waiter.getUncommittedChanges()));
    }
}
