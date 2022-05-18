package com.zen.dddpracticemodel.store.entities;

import co.com.sofka.domain.generic.Entity;
import com.zen.dddpracticemodel.store.values.*;

import java.util.Objects;

public class Table extends Entity<TableID> {
    protected Size size;
    protected IsAvailable isAvailable;
    protected Material material;

    protected IsClean isClean;
    protected Table(TableID entityId, Size size, Material material) {
        super(entityId);
        this.size = size;
        this.material = material;
        this.isAvailable = new IsAvailable(true );
        this.isClean = new IsClean(true);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Table table = (Table) o;
        return Objects.equals(size, table.size) && Objects.equals(isAvailable, table.isAvailable) && Objects.equals(material, table.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), size, isAvailable, material);
    }
}
