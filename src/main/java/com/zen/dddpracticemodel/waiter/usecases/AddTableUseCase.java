package com.zen.dddpracticemodel.waiter.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.zen.dddpracticemodel.waiter.Waiter;
import com.zen.dddpracticemodel.waiter.commands.AddOrder;
import com.zen.dddpracticemodel.waiter.commands.AddTable;

public class AddTableUseCase extends UseCase<RequestCommand<AddTable>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AddTable> addTableRequestCommand) {
        var command = addTableRequestCommand.getCommand();
        var waiter = Waiter.from(command.getWaiterID(), repository().getEventsBy(command.getWaiterID().value()));
        waiter.addTable(command.getSize(), command.getLocation());
        emit().onResponse(new ResponseEvents(waiter.getUncommittedChanges()));
    }
}
