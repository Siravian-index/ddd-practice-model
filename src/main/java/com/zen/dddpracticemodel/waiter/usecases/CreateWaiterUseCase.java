package com.zen.dddpracticemodel.waiter.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.zen.dddpracticemodel.waiter.Waiter;
import com.zen.dddpracticemodel.waiter.commands.CreateWaiter;

public class CreateWaiterUseCase extends UseCase<RequestCommand<CreateWaiter>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CreateWaiter> createWaiterRequestCommand) {
        var command = createWaiterRequestCommand.getCommand();
        var waiter = new Waiter(command.getEntityId(), command.getName());
        emit().onResponse(new ResponseEvents(waiter.getUncommittedChanges()));
    }
}
