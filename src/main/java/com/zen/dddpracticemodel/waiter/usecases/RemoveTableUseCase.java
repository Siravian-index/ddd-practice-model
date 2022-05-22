package com.zen.dddpracticemodel.waiter.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.zen.dddpracticemodel.waiter.Waiter;
import com.zen.dddpracticemodel.waiter.commands.RemoveTable;

public class RemoveTableUseCase extends UseCase<RequestCommand<RemoveTable>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<RemoveTable> removeTableRequestCommand) {
        var command = removeTableRequestCommand.getCommand();
        var waiter = Waiter.from(command.getWaiterID(), repository().getEventsBy(command.getWaiterID().value()));
        waiter.removeTable(command.getTableID());
        emit().onResponse(new ResponseEvents(waiter.getUncommittedChanges()));
    }
}
