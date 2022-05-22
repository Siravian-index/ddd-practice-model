package com.zen.dddpracticemodel.waiter.usecases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import com.zen.dddpracticemodel.waiter.commands.CreateWaiter;
import com.zen.dddpracticemodel.waiter.events.WaiterCreated;
import com.zen.dddpracticemodel.waiter.values.Name;
import com.zen.dddpracticemodel.waiter.values.WaiterID;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CreateWaiterUseCaseTest {

    @Test
    void createWaiterSuccessfully() {
        //        given
        var trainerID = WaiterID.of("fakeWaiterID");
        var name = new Name("Juan");
        var command = new CreateWaiter(trainerID, name);

        CreateWaiterUseCase useCase = new CreateWaiterUseCase();
//        when
        List<DomainEvent> domainEvents = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

//        assert
        var trainerCreated = (WaiterCreated) domainEvents.get(0);
        assertEquals("fakeWaiterID", trainerCreated.aggregateRootId());
        assertEquals("Juan", trainerCreated.getName().value());
    }
}