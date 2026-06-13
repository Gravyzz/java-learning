package Workspace_project;

import java.util.Objects;

public class Workspace {

    private final int id;
    private final WorkspaceType type;

    public Workspace(int id, WorkspaceType type){
        this.id = id;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public WorkspaceType getType() {
        return type;
    }

    public double getPricePerHour(){
        return type.getPricePerHour();
    }


    @Override
    public String toString(){
        return "Место #" + id + " (" + type.getDescription() + ", " + type.getPricePerHour() + " руб/час)";
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Workspace workspace)) return false;
        return getId() == workspace.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }


}
