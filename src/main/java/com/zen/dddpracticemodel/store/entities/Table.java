package com.zen.dddpracticemodel.store.entities;

import co.com.sofka.domain.generic.Entity;
import com.zen.dddpracticemodel.store.values.IsAvailable;
import com.zen.dddpracticemodel.store.values.Material;
import com.zen.dddpracticemodel.store.values.Size;
import com.zen.dddpracticemodel.store.values.TableID;

public class Table extends Entity<TableID> {
    protected Size size;
    protected IsAvailable isAvailable;
    protected Material material;
    protected Table(TableID entityId, Size size, Material material) {
        super(entityId);
        this.size = size;
        this.material = material;
        this.isAvailable = new IsAvailable(true );
    }
    private Table(TableID entityId) {
        super(entityId);
    }

    public static Table from (TableID entityId, Size size, Material material){
        Table table = new Table(entityId);
        table.size = size;
        table.material = material;
        return table;
    }



//    void clean(){}
//    void assign(){}
//    void move(){}


    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public IsAvailable getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(IsAvailable isAvailable) {
        this.isAvailable = isAvailable;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
}
