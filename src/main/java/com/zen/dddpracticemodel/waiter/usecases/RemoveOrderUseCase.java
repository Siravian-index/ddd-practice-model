package com.zen.dddpracticemodel.waiter.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.zen.dddpracticemodel.waiter.Waiter;
import com.zen.dddpracticemodel.waiter.commands.RemoveOrder;

public class RemoveOrderUseCase extends UseCase<RequestCommand<RemoveOrder>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<RemoveOrder> removeOrderRequestCommand) {
        var command = removeOrderRequestCommand.getCommand();
        var waiter = Waiter.from(command.getWaiterID(), repository().getEventsBy(command.getWaiterID().value()));
        System.out.println(waiter.name);
        waiter.removeOrder(command.getOrderID());
//        System.out.println(waiter.name);
        emit().onResponse(new ResponseEvents(waiter.getUncommittedChanges()));
    }
}
